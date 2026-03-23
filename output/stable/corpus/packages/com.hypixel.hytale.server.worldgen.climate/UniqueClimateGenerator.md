# UniqueClimateGenerator

Type: class | Package: com.hypixel.hytale.server.worldgen.climate | Extends: java.lang.Object

public class UniqueClimateGenerator

Generates unique climate assignments for world regions by combining multiple noise layers with the climate graph. Ensures that each generated world area has a deterministic but varied climate distribution. Used during initial world generation to assign base climate types to chunks.

Also in this package: Buffer, ClimateColor, ClimateGraph, ClimateMaskProvider, ClimateNoise, ClimatePoint, ClimateSearch, ClimateType, DirectGrid, Entry, FadeMode, Grid, Range, Result, Rule, Thresholds, Unique

Complete API:
  public UniqueClimateGenerator.Entry[] entries()
  public UniqueClimateGenerator.Unique[] zones()
  public int generate(int x, int y)
  public Zone.UniqueCandidate[] getCandidates(Map<String,Zone> zoneLookup)
  public UniqueClimateGenerator apply(int seed, Zone.UniqueCandidate[] candidates, ClimateNoise noise, ClimateGraph graph, List<Zone.Unique> collector)
  public UniqueClimateGenerator apply(int seed, ClimateNoise noise, ClimateGraph graph)
  protected static CompletableFuture<Vector2i> findZonePosition(int seed, Vector2i origin, UniqueClimateGenerator.Entry entry, UniqueClimateGenerator.Unique parent, ClimateNoise noise, ClimateGraph graph)

Fields:
public static final UniqueClimateGenerator EMPTY
private static final int[] EMPTY_PARENTS
private static final int MAX_PARENT_DEPTH
private static final Vector2i DEFAULT_ORIGIN
private static final Vector2i[] EMPTY_POSITIONS
protected final UniqueClimateGenerator.Entry[] entries
protected final UniqueClimateGenerator.Unique[] zones
