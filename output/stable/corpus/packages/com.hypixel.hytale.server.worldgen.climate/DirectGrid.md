# DirectGrid

Type: class | Package: com.hypixel.hytale.server.worldgen.climate | Extends: java.lang.Object

public class DirectGrid

Fixed-resolution 2D grid that directly stores climate type indices at each cell. Used as the backing storage for `ClimateGraph` lookup tables. Provides array-based O(1) access by quantized coordinates.

Also in this package: Buffer, ClimateColor, ClimateGraph, ClimateMaskProvider, ClimateNoise, ClimatePoint, ClimateSearch, ClimateType, Entry, FadeMode, Grid, Range, Result, Rule, Thresholds, Unique, UniqueClimateGenerator

Complete API:
  public void nearest2D(int seed, double x, double y, int cellX, int cellY, ResultBuffer.ResultBuffer2d buffer, PointEvaluator pointEvaluator)
  public void nearest3D(int seed, double x, double y, double z, int cellX, int cellY, int cellZ, ResultBuffer.ResultBuffer3d buffer, PointEvaluator pointEvaluator)
  public void transition2D(int seed, double x, double y, int cellX, int cellY, ResultBuffer.ResultBuffer2d buffer, PointEvaluator pointEvaluator)
  public void transition3D(int seed, double x, double y, double z, int cellX, int cellY, int cellZ, ResultBuffer.ResultBuffer3d buffer, PointEvaluator pointEvaluator)
  public void evalPoint(int seed, double x, double y, int cellX, int cellY, ResultBuffer.ResultBuffer2d buffer, PointEvaluator pointEvaluator)
  public void evalPoint(int seed, double x, double y, double z, int cellX, int cellY, int cellZ, ResultBuffer.ResultBuffer3d buffer, PointEvaluator pointEvaluator)
  public void evalPoint2(int seed, double x, double y, int cellX, int cellY, ResultBuffer.ResultBuffer2d buffer, PointEvaluator pointEvaluator)
  public void evalPoint2(int seed, double x, double y, double z, int cellX, int cellY, int cellZ, ResultBuffer.ResultBuffer3d buffer, PointEvaluator pointEvaluator)
  public void collect(int originalSeed, int seed, int minX, int minY, int maxX, int maxY, ResultBuffer.Bounds2d bounds, T ctx, PointConsumer<T> collector, PointEvaluator pointEvaluator)

Fields:
public static final DirectGrid INSTANCE
