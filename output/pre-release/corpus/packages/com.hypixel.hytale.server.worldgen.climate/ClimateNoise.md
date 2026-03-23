# ClimateNoise

Type: class | Package: com.hypixel.hytale.server.worldgen.climate | Extends: java.lang.Object

public class ClimateNoise

Configures and evaluates the noise functions that produce temperature and humidity values for the climate system. Wraps procedural noise generators with scale, offset, and normalization parameters. The noise output feeds into `ClimateGraph` lookups to determine climate type at each world position.

Also in this package: Buffer, ClimateColor, ClimateGraph, ClimateMaskProvider, ClimatePoint, ClimateSearch, ClimateType, DirectGrid, Entry, FadeMode, Grid, Range, Result, Rule, Thresholds, Unique, UniqueClimateGenerator

Complete API:
  public int generate(int seed, double x, double y, ClimateNoise.Buffer buffer, ClimateGraph climate)
  private static int getContinentFlags(double value, ClimateNoise.Thresholds thresholds)

Fields:
public final ClimateNoise.Grid grid
public final NoiseProperty continent
public final NoiseProperty temperature
public final NoiseProperty intensity
public final ClimateNoise.Thresholds thresholds
