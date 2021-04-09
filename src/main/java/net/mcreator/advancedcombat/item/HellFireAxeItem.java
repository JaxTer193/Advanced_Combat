
package net.mcreator.advancedcombat.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.advancedcombat.AdvancedCombatModElements;

@AdvancedCombatModElements.ModElement.Tag
public class HellFireAxeItem extends AdvancedCombatModElements.ModElement {
	@ObjectHolder("advanced_combat:hell_fire_axe")
	public static final Item block = null;
	public HellFireAxeItem(AdvancedCombatModElements instance) {
		super(instance, 167);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 3436;
			}

			public float getEfficiency() {
				return 18f;
			}

			public float getAttackDamage() {
				return 57f;
			}

			public int getHarvestLevel() {
				return 13;
			}

			public int getEnchantability() {
				return 91;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(HellFireItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("hell_fire_axe"));
	}
}
