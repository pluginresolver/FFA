/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harry5573.ffa.api;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 *
 * @author Harry5573
 */
public class PlayerKillPlayerInFFAEvent extends Event {
 
    private static final HandlerList handlers = new HandlerList();
    private int killstreak;
    private Player player;
    
    public PlayerKillPlayerInFFAEvent(final Player p, final int ks) {
        this.killstreak = ks;
        this.player = p;
    }
    
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public Player getPlayer() {
        return player;
    }

    public int getKillStreak() {
        return killstreak;
    }
}