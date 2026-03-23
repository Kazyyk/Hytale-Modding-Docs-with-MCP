# GridCellDistanceFunction

Type: class | Package: com.hypixel.hytale.procedurallib.logic.cell | Implements: CellDistanceFunction

public class GridCellDistanceFunction implements CellDistanceFunction

## Constants

- public static final GridCellDistanceFunction DISTANCE_FUNCTION

## Methods

- public int getHash(int seed, int cellX, int cellY)
- public DoubleArray.Double2 getOffsets(int hash)
- public double getX(double x, double y)
- public double getY(double x, double y)
- public void nearest2D(int seed, double x, double y, int cellX, int cellY, ResultBuffer.ResultBuffer2d buffer, @Nonnull PointEvaluator pointEvaluator)
- public void nearest3D( int seed, double x, double y, double z, int cellX, int cellY, int cellZ, ResultBuffer.ResultBuffer3d buffer, @Nonnull PointEvaluator pointEvaluator )
- public void transition2D(int seed, double x, double y, int cellX, int cellY, ResultBuffer.ResultBuffer2d buffer, @Nonnull PointEvaluator pointEvaluator)
- public void transition3D( int seed, double x, double y, double z, int cellX, int cellY, int cellZ, ResultBuffer.ResultBuffer3d buffer, @Nonnull PointEvaluator pointEvaluator )
- public void evalPoint(int seed, double x, double y, int cellX, int cellY, ResultBuffer.ResultBuffer2d buffer, @Nonnull PointEvaluator pointEvaluator)
- public void evalPoint( int seed, double x, double y, double z, int cellX, int cellY, int cellZ, ResultBuffer.ResultBuffer3d buffer, @Nonnull PointEvaluator pointEvaluator )
- public void evalPoint2(int seed, double x, double y, int cellX, int cellY, ResultBuffer.ResultBuffer2d buffer, @Nonnull PointEvaluator pointEvaluator)
- public void evalPoint2( int seed, double x, double y, double z, int cellX, int cellY, int cellZ, ResultBuffer.ResultBuffer3d buffer, @Nonnull PointEvaluator pointEvaluator )
- public <T> void collect( int originalSeed, int seed, int minX, int minY, int maxX, int maxY, ResultBuffer.Bounds2d bounds, T ctx, @Nonnull PointConsumer<T> collector, @Nonnull PointEvaluator pointEvaluator )
- public String toString()
- public static int getHash(int seed, int cellX, int cellY)

Also in this package: BorderDistanceFunction, CellDistanceFunction, CellPointFunction, CellType, DistanceCalculationMode, HexCellDistanceFunction, MeasurementMode, PointDistanceFunction, SquirrelHash

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
  public String toString()
  public static int getHash(int seed, int cellX, int cellY)

Fields:
public static final GridCellDistanceFunction DISTANCE_FUNCTION
public static final CellPointFunction POINT_FUNCTION
