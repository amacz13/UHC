package fr.amacz13.uhc;

import fr.amacz13.uhc.commands.HealCommand;
import fr.amacz13.uhc.commands.LagCommand;
import fr.amacz13.uhc.commands.QUHCCommand;
import fr.amacz13.uhc.commands.ReviveCommand;
import fr.amacz13.uhc.events.Blocks;
import fr.amacz13.uhc.events.Connections;
import fr.amacz13.uhc.events.Entities;
import fr.amacz13.uhc.events.Players;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("[UHC] Enabling UHC Plugin...");

        getLogger().info("[UHC] Activating Events");
        getServer().getPluginManager().registerEvents(new Blocks(), this);
        getServer().getPluginManager().registerEvents(new Entities(), this);
        getServer().getPluginManager().registerEvents(new Players(), this);
        getServer().getPluginManager().registerEvents(new Connections(), this);

        getLogger().info("[UHC] Activating Commands");
        this.getCommand("quhc").setExecutor(new QUHCCommand());
        this.getCommand("revive").setExecutor(new ReviveCommand());
        this.getCommand("heal").setExecutor(new HealCommand());
        this.getCommand("lag").setExecutor(new LagCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("[UHC] Disabling UHC Plugin...!");
    }

}
