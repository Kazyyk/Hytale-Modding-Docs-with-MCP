# BorderPointEvaluator

Type: class | Package: com.hypixel.hytale.procedurallib.logic.cell.evaluator | Implements: PointEvaluator

public class BorderPointEvaluator implements PointEvaluator

## Fields

- public static final BorderPointEvaluator INSTANCE

## Methods

- @Override public void evalPoint( int seed, double x, double y, int cellHash, int cellX, int cellY, double cellPointX, double cellPointY, @Nonnull ResultBuffer.ResultBuffer2d buffer )
- @Override public void evalPoint2( int seed, double x, double y, int cellHash, int cellX, int cellY, double cellPointX, double cellPointY, @Nonnull ResultBuffer.ResultBuffer2d buffer )
- @Override public void evalPoint( int seed, double x, double y, double z, int cellHash, int cellX, int cellY, int cellZ, double cellPointX, double cellPointY, double cellPointZ, ResultBuffer.ResultBuffer3d buffer )
- @Override public void evalPoint2( int seed, double x, double y, double z, int cellHash, int cellX, int cellY, int cellZ, double cellPointX, double cellPointY, double cellPointZ, ResultBuffer.ResultBuffer3d buffer )
- @Override @Nonnull public String toString()
- protected static boolean isOrigin(int cellX, int cellY, @Nonnull ResultBuffer.ResultBuffer2d buffer)
- protected static double getBorderDistance(double x, double y, double originX, double originY, double cellPointX, double cellPointY)

Also in this package: BranchEvaluator, DensityPointEvaluator, Direction, DistancePointEvaluator, JitterPointEvaluator, Mode, NormalPointEvaluator, PointEvaluator, SkipCellPointEvaluator

Complete API:
  public void evalPoint(int seed, double x, double y, int cellHash, int cellX, int cellY, double cellPointX, double cellPointY, ResultBuffer.ResultBuffer2d buffer)
  public void evalPoint2(int seed, double x, double y, int cellHash, int cellX, int cellY, double cellPointX, double cellPointY, ResultBuffer.ResultBuffer2d buffer)
  public void evalPoint(int seed, double x, double y, double z, int cellHash, int cellX, int cellY, int cellZ, double cellPointX, double cellPointY, double cellPointZ, ResultBuffer.ResultBuffer3d buffer)
  public void evalPoint2(int seed, double x, double y, double z, int cellHash, int cellX, int cellY, int cellZ, double cellPointX, double cellPointY, double cellPointZ, ResultBuffer.ResultBuffer3d buffer)
  public String toString()
  protected static boolean isOrigin(int cellX, int cellY, ResultBuffer.ResultBuffer2d buffer)
  protected static double getBorderDistance(double x, double y, double originX, double originY, double cellPointX, double cellPointY)

Fields:
public static final BorderPointEvaluator INSTANCE
