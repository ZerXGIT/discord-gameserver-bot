package de.zerx.game;

/**
 * Created by Till O. aka. ZerX
 * <p>
 * Project name: Discord-GameServer-Bot<p>
 * This file was created at 23.09.2021 23:19
 */
public class GameserverObject {

    String Owner;
    String GameServerId;

    de.zerx.game.Game Game;

    public GameserverObject(String Owner, de.zerx.game.Game Game, String GameServerId) {
        this.Owner = Owner;
        this.Game = Game;
        this.GameServerId = GameServerId;
    }
}
