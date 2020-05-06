package fr.amacz13.uhc.utilities;

import org.bukkit.ChatColor;
import org.bukkit.DyeColor;

public class ColorConverter {

    private static ColorConverter cc = new ColorConverter();

    private ColorConverter() {

    }

    public static ColorConverter getInstance() {
        return cc;
    }

    public DyeColor getDyeColor(ChatColor cc) {
        DyeColor d = DyeColor.WHITE;
        switch (cc) {
            case BLACK:
                d = DyeColor.BLACK;
                break;
            case DARK_BLUE:
                d = DyeColor.BLUE;
                break;
            case DARK_GREEN:
                d = DyeColor.GREEN;
                break;
            case DARK_AQUA:
                d = DyeColor.CYAN;
                break;
            case DARK_RED:
                d = DyeColor.RED;
                break;
            case DARK_PURPLE:
                d = DyeColor.PURPLE;
                break;
            case GOLD:
                d = DyeColor.ORANGE;
                break;
            case GRAY:
                d = DyeColor.LIGHT_GRAY;
                break;
            case DARK_GRAY:
                d = DyeColor.GRAY;
                break;
            case BLUE:
                d = DyeColor.LIGHT_BLUE;
                break;
            case GREEN:
                d = DyeColor.LIME;
                break;
            case AQUA:
                d = DyeColor.MAGENTA;
                break;
            case RED:
                d = DyeColor.BROWN;
                break;
            case LIGHT_PURPLE:
                d = DyeColor.PINK;
                break;
            case YELLOW:
                d = DyeColor.YELLOW;
                break;
            case WHITE:
                d = DyeColor.WHITE;
                break;
        }
        return d;
    }


}
