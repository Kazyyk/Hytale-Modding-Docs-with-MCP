# UniqueClimateJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.climate | Extends: SeedResource> extends JsonLoader

public class UniqueClimateJsonLoader<K extends SeedResource> extends JsonLoader<K, UniqueClimateGenerator.Entry>

JSON loader that deserializes configuration data from JSON files.

## Methods

- super(seed, dataFolder, json)
- @Nonnull public UniqueClimateGenerator.Entry load()
- protected String loadName()
- protected String loadParent()
- protected int loadColor()
- protected int loadRadius()
- @Nonnull protected Vector2i loadOrigin()
- return new Vector2i(x, y)
- protected int loadDistance()
- protected int loadMinDistance()
- protected ClimateSearch.Rule loadRule()
