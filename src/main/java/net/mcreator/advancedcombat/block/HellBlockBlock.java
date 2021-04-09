
package net.mcreator.advancedcombat.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.advancedcombat.itemgroup.AdvancedCombatItemGroup;
import net.mcreator.advancedcombat.AdvancedCombatModElements;

import java.util.List;
import java.util.Collections;

@AdvancedCombatModElements.ModElement.Tag
public class HellBlockBlock extends AdvancedCombatModElements.ModElement {
	@ObjectHolder("advanced_combat:hell_block")
	public static final Block block = null;
	public HellBlockBlock(AdvancedCombatModElements instance) {
		super(instance, 527);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(AdvancedCombatItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(5f, 10f).lightValue(0).harvestLevel(7)
					.harvestTool(ToolType.PICKAXE));
			setRegistryName("hell_block");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
