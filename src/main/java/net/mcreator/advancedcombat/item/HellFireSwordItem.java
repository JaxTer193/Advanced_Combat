
package net.mcreator.advancedcombat.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.advancedcombat.AdvancedCombatModElements;

@AdvancedCombatModElements.ModElement.Tag
public class HellFireSwordItem extends AdvancedCombatModElements.ModElement {
	@ObjectHolder("advanced_combat:hell_fire_sword")
	public static final Item block = null;
	public HellFireSwordItem(AdvancedCombatModElements instance) {
		super(instance, 104);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 3436;
			}

			public float getEfficiency() {
				return 18f;
			}

			public float getAttackDamage() {
				return 37f;
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
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("hell_fire_sword"));
	}
}
