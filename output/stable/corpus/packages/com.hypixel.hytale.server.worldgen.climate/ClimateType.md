# ClimateType

Type: class | Package: com.hypixel.hytale.server.worldgen.climate | Extends: java.lang.Object

public class ClimateType

Defines a distinct climate/biome type with its temperature-humidity position, map colors, parent-child relationships, and associated generation parameters. Each climate type occupies a region in the 2D climate graph. Supports hierarchical nesting (e.g., a desert climate type may have sub-types for dunes vs. oasis).

Also in this package: Buffer, ClimateColor, ClimateGraph, ClimateMaskProvider, ClimateNoise, ClimatePoint, ClimateSearch, DirectGrid, Entry, FadeMode, Grid, Range, Result, Rule, Thresholds, Unique, UniqueClimateGenerator

Complete API:
  public String toString()
  public static String name(ClimateType parent, ClimateType type)
  public static void walk(ClimateType type, Consumer<ClimateType> visitor)
  public static void walk(ClimateType[] types, Consumer<ClimateType> visitor)
  public static int color(int id, ClimateGraph climate)
  private static void walkRecursive(ClimateType type, Consumer<ClimateType> visitor, int depth)

Fields:
public static final ClimateType[] EMPTY_ARRAY
private static final int MAX_DEPTH
public static final int IS_ISLAND
public static final int IS_SHORE
public static final int IS_OCEAN
public static final int IS_MAINLAND
public static final int IS_MAINLAND_SHORE
public static final int IS_MAINLAND_SHALLOW_OCEAN
public static final int IS_ISLAND_SHORE
public static final int IS_ISLAND_SHALLOW_OCEAN
public static final int MASK
public final String name
public final ClimateColor color
public final ClimateColor island
public final ClimatePoint[] points
public final ClimateType[] children
