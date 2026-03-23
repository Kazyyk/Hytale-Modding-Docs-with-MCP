# DensityPointEvaluator

Type: class | Package: com.hypixel.hytale.procedurallib.logic.cell.evaluator | Implements: PointEvaluator

public class DensityPointEvaluator implements PointEvaluator

## Fields

- protected final PointEvaluator pointEvaluator
- protected final IIntCondition density

## Methods

- @Override public CellJitter getJitter()
- @Override public void evalPoint( int seed, double x, double y, int cellHash, int cellX, int cellY, double cellPointX, double cellPointY, ResultBuffer.ResultBuffer2d buffer )
- @Override public void evalPoint2( int seed, double x, double y, int cellHash, int cellX, int cellY, double cellPointX, double cellPointY, ResultBuffer.ResultBuffer2d buffer )
- @Override public void evalPoint( int seed, double x, double y, double z, int cellHash, int cellX, int cellY, int cellZ, double cellPointX, double cellPointY, double cellPointZ, ResultBuffer.ResultBuffer3d buffer )
- @Override public void evalPoint2( int seed, double x, double y, double z, int cellHash, int cellX, int cellY, int cellZ, double cellPointX, double cellPointY, double cellPointZ, ResultBuffer.ResultBuffer3d buffer )
- @Override public <T> void collectPoint(int cellHash, int cellX, int cellY, double x, double y, T t, @Nonnull PointConsumer<T> consumer)
- @Override @Nonnull public String toString()
- @Nonnull public static IIntCondition getDensityCondition(@Nullable IDoubleCondition threshold)
- public static double randomDensityCondition(int seed)

Also in this package: BorderPointEvaluator, BranchEvaluator, Direction, DistancePointEvaluator, JitterPointEvaluator, Mode, NormalPointEvaluator, PointEvaluator, SkipCellPointEvaluator

Complete API:
  public CellJitter getJitter()
  public void evalPoint(int seed, double x, double y, int cellHash, int cellX, int cellY, double cellPointX, double cellPointY, ResultBuffer.ResultBuffer2d buffer)
  public void evalPoint2(int seed, double x, double y, int cellHash, int cellX, int cellY, double cellPointX, double cellPointY, ResultBuffer.ResultBuffer2d buffer)
  public void evalPoint(int seed, double x, double y, double z, int cellHash, int cellX, int cellY, int cellZ, double cellPointX, double cellPointY, double cellPointZ, ResultBuffer.ResultBuffer3d buffer)
  public void evalPoint2(int seed, double x, double y, double z, int cellHash, int cellX, int cellY, int cellZ, double cellPointX, double cellPointY, double cellPointZ, ResultBuffer.ResultBuffer3d buffer)
  public void collectPoint(int cellHash, int cellX, int cellY, double x, double y, T t, PointConsumer<T> consumer)
  public String toString()
  public static IIntCondition getDensityCondition(IDoubleCondition threshold)
  public static double randomDensityCondition(int seed)

Fields:
protected final PointEvaluator pointEvaluator
protected final IIntCondition density
