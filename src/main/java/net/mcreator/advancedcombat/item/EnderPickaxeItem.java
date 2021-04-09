
package net.mcreator.advancedcombat.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.advancedcombat.AdvancedCombatModElements;

@AdvancedCombatModElements.ModElement.Tag
public class EnderPickaxeItem extends AdvancedCombatModElements.ModElement {
	@ObjectHolder("advanced_combat:ender_pickaxe")
	public static final Item block = null;
	public EnderPickaxeItem(AdvancedCombatModElements instance) {
		super(instance, 126);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
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
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(EnderIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("ender_pickaxe"));
	}
}
