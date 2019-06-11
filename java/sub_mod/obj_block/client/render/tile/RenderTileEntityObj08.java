package sub_mod.obj_block.client.render.tile;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import sub_mod.obj_block.ModBlockObj;
import sub_mod.obj_block.client.ProxyClient;
import sub_mod.obj_block.tile_entity.TileEntityObj08;

public class RenderTileEntityObj08 extends TileEntitySpecialRenderer {

	public static final ResourceLocation texture = new ResourceLocation(ModBlockObj.MODID, "textures/blocks/model_obj.png");

	@Override
	public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float f) {
		render((TileEntityObj08)tile, x, y, z, f);
	}

	private void render(TileEntityObj08 tile, double x, double y, double z, float f) {
		GL11.glPushMatrix();
		GL11.glTranslated(x, y, z);
		GL11.glTranslatef(0.5F, 0.0F, 0.5F);
		bindTexture(texture);
		GL11.glCallList(ProxyClient.displayList[2]);
		GL11.glPopMatrix();
	}

}
