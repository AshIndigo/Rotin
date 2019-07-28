package com.ashindigo.rotin;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block.Settings;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RotinMod implements ModInitializer {
    private static final RotinBlock rotin = new RotinBlock(FabricBlockSettings.of(Material.AIR).noCollision().lightLevel(20).breakInstantly().build());

    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier("rotin", "rotin"), rotin);
        Registry.register(Registry.ITEM, new Identifier("rotin", "rotin"), new BlockItem(rotin, new Item.Settings().group(ItemGroup.DECORATIONS)));
    }
}
