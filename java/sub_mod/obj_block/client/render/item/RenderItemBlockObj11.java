package sub_mod.obj_block.client.render.item;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import sub_mod.obj_block.client.ProxyClient;
import sub_mod.obj_block.client.render.tile.RenderTileEntityObj11;

public class RenderItemBlockObj11 implements IItemRenderer {

	@Override
	public boolean handleRenderType(ItemStack is, ItemRenderType type) {
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack is, ItemRendererHelper helper) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack is, Object... data) {
		GL11.glPushMatrix();
		GL11.glTranslatef(0.5F, 0.0F, 0.5F);
		Minecraft.getMinecraft().renderEngine.bindTexture(RenderTileEntityObj11.texture);
		GL11.glCallList(ProxyClient.displayList[0]);
		GL11.glPopMatrix();
	}

}
