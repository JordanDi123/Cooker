package me.jordan.cooker

import me.jordan.cooker.commands.CookCommand
import org.bukkit.plugin.java.JavaPlugin

/**
 * This is the main class for the Cooker plugin
 *
 * @author Jordan Di Marcantonio
 */
class Main : JavaPlugin() {

    override fun onEnable() {
        this.getCommand("cook")!!.setExecutor(CookCommand())
    }

    override fun onDisable() {
    }
}