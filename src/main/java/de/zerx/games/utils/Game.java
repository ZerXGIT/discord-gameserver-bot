package de.zerx.games.utils;

/**
 * Created by Till O. aka. ZerX
 * <p>
 * Project name: Discord-GameServer-Bot<p>
 * This file was created at 23.09.2021 23:20
 */
public enum Game {

    GarrysMod("Garry's Mod"),
    Minecraft("Minecraft"),
    CsGo("CS:GO");

    String Name;

    Game(String Name) {
        this.Name = Name;
    }


}
