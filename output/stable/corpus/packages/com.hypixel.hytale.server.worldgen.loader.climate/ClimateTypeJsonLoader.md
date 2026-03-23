# ClimateTypeJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.climate | Extends: SeedResource> extends JsonLoader

public class ClimateTypeJsonLoader<K extends SeedResource> extends JsonLoader<K, ClimateType>

JSON loader that deserializes configuration data from JSON files.

## Methods

- super(seed, dataFolder, json)
- public ClimateType load()
- return new ClimateType(name, color, island, points, children)
- @Nonnull protected String loadName()
- @Nonnull protected ClimateColor loadIslandColor(@Nonnull ClimateColor color)
- @Nonnull protected ClimatePoint[] loadClimatePoints()
- @Nonnull protected ClimateType[] loadChildren(ClimateType parent)
- @Nonnull protected ClimatePoint loadPoint(int index, JsonElement pointsJson)
