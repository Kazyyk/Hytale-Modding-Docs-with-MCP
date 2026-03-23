# BranchEvaluator

Type: class | Package: com.hypixel.hytale.procedurallib.logic.cell.evaluator | Implements: PointEvaluator

public class BranchEvaluator implements PointEvaluator

## Fields

- protected static final int CARDINAL_MASK
- protected static final int CARDINAL_MASK_RESULT_X
- protected static final int CARDINAL_MASK_RESULT_Y
- protected static final int RANDOM_DIRECTION_MASK
- protected static final Vector2i[] RANDOM_DIRECTIONS
- protected final CellPointFunction pointFunction
- protected final BranchEvaluator.Direction direction
- protected final CellJitter jitter
- protected final double branch2parentScale
- protected final double invLineNormalization

## Methods

- @Override public CellJitter getJitter()
- @Override public void evalPoint(int seed, double x, double y, int hashA, int cax, int cay, double ax, double ay, @Nonnull ResultBuffer.ResultBuffer2d buffer)
- @Override public void evalPoint2(int seed, double x, double y, int cellHash, int xi, int yi, double vecX, double vecY, ResultBuffer.ResultBuffer2d buffer)
- @Override public void evalPoint( int seed, double x, double y, double z, int cellHash, int cellX, int cellY, int cellZ, double cellPointX, double cellPointY, double cellPointZ, ResultBuffer.ResultBuffer3d buffer )
- @Override public void evalPoint2( int seed, double x, double y, double z, int cellHash, int cellX, int cellY, int cellZ, double cellPointX, double cellPointY, double cellPointZ, ResultBuffer.ResultBuffer3d buffer )
- protected static int getConnectionX(BranchEvaluator.Direction direction, int regionHash, double regionCoord, int cellHash, double cellCoord)
- protected static int getConnectionY(BranchEvaluator.Direction direction, int regionHash, double regionCoord, int cellHash, double cellCoord)
- protected static boolean checkBounds(double x, double y, double ax, double ay, double bx, double by, double thickness)

## Inner Types

- `BranchEvaluator.Direction`
