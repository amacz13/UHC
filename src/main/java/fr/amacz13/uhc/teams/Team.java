package fr.amacz13.uhc.teams;

import fr.amacz13.uhc.state.GameStateManager;
import fr.amacz13.uhc.utilities.ColorConverter;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.Banner;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.ArrayList;

public class Team {

    private final String name;
    private final ArrayList<Player> players;
    private final ChatColor chatColor;
    private final ItemStack banner;
    private TeamStatus status;


    public Team(String n, ChatColor c, PatternType p){
        ColorConverter cc = ColorConverter.getInstance();

        this.name = n;
        this.chatColor = c;
        this.players = new ArrayList<Player>();
        this.banner = new ItemStack(Material.WHITE_BANNER,1);
        BannerMeta bMeta = (BannerMeta) this.banner.getItemMeta();
        bMeta.setBaseColor(cc.getDyeColor(c));
        bMeta.addPattern(new Pattern(cc.getDyeColor(c) == DyeColor.WHITE ? DyeColor.BLACK : DyeColor.WHITE, p));
        this.banner.setItemMeta(bMeta);
        this.status = TeamStatus.EMPTY;

    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(Player player){
        if (isPlayerInTeam(player)) this.players.remove(player);
        GameStateManager gms = GameStateManager.getInstance();
        switch (gms.getGameState()){
            case WAITING:
            case LAUNCHING:
                if (this.players.size() == 0) this.status = TeamStatus.EMPTY;
                break;
            case INGAME:
            case ENDING:
                if (this.players.size() == 0) this.status = TeamStatus.ELIMINATED;
                break;
        }
    }

    public boolean isPlayerInTeam(Player player) {
        return this.players.contains(player);
    }

    public ChatColor getChatColor() {
        return chatColor;
    }

    public ItemStack getBanner() {
        return banner;
    }
}
