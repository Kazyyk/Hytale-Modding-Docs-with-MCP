# ClimateColorJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.climate | Extends: SeedResource> extends JsonLoader

public class ClimateColorJsonLoader<K extends SeedResource> extends JsonLoader<K, ClimateColor>

JSON loader that deserializes configuration data from JSON files.

## Methods

- super(seed, dataFolder, json)
- @Nonnull public ClimateColor load()
- protected int loadColor(@Nonnull String key, int defaultColor)

Also in this package: ClimateGraphJsonLoader, ClimateGridJsonLoader, ClimateMaskJsonLoader, ClimateNoiseJsonLoader, ClimatePointJsonLoader, ClimateRuleJsonLoader, ClimateTypeJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, ContinentThresholdsJsonLoader, UniqueClimateGeneratorJsonLoader, UniqueClimateJsonLoader

Complete API:
  public ClimateColor load()
  protected int loadColor(String key, int defaultColor)

Fields:
private final ClimateColor parent
