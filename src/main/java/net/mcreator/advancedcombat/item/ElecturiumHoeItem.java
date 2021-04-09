
package net.mcreator.advancedcombat.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.advancedcombat.AdvancedCombatModElements;

@AdvancedCombatModElements.ModElement.Tag
public class ElecturiumHoeItem extends AdvancedCombatModElements.ModElement {
	@ObjectHolder("advanced_combat:electurium_hoe")
	public static final Item block = null;
	public ElecturiumHoeItem(AdvancedCombatModElements instance) {
		super(instance, 149);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 216;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 13;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ElecturiumIngotItem.block, (int) (1)));
			}
		}, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("electurium_hoe"));
	}
}
