package net.merian.rattherat;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.merian.rattherat.entity.ModEntities;
import net.merian.rattherat.entity.custom.RatEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RatTheRat implements ModInitializer {

	public static final String MOD_ID = "rat-the-rat";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		FabricDefaultAttributeRegistry.register(ModEntities.RAT, RatEntity.createRatAttributes());

		LOGGER.info("Hello Fabric world!");
	}
}