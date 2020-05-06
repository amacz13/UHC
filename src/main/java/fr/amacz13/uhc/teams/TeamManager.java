package fr.amacz13.uhc.teams;

import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.HashMap;

public class TeamManager {

    private static TeamManager tm = new TeamManager();

    private ArrayList<Team> allTeams = new ArrayList<>();
    private ArrayList<Team> teamsIngame = new ArrayList<>();
    private HashMap<Player,Team> playerTeam = new HashMap<>();

    private TeamManager() {

    }

    public static TeamManager getInstance() {
        return tm;
    }


}
