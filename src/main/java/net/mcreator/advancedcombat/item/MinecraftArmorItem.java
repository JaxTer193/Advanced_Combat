
package net.mcreator.advancedcombat.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.Entity;

import net.mcreator.advancedcombat.AdvancedCombatModElements;

@AdvancedCombatModElements.ModElement.Tag
public class MinecraftArmorItem extends AdvancedCombatModElements.ModElement {
	@ObjectHolder("advanced_combat:minecraft_armor_helmet")
	public static final Item helmet = null;
	@ObjectHolder("advanced_combat:minecraft_armor_chestplate")
	public static final Item body = null;
	@ObjectHolder("advanced_combat:minecraft_armor_leggings")
	public static final Item legs = null;
	@ObjectHolder("advanced_combat:minecraft_armor_boots")
	public static final Item boots = null;
	public MinecraftArmorItem(AdvancedCombatModElements instance) {
		super(instance, 478);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 150;
			}

			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{20, 60, 50, 20}[slot.getIndex()];
			}

			public int getEnchantability() {
				return 90;
			}

			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(MinecraftIngotItem.block, (int) (1)));
			}

			@OnlyIn(Dist.CLIENT)
			public String getName() {
				return "minecraft_armor";
			}

			public float getToughness() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "advanced_combat:textures/models/armor/minecraft_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("minecraft_armor_helmet"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "advanced_combat:textures/models/armor/minecraft_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("minecraft_armor_chestplate"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "advanced_combat:textures/models/armor/minecraft_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("minecraft_armor_leggings"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "advanced_combat:textures/models/armor/minecraft_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("minecraft_armor_boots"));
	}
}
