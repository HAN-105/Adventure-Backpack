package com.darkona.adventurebackpack.item;

import com.darkona.adventurebackpack.CreativeTabAB;
import com.darkona.adventurebackpack.reference.ModInfo;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
//import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Darkona on 10/10/2014.
 */
public class ItemAB extends Item
{

    public ItemAB()
    {
        super();
        setCreativeTab(CreativeTabAB.ADVENTURE_BACKPACK_CREATIVE_TAB);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack)
    {
        return String.format("item.%s%s", ModInfo.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", ModInfo.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getUnlocalizedName(String name)
    {
        return String.format("item.%s%s", ModInfo.MOD_ID.toLowerCase() + ":", name);
    }

    //@Override
    //@SideOnly(Side.CLIENT)
    //public void registerIcons(IIconRegister iconRegister)
    //{
    //    itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    //}

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
