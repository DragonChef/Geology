package mod.Geology.common.items;

import mod.Geology.common.mod_Geology;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemTungstenIngot extends Item{

    public ItemTungstenIngot(int par1, Material iron) {
        super(par1);
        this.setCreativeTab(mod_Geology.GeologyTab);

    }

}
