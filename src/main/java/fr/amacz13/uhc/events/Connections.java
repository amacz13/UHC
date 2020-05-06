package fr.amacz13.uhc.events;

import de.Herbystar.TTA.TTA_Methods;
import fr.amacz13.uhc.state.GameStateManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Connections implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        event.setJoinMessage(null);
        Player player = event.getPlayer();
        switch (GameStateManager.getInstance().getGameState()) {
            case WAITING:
            case LAUNCHING:
                for (Player p : Bukkit.getOnlinePlayers()) TTA_Methods.sendActionBar(p,"§6"+player.getDisplayName()+" §7a rejoint la partie §c("+Bukkit.getOnlinePlayers()+"/"+Bukkit.getMaxPlayers()+")");
                break;
            case INGAME:

                break;
            case ENDING:

                break;
        }
    }

    @EventHandler
    public void onLeave(PlayerQuitEvent event){

    }

}
