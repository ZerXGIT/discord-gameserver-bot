package de.zerx.games.utils;

/**
 * Created by Till O. aka. ZerX
 * <p>
 * Project name: Discord-GameServer-Bot<p>
 * This file was created at 23.09.2021 23:19
 */
public class GameserverObject {

    String Owner;
    String GameServerId;

    Game Game;

    public GameserverObject(String Owner, Game Game, String GameServerId) {
        this.Owner = Owner;
        this.Game = Game;
        this.GameServerId = GameServerId;
    }
}
