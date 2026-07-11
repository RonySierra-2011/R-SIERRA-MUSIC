
package com.tumod.customdiscs;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

	public static final DeferredRegister<Item> ITEMS =
			DeferredRegister.create(ForgeRegistries.ITEMS, CustomDiscsMod.MOD_ID);

	// El "comparatorOutput" es el valor de señal de comparador que emite el disco
	// dentro de un jukebox (los discos vanilla van de 1 a 15). Usamos 13 y 14.
	// El "lengthInTicks" son los segundos de la canción multiplicados por 20.

	// lengthInSeconds: duración real de la canción EN SEGUNDOS (no en ticks).
	public static final RegistryObject<Item> LUZ_EN_LA_TORMENTA_DISC = ITEMS.register("luz_en_la_tormenta_disc",
			() -> new RecordItem(13, () -> ModSounds.LUZ_EN_LA_TORMENTA.get(),
					new Item.Properties().stacksTo(1).rarity(Rarity.RARE),
					182));

	public static final RegistryObject<Item> ME_DAS_VIDA_DISC = ITEMS.register("me_das_vida_disc",
			() -> new RecordItem(14, () -> ModSounds.ME_DAS_VIDA.get(),
					new Item.Properties().stacksTo(1).rarity(Rarity.RARE),
					237));
}
