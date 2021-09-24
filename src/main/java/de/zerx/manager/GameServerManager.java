package de.zerx.manager;

import de.zerx.games.utils.GameserverObject;

import java.util.HashMap;

/**
 * Created by Till O. aka. ZerX
 * <p>
 * Project name: Discord-GameServer-Bot<p>
 * This file is created at 21.09.2021 23:27
 */

public class GameServerManager {

    public static HashMap<String, GameserverObject> Server = new HashMap<>();
    Boolean isStarted = false;

    public GameServerManager() {

    }

    public static boolean createGameServer() {



        return false;
    }


    public Boolean getStarted() {
        return isStarted;
    }

    public void setStarted(Boolean started) {
        isStarted = started;
    }
}
