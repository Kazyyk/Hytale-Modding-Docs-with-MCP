# ModifyEvents.BiomeDynamicLayers

Type: record | Package: com.hypixel.hytale.builtin.worldgen.modifier.event

public record BiomeDynamicLayers(

ModifyEvent record for biome dynamic layer entries.

## Record Components


@Nonnull BiomeFileContext file,
        @Nonnull List<LayerContainer.DynamicLayer> entries,
        @Nonnull ModifyEvent.ContentLoader<LayerContainer.DynamicLayer> loader

Also in this package: BiomeCovers, BiomeEnvironments, BiomeFluids, BiomePrefabs, BiomeStaticLayers, BiomeTints, CaveCovers, CavePrefabs, CaveTypes, ContentLoader, EventType, ModifyEvent, ModifyEvents, SeedGenerator

Complete API:
  public EventType type()
