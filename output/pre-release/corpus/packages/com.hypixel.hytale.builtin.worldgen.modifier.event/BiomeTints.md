# ModifyEvents.BiomeTints

Type: record | Package: com.hypixel.hytale.builtin.worldgen.modifier.event

public record BiomeTints(

ModifyEvent record for biome tint entries.

## Record Components


@Nonnull BiomeFileContext file,
        @Nonnull List<TintContainer.TintContainerEntry> entries,
        @Nonnull ModifyEvent.ContentLoader<TintContainer.TintContainerEntry> loader

Also in this package: BiomeCovers, BiomeDynamicLayers, BiomeEnvironments, BiomeFluids, BiomePrefabs, BiomeStaticLayers, CaveCovers, CavePrefabs, CaveTypes, ContentLoader, EventType, ModifyEvent, ModifyEvents, SeedGenerator

Complete API:
  public EventType type()
