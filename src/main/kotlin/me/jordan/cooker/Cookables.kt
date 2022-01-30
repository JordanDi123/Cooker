package me.jordan.cooker

import org.bukkit.Material

/**
 * This enum stores all the items which can be cooked
 *
 * @author Jordan Di Marcantonio
 */
enum class Cookables(val raw: Material, val cooked: Material) {
    POTATO(Material.POTATO, Material.BAKED_POTATO),
    CHICKEN(Material.CHICKEN, Material.COOKED_CHICKEN),
    COD(Material.COD, Material.COOKED_COD),
    MUTTON(Material.MUTTON, Material.COOKED_MUTTON),
    PORKCHOP(Material.PORKCHOP, Material.COOKED_PORKCHOP),
    RABBIT(Material.RABBIT, Material.COOKED_RABBIT),
    SALMON(Material.SALMON, Material.COOKED_SALMON),
    KELP(Material.KELP, Material.DRIED_KELP),
    BEEF(Material.BEEF, Material.COOKED_BEEF),
}