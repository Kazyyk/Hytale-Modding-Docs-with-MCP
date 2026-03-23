# ModifyEvents.BiomeStaticLayers

Type: record | Package: com.hypixel.hytale.builtin.worldgen.modifier.event

public record BiomeStaticLayers(

ModifyEvent record for biome static layer entries.

## Record Components


@Nonnull BiomeFileContext file,
        @Nonnull List<LayerContainer.StaticLayer> entries,
        @Nonnull ModifyEvent.ContentLoader<LayerContainer.StaticLayer> loader
