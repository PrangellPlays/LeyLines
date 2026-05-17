package dev.lumi.leylines;

import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;

public class LeyLinesPreLaunchEntrypoint implements PreLaunchEntrypoint {

    @Override
    public void onPreLaunch() {
        System.setProperty("devauth.enabled", "true");
        System.setProperty("devauth.account", "main");
    }
}
