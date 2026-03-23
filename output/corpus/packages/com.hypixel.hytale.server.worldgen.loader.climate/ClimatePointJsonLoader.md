# ClimatePointJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.climate | Extends: SeedResource> extends JsonLoader

public class ClimatePointJsonLoader<K extends SeedResource> extends JsonLoader<K, ClimatePoint>

JSON loader that deserializes configuration data from JSON files.

## Methods

- super(seed, dataFolder, json)
- @Nonnull public ClimatePoint load()
- protected double loadTemperature()
- protected double loadIntensity()
- protected double loadModifier()
