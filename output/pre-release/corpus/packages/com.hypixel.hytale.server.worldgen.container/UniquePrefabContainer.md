# UniquePrefabContainer

Type: class | Package: com.hypixel.hytale.server.worldgen.container

public class UniquePrefabContainer

Container for unique (one-per-world) prefab placement. Generates positioned prefab entries with rotation, spawn offset, exclusion radius, and map marker visibility from a seed and chunk generator.

Also in this package: CoverContainer, CoverContainerEntry, CoverContainerEntryPart, DefaultEnvironmentContainerEntry, DefaultTintContainerEntry, DynamicLayer, DynamicLayerEntry, Entry, EnvironmentContainer, EnvironmentContainerEntry, FadeContainer, Layer, LayerContainer, LayerEntry, PrefabContainer, PrefabContainerEntry, StaticLayer, StaticLayerEntry, TintContainer, TintContainerEntry (and 2 more)

Complete API:
  public UniquePrefabGenerator[] getGenerators()
  public UniquePrefabContainer.UniquePrefabEntry[] generate(int seed, Vector2i position, ChunkGenerator chunkGenerator)
  public String toString()

Fields:
protected final int seedOffset
protected final UniquePrefabGenerator[] generators
