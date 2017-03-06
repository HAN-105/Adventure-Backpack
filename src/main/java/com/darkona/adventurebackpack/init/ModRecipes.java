package com.darkona.adventurebackpack.init;

import java.lang.reflect.Field;

import com.darkona.adventurebackpack.config.ConfigHandler;
import com.darkona.adventurebackpack.init.recipes.BackpackRecipesList;
import com.darkona.adventurebackpack.reference.BackpackNames;
import com.darkona.adventurebackpack.util.LogHelper;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * Created on 20/10/2014
 *
 * @author Darkona
 */
public class ModRecipes
{
    private static ItemStack bc(int damage)
    {
        return BackpackNames.setBackpackColorNameFromDamage(new ItemStack(ModItems.adventureBackpack), damage);
    }

    public static void init()
    {
        if (ConfigHandler.recipeSaddle)
        {
            GameRegistry.addRecipe(new ItemStack(Items.saddle),
                    "LLL",
                    "L L",
                    "I I",
                    'L', Items.leather,
                    'I', Items.iron_ingot);
        }

        //Copter Pack
        if (ConfigHandler.recipeCopterPack)
        {
            GameRegistry.addRecipe(new ItemStack(ModItems.copterPack),
                    "WBW",
                    "TEI",
                    "CDI",
                    'W', Blocks.planks,
                    'B', new ItemStack(ModItems.component, 1, 6),
                    'T', new ItemStack(ModItems.component, 1, 2),
                    'E', new ItemStack(ModItems.component, 1, 5),
                    'C', new ItemStack(Items.dye, 1, 2),
                    'D', Items.diamond,
                    'I', Items.iron_ingot);
        }

        //CoalJetpack
        if (ConfigHandler.recipeCoalJetpack)
        {
            GameRegistry.addRecipe(new ItemStack(ModItems.CoalJetpack),
                    "SWT",
                    "GIG",
                    "FWS",
                    'W', Blocks.planks,
                    'G', Items.gold_ingot,
                    'I', Items.iron_ingot,
                    'S', Blocks.stone,
                    'F', Blocks.furnace,
                    'T', new ItemStack(ModItems.component, 1, 2));
        }

        //change to make it not support BuildCraft there are people out there who dont like that mod
        //CampFire
        GameRegistry.addRecipe(new ShapedOreRecipe(ModBlocks.blockCampFire,
                " S ",
                "SxS",
                "ccc",
                'S', "stickWood",
                'x', Items.coal,
                'c', "cobblestone"));

        //Sleeping Bag
        GameRegistry.addRecipe(new ItemStack(ModItems.component, 1, 1),
                "  X",
                "CCC",
                'X', Blocks.wool,
                'C', Blocks.carpet);

        //Backpack Tank
        GameRegistry.addRecipe(new ItemStack(ModItems.component, 1, 2),
                "GIG",
                "GGG",
                "GIG",
                'G', Blocks.glass,
                'I', Items.iron_ingot);

        //Inflatable Boat
        if (ConfigHandler.recipeInflatableBoat)
        {
            GameRegistry.addRecipe(new ItemStack(ModItems.component, 1, 7),
                    "   ",
                    "w w",
                    "sws",
                    'w', Blocks.wool,
                    's', Blocks.sand);
        }

        //Inflatable Boat (Motorized)
        if (ConfigHandler.recipeInflatableBoatM && ConfigHandler.recipeInflatableBoat)
        {
            GameRegistry.addRecipe(new ItemStack(ModItems.component, 1, 8),
                    " B ",
                    " E ",
                    " H ",
                    'B', new ItemStack(ModItems.component, 1, 7),
                    'H', new ItemStack(ModItems.component, 1, 9),
                    'E', new ItemStack(ModItems.component, 1, 5));
        }

        //Hose Nozzle
        GameRegistry.addRecipe(new ItemStack(ModItems.component, 1, 3),
                " G ",
                "ILI",
                "   ",
                'G', Items.gold_ingot,
                'I', Items.iron_ingot,
                'L', Blocks.lever);

        if (ConfigHandler.recipeMachete)
        {
            //Machete Handle
            GameRegistry.addRecipe(new ItemStack(ModItems.component, 1, 4),
                    "YIY",
                    "BSB",
                    "RbR",
                    'Y', new ItemStack(Items.dye, 1, 11),
                    'B', new ItemStack(Items.dye, 1, 4),
                    'R', new ItemStack(Items.dye, 1, 1),
                    'b', new ItemStack(Items.dye, 1, 0),
                    'I', Items.iron_ingot,
                    'S', Items.stick);

            //Machete
            GameRegistry.addRecipe(new ItemStack(ModItems.machete),
                    " I ",
                    " I ",
                    " H ",
                    'I', Items.iron_ingot,
                    'H', new ItemStack(ModItems.component, 1, 4));
        }

        //Clockwork Crossbow
        if (ConfigHandler.recipeClockCrossbow)
        {
            GameRegistry.addRecipe(new ItemStack(ModItems.cwxbow),
                    "   ",
                    "BA ",
                    "SW ",
                    'B', Items.bow,
                    'A', Items.arrow,
                    'S', Items.stick,
                    'W', Blocks.planks);
        }

        if (ConfigHandler.recipeAdventuresSet)
        {
            //Adventure Hat
            GameRegistry.addRecipe(new ItemStack(ModItems.adventureHat),
                    "   ",
                    "nC ",
                    "LLL",
                    'n', Items.gold_nugget,
                    'C', Items.leather_helmet,
                    'L', Items.leather);

            //Adventure Suit
            GameRegistry.addRecipe(new ItemStack(ModItems.adventureSuit),
                    "LWL",
                    "LVL",
                    "   ",
                    'V', Items.leather_chestplate,
                    'W', Blocks.wool,
                    'L', Items.leather);

            //Adventure Pants
            GameRegistry.addRecipe(new ItemStack(ModItems.adventurePants),
                    "LVL",
                    "LWL",
                    "   ",
                    'V', Items.leather_leggings,
                    'W', Blocks.wool,
                    'L', Items.leather);
        }

        //Piston Boots
        if (ConfigHandler.recipePitonBoots)
        {
            GameRegistry.addRecipe(new ItemStack(ModItems.pistonBoots),
                    " B ",
                    "PSP",
                    'B', Items.leather_boots,
                    'P', Blocks.piston,
                    'S', Items.slime_ball);
        }

        //Melon Juice Bottle
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.melonJuiceBottle), Items.melon, Items.potionitem);

        //Hose
        GameRegistry.addRecipe(new ItemStack(ModItems.hose),
                "NGG",
                "  G",
                'N', new ItemStack(ModItems.component, 1, 3),
                'G', new ItemStack(Items.dye, 1, 2));

        BackpackRecipesList br = new BackpackRecipesList();
        int counter = 0;
        for (int i = 0; i < BackpackNames.backpackNames.length; i++)
        {
            for (Field field : BackpackRecipesList.class.getFields())
            {
                try
                {
                    if (field.getName().equals((BackpackNames.backpackNames[i])))
                    {
                        GameRegistry.addRecipe(new ShapedOreRecipe(BackpackNames.setBackpackColorNameFromDamage(new ItemStack(ModItems.adventureBackpack), i), (Object[]) field.get(br)));
                        counter++;
                    }
                } catch (Exception oops)
                {
                    LogHelper.error("Huge mistake during reflection. Some bad things might happen: " + oops.getClass().getName());
                    oops.printStackTrace();
                }
            }

        }
        LogHelper.info("Loaded " + counter + " backpack recipes.");

        //GameRegistry.addRecipe(new AbstractBackpackRecipe());
        /*BackpackRecipes br = new BackpackRecipes();
        int i = 0;
        for (Field field : BackpackRecipes.class.getFields())
        {
            try
            {
                if (field.getType() == ItemStack[].class)
                {
                    AbstractBackpackRecipeTwo recipe = new AbstractBackpackRecipeTwo(field.getName(), (ItemStack[]) field.get(br));
                    GameRegistry.addRecipe(recipe);
                    //LogHelper.info("Loaded recipe for " + field.getName() + " backpack.");
                    i++;
                }
            } catch (Exception oops)
            {
                LogHelper.error("Huge mistake during reflection. Some bad things might happen.");
            }
        }
        LogHelper.info("Loaded " + i + " backpack recipes.");
        RecipeSorter.register(ModInfo.MOD_ID + ":adventureBackpack", AbstractBackpackRecipeTwo.class, RecipeSorter.Category.SHAPED, "after:minecraft:shapeless");
        */
    }

    public static void conditionalInit()
    {
        {
            //Copter Engine
            GameRegistry.addRecipe(new ItemStack(ModItems.component, 1, 5),
                    "IGI",
                    "PCP",
                    "FOF",
                    'I', Items.iron_ingot,
                    'G', Items.gold_ingot,
                    'P', Blocks.piston,
                    'F', Blocks.furnace,
                    'C', Items.cauldron,
                    'O', Blocks.obsidian);

            //Copter Blades
            GameRegistry.addRecipe(new ItemStack(ModItems.component, 1, 6),
                    "III",
                    " F ",
                    " F ",
                    'I', Items.iron_ingot,
                    'F', Blocks.fence);

            //Hydro Blades
            GameRegistry.addRecipe(new ItemStack(ModItems.component, 1, 9),
                    " F ",
                    " F ",
                    "III",
                    'I', Items.iron_ingot,
                    'F', Blocks.fence);
        }
    }
}