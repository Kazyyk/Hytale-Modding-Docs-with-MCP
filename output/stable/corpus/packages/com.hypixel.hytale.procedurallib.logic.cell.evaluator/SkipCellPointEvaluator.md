# SkipCellPointEvaluator

Type: class | Package: com.hypixel.hytale.procedurallib.logic.cell.evaluator | Implements: PointEvaluator

public class SkipCellPointEvaluator implements PointEvaluator

## Fields

- protected final PointEvaluator pointEvaluator
- protected final SkipCellPointEvaluator.Mode mode
- protected final int mask
- protected final int mid
- public static final int DEFAULT_NO_SKIP
- public static final SkipCellPointEvaluator.Mode DEFAULT_MODE

## Methods

- @Override public CellJitter getJitter()
- @Override public void evalPoint( int seed, double x, double y, int cellHash, int cellX, int cellY, double cellPointX, double cellPointY, ResultBuffer.ResultBuffer2d buffer )
- @Override public void evalPoint2( int seed, double x, double y, int cellHash, int cellX, int cellY, double cellPointX, double cellPointY, ResultBuffer.ResultBuffer2d buffer )
- @Override public void evalPoint( int seed, double x, double y, double z, int cellHash, int cellX, int cellY, int cellZ, double cellPointX, double cellPointY, double cellPointZ, ResultBuffer.ResultBuffer3d buffer )
- @Override public void evalPoint2( int seed, double x, double y, double z, int cellHash, int cellX, int cellY, int cellZ, double cellPointX, double cellPointY, double cellPointZ, ResultBuffer.ResultBuffer3d buffer )
- @Override public <T> void collectPoint(int cellHash, int cellX, int cellY, double cellCentreX, double cellCentreY, T ctx, @Nonnull PointConsumer<T> consumer)
- protected boolean skip(SkipCellPointEvaluator.Mode mode, int cx, int cy)

## Inner Types

- `SkipCellPointEvaluator.Mode`

Also in this package: BorderPointEvaluator, BranchEvaluator, DensityPointEvaluator, Direction, DistancePointEvaluator, JitterPointEvaluator, Mode, NormalPointEvaluator, PointEvaluator

Complete API:
  public CellJitter getJitter()
  public void evalPoint(int seed, double x, double y, int cellHash, int cellX, int cellY, double cellPointX, double cellPointY, ResultBuffer.ResultBuffer2d buffer)
  public void evalPoint2(int seed, double x, double y, int cellHash, int cellX, int cellY, double cellPointX, double cellPointY, ResultBuffer.ResultBuffer2d buffer)
  public void evalPoint(int seed, double x, double y, double z, int cellHash, int cellX, int cellY, int cellZ, double cellPointX, double cellPointY, double cellPointZ, ResultBuffer.ResultBuffer3d buffer)
  public void evalPoint2(int seed, double x, double y, double z, int cellHash, int cellX, int cellY, int cellZ, double cellPointX, double cellPointY, double cellPointZ, ResultBuffer.ResultBuffer3d buffer)
  public void collectPoint(int cellHash, int cellX, int cellY, double cellCentreX, double cellCentreY, T ctx, PointConsumer<T> consumer)
  protected boolean skip(SkipCellPointEvaluator.Mode mode, int cx, int cy)

Fields:
protected final PointEvaluator pointEvaluator
protected final SkipCellPointEvaluator.Mode mode
protected final int mask
protected final int mid
public static final int DEFAULT_NO_SKIP
public static final SkipCellPointEvaluator.Mode DEFAULT_MODE
