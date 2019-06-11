package sub_mod.obj_block.client;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import sub_mod.obj_block.ModBlockObj;
import sub_mod.obj_block.ProxyCommon;
import sub_mod.obj_block.client.render.item.*;
import sub_mod.obj_block.client.render.tile.*;
import sub_mod.obj_block.tile_entity.*;

public class ProxyClient extends ProxyCommon {

	public static int[] displayList = new int[5];//for 5 model

	public void preInit() {
		super.preInit();
	}

	public void init() {
		super.init();

		final IModelCustom[] models = new IModelCustom[]{
				AdvancedModelLoader.loadModel(new ResourceLocation(ModBlockObj.MODID, "obj/m01.obj")),
				AdvancedModelLoader.loadModel(new ResourceLocation(ModBlockObj.MODID, "obj/m02.obj")),
				AdvancedModelLoader.loadModel(new ResourceLocation(ModBlockObj.MODID, "obj/m03.obj")),
				AdvancedModelLoader.loadModel(new ResourceLocation(ModBlockObj.MODID, "obj/m04.obj")),
				AdvancedModelLoader.loadModel(new ResourceLocation(ModBlockObj.MODID, "obj/m05.obj"))
				/*
				AdvancedModelLoader.loadModel(new ResourceLocation(ModBlockObj.MODID, "obj/m06.obj")),
				AdvancedModelLoader.loadModel(new ResourceLocation(ModBlockObj.MODID, "obj/m07.obj")),
				AdvancedModelLoader.loadModel(new ResourceLocation(ModBlockObj.MODID, "obj/m08.obj")),
				AdvancedModelLoader.loadModel(new ResourceLocation(ModBlockObj.MODID, "obj/m09.obj")),
				AdvancedModelLoader.loadModel(new ResourceLocation(ModBlockObj.MODID, "obj/m10.obj")),

				AdvancedModelLoader.loadModel(new ResourceLocation(ModBlockObj.MODID, "obj/m11.obj")),
				AdvancedModelLoader.loadModel(new ResourceLocation(ModBlockObj.MODID, "obj/m12.obj")),
				AdvancedModelLoader.loadModel(new ResourceLocation(ModBlockObj.MODID, "obj/m13.obj")),
				AdvancedModelLoader.loadModel(new ResourceLocation(ModBlockObj.MODID, "obj/m14.obj")),
				AdvancedModelLoader.loadModel(new ResourceLocation(ModBlockObj.MODID, "obj/m15.obj")),
				AdvancedModelLoader.loadModel(new ResourceLocation(ModBlockObj.MODID, "obj/m16.obj")),
				AdvancedModelLoader.loadModel(new ResourceLocation(ModBlockObj.MODID, "obj/m17.obj")),
				AdvancedModelLoader.loadModel(new ResourceLocation(ModBlockObj.MODID, "obj/m18.obj")),
				AdvancedModelLoader.loadModel(new ResourceLocation(ModBlockObj.MODID, "obj/m19.obj")),
				AdvancedModelLoader.loadModel(new ResourceLocation(ModBlockObj.MODID, "obj/m20.obj")),

				AdvancedModelLoader.loadModel(new ResourceLocation(ModBlockObj.MODID, "obj/m21.obj")),
				AdvancedModelLoader.loadModel(new ResourceLocation(ModBlockObj.MODID, "obj/m22.obj")),
				AdvancedModelLoader.loadModel(new ResourceLocation(ModBlockObj.MODID, "obj/m23.obj")),
				AdvancedModelLoader.loadModel(new ResourceLocation(ModBlockObj.MODID, "obj/m24.obj")),
				AdvancedModelLoader.loadModel(new ResourceLocation(ModBlockObj.MODID, "obj/m25.obj")),
				AdvancedModelLoader.loadModel(new ResourceLocation(ModBlockObj.MODID, "obj/m26.obj")),
				AdvancedModelLoader.loadModel(new ResourceLocation(ModBlockObj.MODID, "obj/m27.obj")),
				AdvancedModelLoader.loadModel(new ResourceLocation(ModBlockObj.MODID, "obj/m28.obj")),
				AdvancedModelLoader.loadModel(new ResourceLocation(ModBlockObj.MODID, "obj/m29.obj")),
				AdvancedModelLoader.loadModel(new ResourceLocation(ModBlockObj.MODID, "obj/m30.obj"))
				 */
		};

		for (int i = 0; i < displayList.length; ++i) {
			displayList[i] = GLAllocation.generateDisplayLists(1);
			GL11.glNewList(displayList[i], GL11.GL_COMPILE);
			models[i].renderAll();
			GL11.glEndList();
		}
		//------------------------------------------------------------------------------------
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityObj01.class, new RenderTileEntityObj01());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockObj.block_obj01), new RenderItemBlockObj01());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityObj02.class, new RenderTileEntityObj02());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockObj.block_obj02), new RenderItemBlockObj02());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityObj03.class, new RenderTileEntityObj03());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockObj.block_obj03), new RenderItemBlockObj03());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityObj04.class, new RenderTileEntityObj04());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockObj.block_obj04), new RenderItemBlockObj04());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityObj05.class, new RenderTileEntityObj05());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockObj.block_obj05), new RenderItemBlockObj05());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityObj06.class, new RenderTileEntityObj06());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockObj.block_obj06), new RenderItemBlockObj06());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityObj07.class, new RenderTileEntityObj07());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockObj.block_obj07), new RenderItemBlockObj07());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityObj08.class, new RenderTileEntityObj08());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockObj.block_obj08), new RenderItemBlockObj08());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityObj09.class, new RenderTileEntityObj09());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockObj.block_obj09), new RenderItemBlockObj09());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityObj10.class, new RenderTileEntityObj10());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockObj.block_obj10), new RenderItemBlockObj10());
		//------------------------------------------------------------------------------------
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityObj11.class, new RenderTileEntityObj11());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockObj.block_obj11), new RenderItemBlockObj11());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityObj12.class, new RenderTileEntityObj12());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockObj.block_obj12), new RenderItemBlockObj12());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityObj13.class, new RenderTileEntityObj13());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockObj.block_obj13), new RenderItemBlockObj13());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityObj14.class, new RenderTileEntityObj14());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockObj.block_obj14), new RenderItemBlockObj14());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityObj15.class, new RenderTileEntityObj15());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockObj.block_obj15), new RenderItemBlockObj15());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityObj16.class, new RenderTileEntityObj16());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockObj.block_obj16), new RenderItemBlockObj16());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityObj17.class, new RenderTileEntityObj17());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockObj.block_obj17), new RenderItemBlockObj17());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityObj18.class, new RenderTileEntityObj18());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockObj.block_obj18), new RenderItemBlockObj18());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityObj19.class, new RenderTileEntityObj19());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockObj.block_obj19), new RenderItemBlockObj19());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityObj20.class, new RenderTileEntityObj20());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockObj.block_obj20), new RenderItemBlockObj20());
		//------------------------------------------------------------------------------------
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityObj21.class, new RenderTileEntityObj21());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockObj.block_obj21), new RenderItemBlockObj21());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityObj22.class, new RenderTileEntityObj22());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockObj.block_obj22), new RenderItemBlockObj22());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityObj23.class, new RenderTileEntityObj23());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockObj.block_obj23), new RenderItemBlockObj23());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityObj24.class, new RenderTileEntityObj24());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockObj.block_obj24), new RenderItemBlockObj24());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityObj25.class, new RenderTileEntityObj25());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockObj.block_obj25), new RenderItemBlockObj25());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityObj26.class, new RenderTileEntityObj26());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockObj.block_obj26), new RenderItemBlockObj26());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityObj27.class, new RenderTileEntityObj27());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockObj.block_obj27), new RenderItemBlockObj27());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityObj28.class, new RenderTileEntityObj28());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockObj.block_obj28), new RenderItemBlockObj28());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityObj29.class, new RenderTileEntityObj29());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockObj.block_obj29), new RenderItemBlockObj29());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityObj30.class, new RenderTileEntityObj30());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlockObj.block_obj30), new RenderItemBlockObj30());
		//------------------------------------------------------------------------------------
	}

}
