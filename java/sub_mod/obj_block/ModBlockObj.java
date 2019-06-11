package sub_mod.obj_block;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import sub_mod.obj_block.block.*;
import sub_mod.obj_block.tile_entity.*;

@Mod (modid = ModBlockObj.MODID, name = ModBlockObj.MODNAME, version = ModBlockObj.VERSION)

public class ModBlockObj {

	public static final String MODID = "sub_mod_obj_block";
	public static final String MODNAME = "SM_OB";
	public static final String VERSION = "0.30a";

	@Instance(ModBlockObj.MODID) public static ModBlockObj instance;
	@SidedProxy(modId = ModBlockObj.MODID, clientSide = "sub_mod.obj_block.client.ProxyClient", serverSide = "sub_mod.obj_block.ProxyCommon")
	public static ProxyCommon proxy;

	public static Block
	block_obj01,
	block_obj02,
	block_obj03,
	block_obj04,
	block_obj05,
	block_obj06,
	block_obj07,
	block_obj08,
	block_obj09,
	block_obj10,

	block_obj11,
	block_obj12,
	block_obj13,
	block_obj14,
	block_obj15,
	block_obj16,
	block_obj17,
	block_obj18,
	block_obj19,
	block_obj20,

	block_obj21,
	block_obj22,
	block_obj23,
	block_obj24,
	block_obj25,
	block_obj26,
	block_obj27,
	block_obj28,
	block_obj29,
	block_obj30;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//----------------------------------------------------
		block_obj01 = new BlockObj01();
		GameRegistry.registerBlock(block_obj01, "block_obj01");
		block_obj02 = new BlockObj02();
		GameRegistry.registerBlock(block_obj02, "block_obj02");
		block_obj03 = new BlockObj03();
		GameRegistry.registerBlock(block_obj03, "block_obj03");
		block_obj04 = new BlockObj04();
		GameRegistry.registerBlock(block_obj04, "block_obj04");
		block_obj05 = new BlockObj05();
		GameRegistry.registerBlock(block_obj05, "block_obj05");
		block_obj06 = new BlockObj06();
		GameRegistry.registerBlock(block_obj06, "block_obj06");
		block_obj07 = new BlockObj07();
		GameRegistry.registerBlock(block_obj07, "block_obj07");
		block_obj08 = new BlockObj08();
		GameRegistry.registerBlock(block_obj08, "block_obj08");
		block_obj09 = new BlockObj09();
		GameRegistry.registerBlock(block_obj09, "block_obj09");
		block_obj10 = new BlockObj10();
		GameRegistry.registerBlock(block_obj10, "block_obj10");

		block_obj11 = new BlockObj11();
		GameRegistry.registerBlock(block_obj11, "block_obj11");
		block_obj12 = new BlockObj12();
		GameRegistry.registerBlock(block_obj12, "block_obj12");
		block_obj13 = new BlockObj13();
		GameRegistry.registerBlock(block_obj13, "block_obj13");
		block_obj14 = new BlockObj14();
		GameRegistry.registerBlock(block_obj14, "block_obj14");
		block_obj15 = new BlockObj15();
		GameRegistry.registerBlock(block_obj15, "block_obj15");
		block_obj16 = new BlockObj16();
		GameRegistry.registerBlock(block_obj16, "block_obj16");
		block_obj17 = new BlockObj17();
		GameRegistry.registerBlock(block_obj17, "block_obj17");
		block_obj18 = new BlockObj18();
		GameRegistry.registerBlock(block_obj18, "block_obj18");
		block_obj19 = new BlockObj19();
		GameRegistry.registerBlock(block_obj19, "block_obj19");
		block_obj20 = new BlockObj20();
		GameRegistry.registerBlock(block_obj20, "block_obj20");

		block_obj21 = new BlockObj21();
		GameRegistry.registerBlock(block_obj21, "block_obj21");
		block_obj22 = new BlockObj22();
		GameRegistry.registerBlock(block_obj22, "block_obj22");
		block_obj23 = new BlockObj23();
		GameRegistry.registerBlock(block_obj23, "block_obj23");
		block_obj24 = new BlockObj24();
		GameRegistry.registerBlock(block_obj24, "block_obj24");
		block_obj25 = new BlockObj25();
		GameRegistry.registerBlock(block_obj25, "block_obj25");
		block_obj26 = new BlockObj26();
		GameRegistry.registerBlock(block_obj26, "block_obj26");
		block_obj27 = new BlockObj27();
		GameRegistry.registerBlock(block_obj27, "block_obj27");
		block_obj28 = new BlockObj28();
		GameRegistry.registerBlock(block_obj28, "block_obj28");
		block_obj29 = new BlockObj29();
		GameRegistry.registerBlock(block_obj29, "block_obj29");
		block_obj30 = new BlockObj30();
		GameRegistry.registerBlock(block_obj30, "block_obj30");
		//----------------------------------------------------
		GameRegistry.registerTileEntity(TileEntityObj01.class, "TileEntityObj01");
		GameRegistry.registerTileEntity(TileEntityObj02.class, "TileEntityObj02");
		GameRegistry.registerTileEntity(TileEntityObj03.class, "TileEntityObj03");
		GameRegistry.registerTileEntity(TileEntityObj04.class, "TileEntityObj04");
		GameRegistry.registerTileEntity(TileEntityObj05.class, "TileEntityObj05");
		GameRegistry.registerTileEntity(TileEntityObj06.class, "TileEntityObj06");
		GameRegistry.registerTileEntity(TileEntityObj07.class, "TileEntityObj07");
		GameRegistry.registerTileEntity(TileEntityObj08.class, "TileEntityObj08");
		GameRegistry.registerTileEntity(TileEntityObj09.class, "TileEntityObj09");
		GameRegistry.registerTileEntity(TileEntityObj10.class, "TileEntityObj10");

		GameRegistry.registerTileEntity(TileEntityObj11.class, "TileEntityObj11");
		GameRegistry.registerTileEntity(TileEntityObj12.class, "TileEntityObj12");
		GameRegistry.registerTileEntity(TileEntityObj13.class, "TileEntityObj13");
		GameRegistry.registerTileEntity(TileEntityObj14.class, "TileEntityObj14");
		GameRegistry.registerTileEntity(TileEntityObj15.class, "TileEntityObj15");
		GameRegistry.registerTileEntity(TileEntityObj16.class, "TileEntityObj16");
		GameRegistry.registerTileEntity(TileEntityObj17.class, "TileEntityObj17");
		GameRegistry.registerTileEntity(TileEntityObj18.class, "TileEntityObj18");
		GameRegistry.registerTileEntity(TileEntityObj19.class, "TileEntityObj19");
		GameRegistry.registerTileEntity(TileEntityObj20.class, "TileEntityObj20");

		GameRegistry.registerTileEntity(TileEntityObj21.class, "TileEntityObj21");
		GameRegistry.registerTileEntity(TileEntityObj22.class, "TileEntityObj22");
		GameRegistry.registerTileEntity(TileEntityObj23.class, "TileEntityObj23");
		GameRegistry.registerTileEntity(TileEntityObj24.class, "TileEntityObj24");
		GameRegistry.registerTileEntity(TileEntityObj25.class, "TileEntityObj25");
		GameRegistry.registerTileEntity(TileEntityObj26.class, "TileEntityObj26");
		GameRegistry.registerTileEntity(TileEntityObj27.class, "TileEntityObj27");
		GameRegistry.registerTileEntity(TileEntityObj28.class, "TileEntityObj28");
		GameRegistry.registerTileEntity(TileEntityObj29.class, "TileEntityObj29");
		GameRegistry.registerTileEntity(TileEntityObj30.class, "TileEntityObj30");
		//----------------------------------------------------
		proxy.preInit();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
	}

}