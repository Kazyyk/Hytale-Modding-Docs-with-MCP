# DistancePointEvaluator

Type: class | Package: com.hypixel.hytale.procedurallib.logic.cell.evaluator | Implements: PointEvaluator

public class DistancePointEvaluator implements PointEvaluator

## Fields

- protected final PointDistanceFunction distanceFunction
- protected final ISeedDoubleRange distanceMod

## Methods

- @Override public void evalPoint( int seed, double x, double y, int cellHash, int cellX, int cellY, double cellPointX, double cellPointY, @Nonnull ResultBuffer.ResultBuffer2d buffer )
- @Override public void evalPoint2( int seed, double x, double y, int cellHash, int cellX, int cellY, double cellPointX, double cellPointY, @Nonnull ResultBuffer.ResultBuffer2d buffer )
- @Override public void evalPoint( int seed, double x, double y, double z, int cellHash, int cellX, int cellY, int cellZ, double cellPointX, double cellPointY, double cellPointZ, @Nonnull ResultBuffer.ResultBuffer3d buffer )
- @Override public void evalPoint2( int seed, double x, double y, double z, int cellHash, int cellX, int cellY, int cellZ, double cellPointX, double cellPointY, double cellPointZ, @Nonnull ResultBuffer.ResultBuffer3d buffer )
- @Override @Nonnull public String toString()
- @Nonnull public static ISeedDoubleRange getDistanceModifier(@Nullable IDoubleRange range)
- public static double randomDistanceModification(int seed)

Also in this package: BorderPointEvaluator, BranchEvaluator, DensityPointEvaluator, Direction, JitterPointEvaluator, Mode, NormalPointEvaluator, PointEvaluator, SkipCellPointEvaluator

Complete API:
  public void evalPoint(int seed, double x, double y, int cellHash, int cellX, int cellY, double cellPointX, double cellPointY, ResultBuffer.ResultBuffer2d buffer)
  public void evalPoint2(int seed, double x, double y, int cellHash, int cellX, int cellY, double cellPointX, double cellPointY, ResultBuffer.ResultBuffer2d buffer)
  public void evalPoint(int seed, double x, double y, double z, int cellHash, int cellX, int cellY, int cellZ, double cellPointX, double cellPointY, double cellPointZ, ResultBuffer.ResultBuffer3d buffer)
  public void evalPoint2(int seed, double x, double y, double z, int cellHash, int cellX, int cellY, int cellZ, double cellPointX, double cellPointY, double cellPointZ, ResultBuffer.ResultBuffer3d buffer)
  public String toString()
  public static ISeedDoubleRange getDistanceModifier(IDoubleRange range)
  public static double randomDistanceModification(int seed)

Fields:
protected final PointDistanceFunction distanceFunction
protected final ISeedDoubleRange distanceMod
