package assets.Geology.common.items;

import assets.Geology.common.mod_Geology;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ItemTungstenIngot extends Item{

    public ItemTungstenIngot(int par1, Material iron) {
        super(par1);
        this.setCreativeTab(mod_Geology.GeologyTab);

    }

}
