package com.example.demo;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
    @Override
    public void onEnable() { // 플러그인 활성화시 실행
        getLogger().info("HIHI This is my First Demo Plugin Welcome~~");
        getServer().getPluginManager().registerEvents(new HelloWorld(), this);
        getCommand("location").setExecutor(new TestCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("plugin Exit");
    }
}
