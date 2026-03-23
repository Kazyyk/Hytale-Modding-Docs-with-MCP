# ClimateGraphJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.climate | Extends: SeedResource> extends JsonLoader

public class ClimateGraphJsonLoader<K extends SeedResource> extends JsonLoader<K, ClimateGraph>

JSON loader that deserializes configuration data from JSON files.

## Methods

- super(seed, dataFolder, json)
- @Nonnull public ClimateGraph load()
- return new ClimateGraph(512, climates, fadeMode, fadeRadius, fadeDistance)
- protected ClimateGraph.FadeMode loadFadeMode()
- protected double loadFadeRadius()
- protected double loadFadeDistance()
- @Nonnull protected ClimateType[] loadClimates()
