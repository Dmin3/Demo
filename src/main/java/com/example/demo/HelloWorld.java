package com.example.demo;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class HelloWorld implements Listener {
    @EventHandler
    public void sendTitle(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.sendTitle("Demo 플러그인 입니다!", "By Dmin3", 10, 100, 20);
    }
}
