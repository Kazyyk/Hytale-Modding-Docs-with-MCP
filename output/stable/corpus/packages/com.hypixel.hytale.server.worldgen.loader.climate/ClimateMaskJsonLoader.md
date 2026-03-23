# ClimateMaskJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.climate | Extends: SeedResource> extends JsonLoader

public class ClimateMaskJsonLoader<K extends SeedResource> extends JsonLoader<K, ClimateMaskProvider>

JSON loader that deserializes configuration data from JSON files.

## Methods

- @Nullable public ClimateMaskProvider load()
- @Nonnull protected ICoordinateRandomizer loadRandomizer()
- @Nonnull protected ClimateNoise loadClimateNoise()
- @Nonnull protected ClimateGraph loadClimateGraph()
- @Nonnull protected UniqueClimateGenerator loadUniqueClimateGenerator()
- protected static JsonObject loadMaskFileJson(Path file)
- throw new Error("Failed to load Mask.json", var2)

Also in this package: ClimateColorJsonLoader, ClimateGraphJsonLoader, ClimateGridJsonLoader, ClimateNoiseJsonLoader, ClimatePointJsonLoader, ClimateRuleJsonLoader, ClimateTypeJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, ContinentThresholdsJsonLoader, UniqueClimateGeneratorJsonLoader, UniqueClimateJsonLoader

Complete API:
  public ClimateMaskProvider load()
  protected ICoordinateRandomizer loadRandomizer()
  protected ClimateNoise loadClimateNoise()
  protected ClimateGraph loadClimateGraph()
  protected UniqueClimateGenerator loadUniqueClimateGenerator()
  protected static JsonObject loadMaskFileJson(Path file)
