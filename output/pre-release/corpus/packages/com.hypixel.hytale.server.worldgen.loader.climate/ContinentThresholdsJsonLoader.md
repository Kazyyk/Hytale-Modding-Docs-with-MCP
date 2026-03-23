# ContinentThresholdsJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.climate | Extends: SeedResource> extends JsonLoader

public class ContinentThresholdsJsonLoader<K extends SeedResource> extends JsonLoader<K, ClimateNoise.Thresholds>

JSON loader that deserializes configuration data from JSON files.

## Methods

- super(seed, dataFolder, json)
- @Nonnull public ClimateNoise.Thresholds load()
- protected double loadLandThreshold()
- protected double loadIslandThreshold()
- protected double loadBeachSize()
- protected double loadShallowOceanSize()
