# ModifyEvents.CaveCovers

Type: record | Package: com.hypixel.hytale.builtin.worldgen.modifier.event

public record CaveCovers(

ModifyEvent record for cave cover entries.

## Record Components


@Nonnull CaveFileContext file,
        @Nonnull List<CaveNodeType.CaveNodeCoverEntry> entries,
        @Nonnull ModifyEvent.ContentLoader<CaveNodeType.CaveNodeCoverEntry> loader

Also in this package: BiomeCovers, BiomeDynamicLayers, BiomeEnvironments, BiomeFluids, BiomePrefabs, BiomeStaticLayers, BiomeTints, CavePrefabs, CaveTypes, ContentLoader, EventType, ModifyEvent, ModifyEvents, SeedGenerator

Complete API:
  public EventType type()
