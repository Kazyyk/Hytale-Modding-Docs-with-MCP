# UniqueClimateGeneratorJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.climate | Extends: SeedResource> extends JsonLoader

public class UniqueClimateGeneratorJsonLoader<K extends SeedResource> extends JsonLoader<K, UniqueClimateGenerator>

JSON loader that deserializes configuration data from JSON files.

## Methods

- super(seed, dataFolder, json)
- @Nonnull public UniqueClimateGenerator load()
- protected UniqueClimateGenerator.Entry[] loadEntries()

Also in this package: ClimateColorJsonLoader, ClimateGraphJsonLoader, ClimateGridJsonLoader, ClimateMaskJsonLoader, ClimateNoiseJsonLoader, ClimatePointJsonLoader, ClimateRuleJsonLoader, ClimateTypeJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, ContinentThresholdsJsonLoader, UniqueClimateJsonLoader

Complete API:
  public UniqueClimateGenerator load()
  protected UniqueClimateGenerator.Entry[] loadEntries()

Fields:
private final JsonArray array
