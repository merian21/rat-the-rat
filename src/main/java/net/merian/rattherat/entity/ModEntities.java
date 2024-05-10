package net.merian.rattherat.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.merian.rattherat.RatTheRat;
import net.merian.rattherat.entity.custom.RatEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final EntityType<RatEntity> RAT = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(RatTheRat.MOD_ID, "rat"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, RatEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 0.5f)).build());
}
