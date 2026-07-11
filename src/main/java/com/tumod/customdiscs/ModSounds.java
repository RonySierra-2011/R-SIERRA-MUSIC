package com.tumod.customdiscs;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {

	public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
			DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CustomDiscsMod.MOD_ID);

	public static final RegistryObject<SoundEvent> LUZ_EN_LA_TORMENTA = registerSoundEvent("luz_en_la_tormenta");
	public static final RegistryObject<SoundEvent> ME_DAS_VIDA = registerSoundEvent("me_das_vida");

	private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
		ResourceLocation id = new ResourceLocation(CustomDiscsMod.MOD_ID, name);
		return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
	}
}
