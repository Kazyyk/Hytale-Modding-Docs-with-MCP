# HexCellDistanceFunction

Type: class | Package: com.hypixel.hytale.procedurallib.logic.cell | Implements: CellDistanceFunction

public class HexCellDistanceFunction implements CellDistanceFunction

## Constants

- public static final HexCellDistanceFunction DISTANCE_FUNCTION
- protected static final double X_TO_GRID_X
- protected static final double Y_TO_GRID_X
- protected static final double Y_TO_GRID_Y
- protected static final double X_TO_HEX_X
- protected static final double Y_TO_HEX_X
- protected static final double Y_TO_HEX_Y
- protected static final double NORMALIZATION
- protected static final double SCALE
- protected static final int HASH0
- protected static final int BIT_NOISE1
- protected static final int BIT_NOISE2
- protected static final int BIT_NOISE3

## Fields

- protected static final double Y_TO_GRID_X
- protected static final double Y_TO_GRID_Y
- protected static final double Y_TO_HEX_Y
- protected static final double NORMALIZATION
- protected static final int HASH0
- protected static final int BIT_NOISE1
- protected static final int BIT_NOISE2
- protected static final int BIT_NOISE3

## Methods

- public double scale(double value)
- public double normalize(double value)
- public int getHash(int seed, int cellX, int cellY)
- public double getX(double x, double y)
- public double getY(double x, double y)
- public DoubleArray.Double2 getOffsets(int hash)
- public double scale(double value)
- public double invScale(double value)
- public int getCellX(double x, double y)
- public int getCellY(double x, double y)
- public void nearest2D( int seed, double x, double y, int cellX, int cellY, @Nonnull ResultBuffer.ResultBuffer2d buffer, @Nonnull PointEvaluator pointEvaluator )
- public void nearest3D( int seed, double x, double y, double z, int cellX, int cellY, int cellZ, ResultBuffer.ResultBuffer3d buffer, PointEvaluator pointEvaluator )
- public void transition2D( int seed, double x, double y, int cellX, int cellY, @Nonnull ResultBuffer.ResultBuffer2d buffer, @Nonnull PointEvaluator pointEvaluator )
- public void transition3D( int seed, double x, double y, double z, int cellX, int cellY, int cellZ, ResultBuffer.ResultBuffer3d buffer, PointEvaluator pointEvaluator )
- public void evalPoint(int seed, double x, double y, int cellX, int cellY, ResultBuffer.ResultBuffer2d buffer, @Nonnull PointEvaluator pointEvaluator)
- public void evalPoint( int seed, double x, double y, double z, int cellX, int cellY, int cellZ, ResultBuffer.ResultBuffer3d buffer, PointEvaluator pointEvaluator )
- public void evalPoint2(int seed, double x, double y, int cellX, int cellY, ResultBuffer.ResultBuffer2d buffer, @Nonnull PointEvaluator pointEvaluator)
- public void evalPoint2( int seed, double x, double y, double z, int cellX, int cellY, int cellZ, ResultBuffer.ResultBuffer3d buffer, PointEvaluator pointEvaluator )
- public <T> void collect( int originalSeed, int seed, int minX, int minY, int maxX, int maxY, @Nonnull ResultBuffer.Bounds2d bounds, T ctx, @Nonnull PointConsumer<T> collector, @Nonnull PointEvaluator pointEvaluator )
- public String toString()
- public static int getHash(int seed, int x, int y)
- public static int toGridX(double x, double y)
- public static int toGridY(double x, double y)
- public static double toHexX(double hx, double hy)
- public static double toHexY(double hx, double hy)
- public static int hash(int seed, int x, int y)
