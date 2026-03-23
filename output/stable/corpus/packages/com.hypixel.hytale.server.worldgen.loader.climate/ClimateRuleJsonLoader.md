# ClimateRuleJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.climate | Extends: SeedResource> extends JsonLoader

public class ClimateRuleJsonLoader<K extends SeedResource> extends JsonLoader<K, ClimateSearch.Rule>

JSON loader that deserializes configuration data from JSON files.

## Methods

- super(seed, dataFolder, json)
- @Nullable public ClimateSearch.Rule load()
- protected ClimateSearch.Range loadRange(String key)
- protected static double loadTarget(@Nonnull JsonObject json)
- protected static double loadRadius(@Nonnull JsonObject json)
- protected static double loadWeight(@Nonnull JsonObject json)
