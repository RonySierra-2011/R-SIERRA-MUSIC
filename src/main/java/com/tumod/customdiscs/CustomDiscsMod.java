package com.tumod.customdiscs;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(CustomDiscsMod.MOD_ID)
public class CustomDiscsMod {

	public static final String MOD_ID = "customdiscs";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public CustomDiscsMod() {
		LOGGER.info("Cargando Discos Personalizados...");

		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		ModSounds.SOUND_EVENTS.register(modEventBus);
		ModItems.ITEMS.register(modEventBus);

		modEventBus.addListener(this::addCreative);
	}

	// Añade ambos discos a la pestaña de creativo "Herramientas y utilidades"
	private void addCreative(BuildCreativeModeTabContentsEvent event) {
		if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			event.accept(ModItems.LUZ_EN_LA_TORMENTA_DISC);
			event.accept(ModItems.ME_DAS_VIDA_DISC);
		}
	}
}
