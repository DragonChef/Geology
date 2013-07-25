package mod.Geology.common;

import mod.Geology.common.blocks.BlockAdamantiumOre;
import mod.Geology.common.blocks.BlockAmberOre;
import mod.Geology.common.blocks.BlockCobaltOre;
import mod.Geology.common.blocks.BlockCopperOre;
import mod.Geology.common.blocks.BlockMithrilOre;
import mod.Geology.common.blocks.BlockOpalOre;
import mod.Geology.common.blocks.BlockOrichalcumOre;
import mod.Geology.common.blocks.BlockPeridotOre;
import mod.Geology.common.blocks.BlockSilverOre;
import mod.Geology.common.blocks.BlockSinniumOre;
import mod.Geology.common.blocks.BlockSkyIronOre;
import mod.Geology.common.blocks.BlockStarRubyOre;
import mod.Geology.common.blocks.BlockTantalumOre;
import mod.Geology.common.blocks.BlockTinOre;
import mod.Geology.common.blocks.BlockTitaniumOre;
import mod.Geology.common.blocks.BlockTungstenOre;
import mod.Geology.common.items.ItemAdamantiumIngot;
import mod.Geology.common.items.ItemAmber;
import mod.Geology.common.items.ItemAmethyst;
import mod.Geology.common.items.ItemBloodstone;
import mod.Geology.common.items.ItemCobaltIngot;
import mod.Geology.common.items.ItemCopperIngot;
import mod.Geology.common.items.ItemMalachite;
import mod.Geology.common.items.ItemMithrilIngot;
import mod.Geology.common.items.ItemMoonstone;
import mod.Geology.common.items.ItemOnyx;
import mod.Geology.common.items.ItemOpal;
import mod.Geology.common.items.ItemOrichalcumIngot;
import mod.Geology.common.items.ItemPeridot;
import mod.Geology.common.items.ItemSilverIngot;
import mod.Geology.common.items.ItemSinniumIngot;
import mod.Geology.common.items.ItemSkyIronIngot;
import mod.Geology.common.items.ItemStarRuby;
import mod.Geology.common.items.ItemStarSapphire;
import mod.Geology.common.items.ItemSunstone;
import mod.Geology.common.items.ItemTantalumIngot;
import mod.Geology.common.items.ItemTinIngot;
import mod.Geology.common.items.ItemTitaniumIngot;
import mod.Geology.common.items.ItemTopaz;
import mod.Geology.common.items.ItemTungstenIngot;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
//other imports
import net.minecraftforge.common.Configuration;

@Mod(modid="Geology", name="Geology", version="0.0.1A")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class mod_Geology {
	
	public static CreativeTabs GeologyTab=new CreativeTabs("Geology_GeologyTab"){
	    public ItemStack getIconItemStack(){
	        return new ItemStack(Item.skull);
	    }
	};
    @SidedProxy(clientSide="mod.Geology.common.ClientProxy", serverSide="mod.Geology.common.ServerProxy")
	public static ServerProxy proxy;
	

	//Blocks Ores
	public static Block TinOre;
	public static Block CopperOre;
	public static Block SilverOre;
	public static Block MithrilOre;
	public static Block TungstenOre;
	public static Block CobaltOre;
	public static Block OrichalcumOre;
	public static Block TantalumOre;
	public static Block TitaniumOre;
	public static Block AdamantiumOre;
	public static Block SinniumOre;
	public static Block SkyIronOre;
	public static Block AmberOre;
	public static Block PeridotOre;
	public static Block OpalOre;
	public static Block StarRubyOre;
	public static Block StarSapphireOre;
	public static Block AmethystOre;
	public static Block MalachiteOre;
	public static Block OnyxOre;
	public static Block TopazOre;
	public static Block SunstoneOre;
	public static Block MoonstoneOre;
	public static Block BloodstoneOre;
	
	int TinOreID;
	int CopperOreID;
	int SilverOreID;
	int MithrilOreID;
	int TungstenOreID;
	int CobaltOreID;
	int OrichalcumOreID;
	int TantalumOreID;
	int TitaniumOreID;
	int AdamantiumOreID;
	int SinniumOreID;
	int SkyIronOreID;
	int AmberOreID;
	int PeridotOreID;
	int OpalOreID;
	int StarRubyOreID;
	int StarSapphireOreID;
	int AmethystOreID;
	int MalachiteOreID;
	int OnyxOreID;
	int TopazOreID;
	int SunstoneOreID;
	int MoonstoneOreID;
	int BloodstoneOreID;
	
	//Blocks Storageblocks
	public static Block TinBlock;
	public static Block CopperBlock;
	public static Block SilverBlock;
	public static Block MithrilBlock;
	public static Block TungstenBlock;
	public static Block CobaltBlock;
	public static Block OrichalcumBlock;
	public static Block TantalumBlock;
	public static Block TitaniumBlock;
	public static Block AdamantiumBlock;
	public static Block SinniumBlock;
	public static Block SkyIronBlock;
	public static Block AmberBlock;
	public static Block PeridotBlock;
	public static Block OpalBlock;
	public static Block StarRubyBlock;
	public static Block StarSapphireBlock;
	public static Block AmethystBlock;
	public static Block MalachiteBlock;
	public static Block OnyxBlock;
	public static Block TopazBlock;
	public static Block SunstoneBlock;
	public static Block MoonstoneBlock;
	public static Block BloodstoneBlock;
	public static Block BronzeBlock;
	public static Block DragonSteelBlock;
	public static Block BlueSteelBlock;
	public static Block ElvishIronBlock;
	public static Block ToolSteelBlock;
	public static Block RadiantAdamantBlock;
	public static Block SoulSteelBlock;
	public static Block CelestialBronzeBlock;
	
	int TinBlockID;
	int CopperBlockID;
	int SilverBlockID;
	int MithrilBlockID;
	int TungstenBlockID;
	int CobaltBlockID;
	int OrichalcumBlockID;
	int TantalumBlockID;
	int TitaniumBlockID;
	int AdamantiumBlockID;
	int SinniumBlockID;
	int SkyIronBlockID;
	int AmberBlockID;
	int PeridotBlockID;
	int OpalBlockID;
	int StarRubyBlockID;
	int StarSapphireBlockID;
	int AmethystBlockID;
	int MalachiteBlockID;
	int OnyxBlockID;
	int TopazBlockID;
	int SunstoneBlockID;
	int MoonstoneBlockID;
	int BloodstoneBlockID;
	int BronzeBlockID;
	int DragonSteelBlockID;
	int BlueSteelBlockID;
	int ElvishIronBlockID;
	int ToolSteelBlockID;
	int RadiantAdamantBlockID;
	int SoulSteelBlockID;
	int CelestialBronzeBlockID;
	
	//Blocks Largebricks
	public static Block TinLargeBrick;
	public static Block CopperLargeBrick;
	public static Block SilverLargeBrick;
	public static Block MithrilLargeBrick;
	public static Block TungstenLargeBrick;
	public static Block CobaltLargeBrick;
	public static Block OrichalcumLargeBrick;
	public static Block TantalumLargeBrick;
	public static Block TitaniumLargeBrick;
	public static Block AdamantiumLargeBrick;
	public static Block SinniumLargeBrick;
	public static Block SkyIronLargeBrick;
	public static Block AmberLargeBrick;
	public static Block PeridotLargeBrick;
	public static Block OpalLargeBrick;
	public static Block StarRubyLargeBrick;
	public static Block StarSapphireLargeBrick;
	public static Block AmethystLargeBrick;
	public static Block MalachiteLargeBrick;
	public static Block OnyxLargeBrick;
	public static Block TopazLargeBrick;
	public static Block SunstoneLargeBrick;
	public static Block MoonstoneLargeBrick;
	public static Block BloodstoneLargeBrick;
	public static Block BronzeLargeBrick;
	public static Block DragonSteelLargeBrick;
	public static Block BlueSteelLargeBrick;
	public static Block ElvishIronLargeBrick;
	public static Block ToolSteelLargeBrick;
	public static Block RadiantAdamantLargeBrick;
	public static Block SoulSteelLargeBrick;
	public static Block CelestialBronzeLargeBrick;
	
	int TinLargeBrickID;
	int CopperLargeBrickID;
	int SilverLargeBrickID;
	int MithrilLargeBrickID;
	int TungstenLargeBrickID;
	int CobaltLargeBrickID;
	int OrichalcumLargeBrickID;
	int TantalumLargeBrickID;
	int TitaniumLargeBrickID;
	int AdamantiumLargeBrickID;
	int SinniumLargeBrickID;
	int SkyIronLargeBrickID;
	int AmberLargeBrickID;
	int PeridotLargeBrickID;
	int OpalLargeBrickID;
	int StarRubyLargeBrickID;
	int StarSapphireLargeBrickID;
	int AmethystLargeBrickID;
	int MalachiteLargeBrickID;
	int OnyxLargeBrickID;
	int TopazLargeBrickID;
	int SunstoneLargeBrickID;
	int MoonstoneLargeBrickID;
	int BloodstoneLargeBrickID;
	int BronzeLargeBrickID;
	int DragonSteelLargeBrickID;
	int BlueSteelLargeBrickID;
	int ElvishIronLargeBrickID;
	int ToolSteelLargeBrickID;
	int RadiantAdamantLargeBrickID;
	int SoulSteelLargeBrickID;
	int CelestialBronzeLargeBrickID;
	
	//Blocks Smallbricks
	public static Block TinSmallBrick;
	public static Block CopperSmallBrick;
	public static Block SilverSmallBrick;
	public static Block MithrilSmallBrick;
	public static Block TungstenSmallBrick;
	public static Block CobaltSmallBrick;
	public static Block OrichalcumSmallBrick;
	public static Block TantalumSmallBrick;
	public static Block TitaniumSmallBrick;
	public static Block AdamantiumSmallBrick;
	public static Block SinniumSmallBrick;
	public static Block SkyIronSmallBrick;
	public static Block AmberSmallBrick;
	public static Block PeridotSmallBrick;
	public static Block OpalSmallBrick;
	public static Block StarRubySmallBrick;
	public static Block StarSapphireSmallBrick;
	public static Block AmethystSmallBrick;
	public static Block MalachiteSmallBrick;
	public static Block OnyxSmallBrick;
	public static Block TopazSmallBrick;
	public static Block SunstoneSmallBrick;
	public static Block MoonstoneSmallBrick;
	public static Block BloodstoneSmallBrick;
	public static Block BronzeSmallBrick;
	public static Block DragonSteelSmallBrick;
	public static Block BlueSteelSmallBrick;
	public static Block ElvishIronSmallBrick;
	public static Block ToolSteelSmallBrick;
	public static Block RadiantAdamantSmallBrick;
	public static Block SoulSteelSmallBrick;
	public static Block CelestialBronzeSmallBrick;
	
	int TinSmallBrickID;
	int CopperSmallBrickID;
	int SilverSmallBrickID;
	int MithrilSmallBrickID;
	int TungstenSmallBrickID;
	int CobaltSmallBrickID;
	int OrichalcumSmallBrickID;
	int TantalumSmallBrickID;
	int TitaniumSmallBrickID;
	int AdamantiumSmallBrickID;
	int SinniumSmallBrickID;
	int SkyIronSmallBrickID;
	int AmberSmallBrickID;
	int PeridotSmallBrickID;
	int OpalSmallBrickID;
	int StarRubySmallBrickID;
	int StarSapphireSmallBrickID;
	int AmethystSmallBrickID;
	int MalachiteSmallBrickID;
	int OnyxSmallBrickID;
	int TopazSmallBrickID;
	int SunstoneSmallBrickID;
	int MoonstoneSmallBrickID;
	int BloodstoneSmallBrickID;
	int BronzeSmallBrickID;
	int DragonSteelSmallBrickID;
	int BlueSteelSmallBrickID;
	int ElvishIronSmallBrickID;
	int ToolSteelSmallBrickID;
	int RadiantAdamantSmallBrickID;
	int SoulSteelSmallBrickID;
	int CelestialBronzeSmallBrickID;
	
	//Blocks Stairs
	public static Block TinStair;
	public static Block CopperStair;
	public static Block SilverStair;
	public static Block MithrilStair;
	public static Block TungstenStair;
	public static Block CobaltStair;
	public static Block OrichalcumStair;
	public static Block TantalumStair;
	public static Block TitaniumStair;
	public static Block AdamantiumStair;
	public static Block SinniumStair;
	public static Block SkyIronStair;
	public static Block AmberStair;
	public static Block PeridotStair;
	public static Block OpalStair;
	public static Block StarRubyStair;
	public static Block StarSapphireStair;
	public static Block AmethystStair;
	public static Block MalachiteStair;
	public static Block OnyxStair;
	public static Block TopazStair;
	public static Block SunstoneStair;
	public static Block MoonstoneStair;
	public static Block BloodstoneStair;
	public static Block BronzeStair;
	public static Block DragonSteelStair;
	public static Block BlueSteelStair;
	public static Block ElvishIronStair;
	public static Block ToolSteelStair;
	public static Block RadiantAdamantStair;
	public static Block SoulSteelStair;
	public static Block CelestialBronzeStair;
	
	int TinStairID;
	int CopperStairID;
	int SilverStairID;
	int MithrilStairID;
	int TungstenStairID;
	int CobaltStairID;
	int OrichalcumStairID;
	int TantalumStairID;
	int TitaniumStairID;
	int AdamantiumStairID;
	int SinniumStairID;
	int SkyIronStairID;
	int AmberStairID;
	int PeridotStairID;
	int OpalStairID;
	int StarRubyStairID;
	int StarSapphireStairID;
	int AmethystStairID;
	int MalachiteStairID;
	int OnyxStairID;
	int TopazStairID;
	int SunstoneStairID;
	int MoonstoneStairID;
	int BloodstoneStairID;
	int BronzeStairID;
	int DragonSteelStairID;
	int BlueSteelStairID;
	int ElvishIronStairID;
	int ToolSteelStairID;
	int RadiantAdamantStairID;
	int SoulSteelStairID;
	int CelestialBronzeStairID;
	
	//Blocks Doors
	public static Block TinDoor;
	public static Block CopperDoor;
	public static Block SilverDoor;
	public static Block MithrilDoor;
	public static Block TungstenDoor;
	public static Block CobaltDoor;
	public static Block OrichalcumDoor;
	public static Block TantalumDoor;
	public static Block TitaniumDoor;
	public static Block AdamantiumDoor;
	public static Block SinniumDoor;
	public static Block SkyIronDoor;
	public static Block AmberDoor;
	public static Block PeridotDoor;
	public static Block OpalDoor;
	public static Block StarRubyDoor;
	public static Block StarSapphireDoor;
	public static Block AmethystDoor;
	public static Block MalachiteDoor;
	public static Block OnyxDoor;
	public static Block TopazDoor;
	public static Block SunstoneDoor;
	public static Block MoonstoneDoor;
	public static Block BloodstoneDoor;
	public static Block BronzeDoor;
	public static Block DragonSteelDoor;
	public static Block BlueSteelDoor;
	public static Block ElvishIronDoor;
	public static Block ToolSteelDoor;
	public static Block RadiantAdamantDoor;
	public static Block SoulSteelDoor;
	public static Block CelestialBronzeDoor;
	
	int TinDoorID;
	int CopperDoorID;
	int SilverDoorID;
	int MithrilDoorID;
	int TungstenDoorID;
	int CobaltDoorID;
	int OrichalcumDoorID;
	int TantalumDoorID;
	int TitaniumDoorID;
	int AdamantiumDoorID;
	int SinniumDoorID;
	int SkyIronDoorID;
	int AmberDoorID;
	int PeridotDoorID;
	int OpalDoorID;
	int StarRubyDoorID;
	int StarSapphireDoorID;
	int AmethystDoorID;
	int MalachiteDoorID;
	int OnyxDoorID;
	int TopazDoorID;
	int SunstoneDoorID;
	int MoonstoneDoorID;
	int BloodstoneDoorID;
	int BronzeDoorID;
	int DragonSteelDoorID;
	int BlueSteelDoorID;
	int ElvishIronDoorID;
	int ToolSteelDoorID;
	int RadiantAdamantDoorID;
	int SoulSteelDoorID;
	int CelestialBronzeDoorID;
	
	//Blocks Fences
	public static Block TinFence;
	public static Block CopperFence;
	public static Block SilverFence;
	public static Block MithrilFence;
	public static Block TungstenFence;
	public static Block CobaltFence;
	public static Block OrichalcumFence;
	public static Block TantalumFence;
	public static Block TitaniumFence;
	public static Block AdamantiumFence;
	public static Block SinniumFence;
	public static Block SkyIronFence;
	public static Block AmberFence;
	public static Block PeridotFence;
	public static Block OpalFence;
	public static Block StarRubyFence;
	public static Block StarSapphireFence;
	public static Block AmethystFence;
	public static Block MalachiteFence;
	public static Block OnyxFence;
	public static Block TopazFence;
	public static Block SunstoneFence;
	public static Block MoonstoneFence;
	public static Block BloodstoneFence;
	public static Block BronzeFence;
	public static Block DragonSteelFence;
	public static Block BlueSteelFence;
	public static Block ElvishIronFence;
	public static Block ToolSteelFence;
	public static Block RadiantAdamantFence;
	public static Block SoulSteelFence;
	public static Block CelestialBronzeFence;
	
	int TinFenceID;
	int CopperFenceID;
	int SilverFenceID;
	int MithrilFenceID;
	int TungstenFenceID;
	int CobaltFenceID;
	int OrichalcumFenceID;
	int TantalumFenceID;
	int TitaniumFenceID;
	int AdamantiumFenceID;
	int SinniumFenceID;
	int SkyIronFenceID;
	int AmberFenceID;
	int PeridotFenceID;
	int OpalFenceID;
	int StarRubyFenceID;
	int StarSapphireFenceID;
	int AmethystFenceID;
	int MalachiteFenceID;
	int OnyxFenceID;
	int TopazFenceID;
	int SunstoneFenceID;
	int MoonstoneFenceID;
	int BloodstoneFenceID;
	int BronzeFenceID;
	int DragonSteelFenceID;
	int BlueSteelFenceID;
	int ElvishIronFenceID;
	int ToolSteelFenceID;
	int RadiantAdamantFenceID;
	int SoulSteelFenceID;
	int CelestialBronzeFenceID;
	
	//Blocks Fence Gates
	public static Block TinFenceGate;
	public static Block CopperFenceGate;
	public static Block SilverFenceGate;
	public static Block MithrilFenceGate;
	public static Block TungstenFenceGate;
	public static Block CobaltFenceGate;
	public static Block OrichalcumFenceGate;
	public static Block TantalumFenceGate;
	public static Block TitaniumFenceGate;
	public static Block AdamantiumFenceGate;
	public static Block SinniumFenceGate;
	public static Block SkyIronFenceGate;
	public static Block AmberFenceGate;
	public static Block PeridotFenceGate;
	public static Block OpalFenceGate;
	public static Block StarRubyFenceGate;
	public static Block StarSapphireFenceGate;
	public static Block AmethystFenceGate;
	public static Block MalachiteFenceGate;
	public static Block OnyxFenceGate;
	public static Block TopazFenceGate;
	public static Block SunstoneFenceGate;
	public static Block MoonstoneFenceGate;
	public static Block BloodstoneFenceGate;
	public static Block BronzeFenceGate;
	public static Block DragonSteelFenceGate;
	public static Block BlueSteelFenceGate;
	public static Block ElvishIronFenceGate;
	public static Block ToolSteelFenceGate;
	public static Block RadiantAdamantFenceGate;
	public static Block SoulSteelFenceGate;
	public static Block CelestialBronzeFenceGate;
	
	int TinFenceGateID;
	int CopperFenceGateID;
	int SilverFenceGateID;
	int MithrilFenceGateID;
	int TungstenFenceGateID;
	int CobaltFenceGateID;
	int OrichalcumFenceGateID;
	int TantalumFenceGateID;
	int TitaniumFenceGateID;
	int AdamantiumFenceGateID;
	int SinniumFenceGateID;
	int SkyIronFenceGateID;
	int AmberFenceGateID;
	int PeridotFenceGateID;
	int OpalFenceGateID;
	int StarRubyFenceGateID;
	int StarSapphireFenceGateID;
	int AmethystFenceGateID;
	int MalachiteFenceGateID;
	int OnyxFenceGateID;
	int TopazFenceGateID;
	int SunstoneFenceGateID;
	int MoonstoneFenceGateID;
	int BloodstoneFenceGateID;
	int BronzeFenceGateID;
	int DragonSteelFenceGateID;
	int BlueSteelFenceGateID;
	int ElvishIronFenceGateID;
	int ToolSteelFenceGateID;
	int RadiantAdamantFenceGateID;
	int SoulSteelFenceGateID;
	int CelestialBronzeFenceGateID;
	
	//Items Ingots
	public static Item TinIngot;
	public static Item CopperIngot;
	public static Item SilverIngot;
	public static Item MithrilIngot;
	public static Item TungstenIngot;
	public static Item CobaltIngot;
	public static Item OrichalcumIngot;
	public static Item TantalumIngot;
	public static Item TitaniumIngot;
	public static Item AdamantiumIngot;
	public static Item SinniumIngot;
	public static Item SkyIronIngot;
	public static Item BronzeIngot;
	public static Item DragonSteelIngot;
	public static Item BlueSteelIngot;
	public static Item ElvishIronIngot;
	public static Item ToolSteelIngot;
	public static Item RadiantAdamantIngot;
	public static Item SoulSteelIngot;
	public static Item CelestialBronzeIngot;
	
	int TinIngotID;
	int CopperIngotID;
	int SilverIngotID;
	int MithrilIngotID;
	int TungstenIngotID;
	int CobaltIngotID;
	int OrichalcumIngotID;
	int TantalumIngotID;
	int TitaniumIngotID;
	int AdamantiumIngotID;
	int SinniumIngotID;
	int SkyIronIngotID;
	int BronzeIngotID;
	int DragonSteelIngotID;
	int BlueSteelIngotID;
	int ElvishIronIngotID;
	int ToolSteelIngotID;
	int RadiantAdamantIngotID;
	int SoulSteelIngotID;
	int CelestialBronzeIngotID;
	
	// Items Gems
	public static Item Amber;
	public static Item Peridot;
	public static Item Opal;
	public static Item StarRuby;
	public static Item StarSapphire;
	public static Item Amethyst;
	public static Item Malachite;
	public static Item Onyx;
	public static Item Topaz;
	public static Item Sunstone;
	public static Item Moonstone;
	public static Item Bloodstone;
	
	int AmberID;
	int PeridotID;
	int OpalID;
	int StarRubyID;
	int StarSapphireID;
	int AmethystID;
	int MalachiteID;
	int OnyxID;
	int TopazID;
	int SunstoneID;
	int MoonstoneID;
	int BloodstoneID;
	
	//Items Helmet
	public static Item TinHelmet;
	public static Item CopperHelmet;
	public static Item SilverHelmet;
	public static Item MithrilHelmet;
	public static Item TungstenHelmet;
	public static Item CobaltHelmet;
	public static Item OrichalcumHelmet;
	public static Item TantalumHelmet;
	public static Item TitaniumHelmet;
	public static Item AdamantiumHelmet;
	public static Item SinniumHelmet;
	public static Item SkyIronHelmet;
	public static Item BronzeHelmet;
	public static Item DragonSteelHelmet;
	public static Item BlueSteelHelmet;
	public static Item ElvishIronHelmet;
	public static Item ToolSteelHelmet;
	public static Item RadiantAdamantHelmet;
	public static Item SoulSteelHelmet;
	public static Item CelestialBronzeHelmet;
	
	int TinHelmetID;
	int CopperHelmetID;
	int SilverHelmetID;
	int MithrilHelmetID;
	int TungstenHelmetID;
	int CobaltHelmetID;
	int OrichalcumHelmetID;
	int TantalumHelmetID;
	int TitaniumHelmetID;
	int AdamantiumHelmetID;
	int SinniumHelmetID;
	int SkyIronHelmetID;
	int BronzeHelmetID;
	int DragonSteelHelmetID;
	int BlueSteelHelmetID;
	int ElvishIronHelmetID;
	int ToolSteelHelmetID;
	int RadiantAdamantHelmetID;
	int SoulSteelHelmetID;
	int CelestialBronzeHelmetID;
	
	//Items Chestplate
	public static Item TinChestplate;
	public static Item CopperChestplate;
	public static Item SilverChestplate;
	public static Item MithrilChestplate;
	public static Item TungstenChestplate;
	public static Item CobaltChestplate;
	public static Item OrichalcumChestplate;
	public static Item TantalumChestplate;
	public static Item TitaniumChestplate;
	public static Item AdamantiumChestplate;
	public static Item SinniumChestplate;
	public static Item SkyIronChestplate;
	public static Item BronzeChestplate;
	public static Item DragonSteelChestplate;
	public static Item BlueSteelChestplate;
	public static Item ElvishIronChestplate;
	public static Item ToolSteelChestplate;
	public static Item RadiantAdamantChestplate;
	public static Item SoulSteelChestplate;
	public static Item CelestialBronzeChestplate;
	
	int TinChestplateID;
	int CopperChestplateID;
	int SilverChestplateID;
	int MithrilChestplateID;
	int TungstenChestplateID;
	int CobaltChestplateID;
	int OrichalcumChestplateID;
	int TantalumChestplateID;
	int TitaniumChestplateID;
	int AdamantiumChestplateID;
	int SinniumChestplateID;
	int SkyIronChestplateID;
	int BronzeChestplateID;
	int DragonSteelChestplateID;
	int BlueSteelChestplateID;
	int ElvishIronChestplateID;
	int ToolSteelChestplateID;
	int RadiantAdamantChestplateID;
	int SoulSteelChestplateID;
	int CelestialBronzeChestplateID;
	
	//Items Leggings
	public static Item TinLeggings;
	public static Item CopperLeggings;
	public static Item SilverLeggings;
	public static Item MithrilLeggings;
	public static Item TungstenLeggings;
	public static Item CobaltLeggings;
	public static Item OrichalcumLeggings;
	public static Item TantalumLeggings;
	public static Item TitaniumLeggings;
	public static Item AdamantiumLeggings;
	public static Item SinniumLeggings;
	public static Item SkyIronLeggings;
	public static Item BronzeLeggings;
	public static Item DragonSteelLeggings;
	public static Item BlueSteelLeggings;
	public static Item ElvishIronLeggings;
	public static Item ToolSteelLeggings;
	public static Item RadiantAdamantLeggings;
	public static Item SoulSteelLeggings;
	public static Item CelestialBronzeLeggings;
	
	int TinLeggingsID;
	int CopperLeggingsID;
	int SilverLeggingsID;
	int MithrilLeggingsID;
	int TungstenLeggingsID;
	int CobaltLeggingsID;
	int OrichalcumLeggingsID;
	int TantalumLeggingsID;
	int TitaniumLeggingsID;
	int AdamantiumLeggingsID;
	int SinniumLeggingsID;
	int SkyIronLeggingsID;
	int BronzeLeggingsID;
	int DragonSteelLeggingsID;
	int BlueSteelLeggingsID;
	int ElvishIronLeggingsID;
	int ToolSteelLeggingsID;
	int RadiantAdamantLeggingsID;
	int SoulSteelLeggingsID;
	int CelestialBronzeLeggingsID;
	
	//Items Boots
	public static Item TinBoots;
	public static Item CopperBoots;
	public static Item SilverBoots;
	public static Item MithrilBoots;
	public static Item TungstenBoots;
	public static Item CobaltBoots;
	public static Item OrichalcumBoots;
	public static Item TantalumBoots;
	public static Item TitaniumBoots;
	public static Item AdamantiumBoots;
	public static Item SinniumBoots;
	public static Item SkyIronBoots;
	public static Item BronzeBoots;
	public static Item DragonSteelBoots;
	public static Item BlueSteelBoots;
	public static Item ElvishIronBoots;
	public static Item ToolSteelBoots;
	public static Item RadiantAdamantBoots;
	public static Item SoulSteelBoots;
	public static Item CelestialBronzeBoots;
	
	int TinBootsID;
	int CopperBootsID;
	int SilverBootsID;
	int MithrilBootsID;
	int TungstenBootsID;
	int CobaltBootsID;
	int OrichalcumBootsID;
	int TantalumBootsID;
	int TitaniumBootsID;
	int AdamantiumBootsID;
	int SinniumBootsID;
	int SkyIronBootsID;
	int BronzeBootsID;
	int DragonSteelBootsID;
	int BlueSteelBootsID;
	int ElvishIronBootsID;
	int ToolSteelBootsID;
	int RadiantAdamantBootsID;
	int SoulSteelBootsID;
	int CelestialBronzeBootsID;
	
	//Items Pickaxe
	public static Item TinPickaxe;
	public static Item CopperPickaxe;
	public static Item SilverPickaxe;
	public static Item MithrilPickaxe;
	public static Item TungstenPickaxe;
	public static Item CobaltPickaxe;
	public static Item OrichalcumPickaxe;
	public static Item TantalumPickaxe;
	public static Item TitaniumPickaxe;
	public static Item AdamantiumPickaxe;
	public static Item SinniumPickaxe;
	public static Item SkyIronPickaxe;
	public static Item AmberPickaxe;
	public static Item PeridotPickaxe;
	public static Item OpalPickaxe;
	public static Item StarRubyPickaxe;
	public static Item StarSapphirePickaxe;
	public static Item AmethystPickaxe;
	public static Item MalachitePickaxe;
	public static Item OnyxPickaxe;
	public static Item TopazPickaxe;
	public static Item SunstonePickaxe;
	public static Item MoonstonePickaxe;
	public static Item BloodstonePickaxe;
	public static Item BronzePickaxe;
	public static Item DragonSteelPickaxe;
	public static Item BlueSteelPickaxe;
	public static Item ElvishIronPickaxe;
	public static Item ToolSteelPickaxe;
	public static Item RadiantAdamantPickaxe;
	public static Item SoulSteelPickaxe;
	public static Item CelestialBronzePickaxe;
	
	int TinPickaxeID;
	int CopperPickaxeID;
	int SilverPickaxeID;
	int MithrilPickaxeID;
	int TungstenPickaxeID;
	int CobaltPickaxeID;
	int OrichalcumPickaxeID;
	int TantalumPickaxeID;
	int TitaniumPickaxeID;
	int AdamantiumPickaxeID;
	int SinniumPickaxeID;
	int SkyIronPickaxeID;
	int AmberPickaxeID;
	int PeridotPickaxeID;
	int OpalPickaxeID;
	int StarRubyPickaxeID;
	int StarSapphirePickaxeID;
	int AmethystPickaxeID;
	int MalachitePickaxeID;
	int OnyxPickaxeID;
	int TopazPickaxeID;
	int SunstonePickaxeID;
	int MoonstonePickaxeID;
	int BloodstonePickaxeID;
	int BronzePickaxeID;
	int DragonSteelPickaxeID;
	int BlueSteelPickaxeID;
	int ElvishIronPickaxeID;
	int ToolSteelPickaxeID;
	int RadiantAdamantPickaxeID;
	int SoulSteelPickaxeID;
	int CelestialBronzePickaxeID;
	
	//Items Shovel
	public static Item TinShovel;
	public static Item CopperShovel;
	public static Item SilverShovel;
	public static Item MithrilShovel;
	public static Item TungstenShovel;
	public static Item CobaltShovel;
	public static Item OrichalcumShovel;
	public static Item TantalumShovel;
	public static Item TitaniumShovel;
	public static Item AdamantiumShovel;
	public static Item SinniumShovel;
	public static Item SkyIronShovel;
	public static Item AmberShovel;
	public static Item PeridotShovel;
	public static Item OpalShovel;
	public static Item StarRubyShovel;
	public static Item StarSapphireShovel;
	public static Item AmethystShovel;
	public static Item MalachiteShovel;
	public static Item OnyxShovel;
	public static Item TopazShovel;
	public static Item SunstoneShovel;
	public static Item MoonstoneShovel;
	public static Item BloodstoneShovel;
	public static Item BronzeShovel;
	public static Item DragonSteelShovel;
	public static Item BlueSteelShovel;
	public static Item ElvishIronShovel;
	public static Item ToolSteelShovel;
	public static Item RadiantAdamantShovel;
	public static Item SoulSteelShovel;
	public static Item CelestialBronzeShovel;
	
	int TinShovelID;
	int CopperShovelID;
	int SilverShovelID;
	int MithrilShovelID;
	int TungstenShovelID;
	int CobaltShovelID;
	int OrichalcumShovelID;
	int TantalumShovelID;
	int TitaniumShovelID;
	int AdamantiumShovelID;
	int SinniumShovelID;
	int SkyIronShovelID;
	int AmberShovelID;
	int PeridotShovelID;
	int OpalShovelID;
	int StarRubyShovelID;
	int StarSapphireShovelID;
	int AmethystShovelID;
	int MalachiteShovelID;
	int OnyxShovelID;
	int TopazShovelID;
	int SunstoneShovelID;
	int MoonstoneShovelID;
	int BloodstoneShovelID;
	int BronzeShovelID;
	int DragonSteelShovelID;
	int BlueSteelShovelID;
	int ElvishIronShovelID;
	int ToolSteelShovelID;
	int RadiantAdamantShovelID;
	int SoulSteelShovelID;
	int CelestialBronzeShovelID;
	
	//Items Hatchet
	public static Item TinHatchet;
	public static Item CopperHatchet;
	public static Item SilverHatchet;
	public static Item MithrilHatchet;
	public static Item TungstenHatchet;
	public static Item CobaltHatchet;
	public static Item OrichalcumHatchet;
	public static Item TantalumHatchet;
	public static Item TitaniumHatchet;
	public static Item AdamantiumHatchet;
	public static Item SinniumHatchet;
	public static Item SkyIronHatchet;
	public static Item AmberHatchet;
	public static Item PeridotHatchet;
	public static Item OpalHatchet;
	public static Item StarRubyHatchet;
	public static Item StarSapphireHatchet;
	public static Item AmethystHatchet;
	public static Item MalachiteHatchet;
	public static Item OnyxHatchet;
	public static Item TopazHatchet;
	public static Item SunstoneHatchet;
	public static Item MoonstoneHatchet;
	public static Item BloodstoneHatchet;
	public static Item BronzeHatchet;
	public static Item DragonSteelHatchet;
	public static Item BlueSteelHatchet;
	public static Item ElvishIronHatchet;
	public static Item ToolSteelHatchet;
	public static Item RadiantAdamantHatchet;
	public static Item SoulSteelHatchet;
	public static Item CelestialBronzeHatchet;
	
	int TinHatchetID;
	int CopperHatchetID;
	int SilverHatchetID;
	int MithrilHatchetID;
	int TungstenHatchetID;
	int CobaltHatchetID;
	int OrichalcumHatchetID;
	int TantalumHatchetID;
	int TitaniumHatchetID;
	int AdamantiumHatchetID;
	int SinniumHatchetID;
	int SkyIronHatchetID;
	int AmberHatchetID;
	int PeridotHatchetID;
	int OpalHatchetID;
	int StarRubyHatchetID;
	int StarSapphireHatchetID;
	int AmethystHatchetID;
	int MalachiteHatchetID;
	int OnyxHatchetID;
	int TopazHatchetID;
	int SunstoneHatchetID;
	int MoonstoneHatchetID;
	int BloodstoneHatchetID;
	int BronzeHatchetID;
	int DragonSteelHatchetID;
	int BlueSteelHatchetID;
	int ElvishIronHatchetID;
	int ToolSteelHatchetID;
	int RadiantAdamantHatchetID;
	int SoulSteelHatchetID;
	int CelestialBronzeHatchetID;
	
	//Items Hoe
	public static Item TinHoe;
	public static Item CopperHoe;
	public static Item SilverHoe;
	public static Item MithrilHoe;
	public static Item TungstenHoe;
	public static Item CobaltHoe;
	public static Item OrichalcumHoe;
	public static Item TantalumHoe;
	public static Item TitaniumHoe;
	public static Item AdamantiumHoe;
	public static Item SinniumHoe;
	public static Item SkyIronHoe;
	public static Item AmberHoe;
	public static Item PeridotHoe;
	public static Item OpalHoe;
	public static Item StarRubyHoe;
	public static Item StarSapphireHoe;
	public static Item AmethystHoe;
	public static Item MalachiteHoe;
	public static Item OnyxHoe;
	public static Item TopazHoe;
	public static Item SunstoneHoe;
	public static Item MoonstoneHoe;
	public static Item BloodstoneHoe;
	public static Item BronzeHoe;
	public static Item DragonSteelHoe;
	public static Item BlueSteelHoe;
	public static Item ElvishIronHoe;
	public static Item ToolSteelHoe;
	public static Item RadiantAdamantHoe;
	public static Item SoulSteelHoe;
	public static Item CelestialBronzeHoe;
	
	int TinHoeID;
	int CopperHoeID;
	int SilverHoeID;
	int MithrilHoeID;
	int TungstenHoeID;
	int CobaltHoeID;
	int OrichalcumHoeID;
	int TantalumHoeID;
	int TitaniumHoeID;
	int AdamantiumHoeID;
	int SinniumHoeID;
	int SkyIronHoeID;
	int AmberHoeID;
	int PeridotHoeID;
	int OpalHoeID;
	int StarRubyHoeID;
	int StarSapphireHoeID;
	int AmethystHoeID;
	int MalachiteHoeID;
	int OnyxHoeID;
	int TopazHoeID;
	int SunstoneHoeID;
	int MoonstoneHoeID;
	int BloodstoneHoeID;
	int BronzeHoeID;
	int DragonSteelHoeID;
	int BlueSteelHoeID;
	int ElvishIronHoeID;
	int ToolSteelHoeID;
	int RadiantAdamantHoeID;
	int SoulSteelHoeID;
	int CelestialBronzeHoeID;
	
	//Items Sword
	public static Item TinSword;
	public static Item CopperSword;
	public static Item SilverSword;
	public static Item MithrilSword;
	public static Item TungstenSword;
	public static Item CobaltSword;
	public static Item OrichalcumSword;
	public static Item TantalumSword;
	public static Item TitaniumSword;
	public static Item AdamantiumSword;
	public static Item SinniumSword;
	public static Item SkyIronSword;
	public static Item AmberSword;
	public static Item PeridotSword;
	public static Item OpalSword;
	public static Item StarRubySword;
	public static Item StarSapphireSword;
	public static Item AmethystSword;
	public static Item MalachiteSword;
	public static Item OnyxSword;
	public static Item TopazSword;
	public static Item SunstoneSword;
	public static Item MoonstoneSword;
	public static Item BloodstoneSword;
	public static Item BronzeSword;
	public static Item DragonSteelSword;
	public static Item BlueSteelSword;
	public static Item ElvishIronSword;
	public static Item ToolSteelSword;
	public static Item RadiantAdamantSword;
	public static Item SoulSteelSword;
	public static Item CelestialBronzeSword;
	
	int TinSwordID;
	int CopperSwordID;
	int SilverSwordID;
	int MithrilSwordID;
	int TungstenSwordID;
	int CobaltSwordID;
	int OrichalcumSwordID;
	int TantalumSwordID;
	int TitaniumSwordID;
	int AdamantiumSwordID;
	int SinniumSwordID;
	int SkyIronSwordID;
	int AmberSwordID;
	int PeridotSwordID;
	int OpalSwordID;
	int StarRubySwordID;
	int StarSapphireSwordID;
	int AmethystSwordID;
	int MalachiteSwordID;
	int OnyxSwordID;
	int TopazSwordID;
	int SunstoneSwordID;
	int MoonstoneSwordID;
	int BloodstoneSwordID;
	int BronzeSwordID;
	int DragonSteelSwordID;
	int BlueSteelSwordID;
	int ElvishIronSwordID;
	int ToolSteelSwordID;
	int RadiantAdamantSwordID;
	int SoulSteelSwordID;
	int CelestialBronzeSwordID;

	
	//@PreInit
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		Configuration config=new Configuration(event.getSuggestedConfigurationFile());
		
		//Block Ore Config
		TinOreID=config.get("Ore IDs", "Tin Ore ID", 2325).getInt();
		CopperOreID=config.get("Ore IDs", "Copper Ore ID", 2326).getInt();
		SilverOreID=config.get("Ore IDs", "Silver Ore ID", 2327).getInt();
		MithrilOreID=config.get("Ore IDs", "Mithril Ore ID", 2328).getInt();
		TungstenOreID=config.get("Ore IDs", "Tungsten Ore ID", 2329).getInt();
		CobaltOreID=config.get("Ore IDs", "Cobalt Ore ID", 2330).getInt();
		OrichalcumOreID=config.get("Ore IDs", "Orichalcum Ore ID", 2331).getInt();
		TantalumOreID=config.get("Ore IDs", "Tantalum Ore ID", 2332).getInt();
		TitaniumOreID=config.get("Ore IDs", "Titanium Ore ID", 2333).getInt();
		AdamantiumOreID=config.get("Ore IDs", "Adamantium Ore ID", 2334).getInt();
		SinniumOreID=config.get("Ore IDs", "Sinnium Ore ID", 2335).getInt();
		SkyIronOreID=config.get("Ore IDs", "Sky Iron Ore ID", 2336).getInt();
		AmberOreID=config.get("Ore IDs", "Amber Ore ID", 2337).getInt();
		PeridotOreID=config.get("Ore IDs", "Peridot Ore ID", 2338).getInt();
		OpalOreID=config.get("Ore IDs", "Opal Ore ID", 2339).getInt();
		StarRubyOreID=config.get("Ore IDs", "Star Ruby Ore ID", 2340).getInt();
		StarSapphireOreID=config.get("Ore IDs", "Star Sapphire Ore ID", 2341).getInt();
		AmethystOreID=config.get("Ore IDs", "Amethyst Ore ID", 2342).getInt();
		MalachiteOreID=config.get("Ore IDs", "Malachite Ore ID", 2343).getInt();
		OnyxOreID=config.get("Ore IDs", "Onyx Ore ID", 2344).getInt();
		TopazOreID=config.get("Ore IDs", "Topaz Ore ID", 2345).getInt();
		SunstoneOreID=config.get("Ore IDs", "Sunstone Ore ID", 2346).getInt();
		MoonstoneOreID=config.get("Ore IDs", "Moonstone Ore ID", 2347).getInt();
		BloodstoneOreID=config.get("Ore IDs", "Bloodstone Ore ID", 2348).getInt();
		
		//Block Storage Config
		TinBlockID=config.get("Storage Block IDs", "Tin Block ID", 2349).getInt();
		CopperBlockID=config.get("Storage Block IDs", "Copper Block ID", 2350).getInt();
		SilverBlockID=config.get("Storage Block IDs", "Silver Block ID", 2351).getInt();
		MithrilBlockID=config.get("Storage Block IDs", "Mithril Block ID", 2352).getInt();
		TungstenBlockID=config.get("Storage Block IDs", "Tungsten Block ID", 2353).getInt();
		CobaltBlockID=config.get("Storage Block IDs", "Cobalt Block ID", 2354).getInt();
		OrichalcumBlockID=config.get("Storage Block IDs", "Orichalcum Block ID", 2355).getInt();
		TantalumBlockID=config.get("Storage Block IDs", "Tantalum Block ID", 2356).getInt();
		TitaniumBlockID=config.get("Storage Block IDs", "Titanium Block ID", 2357).getInt();
		AdamantiumBlockID=config.get("Storage Block IDs", "Admantium Block ID", 2358).getInt();
		SinniumBlockID=config.get("Storage Block IDs", "Sinnium Block ID", 2359).getInt();
		SkyIronBlockID=config.get("Storage Block IDs", "Sky Iron Block ID", 2360).getInt();
		AmberBlockID=config.get("Storage Block IDs", "Amber Block ID", 2361).getInt();
		PeridotBlockID=config.get("Storage Block IDs", "Peridot Block ID", 2362).getInt();
		OpalBlockID=config.get("Storage Block IDs", "Opal Block ID", 2363).getInt();
		StarRubyBlockID=config.get("Storage Block IDs", "Star Ruby Block ID", 2364).getInt();
		StarSapphireBlockID=config.get("Storage Block IDs", "Star Sapphire Block ID", 2365).getInt();
		AmethystBlockID=config.get("Storage Block IDs", "Amethyst Block ID", 2366).getInt();
		MalachiteBlockID=config.get("Storage Block IDs", "Malachite Block ID", 2367).getInt();
		OnyxBlockID=config.get("Storage Block IDs", "Onyx Block ID", 2368).getInt();
		TopazBlockID=config.get("Storage Block IDs", "Topaz Block ID", 2369).getInt();
		SunstoneBlockID=config.get("Storage Block IDs", "Sunstone Block ID", 2370).getInt();
		MoonstoneBlockID=config.get("Storage Block IDs", "Moonstone Block ID", 2371).getInt();
		BloodstoneBlockID=config.get("Storage Block IDs", "Bloodstone Block ID", 2372).getInt();
		BronzeBlockID=config.get("Storage Block IDs", "Bronze Block ID", 2373).getInt();
		DragonSteelBlockID=config.get("Storage Block IDs", "Dragon Steel Block ID", 2374).getInt();
		BlueSteelBlockID=config.get("Storage Block IDs", "Blue Steel Block ID", 2375).getInt();
		ElvishIronBlockID=config.get("Storage Block IDs", "Elvish Iron Block ID", 2376).getInt();
		ToolSteelBlockID=config.get("Storage Block IDs", "Tool Steel Block ID", 2377).getInt();
		RadiantAdamantBlockID=config.get("Storage Block IDs", "Radiant Adamant Block ID", 2378).getInt();
		SoulSteelBlockID=config.get("Storage Block IDs", "Soul Steel Block ID", 2379).getInt();
		CelestialBronzeBlockID=config.get("Storage Block IDs", "Celestial Bronze Block ID", 2380).getInt();
		
		
		//Block Large Brick Config
		TinLargeBrickID=config.get("Large Brick IDs", "Tin Large Brick ID", 2375).getInt();
		CopperLargeBrickID=config.get("Large Brick IDs", "Copper Large Brick ID", 2376).getInt();
		SilverLargeBrickID=config.get("Large Brick IDs", "Silver Large Brick ID", 2377).getInt();
		MithrilLargeBrickID=config.get("Large Brick IDs", "Mithril Large Brick ID", 2378).getInt();
		TungstenLargeBrickID=config.get("Large Brick IDs", "Tungsten Large Brick ID", 2379).getInt();
		CobaltLargeBrickID=config.get("Large Brick IDs", "Cobalt Large Brick ID", 2380).getInt();
		OrichalcumLargeBrickID=config.get("Large Brick IDs", "Orichalcum Large Brick ID", 2381).getInt();
		TantalumLargeBrickID=config.get("Large Brick IDs", "Tantalum Large Brick ID", 2382).getInt();
		TitaniumLargeBrickID=config.get("Large Brick IDs", "Titanium Large Brick ID", 2383).getInt();
		AdamantiumLargeBrickID=config.get("Large Brick IDs", "Admantium Large Brick ID", 2384).getInt();
		SinniumLargeBrickID=config.get("Large Brick IDs", "Sinnium Large Brick ID", 2385).getInt();
		SkyIronLargeBrickID=config.get("Large Brick IDs", "Sky Iron Large Brick ID", 2386).getInt();
		AmberLargeBrickID=config.get("Large Brick IDs", "Amber Large Brick ID", 2387).getInt();
		PeridotLargeBrickID=config.get("Large Brick IDs", "Peridot Large Brick ID", 2389).getInt();
		OpalLargeBrickID=config.get("Large Brick IDs", "Opal Large Brick ID", 2392).getInt();
		StarRubyLargeBrickID=config.get("Large Brick IDs", "Star Ruby Large Brick ID", 2393).getInt();
		StarSapphireLargeBrickID=config.get("Large Brick IDs", "Star Sapphire Large Brick ID", 2394).getInt();
		AmethystLargeBrickID=config.get("Large Brick IDs", "Amethyst Large Brick ID", 2397).getInt();
		MalachiteLargeBrickID=config.get("Large Brick IDs", "Malachite Large Brick ID", 2398).getInt();
		OnyxLargeBrickID=config.get("Large Brick IDs", "Onyx Large Brick ID", 2399).getInt();
		TopazLargeBrickID=config.get("Large Brick IDs", "Topaz Large Brick ID", 2400).getInt();
		SunstoneLargeBrickID=config.get("Large Brick IDs", "Sunstone Large Brick ID", 2401).getInt();
		MoonstoneLargeBrickID=config.get("Large Brick IDs", "Moonstone Large Brick ID", 2402).getInt();
		BloodstoneLargeBrickID=config.get("Large Brick IDs", "Bloodstone Large Brick ID", 2403).getInt();
		BronzeLargeBrickID=config.get("Large Brick IDs", "Bronze Large Brick ID", 2404).getInt();
		DragonSteelLargeBrickID=config.get("Large Brick IDs", "Dragon Steel Large Brick ID", 2405).getInt();
		BlueSteelLargeBrickID=config.get("Large Brick IDs", "Blue Steel Large Brick ID", 2406).getInt();
		ElvishIronLargeBrickID=config.get("Large Brick IDs", "Elvish Iron Large Brick ID", 2407).getInt();
		ToolSteelLargeBrickID=config.get("Large Brick IDs", "Tool Steel Large Brick ID", 2408).getInt();
		RadiantAdamantLargeBrickID=config.get("Large Brick IDs", "Radiant Adamant Large Brick ID", 2409).getInt();
		SoulSteelLargeBrickID=config.get("Large Brick IDs", "Soul Steel Large Brick ID", 2410).getInt();
		CelestialBronzeLargeBrickID=config.get("Large Brick IDs", "Celestial Bronze Large Brick ID", 2411).getInt();
		
		//Block Small Brick Config
		TinSmallBrickID=config.get("Small Brick IDs", "Tin Small Brick ID", 2412).getInt();
		CopperSmallBrickID=config.get("Small Brick IDs", "Copper Small Brick ID", 2413).getInt();
		SilverSmallBrickID=config.get("Small Brick IDs", "Silver Small Brick ID", 2414).getInt();
		MithrilSmallBrickID=config.get("Small Brick IDs", "Mithril Small Brick ID", 2415).getInt();
		TungstenSmallBrickID=config.get("Small Brick IDs", "Tungsten Small Brick ID", 2416).getInt();
		CobaltSmallBrickID=config.get("Small Brick IDs", "Cobalt Small Brick ID", 2417).getInt();
		OrichalcumSmallBrickID=config.get("Small Brick IDs", "Orichalcum Small Brick ID", 2418).getInt();
		TantalumSmallBrickID=config.get("Small Brick IDs", "Tantalum Small Brick ID", 2419).getInt();
		TitaniumSmallBrickID=config.get("Small Brick IDs", "Titanium Small Brick ID", 2420).getInt();
		AdamantiumSmallBrickID=config.get("Small Brick IDs", "Admantium Small Brick ID", 2421).getInt();
		SinniumSmallBrickID=config.get("Small Brick IDs", "Sinnium Small Brick ID", 2422).getInt();
		SkyIronSmallBrickID=config.get("Small Brick IDs", "Sky Iron Small Brick ID", 2423).getInt();
		AmberSmallBrickID=config.get("Small Brick IDs", "Amber Small Brick ID", 2424).getInt();
		PeridotSmallBrickID=config.get("Small Brick IDs", "Peridot Small Brick ID", 2426).getInt();
		OpalSmallBrickID=config.get("Small Brick IDs", "Opal Small Brick ID", 2429).getInt();
		StarRubySmallBrickID=config.get("Small Brick IDs", "Star Ruby Small Brick ID", 2430).getInt();
		StarSapphireSmallBrickID=config.get("Small Brick IDs", "Star Sapphire Small Brick ID", 2431).getInt();
		AmethystSmallBrickID=config.get("Small Brick IDs", "Amethyst Small Brick ID", 2434).getInt();
		MalachiteSmallBrickID=config.get("Small Brick IDs", "Malachite Small Brick ID", 2435).getInt();
		OnyxSmallBrickID=config.get("Small Brick IDs", "Onyx Small Brick ID", 2436).getInt();
		TopazSmallBrickID=config.get("Small Brick IDs", "Topaz Small Brick ID", 2437).getInt();
		SunstoneSmallBrickID=config.get("Small Brick IDs", "Sunstone Small Brick ID", 2438).getInt();
		MoonstoneSmallBrickID=config.get("Small Brick IDs", "Moonstone Small Brick ID", 2439).getInt();
		BloodstoneSmallBrickID=config.get("Small Brick IDs", "Bloodstone Small Brick ID", 2440).getInt();
		BronzeSmallBrickID=config.get("Small Brick IDs", "Bronze Small Brick ID", 2441).getInt();
		DragonSteelSmallBrickID=config.get("Small Brick IDs", "Dragon Steel Small Brick ID", 2442).getInt();
		BlueSteelSmallBrickID=config.get("Small Brick IDs", "Blue Steel Small Brick ID", 2443).getInt();
		ElvishIronSmallBrickID=config.get("Small Brick IDs", "Elvish Iron Small Brick ID", 2444).getInt();
		ToolSteelSmallBrickID=config.get("Small Brick IDs", "Tool Steel Small Brick ID", 2445).getInt();
		RadiantAdamantSmallBrickID=config.get("Small Brick IDs", "Radiant Adamant Small Brick ID", 2446).getInt();
		SoulSteelSmallBrickID=config.get("Small Brick IDs", "Soul Steel Small Brick ID", 2447).getInt();
		CelestialBronzeSmallBrickID=config.get("Small Brick IDs", "Celestial Bronze Small Brick ID", 2448).getInt();
		
		//Block Stairs Config
		TinStairID=config.get("Stairs IDs", "Tin Stairs ID", 2449).getInt();
		CopperStairID=config.get("Stairs IDs", "Copper Stairs ID", 2450).getInt();
		SilverStairID=config.get("Stairs IDs", "Silver Stairs ID", 2451).getInt();
		MithrilStairID=config.get("Stairs IDs", "Mithril Stairs ID", 2452).getInt();
		TungstenStairID=config.get("Stairs IDs", "Tungsten Stairs ID", 2453).getInt();
		CobaltStairID=config.get("Stairs IDs", "Cobalt Stairs ID", 2454).getInt();
		OrichalcumStairID=config.get("Stairs IDs", "Orichalcum Stairs ID", 2455).getInt();
		TantalumStairID=config.get("Stairs IDs", "Tantalum Stairs ID", 2456).getInt();
		TitaniumStairID=config.get("Stairs IDs", "Titanium Stairs ID", 2457).getInt();
		AdamantiumStairID=config.get("Stairs IDs", "Admantium Stairs ID", 2458).getInt();
		SinniumStairID=config.get("Stairs IDs", "Sinnium Stairs ID", 2459).getInt();
		SkyIronStairID=config.get("Stairs IDs", "Sky Iron Stairs ID", 2460).getInt();
		AmberStairID=config.get("Stairs IDs", "Amber Stairs ID", 2461).getInt();
		PeridotStairID=config.get("Stairs IDs", "Peridot Stairs ID", 2463).getInt();
		OpalStairID=config.get("Stairs IDs", "Opal Stairs ID", 2466).getInt();
		StarRubyStairID=config.get("Stairs IDs", "Star Ruby Stairs ID", 2467).getInt();
		StarSapphireStairID=config.get("Stairs IDs", "Star Sapphire Stairs ID", 2468).getInt();
		AmethystStairID=config.get("Stairs IDs", "Amethyst Stairs ID", 2471).getInt();
		MalachiteStairID=config.get("Stairs IDs", "Malachite Stairs ID", 2472).getInt();
		OnyxStairID=config.get("Stairs IDs", "Onyx Stairs ID", 2473).getInt();
		TopazStairID=config.get("Stairs IDs", "Topaz Stairs ID", 2474).getInt();
		SunstoneStairID=config.get("Stairs IDs", "Sunstone Stairs ID", 2475).getInt();
		MoonstoneStairID=config.get("Stairs IDs", "Moonstone Stairs ID", 2476).getInt();
		BloodstoneStairID=config.get("Stairs IDs", "Bloodstone Stairs ID", 2477).getInt();
		BronzeStairID=config.get("Stairs IDs", "Bronze Stairs ID", 2478).getInt();
		DragonSteelStairID=config.get("Stairs IDs", "Dragon Steel Stairs ID", 2479).getInt();
		BlueSteelStairID=config.get("Stairs IDs", "Blue Steel Stairs ID", 2480).getInt();
		ElvishIronStairID=config.get("Stairs IDs", "Elvish Iron Stairs ID", 2481).getInt();
		ToolSteelStairID=config.get("Stairs IDs", "Tool Steel Stairs ID", 2482).getInt();
		RadiantAdamantStairID=config.get("Stairs IDs", "Radiant Adamant Stairs ID", 2483).getInt();
		SoulSteelStairID=config.get("Stairs IDs", "Soul Steel Stairs ID", 2484).getInt();
		CelestialBronzeStairID=config.get("Stairs IDs", "Celestial Bronze Stairs ID", 2485).getInt();
		
		//Block Door Config
		TinDoorID=config.get("Door IDs", "Tin Door ID", 2486).getInt();
		CopperDoorID=config.get("Door IDs", "Copper Door ID", 2487).getInt();
		SilverDoorID=config.get("Door IDs", "Silver Door ID", 2488).getInt();
		MithrilDoorID=config.get("Door IDs", "Mithril Door ID", 2489).getInt();
		TungstenDoorID=config.get("Door IDs", "Tungsten Door ID", 2490).getInt();
		CobaltDoorID=config.get("Door IDs", "Cobalt Door ID", 2491).getInt();
		OrichalcumDoorID=config.get("Door IDs", "Orichalcum Door ID", 2492).getInt();
		TantalumDoorID=config.get("Door IDs", "Tantalum Door ID", 2493).getInt();
		TitaniumDoorID=config.get("Door IDs", "Titanium Door ID", 2494).getInt();
		AdamantiumDoorID=config.get("Door IDs", "Admantium Door ID", 2495).getInt();
		SinniumDoorID=config.get("Door IDs", "Sinnium Door ID", 2496).getInt();
		SkyIronDoorID=config.get("Door IDs", "Sky Iron Door ID", 2497).getInt();
		AmberDoorID=config.get("Door IDs", "Amber Door ID", 2498).getInt();
		PeridotDoorID=config.get("Door IDs", "Peridot Door ID", 2500).getInt();
		OpalDoorID=config.get("Door IDs", "Opal Door ID", 2503).getInt();
		StarRubyDoorID=config.get("Door IDs", "Star Ruby Door ID", 2504).getInt();
		StarSapphireDoorID=config.get("Door IDs", "Star Sapphire Door ID", 2505).getInt();
		AmethystDoorID=config.get("Door IDs", "Amethyst Door ID", 2508).getInt();
		MalachiteDoorID=config.get("Door IDs", "Malachite Door ID", 2509).getInt();
		OnyxDoorID=config.get("Door IDs", "Onyx Door ID", 2510).getInt();
		TopazDoorID=config.get("Door IDs", "Topaz Door ID", 2511).getInt();
		SunstoneDoorID=config.get("Door IDs", "Sunstone Door ID", 2512).getInt();
		MoonstoneDoorID=config.get("Door IDs", "Moonstone Door ID", 2513).getInt();
		BloodstoneDoorID=config.get("Door IDs", "Bloodstone Door ID", 2514).getInt();
		BronzeDoorID=config.get("Door IDs", "Bronze Door ID", 2515).getInt();
		DragonSteelDoorID=config.get("Door IDs", "Dragon Steel Door ID", 2516).getInt();
		BlueSteelDoorID=config.get("Door IDs", "Blue Steel Door ID", 2517).getInt();
		ElvishIronDoorID=config.get("Door IDs", "Elvish Iron Door ID", 2518).getInt();
		ToolSteelDoorID=config.get("Door IDs", "Tool Steel Door ID", 2519).getInt();
		RadiantAdamantDoorID=config.get("Door IDs", "Radiant Adamant Door ID", 2520).getInt();
		SoulSteelDoorID=config.get("Door IDs", "Soul Steel Door ID", 2521).getInt();
		CelestialBronzeDoorID=config.get("Door IDs", "Celestial Bronze Door ID", 2522).getInt();
		
		//Block Fence Config
		TinFenceID=config.get("Fence IDs", "Tin Fence ID", 2523).getInt();
		CopperFenceID=config.get("Fence IDs", "Copper Fence ID", 2524).getInt();
		SilverFenceID=config.get("Fence IDs", "Silver Fence ID", 2525).getInt();
		MithrilFenceID=config.get("Fence IDs", "Mithril Fence ID", 2526).getInt();
		TungstenFenceID=config.get("Fence IDs", "Tungsten Fence ID", 2527).getInt();
		CobaltFenceID=config.get("Fence IDs", "Cobalt Fence ID", 2528).getInt();
		OrichalcumFenceID=config.get("Fence IDs", "Orichalcum Fence ID", 2529).getInt();
		TantalumFenceID=config.get("Fence IDs", "Tantalum Fence ID", 2530).getInt();
		TitaniumFenceID=config.get("Fence IDs", "Titanium Fence ID", 2531).getInt();
		AdamantiumFenceID=config.get("Fence IDs", "Admantium Fence ID", 2532).getInt();
		SinniumFenceID=config.get("Fence IDs", "Sinnium Fence ID", 2533).getInt();
		SkyIronFenceID=config.get("Fence IDs", "Sky Iron Fence ID", 2534).getInt();
		AmberFenceID=config.get("Fence IDs", "Amber Fence ID", 2535).getInt();
		PeridotFenceID=config.get("Fence IDs", "Peridot Fence ID", 2537).getInt();
		OpalFenceID=config.get("Fence IDs", "Opal Fence ID", 2540).getInt();
		StarRubyFenceID=config.get("Fence IDs", "Star Ruby Fence ID", 2541).getInt();
		StarSapphireFenceID=config.get("Fence IDs", "Star Sapphire Fence ID", 2542).getInt();
		AmethystFenceID=config.get("Fence IDs", "Amethyst Fence ID", 2545).getInt();
		MalachiteFenceID=config.get("Fence IDs", "Malachite Fence ID", 2546).getInt();
		OnyxFenceID=config.get("Fence IDs", "Onyx Fence ID", 2547).getInt();
		TopazFenceID=config.get("Fence IDs", "Topaz Fence ID", 2548).getInt();
		SunstoneFenceID=config.get("Fence IDs", "Sunstone Fence ID", 2549).getInt();
		MoonstoneFenceID=config.get("Fence IDs", "Moonstone Fence ID", 2550).getInt();
		BloodstoneFenceID=config.get("Fence IDs", "Bloodstone Fence ID", 2551).getInt();
		BronzeFenceID=config.get("Fence IDs", "Bronze Fence ID", 2552).getInt();
		DragonSteelFenceID=config.get("Fence IDs", "Dragon Steel Fence ID", 2553).getInt();
		BlueSteelFenceID=config.get("Fence IDs", "Blue Steel Fence ID", 2554).getInt();
		ElvishIronFenceID=config.get("Fence IDs", "Elvish Iron Fence ID", 2555).getInt();
		ToolSteelFenceID=config.get("Fence IDs", "Tool Steel Fence ID", 2556).getInt();
		RadiantAdamantFenceID=config.get("Fence IDs", "Radiant Adamant Fence ID", 2557).getInt();
		SoulSteelFenceID=config.get("Fence IDs", "Soul Steel Fence ID", 2558).getInt();
		CelestialBronzeFenceID=config.get("Fence IDs", "Celestial Bronze Fence ID", 2559).getInt();
		
		//Block Fence Gate Config
		TinFenceGateID=config.get("Fence Gate IDs", "Tin Fence Gate ID", 2560).getInt();
		CopperFenceGateID=config.get("Fence Gate IDs", "Copper Fence Gate ID", 2561).getInt();
		SilverFenceGateID=config.get("Fence Gate IDs", "Silver Fence Gate ID", 2562).getInt();
		MithrilFenceGateID=config.get("Fence Gate IDs", "Mithril Fence Gate ID", 2563).getInt();
		TungstenFenceGateID=config.get("Fence Gate IDs", "Tungsten Fence Gate ID", 2564).getInt();
		CobaltFenceGateID=config.get("Fence Gate IDs", "Cobalt Fence Gate ID", 2565).getInt();
		OrichalcumFenceGateID=config.get("Fence Gate IDs", "Orichalcum Fence Gate ID", 2566).getInt();
		TantalumFenceGateID=config.get("Fence Gate IDs", "Tantalum Fence Gate ID", 2567).getInt();
		TitaniumFenceGateID=config.get("Fence Gate IDs", "Titanium Fence Gate ID", 2568).getInt();
		AdamantiumFenceGateID=config.get("Fence Gate IDs", "Admantium Fence Gate ID", 2569).getInt();
		SinniumFenceGateID=config.get("Fence Gate IDs", "Sinnium Fence Gate ID", 2570).getInt();
		SkyIronFenceGateID=config.get("Fence Gate IDs", "Sky Iron Fence Gate ID", 2571).getInt();
		AmberFenceGateID=config.get("Fence Gate IDs", "Amber Fence Gate ID", 2572).getInt();
		PeridotFenceGateID=config.get("Fence Gate IDs", "Peridot Fence Gate ID", 2574).getInt();
		OpalFenceGateID=config.get("Fence Gate IDs", "Opal Fence Gate ID", 2577).getInt();
		StarRubyFenceGateID=config.get("Fence Gate IDs", "Star Ruby Fence Gate ID", 2578).getInt();
		StarSapphireFenceGateID=config.get("Fence Gate IDs", "Star Sapphire Fence Gate ID", 2579).getInt();
		AmethystFenceGateID=config.get("Fence Gate IDs", "Amethyst Fence Gate ID", 2582).getInt();
		MalachiteFenceGateID=config.get("Fence Gate IDs", "Malachite Fence Gate ID", 2583).getInt();
		OnyxFenceGateID=config.get("Fence Gate IDs", "Onyx Fence Gate ID", 2584).getInt();
		TopazFenceGateID=config.get("Fence Gate IDs", "Topaz Fence Gate ID", 2585).getInt();
		SunstoneFenceGateID=config.get("Fence Gate IDs", "Sunstone Fence Gate ID", 2586).getInt();
		MoonstoneFenceGateID=config.get("Fence Gate IDs", "Moonstone Fence Gate ID", 2587).getInt();
		BloodstoneFenceGateID=config.get("Fence Gate IDs", "Bloodstone Fence Gate ID", 2588).getInt();
		BronzeFenceGateID=config.get("Fence Gate IDs", "Bronze Fence Gate ID", 2589).getInt();
		DragonSteelFenceGateID=config.get("Fence Gate IDs", "Dragon Steel Fence Gate ID", 2590).getInt();
		BlueSteelFenceGateID=config.get("Fence Gate IDs", "Blue Steel Fence Gate ID", 2591).getInt();
		ElvishIronFenceGateID=config.get("Fence Gate IDs", "Elvish Iron Fence Gate ID", 2592).getInt();
		ToolSteelFenceGateID=config.get("Fence Gate IDs", "Tool Steel Fence Gate ID", 2593).getInt();
		RadiantAdamantFenceGateID=config.get("Fence Gate IDs", "Radiant Adamant Fence Gate ID", 2594).getInt();
		SoulSteelFenceGateID=config.get("Fence Gate IDs", "Soul Steel Fence Gate ID", 2595).getInt();
		CelestialBronzeFenceGateID=config.get("Fence Gate IDs", "Celestial Bronze Fence Gate ID", 2596).getInt();
		
		//Item Ingots Config
		TinIngotID=config.get("Ingot ID's", "Tin Ingot ID", 5360).getInt();
		CopperIngotID=config.get("Ingot ID's", "Copper Ingot ID", 5361).getInt();
		SilverIngotID=config.get("Ingot ID's", "Silver Ingot ID", 5362).getInt();
		MithrilIngotID=config.get("Ingot ID's", "Mithril Ingot ID", 5363).getInt();
		TungstenIngotID=config.get("Ingot ID's", "Tungsten Ingot ID", 5364).getInt();
		CobaltIngotID=config.get("Ingot ID's", "Cobalt Ingot ID", 5365).getInt();
		OrichalcumIngotID=config.get("Ingot ID's", "Orichalcum Ingot ID", 5366).getInt();
		TantalumIngotID=config.get("Ingot ID's", "Tantalum Ingot ID", 5367).getInt();
		TitaniumIngotID=config.get("Ingot ID's", "Titanium Ingot ID", 5368).getInt();
		AdamantiumIngotID=config.get("Ingot ID's", "Adamantium Ingot ID", 5369).getInt();
		SinniumIngotID=config.get("Ingot ID's", "Sinnium Ingot ID", 5370).getInt();
		SkyIronIngotID=config.get("Ingot ID's", "Sky Iron Ingot ID", 5371).getInt();
		BronzeIngotID=config.get("Ingot ID's", "Bronze Ingot ID", 5372).getInt();
		DragonSteelIngotID=config.get("Ingot ID's", "Dragon Steel Ingot ID", 5373).getInt();
		BlueSteelIngotID=config.get("Ingot ID's", "Blue Steel Ingot ID", 5374).getInt();
		ElvishIronIngotID=config.get("Ingot ID's", "Elvish Iron Ingot ID", 5375).getInt();
		ToolSteelIngotID=config.get("Ingot ID's", "Tool Steel Ingot ID", 5376).getInt();
		RadiantAdamantIngotID=config.get("Ingot ID's", "Radiant Adamant Ingot ID", 5377).getInt();
		SoulSteelIngotID=config.get("Ingot ID's", "Soul Steel Ingot ID", 5378).getInt();
		CelestialBronzeIngotID=config.get("Ingot ID's", "Celestial Bronze Ingot ID", 5379).getInt();
		
		//Item Gem Config
		AmberID=config.get("Gem IDs", "Amber ID", 5380).getInt();
		PeridotID=config.get("Gem IDs", "Peridot ID", 5382).getInt();
		OpalID=config.get("Gem IDs", "Opal ID", 5385).getInt();
		StarRubyID=config.get("Gem IDs", "Star Ruby ID", 5386).getInt();
		StarSapphireID=config.get("Gem IDs", "Star Sapphire ID", 5387).getInt();
		AmethystID=config.get("Gem IDs", "Amethyst ID", 5390).getInt();
		MalachiteID=config.get("Gem IDs", "Malachite ID", 5391).getInt();
		OnyxID=config.get("Gem IDs", "Onyx ID", 5392).getInt();
		TopazID=config.get("Gem IDs", "Topaz ID", 5393).getInt();
		SunstoneID=config.get("Gem IDs", "Sunstone ID", 5394).getInt();
		MoonstoneID=config.get("Gem IDs", "Moonstone ID", 5395).getInt();
		BloodstoneID=config.get("Gem IDs", "Bloodstone ID", 5396).getInt();
		
		//Item Helmet Config
		TinHelmetID=config.get("Helmet IDs", "Tin Helmet ID", 5397).getInt();
		CopperHelmetID=config.get("Helmet IDs", "Copper Helmet ID", 5398).getInt();
        SilverHelmetID=config.get("Helmet IDs", "Silver Helmet ID", 5399).getInt();
        MithrilHelmetID=config.get("Helmet IDs", "Mithril Helmet ID", 5400).getInt();
        TungstenHelmetID=config.get("Helmet IDs", "Tungsten Helmet ID", 5401).getInt();
        CobaltHelmetID=config.get("Helmet IDs", "Cobalt Helmet ID", 5402).getInt();
        OrichalcumHelmetID=config.get("Helmet IDs", "Orichalcum Helmet ID", 5403).getInt();
        TantalumHelmetID=config.get("Helmet IDs", "Tantalum Helmet ID", 5404).getInt();
        TitaniumHelmetID=config.get("Helmet IDs", "Titanium Helmet ID", 5405).getInt();
        AdamantiumHelmetID=config.get("Helmet IDs", "Admantium Helmet ID", 5406).getInt();
        SinniumHelmetID=config.get("Helmet IDs", "Sinnium Helmet ID", 5407).getInt();
        SkyIronHelmetID=config.get("Helmet IDs", "Sky Iron Helmet ID", 5408).getInt();
        BronzeHelmetID=config.get("Helmet IDs", "Bronze Helmet ID", 5426).getInt();
        DragonSteelHelmetID=config.get("Helmet IDs", "Dragon Steel Helmet ID", 5427).getInt();
        BlueSteelHelmetID=config.get("Helmet IDs", "Blue Steel Helmet ID", 5428).getInt();
        ElvishIronHelmetID=config.get("Helmet IDs", "Elvish Iron Helmet ID", 5429).getInt();
        ToolSteelHelmetID=config.get("Helmet IDs", "Tool Steel Helmet ID", 5430).getInt();
        RadiantAdamantHelmetID=config.get("Helmet IDs", "Radiant Adamant Helmet ID", 5431).getInt();
        SoulSteelHelmetID=config.get("Helmet IDs", "Soul Steel Helmet ID", 5432).getInt();
        CelestialBronzeHelmetID=config.get("Helmet IDs", "Celestial Bronze Helmet ID", 5433).getInt();
		
		//Item Chestplate Config
        TinChestplateID=config.get("Chestplate IDs", "Tin Chestplate ID", 5434).getInt();
        CopperChestplateID=config.get("Chestplate IDs", "Copper Chestplate ID", 5435).getInt();
        SilverChestplateID=config.get("Chestplate IDs", "Silver Chestplate ID", 5436).getInt();
        MithrilChestplateID=config.get("Chestplate IDs", "Mithril Chestplate ID", 5436).getInt();
        TungstenChestplateID=config.get("Chestplate IDs", "Tungsten Chestplate ID", 5438).getInt();
        CobaltChestplateID=config.get("Chestplate IDs", "Cobalt Chestplate ID", 5439).getInt();
        OrichalcumChestplateID=config.get("Chestplate IDs", "Orichalcum Chestplate ID", 5440).getInt();
        TantalumChestplateID=config.get("Chestplate IDs", "Tantalum Chestplate ID", 5441).getInt();
        TitaniumChestplateID=config.get("Chestplate IDs", "Titanium Chestplate ID", 5442).getInt();
        AdamantiumChestplateID=config.get("Chestplate IDs", "Admantium Chestplate ID", 5443).getInt();
        SinniumChestplateID=config.get("Chestplate IDs", "Sinnium Chestplate ID", 5444).getInt();
        SkyIronChestplateID=config.get("Chestplate IDs", "Sky Iron Chestplate ID", 5445).getInt();
        BronzeChestplateID=config.get("Chestplate IDs", "Bronze Chestplate ID", 5463).getInt();
        DragonSteelChestplateID=config.get("Chestplate IDs", "Dragon Steel Chestplate ID", 5464).getInt();
        BlueSteelChestplateID=config.get("Chestplate IDs", "Blue Steel Chestplate ID", 5465).getInt();
        ElvishIronChestplateID=config.get("Chestplate IDs", "Elvish Iron Chestplate ID", 5466).getInt();
        ToolSteelChestplateID=config.get("Chestplate IDs", "Tool Steel Chestplate ID", 5467).getInt();
        RadiantAdamantChestplateID=config.get("Chestplate IDs", "Radiant Adamant Chestplate ID", 5468).getInt();
        SoulSteelChestplateID=config.get("Chestplate IDs", "Soul Steel Chestplate ID", 5469).getInt();
        CelestialBronzeChestplateID=config.get("Chestplate IDs", "Celestial Bronze Chestplate ID", 5470).getInt();
		
		//Item Leggings Config
        TinLeggingsID=config.get("Leggings IDs", "Tin Leggings ID", 5471).getInt();
        CopperLeggingsID=config.get("Leggings IDs", "Copper Leggings ID", 5472).getInt();
        SilverLeggingsID=config.get("Leggings IDs", "Silver Leggings ID", 5473).getInt();
        MithrilLeggingsID=config.get("Leggings IDs", "Mithril Leggings ID", 5474).getInt();
        TungstenLeggingsID=config.get("Leggings IDs", "Tungsten Leggings ID", 5475).getInt();
        CobaltLeggingsID=config.get("Leggings IDs", "Cobalt Leggings ID", 5476).getInt();
        OrichalcumLeggingsID=config.get("Leggings IDs", "Orichalcum Leggings ID", 5477).getInt();
        TantalumLeggingsID=config.get("Leggings IDs", "Tantalum Leggings ID", 5478).getInt();
        TitaniumLeggingsID=config.get("Leggings IDs", "Titanium Leggings ID", 5479).getInt();
        AdamantiumLeggingsID=config.get("Leggings IDs", "Admantium Leggings ID", 5480).getInt();
        SinniumLeggingsID=config.get("Leggings IDs", "Sinnium Leggings ID", 5481).getInt();
        SkyIronLeggingsID=config.get("Leggings IDs", "Sky Iron Leggings ID", 5482).getInt();
        BronzeLeggingsID=config.get("Leggings IDs", "Bronze Leggings ID", 5500).getInt();
        DragonSteelLeggingsID=config.get("Leggings IDs", "Dragon Steel Leggings ID", 5501).getInt();
        BlueSteelLeggingsID=config.get("Leggings IDs", "Blue Steel Leggings ID", 5502).getInt();
        ElvishIronLeggingsID=config.get("Leggings IDs", "Elvish Iron Leggings ID", 5503).getInt();
        ToolSteelLeggingsID=config.get("Leggings IDs", "Tool Steel Leggings ID", 5504).getInt();
        RadiantAdamantLeggingsID=config.get("Leggings IDs", "Radiant Adamant Leggings ID", 5505).getInt();
        SoulSteelLeggingsID=config.get("Leggings IDs", "Soul Steel Leggings ID", 5506).getInt();
        CelestialBronzeLeggingsID=config.get("Leggings IDs", "Celestial Bronze Leggings ID", 5507).getInt();
		
		//Item Boots Config
        TinBootsID=config.get("Boots IDs", "Tin Boots ID", 5508).getInt();
        CopperBootsID=config.get("Boots IDs", "Copper Boots ID", 5509).getInt();
        SilverBootsID=config.get("Boots IDs", "Silver Boots ID", 5510).getInt();
        MithrilBootsID=config.get("Boots IDs", "Mithril Boots ID", 5511).getInt();
        TungstenBootsID=config.get("Boots IDs", "Tungsten Boots ID", 5512).getInt();
        CobaltBootsID=config.get("Boots IDs", "Cobalt Boots ID", 5513).getInt();
        OrichalcumBootsID=config.get("Boots IDs", "Orichalcum Boots ID", 5514).getInt();
        TantalumBootsID=config.get("Boots IDs", "Tantalum Boots ID", 5515).getInt();
        TitaniumBootsID=config.get("Boots IDs", "Titanium Boots ID", 5516).getInt();
        AdamantiumBootsID=config.get("Boots IDs", "Admantium Boots ID", 5517).getInt();
        SinniumBootsID=config.get("Boots IDs", "Sinnium Boots ID", 5518).getInt();
        SkyIronBootsID=config.get("Boots IDs", "Sky Iron Boots ID", 5519).getInt();
        BronzeBootsID=config.get("Boots IDs", "Bronze Boots ID", 5538).getInt();
        DragonSteelBootsID=config.get("Boots IDs", "Dragon Steel Boots ID", 5539).getInt();
        BlueSteelBootsID=config.get("Boots IDs", "Blue Steel Boots ID", 5540).getInt();
        ElvishIronBootsID=config.get("Boots IDs", "Elvish Iron Boots ID", 5541).getInt();
        ToolSteelBootsID=config.get("Boots IDs", "Tool Steel Boots ID", 5542).getInt();
        RadiantAdamantBootsID=config.get("Boots IDs", "Radiant Adamant Boots ID", 5543).getInt();
        SoulSteelBootsID=config.get("Boots IDs", "Soul Steel Boots ID", 5544).getInt();
        CelestialBronzeBootsID=config.get("Boots IDs", "Celestial Bronze Boots ID", 5545).getInt();
		
		//Item Pickaxe Config
        TinPickaxeID=config.get("Pickaxe IDs", "Tin Pickaxe ID", 5546).getInt();
        CopperPickaxeID=config.get("Pickaxe IDs", "Copper Pickaxe ID", 5567).getInt();
        SilverPickaxeID=config.get("Pickaxe IDs", "Silver Pickaxe ID", 5548).getInt();
        MithrilPickaxeID=config.get("Pickaxe IDs", "Mithril Pickaxe ID", 5549).getInt();
        TungstenPickaxeID=config.get("Pickaxe IDs", "Tungsten Pickaxe ID", 5550).getInt();
        CobaltPickaxeID=config.get("Pickaxe IDs", "Cobalt Pickaxe ID", 5551).getInt();
        OrichalcumPickaxeID=config.get("Pickaxe IDs", "Orichalcum Pickaxe ID", 5552).getInt();
        TantalumPickaxeID=config.get("Pickaxe IDs", "Tantalum Pickaxe ID", 5553).getInt();
        TitaniumPickaxeID=config.get("Pickaxe IDs", "Titanium Pickaxe ID", 5554).getInt();
        AdamantiumPickaxeID=config.get("Pickaxe IDs", "Admantium Pickaxe ID", 5555).getInt();
        SinniumPickaxeID=config.get("Pickaxe IDs", "Sinnium Pickaxe ID", 5556).getInt();
        SkyIronPickaxeID=config.get("Pickaxe IDs", "Sky Iron Pickaxe ID", 5557).getInt();
        AmberPickaxeID=config.get("Pickaxe IDs", "Amber Pickaxe ID", 5558).getInt();
        PeridotPickaxeID=config.get("Pickaxe IDs", "Peridot Pickaxe ID", 5560).getInt();
        OpalPickaxeID=config.get("Pickaxe IDs", "Opal Pickaxe ID", 5563).getInt();
        StarRubyPickaxeID=config.get("Pickaxe IDs", "Star Ruby Pickaxe ID", 5564).getInt();
        StarSapphirePickaxeID=config.get("Pickaxe IDs", "Star Sapphire Pickaxe ID", 5565).getInt();
        AmethystPickaxeID=config.get("Pickaxe IDs", "Amethyst Pickaxe ID", 5568).getInt();
        MalachitePickaxeID=config.get("Pickaxe IDs", "Malachite Pickaxe ID", 5569).getInt();
        OnyxPickaxeID=config.get("Pickaxe IDs", "Onyx Pickaxe ID", 5570).getInt();
        TopazPickaxeID=config.get("Pickaxe IDs", "Topaz Pickaxe ID", 5571).getInt();
        SunstonePickaxeID=config.get("Pickaxe IDs", "Sunstone Pickaxe ID", 5572).getInt();
        MoonstonePickaxeID=config.get("Pickaxe IDs", "Moonstone Pickaxe ID", 5573).getInt();
        BloodstonePickaxeID=config.get("Pickaxe IDs", "Bloodstone Pickaxe ID", 5574).getInt();
        BronzePickaxeID=config.get("Pickaxe IDs", "Bronze Pickaxe ID", 5575).getInt();
        DragonSteelPickaxeID=config.get("Pickaxe IDs", "Dragon Steel Pickaxe ID", 5576).getInt();
        BlueSteelPickaxeID=config.get("Pickaxe IDs", "Blue Steel Pickaxe ID", 5577).getInt();
        ElvishIronPickaxeID=config.get("Pickaxe IDs", "Elvish Iron Pickaxe ID", 5578).getInt();
        ToolSteelPickaxeID=config.get("Pickaxe IDs", "Tool Steel Pickaxe ID", 5579).getInt();
        RadiantAdamantPickaxeID=config.get("Pickaxe IDs", "Radiant Adamant Pickaxe ID", 5580).getInt();
        SoulSteelPickaxeID=config.get("Pickaxe IDs", "Soul Steel Pickaxe ID", 5581).getInt();
        CelestialBronzePickaxeID=config.get("Pickaxe IDs", "Celestial Bronze Pickaxe ID", 5582).getInt();
		
		//Item Shovel Config
        TinShovelID=config.get("Shovel IDs", "Tin Shovel ID", 5583).getInt();
        CopperShovelID=config.get("Shovel IDs", "Copper Shovel ID", 5584).getInt();
        SilverShovelID=config.get("Shovel IDs", "Silver Shovel ID", 5585).getInt();
        MithrilShovelID=config.get("Shovel IDs", "Mithril Shovel ID", 5586).getInt();
        TungstenShovelID=config.get("Shovel IDs", "Tungsten Shovel ID", 5587).getInt();
        CobaltShovelID=config.get("Shovel IDs", "Cobalt Shovel ID", 5588).getInt();
        OrichalcumShovelID=config.get("Shovel IDs", "Orichalcum Shovel ID", 5589).getInt();
        TantalumShovelID=config.get("Shovel IDs", "Tantalum Shovel ID", 5590).getInt();
        TitaniumShovelID=config.get("Shovel IDs", "Titanium Shovel ID", 5591).getInt();
        AdamantiumShovelID=config.get("Shovel IDs", "Admantium Shovel ID", 5592).getInt();
        SinniumShovelID=config.get("Shovel IDs", "Sinnium Shovel ID", 5593).getInt();
        SkyIronShovelID=config.get("Shovel IDs", "Sky Iron Shovel ID", 5594).getInt();
        AmberShovelID=config.get("Shovel IDs", "Amber Shovel ID", 5595).getInt();
        PeridotShovelID=config.get("Shovel IDs", "Peridot Shovel ID", 5597).getInt();
        OpalShovelID=config.get("Shovel IDs", "Opal Shovel ID", 5600).getInt();
        StarRubyShovelID=config.get("Shovel IDs", "Star Ruby Shovel ID", 5601).getInt();
        StarSapphireShovelID=config.get("Shovel IDs", "Star Sapphire Shovel ID", 5602).getInt();
        AmethystShovelID=config.get("Shovel IDs", "Amethyst Shovel ID", 5605).getInt();
        MalachiteShovelID=config.get("Shovel IDs", "Malachite Shovel ID", 5606).getInt();
        OnyxShovelID=config.get("Shovel IDs", "Onyx Shovel ID", 5607).getInt();
        TopazShovelID=config.get("Shovel IDs", "Topaz Shovel ID", 5608).getInt();
        SunstoneShovelID=config.get("Shovel IDs", "Sunstone Shovel ID", 5609).getInt();
        MoonstoneShovelID=config.get("Shovel IDs", "Moonstone Shovel ID", 5610).getInt();
        BloodstoneShovelID=config.get("Shovel IDs", "Bloodstone Shovel ID", 5611).getInt();
        BronzeShovelID=config.get("Shovel IDs", "Bronze Shovel ID", 5612).getInt();
        DragonSteelShovelID=config.get("Shovel IDs", "Dragon Steel Shovel ID", 5612).getInt();
        BlueSteelShovelID=config.get("Shovel IDs", "Blue Steel Shovel ID", 5613).getInt();
        ElvishIronShovelID=config.get("Shovel IDs", "Elvish Iron Shovel ID", 5614).getInt();
        ToolSteelShovelID=config.get("Shovel IDs", "Tool Steel Shovel ID", 5615).getInt();
        RadiantAdamantShovelID=config.get("Shovel IDs", "Radiant Adamant Shovel ID", 5616).getInt();
        SoulSteelShovelID=config.get("Shovel IDs", "Soul Steel Shovel ID", 5617).getInt();
        CelestialBronzeShovelID=config.get("Shovel IDs", "Celestial Bronze Shovel ID", 5618).getInt();
		
		//Item Hatchet Config
        TinHatchetID=config.get("Hatchet IDs", "Tin Hatchet ID", 5619).getInt();
        CopperHatchetID=config.get("Hatchet IDs", "Copper Hatchet ID", 5620).getInt();
        SilverHatchetID=config.get("Hatchet IDs", "Silver Hatchet ID", 5621).getInt();
        MithrilHatchetID=config.get("Hatchet IDs", "Mithril Hatchet ID", 5622).getInt();
        TungstenHatchetID=config.get("Hatchet IDs", "Tungsten Hatchet ID", 5623).getInt();
        CobaltHatchetID=config.get("Hatchet IDs", "Cobalt Hatchet ID", 5624).getInt();
        OrichalcumHatchetID=config.get("Hatchet IDs", "Orichalcum Hatchet ID", 5625).getInt();
        TantalumHatchetID=config.get("Hatchet IDs", "Tantalum Hatchet ID", 5626).getInt();
        TitaniumHatchetID=config.get("Hatchet IDs", "Titanium Hatchet ID", 5627).getInt();
        AdamantiumHatchetID=config.get("Hatchet IDs", "Admantium Hatchet ID", 5628).getInt();
        SinniumHatchetID=config.get("Hatchet IDs", "Sinnium Hatchet ID", 5629).getInt();
        SkyIronHatchetID=config.get("Hatchet IDs", "Sky Iron Hatchet ID", 5630).getInt();
        AmberHatchetID=config.get("Hatchet IDs", "Amber Hatchet ID", 5631).getInt();
        PeridotHatchetID=config.get("Hatchet IDs", "Peridot Hatchet ID", 5633).getInt();
        OpalHatchetID=config.get("Hatchet IDs", "Opal Hatchet ID", 5636).getInt();
        StarRubyHatchetID=config.get("Hatchet IDs", "Star Ruby Hatchet ID", 5637).getInt();
        StarSapphireHatchetID=config.get("Hatchet IDs", "Star Sapphire Hatchet ID", 5638).getInt();
        AmethystHatchetID=config.get("Hatchet IDs", "Amethyst Hatchet ID", 5641).getInt();
        MalachiteHatchetID=config.get("Hatchet IDs", "Malachite Hatchet ID", 5642).getInt();
        OnyxHatchetID=config.get("Hatchet IDs", "Onyx Hatchet ID", 5643).getInt();
        TopazHatchetID=config.get("Hatchet IDs", "Topaz Hatchet ID", 5644).getInt();
        SunstoneHatchetID=config.get("Hatchet IDs", "Sunstone Hatchet ID", 5645).getInt();
        MoonstoneHatchetID=config.get("Hatchet IDs", "Moonstone Hatchet ID", 5646).getInt();
        BloodstoneHatchetID=config.get("Hatchet IDs", "Bloodstone Hatchet ID", 5647).getInt();
        BronzeHatchetID=config.get("Hatchet IDs", "Bronze Hatchet ID", 5648).getInt();
        DragonSteelHatchetID=config.get("Hatchet IDs", "Dragon Steel Hatchet ID", 5649).getInt();
        BlueSteelHatchetID=config.get("Hatchet IDs", "Blue Steel Hatchet ID", 5650).getInt();
        ElvishIronHatchetID=config.get("Hatchet IDs", "Elvish Iron Hatchet ID", 5651).getInt();
        ToolSteelHatchetID=config.get("Hatchet IDs", "Tool Steel Hatchet ID", 5652).getInt();
        RadiantAdamantHatchetID=config.get("Hatchet IDs", "Radiant Adamant Hatchet ID", 5653).getInt();
        SoulSteelHatchetID=config.get("Hatchet IDs", "Soul Steel Hatchet ID", 5654).getInt();
        CelestialBronzeHatchetID=config.get("Hatchet IDs", "Celestial Bronze Hatchet ID", 5655).getInt();
		
		//Item Hoe Config
        TinHoeID=config.get("Hoe IDs", "Tin Hoe ID", 5656).getInt();
        CopperHoeID=config.get("Hoe IDs", "Copper Hoe ID", 5657).getInt();
        SilverHoeID=config.get("Hoe IDs", "Silver Hoe ID", 5658).getInt();
        MithrilHoeID=config.get("Hoe IDs", "Mithril Hoe ID", 5659).getInt();
        TungstenHoeID=config.get("Hoe IDs", "Tungsten Hoe ID", 5660).getInt();
        CobaltHoeID=config.get("Hoe IDs", "Cobalt Hoe ID", 5661).getInt();
        OrichalcumHoeID=config.get("Hoe IDs", "Orichalcum Hoe ID", 5662).getInt();
        TantalumHoeID=config.get("Hoe IDs", "Tantalum Hoe ID", 5663).getInt();
        TitaniumHoeID=config.get("Hoe IDs", "Titanium Hoe ID", 5664).getInt();
        AdamantiumHoeID=config.get("Hoe IDs", "Admantium Hoe ID", 5665).getInt();
        SinniumHoeID=config.get("Hoe IDs", "Sinnium Hoe ID", 5666).getInt();
        SkyIronHoeID=config.get("Hoe IDs", "Sky Iron Hoe ID", 5667).getInt();
        AmberHoeID=config.get("Hoe IDs", "Amber Hoe ID", 5668).getInt();
        PeridotHoeID=config.get("Hoe IDs", "Peridot Hoe ID", 5670).getInt();
        OpalHoeID=config.get("Hoe IDs", "Opal Hoe ID", 5673).getInt();
        StarRubyHoeID=config.get("Hoe IDs", "Star Ruby Hoe ID", 5674).getInt();
        StarSapphireHoeID=config.get("Hoe IDs", "Star Sapphire Hoe ID", 5675).getInt();
        AmethystHoeID=config.get("Hoe IDs", "Amethyst Hoe ID", 5677).getInt();
        MalachiteHoeID=config.get("Hoe IDs", "Malachite Hoe ID", 5678).getInt();
        OnyxHoeID=config.get("Hoe IDs", "Onyx Hoe ID", 5679).getInt();
        TopazHoeID=config.get("Hoe IDs", "Topaz Hoe ID", 5680).getInt();
        SunstoneHoeID=config.get("Hoe IDs", "Sunstone Hoe ID", 5681).getInt();
        MoonstoneHoeID=config.get("Hoe IDs", "Moonstone Hoe ID", 5682).getInt();
        BloodstoneHoeID=config.get("Hoe IDs", "Bloodstone Hoe ID", 5683).getInt();
        BronzeHoeID=config.get("Hoe IDs", "Bronze Hoe ID", 5684).getInt();
        DragonSteelHoeID=config.get("Hoe IDs", "Dragon Steel Hoe ID", 5685).getInt();
        BlueSteelHoeID=config.get("Hoe IDs", "Blue Steel Hoe ID", 5686).getInt();
        ElvishIronHoeID=config.get("Hoe IDs", "Elvish Iron Hoe ID", 5687).getInt();
        ToolSteelHoeID=config.get("Hoe IDs", "Tool Steel Hoe ID", 5688).getInt();
        RadiantAdamantHoeID=config.get("Hoe IDs", "Radiant Adamant Hoe ID", 5689).getInt();
        SoulSteelHoeID=config.get("Hoe IDs", "Soul Steel Hoe ID", 5690).getInt();
        CelestialBronzeHoeID=config.get("Hoe IDs", "Celestial Bronze Hoe ID", 5691).getInt();
		
		//Item Sword Config
        TinSwordID=config.get("Sword IDs", "Tin Sword ID", 5692).getInt();
        CopperSwordID=config.get("Sword IDs", "Copper Sword ID", 5693).getInt();
        SilverSwordID=config.get("Sword IDs", "Silver Sword ID", 5694).getInt();
        MithrilSwordID=config.get("Sword IDs", "Mithril Sword ID", 5695).getInt();
        TungstenSwordID=config.get("Sword IDs", "Tungsten Sword ID", 5696).getInt();
        CobaltSwordID=config.get("Sword IDs", "Cobalt Sword ID", 5697).getInt();
        OrichalcumSwordID=config.get("Sword IDs", "Orichalcum Sword ID", 5698).getInt();
        TantalumSwordID=config.get("Sword IDs", "Tantalum Sword ID", 5699).getInt();
        TitaniumSwordID=config.get("Sword IDs", "Titanium Sword ID", 5700).getInt();
        AdamantiumSwordID=config.get("Sword IDs", "Admantium Sword ID", 5701).getInt();
        SinniumSwordID=config.get("Sword IDs", "Sinnium Sword ID", 5702).getInt();
        SkyIronSwordID=config.get("Sword IDs", "Sky Iron Sword ID", 5703).getInt();
        AmberSwordID=config.get("Sword IDs", "Amber Sword ID", 5704).getInt();
        PeridotSwordID=config.get("Sword IDs", "Peridot Sword ID", 5706).getInt();
        OpalSwordID=config.get("Sword IDs", "Opal Sword ID", 5709).getInt();
        StarRubySwordID=config.get("Sword IDs", "Star Ruby Sword ID", 5710).getInt();
        StarSapphireSwordID=config.get("Sword IDs", "Star Sapphire Sword ID", 5711).getInt();
        AmethystSwordID=config.get("Sword IDs", "Amethyst Sword ID", 5714).getInt();
        MalachiteSwordID=config.get("Sword IDs", "Malachite Sword ID", 5715).getInt();
        OnyxSwordID=config.get("Sword IDs", "Onyx Sword ID", 5716).getInt();
        TopazSwordID=config.get("Sword IDs", "Topaz Sword ID", 5717).getInt();
        SunstoneSwordID=config.get("Sword IDs", "Sunstone Sword ID", 5718).getInt();
        MoonstoneSwordID=config.get("Sword IDs", "Moonstone Sword ID", 5719).getInt();
        BloodstoneSwordID=config.get("Sword IDs", "Bloodstone Sword ID", 5720).getInt();
        BronzeSwordID=config.get("Sword IDs", "Bronze Sword ID", 5721).getInt();
        DragonSteelSwordID=config.get("Sword IDs", "Dragon Steel Sword ID", 5722).getInt();
        BlueSteelSwordID=config.get("Sword IDs", "Blue Steel Sword ID", 5723).getInt();
        ElvishIronSwordID=config.get("Sword IDs", "Elvish Iron Sword ID", 5724).getInt();
        ToolSteelSwordID=config.get("Sword IDs", "Tool Steel Sword ID", 5725).getInt();
        RadiantAdamantSwordID=config.get("Sword IDs", "Radiant Adamant Sword ID", 5726).getInt();
        SoulSteelSwordID=config.get("Sword IDs", "Soul Steel Sword ID", 5727).getInt();
        CelestialBronzeSwordID=config.get("Sword IDs", "Celestial Bronze Sword ID", 5728).getInt();
        
        
		config.save();
	}
	
	//@Init
	@EventHandler
	public void Init(FMLInitializationEvent event){
		proxy.registerRenderThings();
		
		//EnumToolMaterial ("NAME", can mine, uses, effenciency, damage vs entities, enchantability)
		EnumToolMaterial TIN=EnumHelper.addToolMaterial("TIN", 2, 200, 4.5F, 1, 15);
		EnumToolMaterial COPPER=EnumHelper.addToolMaterial("COPPER", 2, 200, 4.5F, 1, 15);
		EnumToolMaterial SILVER=EnumHelper.addToolMaterial("SILVER", 2, 200, 4.5F, 1, 15);
		EnumToolMaterial COBALT=EnumHelper.addToolMaterial("COBALT", 3, 300, 7F, 2, 20);
		EnumToolMaterial TITANIUM=EnumHelper.addToolMaterial("TITANIUM", 3, 300, 7F, 2, 20);
		EnumToolMaterial MITHRIL=EnumHelper.addToolMaterial("MITHRIL", 4, 800, 9F, 3, 25);
		EnumToolMaterial TANTALUM=EnumHelper.addToolMaterial("TANTALUM", 4, 800, 9F, 3, 25);
		EnumToolMaterial TUNGSTEN=EnumHelper.addToolMaterial("TUNGSTEN", 5, 1600, 15F, 4, 30);
		EnumToolMaterial ORICHALCUM=EnumHelper.addToolMaterial("ORICHALCUM", 5, 1600, 15F, 4, 30);
		EnumToolMaterial ADAMANTIUM=EnumHelper.addToolMaterial("ADAMANTIUM", 6, 2500, 20F, 5, 35);
	    EnumToolMaterial SKYIRON=EnumHelper.addToolMaterial("SKYIRON", 6, 2500, 20F, 5, 35);
	    EnumToolMaterial SINNIUM=EnumHelper.addToolMaterial("SINNIUM", 6, 2500, 20F, 5, 35);
	    EnumToolMaterial AMBER=EnumHelper.addToolMaterial("AMBER", 2, 200, 4.5F, 1, 15);
	    EnumToolMaterial MALACHITE=EnumHelper.addToolMaterial("MALACHITE", 3, 300, 7F, 2, 20);
	    EnumToolMaterial OPAL=EnumHelper.addToolMaterial("OPAL", 3, 300, 7F, 2, 20);
	    EnumToolMaterial PERIDOT=EnumHelper.addToolMaterial("PERIDOT", 4, 800, 9F, 3, 25);
	    EnumToolMaterial ONYX=EnumHelper.addToolMaterial("ONYX", 4, 800, 9F, 3, 25);
	    EnumToolMaterial AMETHYST=EnumHelper.addToolMaterial("AMETHYST", 5, 1600, 15F, 4, 30);
	    EnumToolMaterial TOPAZ=EnumHelper.addToolMaterial("TOPAZ", 5, 1600, 15F, 4, 30);
	    EnumToolMaterial STARSAPPHIRE=EnumHelper.addToolMaterial("STARSAPPHIRE", 6, 2500, 20F, 5, 35);
	    EnumToolMaterial STARRUBY=EnumHelper.addToolMaterial("STARRUBY", 6, 2500, 20F, 5, 35);
	    EnumToolMaterial BLOODSTONE=EnumHelper.addToolMaterial("BLOODSTONE", 7, 3500, 25F, 6, 40);
	    EnumToolMaterial MOONSTONE=EnumHelper.addToolMaterial("MOONSTONE", 7, 3500, 25F, 6, 40);
	    EnumToolMaterial SUNSTONE=EnumHelper.addToolMaterial("SUNSTONE", 7, 3500, 25F, 6, 40);
	    EnumToolMaterial BRONZE=EnumHelper.addToolMaterial("BRONZE", 2, 200, 4.5F, 1, 15);
	    EnumToolMaterial ELVISHIRON=EnumHelper.addToolMaterial("ELVISHIRON", 3, 300, 7F, 2, 20);
	    EnumToolMaterial BLUESTEEL=EnumHelper.addToolMaterial("BLUESTEEL", 3, 300, 7F, 2, 20);
	    EnumToolMaterial DRAGONSTEEL=EnumHelper.addToolMaterial("DRAGONSTEEL", 4, 800, 9F, 3, 25);
	    EnumToolMaterial TOOLSTEEL=EnumHelper.addToolMaterial("TOOLSTEEL", 4, 800, 9F, 3, 25);
	    EnumToolMaterial RADIANTADAMANT=EnumHelper.addToolMaterial("RADIANTADAMANT", 8, 7000, 40F, 7, 50);
	    EnumToolMaterial SOULSTEEL=EnumHelper.addToolMaterial("SOULSTEEL", 8, 7000, 40F, 7, 50);
	    EnumToolMaterial CELESTIALBRONZE=EnumHelper.addToolMaterial("CELESTIALBRONZE", 8, 7000, 40F, 7, 50);
		
		//EnumArmorMaterial
		EnumArmorMaterial SILVER1=EnumHelper.addArmorMaterial("SILVER", 15, new int[]{2, 6, 5, 2}, 9);
		
		//Ores
		TinOre=new BlockTinOre(TinOreID, Material.iron).setUnlocalizedName("Tin Ore").setHardness(3.0F).setStepSound(Block.soundStoneFootstep);
		CopperOre=new BlockCopperOre(CopperOreID, Material.iron).setUnlocalizedName("Copper Ore").setHardness(3.0F).setStepSound(Block.soundStoneFootstep);
		SilverOre=new BlockSilverOre(SilverOreID, Material.iron).setUnlocalizedName("Silver Ore").setHardness(3.0F).setStepSound(Block.soundStoneFootstep);
		CobaltOre=new BlockCobaltOre(CobaltOreID, Material.iron).setUnlocalizedName("Cobalt Ore").setHardness(3.0F).setStepSound(Block.soundStoneFootstep);
		TitaniumOre=new BlockTitaniumOre(TitaniumOreID, Material.iron).setUnlocalizedName("Titanium Ore").setHardness(3.0F).setStepSound(Block.soundStoneFootstep);
		MithrilOre=new BlockMithrilOre(MithrilOreID, Material.iron).setUnlocalizedName("Mithril Ore").setHardness(3.0F).setStepSound(Block.soundStoneFootstep);
		TantalumOre=new BlockTantalumOre(TantalumOreID, Material.iron).setUnlocalizedName("Tantalum Ore").setHardness(3.0F).setStepSound(Block.soundStoneFootstep); 
		TungstenOre=new BlockTungstenOre(TungstenOreID, Material.iron).setUnlocalizedName("Tungsten Ore").setHardness(3.0F).setStepSound(Block.soundStoneFootstep);
		OrichalcumOre=new BlockOrichalcumOre(OrichalcumOreID, Material.iron).setUnlocalizedName("Orichalcum Ore").setHardness(3.0F).setStepSound(Block.soundStoneFootstep);
		AdamantiumOre=new BlockAdamantiumOre(AdamantiumOreID, Material.iron).setUnlocalizedName("Adamantium Ore").setHardness(3.0F).setStepSound(Block.soundStoneFootstep);
		SkyIronOre=new BlockSkyIronOre(SkyIronOreID, Material.iron).setUnlocalizedName("Sky Iron Ore").setHardness(3.0F).setStepSound(Block.soundStoneFootstep);
		SinniumOre=new BlockSinniumOre(SinniumOreID, Material.iron).setUnlocalizedName("Sinnium Ore").setHardness(3.0F).setStepSound(Block.soundStoneFootstep);
		AmberOre=new BlockAmberOre(AmberOreID, Material.sand).setUnlocalizedName("Amber Ore").setHardness(1.0F).setStepSound(Block.soundSandFootstep);
		PeridotOre=new BlockPeridotOre(PeridotOreID, Material.iron).setUnlocalizedName("Peridot Ore").setHardness(3.0F).setStepSound(Block.soundStoneFootstep);
		OpalOre=new BlockOpalOre(OpalOreID, Material.iron).setUnlocalizedName("Opal Ore").setHardness(3.0F).setStepSound(Block.soundStoneFootstep);
		StarRubyOre=new BlockStarRubyOre(StarRubyOreID, Material.iron).setUnlocalizedName("Star Ruby Ore").setHardness(3.0F).setStepSound(Block.soundStoneFootstep);
		StarSapphireOre=new BlockStarRubyOre(StarSapphireOreID, Material.iron).setUnlocalizedName("Star Sapphire Ore").setHardness(3.0F).setStepSound(Block.soundStoneFootstep);
		AmethystOre=new BlockStarRubyOre(AmethystOreID, Material.iron).setUnlocalizedName("Amethyst Ore").setHardness(3.0F).setStepSound(Block.soundStoneFootstep);
		MalachiteOre=new BlockStarRubyOre(MalachiteOreID, Material.iron).setUnlocalizedName("Malachite Ore").setHardness(3.0F).setStepSound(Block.soundStoneFootstep);
		OnyxOre=new BlockStarRubyOre(OnyxOreID, Material.iron).setUnlocalizedName("Onyx Ore").setHardness(3.0F).setStepSound(Block.soundStoneFootstep);
		TopazOre=new BlockStarRubyOre(TopazOreID, Material.iron).setUnlocalizedName("Topaz Ore").setHardness(3.0F).setStepSound(Block.soundStoneFootstep);
		SunstoneOre=new BlockStarRubyOre(SunstoneOreID, Material.iron).setUnlocalizedName("Sunstone Ore").setHardness(3.0F).setStepSound(Block.soundStoneFootstep);
		MoonstoneOre=new BlockStarRubyOre(MoonstoneOreID, Material.iron).setUnlocalizedName("Moonstone Ore").setHardness(3.0F).setStepSound(Block.soundStoneFootstep);
		BloodstoneOre=new BlockStarRubyOre(BloodstoneOreID, Material.iron).setUnlocalizedName("Bloodstone Ore").setHardness(3.0F).setStepSound(Block.soundStoneFootstep);
		
		//Storage Block
		
		//Large Brick
		
		//Small Brick
		
		//Stairs
		
		//Door
		
		//Fence
		
		//Fence Gate
		
		//Ingot/Gems
		TinIngot=new ItemTinIngot(TinIngotID, Material.iron).setUnlocalizedName("Tin Ingot");
		CopperIngot=new ItemCopperIngot(CopperIngotID, Material.iron).setUnlocalizedName("Copper Ingot");
        SilverIngot=new ItemSilverIngot(SilverIngotID, Material.iron).setUnlocalizedName("Silver Ingot");
        CobaltIngot=new ItemCobaltIngot(CobaltIngotID, Material.iron).setUnlocalizedName("Cobalt Ingot");
        TitaniumIngot=new ItemTitaniumIngot(TitaniumIngotID, Material.iron).setUnlocalizedName("Titanium Ingot");
        MithrilIngot=new ItemMithrilIngot(MithrilIngotID, Material.iron).setUnlocalizedName("Mithril Ingot");
        TantalumIngot=new ItemTantalumIngot(TantalumIngotID, Material.iron).setUnlocalizedName("Tantalum Ingot"); 
        TungstenIngot=new ItemTungstenIngot(TungstenIngotID, Material.iron).setUnlocalizedName("Tungsten Ingot");
        OrichalcumIngot=new ItemOrichalcumIngot(OrichalcumIngotID, Material.iron).setUnlocalizedName("Orichalcum Ingot");
        AdamantiumIngot=new ItemAdamantiumIngot(AdamantiumIngotID, Material.iron).setUnlocalizedName("Adamantium Ingot");
        SkyIronIngot=new ItemSkyIronIngot(SkyIronIngotID, Material.iron).setUnlocalizedName("Sky Iron Ingot");
        SinniumIngot=new ItemSinniumIngot(SinniumIngotID, Material.iron).setUnlocalizedName("Sinnium Ingot");
        Amber=new ItemAmber(AmberID, Material.sand).setUnlocalizedName("Amber");
        Peridot=new ItemPeridot(PeridotID, Material.iron).setUnlocalizedName("Peridot");
        Opal=new ItemOpal(OpalID, Material.iron).setUnlocalizedName("Opal");
        StarRuby=new ItemStarRuby(StarRubyID, Material.iron).setUnlocalizedName("Star Ruby");
        StarSapphire=new ItemStarSapphire(StarSapphireID, Material.iron).setUnlocalizedName("Star Sapphire");
        Amethyst=new ItemAmethyst(AmethystID, Material.iron).setUnlocalizedName("Amethyst");
        Malachite=new ItemMalachite(MalachiteID, Material.iron).setUnlocalizedName("Malachite");
        Onyx=new ItemOnyx(OnyxID, Material.iron).setUnlocalizedName("Onyx");
        Topaz=new ItemTopaz(TopazID, Material.iron).setUnlocalizedName("Topaz");
        Sunstone=new ItemSunstone(SunstoneID, Material.iron).setUnlocalizedName("Sunstone");
        Moonstone=new ItemMoonstone(MoonstoneID, Material.iron).setUnlocalizedName("Moonstone");
        Bloodstone=new ItemBloodstone(BloodstoneID, Material.iron).setUnlocalizedName("Bloodstone");

		
		//Helmet
		
		//Chestplate
		
		//Leggings
		
		//Boots
		
		//Pickaxe
		
		//Shovel
		
		//Hatchet
		
		//Hoe
		
		//Sword
		
		gameRegisters();
		languageRegisters();
		
		MinecraftForge.setBlockHarvestLevel(TinOre, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(CopperOre, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(SilverOre, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(CobaltOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(TitaniumOre, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(MithrilOre, "pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(TantalumOre, "pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(TungstenOre, "pickaxe", 4);
        MinecraftForge.setBlockHarvestLevel(OrichalcumOre, "pickaxe", 4);
        MinecraftForge.setBlockHarvestLevel(AdamantiumOre, "pickaxe", 5);
        MinecraftForge.setBlockHarvestLevel(SkyIronOre, "pickaxe", 5);
        MinecraftForge.setBlockHarvestLevel(SinniumOre, "pickaxe", 5);
        MinecraftForge.setBlockHarvestLevel(AmberOre, "shovel", 1);
        MinecraftForge.setBlockHarvestLevel(MalachiteOre, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(OpalOre, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(PeridotOre, "pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(OnyxOre, "pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(AmethystOre, "pickaxe", 4);
        MinecraftForge.setBlockHarvestLevel(TopazOre, "pickaxe", 4);
        MinecraftForge.setBlockHarvestLevel(StarSapphireOre, "pickaxe", 5);
        MinecraftForge.setBlockHarvestLevel(StarRubyOre, "pickaxe", 5);
        MinecraftForge.setBlockHarvestLevel(BloodstoneOre, "pickaxe", 6);
        MinecraftForge.setBlockHarvestLevel(MoonstoneOre, "pickaxe", 6);
        MinecraftForge.setBlockHarvestLevel(SunstoneOre, "pickaxe", 6);
		
		GameRegistry.addSmelting(TinOreID, new ItemStack(TinIngot, 1), 1.0F);
		GameRegistry.addSmelting(CopperOreID, new ItemStack(CopperIngot, 1), 1.0F);
		
	}
	
	private static void gameRegisters(){
		
	    //Ores
	    GameRegistry.registerBlock(TinOre, "TinOre");
		GameRegistry.registerBlock(CopperOre, "CopperOre");
		GameRegistry.registerBlock(SilverOre, "SilverOre");
		GameRegistry.registerBlock(CobaltOre, "CobaltOre");
		GameRegistry.registerBlock(TitaniumOre, "TitaniumOre");
        GameRegistry.registerBlock(MithrilOre, "MithrilOre");
        GameRegistry.registerBlock(TantalumOre, "TantalumOre");
        GameRegistry.registerBlock(TungstenOre, "TungstenOre");
        GameRegistry.registerBlock(OrichalcumOre, "OrichalcumOre");
        GameRegistry.registerBlock(AdamantiumOre, "AdamantiumOre");
        GameRegistry.registerBlock(SkyIronOre, "SkyIronOre");
        GameRegistry.registerBlock(SinniumOre, "SinniumOre");
		GameRegistry.registerBlock(AmberOre, "AmberOre");
		GameRegistry.registerBlock(OpalOre, "OpalOre");
		GameRegistry.registerBlock(StarRubyOre, "StarRubyOre");
		GameRegistry.registerBlock(StarSapphireOre, "StarSapphireOre");
		GameRegistry.registerBlock(AmethystOre, "AmethystOre");
		GameRegistry.registerBlock(MalachiteOre, "MalachiteOre");
		GameRegistry.registerBlock(OnyxOre, "OnyxOre");
		GameRegistry.registerBlock(TopazOre, "TopazOre");
		GameRegistry.registerBlock(SunstoneOre, "SunstoneOre");
		GameRegistry.registerBlock(MoonstoneOre, "MoonstoneOre");
		GameRegistry.registerBlock(BloodstoneOre, "BloodstoneOre");
		
		//Storage Block
        
        //Large Brick
        
        //Small Brick
        
        //Stairs
        
        //Door
        
        //Fence
        
        //Fence Gate
        
        //Ingot/Gems
		
		//Helmet
        
        //Chestplate
        
        //Leggings
        
        //Boots
        
        //Pickaxe
        
        //Shovel
        
        //Hatchet
        
        //Hoe
        
        //Sword
		
	}
	
	private static void languageRegisters(){
	    //Ores
	    LanguageRegistry.instance().addStringLocalization("itemGroup.Geology_GeologyTab", "Geology");
		LanguageRegistry.addName(TinOre, "Tin Ore");
		LanguageRegistry.addName(CopperOre, "Copper Ore");
		LanguageRegistry.addName(SilverOre, "Silver Ore");
		LanguageRegistry.addName(CobaltOre, "Cobalt Ore");
		LanguageRegistry.addName(TitaniumOre, "Titanium Ore");
		LanguageRegistry.addName(MithrilOre, "Mithril Ore");
		LanguageRegistry.addName(TantalumOre, "Tantalum Ore");
		LanguageRegistry.addName(TungstenOre, "Tungsten Ore");
		LanguageRegistry.addName(OrichalcumOre, "Orichalcum Ore");
		LanguageRegistry.addName(AdamantiumOre, "Adamantium Ore");
		LanguageRegistry.addName(SkyIronOre, "Sky Iron Ore");
		LanguageRegistry.addName(SinniumOre, "Sinnium Ore");
		LanguageRegistry.addName(AmberOre, "Amber Ore");
		LanguageRegistry.addName(OpalOre, "Opal Ore");
		LanguageRegistry.addName(StarRubyOre, "Star Ruby Ore");
		LanguageRegistry.addName(StarSapphireOre, "Star Sapphire Ore");
		LanguageRegistry.addName(AmethystOre, "Amethyst Ore");
		LanguageRegistry.addName(MalachiteOre, "Malachite Ore");
		LanguageRegistry.addName(OnyxOre, "Onyx Ore");
		LanguageRegistry.addName(TopazOre, "Topaz Ore");
		LanguageRegistry.addName(SunstoneOre, "Sunstone Ore");
		LanguageRegistry.addName(MoonstoneOre, "Moonstone Ore");
		LanguageRegistry.addName(BloodstoneOre, "Bloodstone Ore");
		
		//Storage Block
        
        //Large Brick
        
        //Small Brick
        
        //Stairs
        
        //Door
        
        //Fence
        
        //Fence Gate
        
        //Ingot/Gems
        
        //Helmet
        
        //Chestplate
        
        //Leggings
        
        //Boots
        
        //Pickaxe
        
        //Shovel
        
        //Hatchet
        
        //Hoe
        
        //Sword
	}

}
