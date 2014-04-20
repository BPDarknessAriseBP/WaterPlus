package com.darknessarise.waterplus;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class AirBlock extends Block{

	public AirBlock( Material material) {
		super(material);
	}
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int i)
    {
            return null;
    }
	
	
	
	
}
