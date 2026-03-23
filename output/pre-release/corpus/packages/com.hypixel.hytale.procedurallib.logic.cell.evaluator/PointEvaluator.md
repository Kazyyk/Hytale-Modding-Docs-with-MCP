# PointEvaluator

Type: interface | Package: com.hypixel.hytale.procedurallib.logic.cell.evaluator

public interface PointEvaluator

## Methods

- CellJitter getJitter()
- void evalPoint(int var1, double var2, double var4, int var6, int var7, int var8, double var9, double var11, ResultBuffer.ResultBuffer2d var13)
- void evalPoint2(int var1, double var2, double var4, int var6, int var7, int var8, double var9, double var11, ResultBuffer.ResultBuffer2d var13)
- void evalPoint( int var1, double var2, double var4, double var6, int var8, int var9, int var10, int var11, double var12, double var14, double var16, ResultBuffer.ResultBuffer3d var18 )
- void evalPoint2( int var1, double var2, double var4, double var6, int var8, int var9, int var10, int var11, double var12, double var14, double var16, ResultBuffer.ResultBuffer3d var18 )

Known implementors: BorderPointEvaluator, BranchEvaluator, DensityPointEvaluator, DistancePointEvaluator, JitterPointEvaluator, NormalPointEvaluator, SkipCellPointEvaluator

Also in this package: BorderPointEvaluator, BranchEvaluator, DensityPointEvaluator, Direction, DistancePointEvaluator, JitterPointEvaluator, Mode, NormalPointEvaluator, SkipCellPointEvaluator

Complete API:
  default CellJitter getJitter()
  void evalPoint(int var1, double var2, double var4, int var6, int var7, int var8, double var9, double var11, ResultBuffer.ResultBuffer2d var13)
  void evalPoint2(int var1, double var2, double var4, int var6, int var7, int var8, double var9, double var11, ResultBuffer.ResultBuffer2d var13)
  void evalPoint(int var1, double var2, double var4, double var6, int var8, int var9, int var10, int var11, double var12, double var14, double var16, ResultBuffer.ResultBuffer3d var18)
  void evalPoint2(int var1, double var2, double var4, double var6, int var8, int var9, int var10, int var11, double var12, double var14, double var16, ResultBuffer.ResultBuffer3d var18)
  default void collectPoint(int cellHash, int cellX, int cellY, double cellCentreX, double cellCentreY, T ctx, PointConsumer<T> consumer)
  static PointEvaluator of(PointDistanceFunction distanceFunction, IDoubleCondition density, IDoubleRange distanceMod, CellJitter jitter)
  static PointEvaluator of(PointDistanceFunction distanceFunction, IDoubleCondition density, IDoubleRange distanceMod, int skipCount, SkipCellPointEvaluator.Mode skipMode, CellJitter jitter)
