package de.zerx;

import de.zerx.commands.Command;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;

import javax.security.auth.login.LoginException;

/**
 * Created by Till O. aka. ZerX
 * <p>
 * Project name: Discord-GameServer-Bot<p>
 * This file is created at 19.09.2021 13:53
 */
public class Main {

    public static void main(String[] args) throws LoginException {

        JDA jda = JDABuilder.createDefault(TempData_NSFS.DISCORD_TOKEN)
                .setStatus(OnlineStatus.DO_NOT_DISTURB)
                .addEventListeners(new Command())
                .build();
    }
}
