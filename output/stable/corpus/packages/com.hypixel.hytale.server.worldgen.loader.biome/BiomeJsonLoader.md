# BiomeJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.biome | Extends: JsonLoader<SeedStringResource, Biome>

public abstract class BiomeJsonLoader extends JsonLoader<SeedStringResource, Biome>

Abstract base class for loading biome definitions from JSON. Provides protected methods for loading each biome sub-container: terrain height threshold, covers, fade, layers, prefabs, tint, environment, water, heightmap noise, map color, and interpolation. Each method delegates to the corresponding container-specific JSON loader.

Also defines a `Constants` inner interface with all JSON key names and error message strings used by biome loaders.

## Methods

- @Nonnull protected IHeightThresholdInterpreter loadTerrainHeightThreshold()
- @Nonnull protected CoverContainer loadCoverContainer()
- @Nonnull protected FadeContainer loadFadeContainer()
- @Nonnull protected LayerContainer loadLayerContainers()
- @Nullable protected PrefabContainer loadPrefabContainer()
- @Nonnull protected TintContainer loadTintContainer()
- @Nonnull protected EnvironmentContainer loadEnvironmentContainer()
- @Nonnull protected WaterContainer loadWaterContainer()
- @Nullable protected NoiseProperty loadHeightmapNoise()
- protected int loadColor()
- @Nullable protected BiomeInterpolation loadInterpolation()
