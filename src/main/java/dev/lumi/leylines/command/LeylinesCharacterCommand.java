package dev.lumi.leylines.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import dev.lumi.leylines.LeyLines;
import dev.lumi.leylines.cca.PlayerCharacterComponent;
import dev.lumi.leylines.cca.PlayerPartyComponent;
import dev.lumi.leylines.cca.PlayerProfileComponent;
import dev.lumi.leylines.character.CharacterDefinition;
import dev.lumi.leylines.character.CharacterSkinDefinition;
import dev.lumi.leylines.character.LeyLinesCharacterSkinRegistry;
import dev.lumi.leylines.character.LeylinesCharacterRegistry;
import dev.lumi.leylines.init.LeyLinesComponents;
import dev.lumi.leylines.util.TextOptions;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.command.CommandSource;
import net.minecraft.command.argument.IdentifierArgumentType;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.server.command.CommandManager.argument;

public class LeylinesCharacterCommand {
    public LeylinesCharacterCommand() {
    }

    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, CommandRegistryAccess registryAccess, CommandManager.RegistrationEnvironment environment) {
        dispatcher.register(CommandManager.literal("leylines")
                .then(CommandManager.literal("character")
                        .then(CommandManager.literal("set")
                                .then(argument("id", IdentifierArgumentType.identifier())
                                        .suggests((ctx, builder) -> characterSuggestion(builder))
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
                        .then(CommandManager.literal("skin")
                                .then(argument("id", IdentifierArgumentType.identifier())
                                        .suggests((ctx, builder) -> skinSuggestion(ctx, builder))
                                        .executes(ctx -> {
                                            ServerPlayerEntity player = ctx.getSource().getPlayer();
                                            if (player == null) {
                                                return 0;
                                            }

                                            Identifier skinId = IdentifierArgumentType.getIdentifier(ctx, "id");
                                            PlayerCharacterComponent characterComponent = LeyLinesComponents.CHARACTER.get(player);
                                            Identifier activeCharacter = characterComponent.getActiveCharacter();
                                            if (activeCharacter.equals(LeyLines.id("none"))) {
                                                ctx.getSource().sendFeedback(() -> TextOptions.withColor("Ley Lines §> No active character.", 0XFF001E, TextOptions.color(Formatting.DARK_RED)), false);
                                                return 0;
                                            }

                                            CharacterSkinDefinition skin = LeyLinesCharacterSkinRegistry.get(skinId);
                                            if (skin == null) {
                                                ctx.getSource().sendFeedback(() -> TextOptions.withColor("Ley Lines §> Unknown skin.", 0XFF001E, TextOptions.color(Formatting.DARK_RED)), false);
                                                return 0;
                                            }

                                            if (!skin.character().equals(activeCharacter)) {
                                                ctx.getSource().sendFeedback(() -> TextOptions.withColor("Ley Lines §> That skin does not belong to this character.", 0XFF001E, TextOptions.color(Formatting.DARK_RED)), false);
                                                return 0;
                                            }

                                            characterComponent.setEquippedSkin(activeCharacter, skinId);
                                            ctx.getSource().sendFeedback(() -> TextOptions.withColor("Ley Lines §> Equipped skin '" + skinId + "'", 0xFFFFFF, TextOptions.color(Formatting.GRAY)), false);
                                            return 1;
                                        })
                                )
                        )
                )
                .then(CommandManager.literal("party")
                        .then(CommandManager.literal("set")
                                .then(CommandManager.argument("slot", IntegerArgumentType.integer(0, 3))
                                        .then(CommandManager.argument("id", IdentifierArgumentType.identifier())
                                                .suggests((ctx, builder) -> characterSuggestion(builder))
                                                .executes(ctx -> {
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
                                                })
                                        )
                                )
                        )
                        .then(CommandManager.literal("clear")
                                .executes(ctx -> {
                                    ServerPlayerEntity player = ctx.getSource().getPlayer();
                                    PlayerPartyComponent party = LeyLinesComponents.PARTY.get(player);

                                    for (int i = 0; i < 4; i++) {
                                        party.setSlot(i, LeyLines.id("none"));
                                    }

                                    ctx.getSource().sendFeedback(() -> TextOptions.withColor("Ley Lines §> Party cleared", 0xFFFFFF, TextOptions.color(Formatting.GRAY)), false);
                                    return 1;
                                })
                        )
                )
                .then(CommandManager.literal("adventurerank")
                        .then(CommandManager.literal("rank")
                                .then(CommandManager.literal("set")
                                        .then(CommandManager.argument("level", IntegerArgumentType.integer(0, 60))
                                                .executes(ctx -> {
                                                    ServerPlayerEntity player = ctx.getSource().getPlayer();
                                                    int adventureRank = IntegerArgumentType.getInteger(ctx, "level");
                                                    PlayerProfileComponent profileComponent = (PlayerProfileComponent) LeyLinesComponents.PROFILE.get(player);

                                                    if (profileComponent == null) {
                                                        ctx.getSource().sendFeedback(() -> TextOptions.withColor("Ley Lines §> Player profile unknown.", 0XFF001E, TextOptions.color(Formatting.DARK_RED)), false);
                                                        return 0;
                                                    }

                                                    profileComponent.setAdventureRank(adventureRank);
                                                    PlayerProfileComponent.AdventureRankData current = PlayerProfileComponent.AdventureRankData.byRank(adventureRank);
                                                    profileComponent.setAdventureEXP(current.getCumulativeEXP());
                                                    ctx.getSource().sendFeedback(() -> TextOptions.withColor("Ley Lines §> Set Adventure Rank to " + adventureRank + "!", 0xFFFFFF, TextOptions.color(Formatting.GRAY)), false);
                                                    return 1;
                                                })
                                        )
                                )
                                .then(CommandManager.literal("get")
                                        .executes(ctx -> {
                                            ServerPlayerEntity player = ctx.getSource().getPlayer();
                                            PlayerProfileComponent profileComponent = (PlayerProfileComponent) LeyLinesComponents.PROFILE.get(player);
                                            int adventureRank = profileComponent.getAdventureRank();

                                            if (profileComponent == null) {
                                                ctx.getSource().sendFeedback(() -> TextOptions.withColor("Ley Lines §> Player profile unknown.", 0XFF001E, TextOptions.color(Formatting.DARK_RED)), false);
                                                return 0;
                                            }

                                            ctx.getSource().sendFeedback(() -> TextOptions.withColor("Ley Lines §> Players Adventure Rank is " + adventureRank + "!", 0xFFFFFF, TextOptions.color(Formatting.GRAY)), false);
                                            return 1;
                                        })
                                )
                        )
                        .then(CommandManager.literal("exp")
                                .then(CommandManager.literal("add")
                                        .then(CommandManager.argument("exp", IntegerArgumentType.integer())
                                                .executes(ctx -> {
                                                    ServerPlayerEntity player = ctx.getSource().getPlayer();
                                                    int exp = IntegerArgumentType.getInteger(ctx, "exp");
                                                    PlayerProfileComponent profileComponent = (PlayerProfileComponent) LeyLinesComponents.PROFILE.get(player);

                                                    if (profileComponent == null) {
                                                        ctx.getSource().sendFeedback(() -> TextOptions.withColor("Ley Lines §> Player profile unknown.", 0XFF001E, TextOptions.color(Formatting.DARK_RED)), false);
                                                        return 0;
                                                    }

                                                    profileComponent.addAdventureEXP(exp);
                                                    ctx.getSource().sendFeedback(() -> TextOptions.withColor("Ley Lines §> Added " + exp + " Adventure EXP!", 0xFFFFFF, TextOptions.color(Formatting.GRAY)), false);
                                                    return 1;
                                                })
                                        )
                                )
                                .then(CommandManager.literal("set")
                                        .then(CommandManager.argument("exp", IntegerArgumentType.integer())
                                                .executes(ctx -> {
                                                    ServerPlayerEntity player = ctx.getSource().getPlayer();
                                                    int exp = IntegerArgumentType.getInteger(ctx, "exp");
                                                    PlayerProfileComponent profileComponent = (PlayerProfileComponent) LeyLinesComponents.PROFILE.get(player);

                                                    if (profileComponent == null) {
                                                        ctx.getSource().sendFeedback(() -> TextOptions.withColor("Ley Lines §> Player profile unknown.", 0XFF001E, TextOptions.color(Formatting.DARK_RED)), false);
                                                        return 0;
                                                    }

                                                    profileComponent.setAdventureEXP(exp);
                                                    ctx.getSource().sendFeedback(() -> TextOptions.withColor("Ley Lines §> Set Adventure Rank to " + exp + "!", 0xFFFFFF, TextOptions.color(Formatting.GRAY)), false);
                                                    return 1;
                                                })
                                        )
                                )
                                .then(CommandManager.literal("get")
                                        .executes(ctx -> {
                                            ServerPlayerEntity player = ctx.getSource().getPlayer();
                                            PlayerProfileComponent profileComponent = (PlayerProfileComponent) LeyLinesComponents.PROFILE.get(player);
                                            int exp = profileComponent.getAdventureEXP();

                                            if (profileComponent == null) {
                                                ctx.getSource().sendFeedback(() -> TextOptions.withColor("Ley Lines §> Player profile unknown.", 0XFF001E, TextOptions.color(Formatting.DARK_RED)), false);
                                                return 0;
                                            }

                                            ctx.getSource().sendFeedback(() -> TextOptions.withColor("Ley Lines §> Players Adventure EXP is " + exp + "!", 0xFFFFFF, TextOptions.color(Formatting.GRAY)), false);
                                            return 1;
                                        })
                                )
                        )
                )
        );
    }

    public static CompletableFuture<Suggestions> characterSuggestion(SuggestionsBuilder builder) {
        return CommandSource.suggestIdentifiers(LeylinesCharacterRegistry.ids(), builder);
    }

    public static CompletableFuture<Suggestions> skinSuggestion(CommandContext<ServerCommandSource> ctx, SuggestionsBuilder builder) {
        try {
            ServerPlayerEntity player = ctx.getSource().getPlayer();
            if (player == null) {
                return builder.buildFuture();
            }

            Identifier activeCharacter = LeyLinesComponents.CHARACTER.get(player).getActiveCharacter();
            if (activeCharacter.equals(LeyLines.id("none"))) {
                return builder.buildFuture();
            }

            return CommandSource.suggestIdentifiers(LeyLinesCharacterSkinRegistry.idsForCharacter(activeCharacter), builder);
        } catch (Exception e) {
            return builder.buildFuture();
        }
    }
}
