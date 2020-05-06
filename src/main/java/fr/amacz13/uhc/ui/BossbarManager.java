package fr.amacz13.uhc.ui;

import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;

import java.util.HashMap;

public class BossbarManager {

    private static BossbarManager bbm = new BossbarManager();

    private HashMap<Player, BossBar> playersBar = new HashMap<>();

    private BossbarManager() {

    }

    public static BossbarManager getInstance() {
        return bbm;
    }



}
