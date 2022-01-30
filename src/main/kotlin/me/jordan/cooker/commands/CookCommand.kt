package me.jordan.cooker.commands

import me.jordan.cooker.Cookables
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

/**
 * The /cook command
 *
 * @author Jordan Di Marcantonio
 */
class CookCommand : CommandExecutor {

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if(sender !is Player) {
            sender.sendMessage("Error: only players can execute this command")
            return false
        }

        val player = sender.player ?: return false

        val item = player.inventory.itemInMainHand

        player.sendMessage("You are holding: $item!")

        if(Cookables.values().any { it.raw == item.type }) {
            player.sendMessage("This can be cooked!")
        } else {
            player.sendMessage("you can't cook this mate!")
        }

        return true
    }
}