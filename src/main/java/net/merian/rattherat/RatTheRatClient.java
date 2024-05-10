package net.merian.rattherat;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.merian.rattherat.entity.ModEntities;
import net.merian.rattherat.entity.client.ModModelLayers;
import net.merian.rattherat.entity.client.RatModel;
import net.merian.rattherat.entity.client.RatRenderer;

public class RatTheRatClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.RAT, RatRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.RAT, RatModel::getTexturedModelData);
    }
}
