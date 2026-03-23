# ClimateMaskProvider

Type: class | Package: com.hypixel.hytale.server.worldgen.climate | Extends: java.lang.Object

public class ClimateMaskProvider

Provides climate mask data for world generation. Generates per-chunk climate classification masks by sampling noise fields and looking up the climate graph. Used by the terrain generation pipeline to determine which biome decorations and features apply to each area.

Also in this package: Buffer, ClimateColor, ClimateGraph, ClimateNoise, ClimatePoint, ClimateSearch, ClimateType, DirectGrid, Entry, FadeMode, Grid, Range, Result, Rule, Thresholds, Unique, UniqueClimateGenerator

Complete API:
  public ClimateGraph getGraph()
  public boolean inBounds(double x, double y)
  public double getX(int seed, double x, double y)
  public double getY(int seed, double x, double y)
  public int get(int seed, double x, double y)
  public double distance(double x, double y)
  public MaskProvider generateUniqueZones(int seed, Zone.UniqueCandidate[] candidates, FastRandom random, List<Zone.Unique> collector)
  public Zone.UniqueCandidate[] generateUniqueZoneCandidates(Zone.UniqueEntry[] entries, int maxPositions)
  public Zone.UniqueCandidate[] getUniqueZoneCandidates(Map<String,Zone> zoneLookup)

Fields:
private static final FuzzyZoom EMPTY_ZOOM
private final ICoordinateRandomizer randomizer
private final ClimateNoise noise
private final ClimateGraph graph
private final UniqueClimateGenerator uniqueGenerator
