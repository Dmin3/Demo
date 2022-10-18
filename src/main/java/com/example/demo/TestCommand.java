package com.example.demo;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TestCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        player.sendMessage("테스트 명령어 실행");

        Location location = player.getLocation();
        player.sendMessage("현재 위치는 " + " X좌표 : " + location.getBlockX() + " Y좌표 : " + location.getBlockY() + " Z좌표 : " + location.getBlockZ() + " 이에요~");

        return true;
    }
}
