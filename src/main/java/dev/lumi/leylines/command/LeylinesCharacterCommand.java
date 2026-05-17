package dev.lumi.leylines.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.context.CommandContext;
import dev.lumi.leylines.LeyLines;
import dev.lumi.leylines.cca.PlayerPartyComponent;
import dev.lumi.leylines.character.CharacterDefinition;
import dev.lumi.leylines.character.LeylinesCharacterRegistry;
import dev.lumi.leylines.init.LeyLinesComponents;
import dev.lumi.leylines.util.TextOptions;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.command.argument.IdentifierArgumentType;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

import static net.minecraft.server.command.CommandManager.argument;

public class LeylinesCharacterCommand {
    public LeylinesCharacterCommand() {
    }

    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, CommandRegistryAccess registryAccess, CommandManager.RegistrationEnvironment environment) {
        dispatcher.register(CommandManager.literal("leylines")
                .then(CommandManager.literal("character")
                        .then(CommandManager.literal("set")
                                .then(argument("id", IdentifierArgumentType.identifier())
                                        .executes(ctx -> {
                                            ServerPlayerEntity player = ctx.getSource().getPlayer();
                                            Identifier id = IdentifierArgumentType.getIdentifier(ctx, "id");

                                            if (LeylinesCharacterRegistry.get(id) == null) {
                                                ctx.getSource().sendFeedback(() -> TextOptions.withColor("Ley Lines §> Unknown character.", 0XFF001E, TextOptions.color(Formatting.DARK_RED)), false);
                                                return 0;
                                            }

                                            assert player != null;
                                            LeyLinesComponents.CHARACTER.get(player).setActiveCharacter(id);
                                            ctx.getSource().sendFeedback(() -> TextOptions.withColor("Ley Lines §> Swapped character to '" + id + "'", 0xFFFFFF, TextOptions.color(Formatting.GRAY)), false);
                                            return 1;
                                        })
                                )
                        )
                        .then(CommandManager.literal("clear")
                                .executes(ctx -> {
                                    ServerPlayerEntity player = ctx.getSource().getPlayer();

                                    assert player != null;
                                    LeyLinesComponents.CHARACTER.get(player).setActiveCharacter(LeyLines.id("none"));
                                    ctx.getSource().sendFeedback(() -> TextOptions.withColor("Ley Lines §> Cleared active character", 0xFFFFFF, TextOptions.color(Formatting.GRAY)), false);
                                    return 1;
                                })
                        )
                )
                .then(CommandManager.literal("party")
                        .then(CommandManager.literal("set")
                                .then(CommandManager.argument("slot", IntegerArgumentType.integer(0, 3))
                                        .then(CommandManager.argument("id", IdentifierArgumentType.identifier())
                                                .executes(ctx -> setSlot(ctx))
                                        )
                                )
                        )
                        .then(CommandManager.literal("clear")
                                .executes(ctx -> clearParty(ctx))
                        )
                )
        );
    }

    private static int setSlot(CommandContext<ServerCommandSource> ctx) {
        ServerPlayerEntity player = ctx.getSource().getPlayer();
        int slot = IntegerArgumentType.getInteger(ctx, "slot");
        Identifier id = IdentifierArgumentType.getIdentifier(ctx, "id");
        CharacterDefinition def = LeylinesCharacterRegistry.get(id);

        if (def == null) {
            ctx.getSource().sendFeedback(() -> TextOptions.withColor("Ley Lines §> Unknown character.", 0XFF001E, TextOptions.color(Formatting.DARK_RED)), false);
            return 0;
        }

        PlayerPartyComponent party = LeyLinesComponents.PARTY.get(player);
        party.setSlot(slot, id);
        ctx.getSource().sendFeedback(() -> TextOptions.withColor("Ley Lines §> Set slot " + slot + " to " + id, 0xFFFFFF, TextOptions.color(Formatting.GRAY)), false);
        return 1;
    }

    private static int clearParty(CommandContext<ServerCommandSource> ctx) {
        ServerPlayerEntity player = ctx.getSource().getPlayer();
        PlayerPartyComponent party = LeyLinesComponents.PARTY.get(player);

        for (int i = 0; i < 4; i++) {
            party.setSlot(i, LeyLines.id("none"));
        }

        ctx.getSource().sendFeedback(() -> TextOptions.withColor("Ley Lines §> Party cleared", 0xFFFFFF, TextOptions.color(Formatting.GRAY)), false);
        return 1;
    }
}
