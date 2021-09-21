package de.zerx.games;

import java.io.File;

/**
 * Created by Till O. aka. ZerX
 * <p>
 * Project name: Discord-GameServer-Bot<p>
 * This file is created at 21.09.2021 23:30
 */
public class GameGarysmod {

    String Owner;
    Boolean isServerStarted = false;

    public GameGarysmod(String Owner) {
        this.Owner = Owner;
    }

    public void createServer() {
        File file = new File("/GameServer/GarrysMod/" + Owner + "");
    }






}
