# ModifyEvent.ContentLoader

Type: interface | Package: com.hypixel.hytale.builtin.worldgen.modifier.event

public interface ContentLoader<T>

Functional interface for loading content from a JSON element.

## Methods


@Nonnull
    EventType type()


@Nonnull
    List<T> entries()

Also in this package: BiomeCovers, BiomeDynamicLayers, BiomeEnvironments, BiomeFluids, BiomePrefabs, BiomeStaticLayers, BiomeTints, CaveCovers, CavePrefabs, CaveTypes, EventType, ModifyEvent, ModifyEvents, SeedGenerator

Complete API:
  T load(JsonElement var1)
