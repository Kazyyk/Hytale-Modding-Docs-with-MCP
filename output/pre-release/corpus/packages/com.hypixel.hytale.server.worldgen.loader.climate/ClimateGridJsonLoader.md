# ClimateGridJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.climate | Extends: SeedResource> extends JsonLoader

public class ClimateGridJsonLoader<K extends SeedResource> extends JsonLoader<K, ClimateNoise.Grid>

JSON loader that deserializes configuration data from JSON files.

## Methods

- super(seed, dataFolder, json)
- @Nonnull public ClimateNoise.Grid load()
- protected int loadSeed()
- protected double loadScale()
- protected PointEvaluator loadEvaluator()
- return new JitterPointEvaluator(pointEvaluator, biomeJitter)

Also in this package: ClimateColorJsonLoader, ClimateGraphJsonLoader, ClimateMaskJsonLoader, ClimateNoiseJsonLoader, ClimatePointJsonLoader, ClimateRuleJsonLoader, ClimateTypeJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, ContinentThresholdsJsonLoader, UniqueClimateGeneratorJsonLoader, UniqueClimateJsonLoader

Complete API:
  public ClimateNoise.Grid load()
  protected int loadSeed()
  protected double loadScale()
  protected PointEvaluator loadEvaluator()
