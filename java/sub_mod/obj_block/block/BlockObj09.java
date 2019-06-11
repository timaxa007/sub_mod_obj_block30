package sub_mod.obj_block.block;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import sub_mod.obj_block.ModBlockObj;
import sub_mod.obj_block.tile_entity.TileEntityObj09;

public class BlockObj09 extends Block implements ITileEntityProvider {

	public BlockObj09() {
		super(Material.circuits);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(0.25F);
		setStepSound(soundTypeMetal);
		setBlockTextureName("iron_block");
		setBlockName(ModBlockObj.MODID + ".block_obj09");
	}

	@Override
	public TileEntity createNewTileEntity(World world, int metadata) {
		return new TileEntityObj09();
	}

	public int getRenderType() {
		return -1;
	}

	public boolean isOpaqueCube() {
		return false;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}

}
