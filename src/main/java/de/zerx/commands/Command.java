package de.zerx.commands;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.EventListener;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * Created by Till O. aka. ZerX
 * <p>
 * Project name: Discord-GameServer-Bot<p>
 * This file is created at 21.09.2021 10:39
 */
public class Command extends ListenerAdapter {

    String prefix = ".";

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        String message = event.getMessage().getContentRaw();
        String[] args = message.replaceFirst(prefix, "").split(" ");

        TextChannel channel = event.getTextChannel();
        Member member = event.getMember();

        if(channel.getId().equals("889122544312004658"))
        if(message.startsWith(prefix)){
            if(args[0].equalsIgnoreCase("help")) {
                channel.sendMessage("Help").queue();
            }

        }

    }
}
