# ModifyEvents.CaveTypes

Type: record | Package: com.hypixel.hytale.builtin.worldgen.modifier.event

public record CaveTypes(@Nonnull CaveFileContext file, @Nonnull List<CaveType> entries, @Nonnull ModifyEvent.ContentLoader<CaveType> loader)

ModifyEvent record for cave type entries.

## Record Components


@Nonnull CaveFileContext file, @Nonnull List<CaveType> entries, @Nonnull ModifyEvent.ContentLoader<CaveType> loader

Also in this package: BiomeCovers, BiomeDynamicLayers, BiomeEnvironments, BiomeFluids, BiomePrefabs, BiomeStaticLayers, BiomeTints, CaveCovers, CavePrefabs, ContentLoader, EventType, ModifyEvent, ModifyEvents, SeedGenerator

Complete API:
  public EventType type()
