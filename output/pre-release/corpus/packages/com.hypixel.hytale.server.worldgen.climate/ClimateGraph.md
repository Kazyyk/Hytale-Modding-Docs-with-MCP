# ClimateGraph

Type: class | Package: com.hypixel.hytale.server.worldgen.climate | Extends: java.lang.Object

public class ClimateGraph

Precomputed 2D lookup table that maps temperature-humidity coordinates to climate types. Operates on a fixed 512x512 resolution grid. Builds the lookup table using distance transforms and fade blending at climate boundaries. Supports parent-child climate hierarchies for smooth transitions between biome regions.

Also in this package: Buffer, ClimateColor, ClimateMaskProvider, ClimateNoise, ClimatePoint, ClimateSearch, ClimateType, DirectGrid, Entry, FadeMode, Grid, Range, Result, Rule, Thresholds, Unique, UniqueClimateGenerator

Complete API:
  public double fadeRadius()
  public double fadeDistance()
  public ClimateGraph.FadeMode fadeMode()
  public void refresh()
  public ClimateType[] getParents()
  public ClimateType[] getChildren()
  public IntMap getTable()
  public DoubleMap getFade()
  public int indexOf(double x, double y)
  public int getId(int index)
  public double getFade(int index)
  public double getFadeRaw(int index)
  public int getId(double x, double y)
  public double getFade(double x, double y)
  public double getFadeRaw(double x, double y)
  public ClimateType getType(double x, double y)
  public boolean validate(int id)
  public ClimateType getType(int id)
  private void populateTable(IntMap table, DoubleMap fade)
  private void populatePixel(int x, int y, IntMap table, boolean recursive)

Fields:
public static final int RESOLUTION
private static final double ONE_MINUS_EPS
private final double width
private final double height
private final double fadeRadius
private final double fadeDistance
private final ClimateGraph.FadeMode fadeMode
private final ClimateType[] parents
private final ClimateType[] children
private final ClimateType[] id2TypeLookup
private final IntMap table
private final DoubleMap fade
private final Object2IntMap<ClimateType> type2IdLookup
