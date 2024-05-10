package net.merian.rattherat.entity.client;

import net.merian.rattherat.RatTheRat;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {

    public static final EntityModelLayer RAT =
            new EntityModelLayer(new Identifier(RatTheRat.MOD_ID, "rat"), "main");

}
