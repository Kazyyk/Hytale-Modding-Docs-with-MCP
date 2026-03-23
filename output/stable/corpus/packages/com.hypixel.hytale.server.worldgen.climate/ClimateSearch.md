# ClimateSearch

Type: class | Package: com.hypixel.hytale.server.worldgen.climate | Extends: java.lang.Object

public class ClimateSearch

Performs spatial searches within the climate system to find the nearest climate type matching given criteria. Used for locating biome boundaries and placing biome-specific features at appropriate distances.

Also in this package: Buffer, ClimateColor, ClimateGraph, ClimateMaskProvider, ClimateNoise, ClimatePoint, ClimateType, DirectGrid, Entry, FadeMode, Grid, Range, Result, Rule, Thresholds, Unique, UniqueClimateGenerator

Complete API:
  public static CompletableFuture<ClimateSearch.Result> search(int seed, int cx, int cy, int startRadius, int searchRadius, ClimateSearch.Rule rule, ClimateNoise noise, ClimateGraph graph)
  private static double collect(int seed, int x, int y, ClimateNoise noise, ClimateGraph graph, ClimateSearch.Rule rule)

Fields:
public static final int STEP_SIZE
public static final int DEFAULT_RADIUS
public static final int MAX_RADIUS
public static final double PI2
public static final long SEED_OFFSET
public static final double TARGET_SCORE
