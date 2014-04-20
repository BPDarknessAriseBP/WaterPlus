package com.darknessarise.waterplus;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="waterPlus", name="Water Plus", version="0.0.1")
public class WaterPlus {
	
	 public static Block airBlock;
	 
	 @Instance(value = "waterPlus")
     public static WaterPlus instance;
	 
	 @SidedProxy(clientSide="com.darknessarise.waterplus.ClientProxy", serverSide="com.darknessarise.waterplus.CommonProxy")
     public static CommonProxy proxy;
	
	 @EventHandler
	 public void preInit(FMLPreInitializationEvent event) {
		  airBlock = new AirBlock(Material.leaves).setHardness(0.5f).setBlockName("airBlock").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName("waterPlus:airBlock");
		GameRegistry.registerBlock(airBlock, "Air Block");
	 }
	 @EventHandler
	 public void load(FMLInitializationEvent event) {
         proxy.registerRenderers();
         LanguageRegistry.addName(airBlock, "Air Block");
	 }
	 @EventHandler
	 public void postInit(FMLPostInitializationEvent event) {
		 
 }
	 
}
