package assets.Geology.common;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabGeology extends CreativeTabs {

	public CreativeTabGeology(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex(){
		return Block.anvil.blockID;
		
	}
	
	public String getTranslatedTabLabels(){
		return "Geology";
		
	}
	
}
