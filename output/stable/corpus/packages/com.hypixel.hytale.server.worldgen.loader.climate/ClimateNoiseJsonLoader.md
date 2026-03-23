# ClimateNoiseJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.climate | Extends: SeedResource> extends JsonLoader

public class ClimateNoiseJsonLoader<K extends SeedResource> extends JsonLoader<K, ClimateNoise>

JSON loader that deserializes configuration data from JSON files.

## Methods

- super(seed, dataFolder, json)
- @Nonnull public ClimateNoise load()
- @Nonnull protected ClimateNoise.Grid loadGrid()
- @Nonnull protected NoiseProperty loadContinentNoise()
- @Nonnull protected NoiseProperty loadTemperatureNoise()
- @Nonnull protected NoiseProperty loadIntensityNoise()
- @Nonnull protected ClimateNoise.Thresholds loadThresholds()
