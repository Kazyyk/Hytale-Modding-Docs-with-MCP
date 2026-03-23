# CellDistanceFunction

Type: interface | Package: com.hypixel.hytale.procedurallib.logic.cell

public interface CellDistanceFunction

Known implementors: BorderDistanceFunction, DirectGrid, GridCellDistanceFunction, HexCellDistanceFunction

Also in this package: BorderDistanceFunction, CellPointFunction, CellType, DistanceCalculationMode, GridCellDistanceFunction, HexCellDistanceFunction, MeasurementMode, PointDistanceFunction, SquirrelHash

Complete API:
  default double scale(double value)
  default double invScale(double value)
  default int getCellX(double x, double y)
  default int getCellY(double x, double y)
  default int getCellX(double x, double y, double z)
  default int getCellY(double x, double y, double z)
  default int getCellZ(double x, double y, double z)
  void nearest2D(int var1, double var2, double var4, int var6, int var7, ResultBuffer.ResultBuffer2d var8, PointEvaluator var9)
  void nearest3D(int var1, double var2, double var4, double var6, int var8, int var9, int var10, ResultBuffer.ResultBuffer3d var11, PointEvaluator var12)
  void transition2D(int var1, double var2, double var4, int var6, int var7, ResultBuffer.ResultBuffer2d var8, PointEvaluator var9)
  void transition3D(int var1, double var2, double var4, double var6, int var8, int var9, int var10, ResultBuffer.ResultBuffer3d var11, PointEvaluator var12)
  void evalPoint(int var1, double var2, double var4, int var6, int var7, ResultBuffer.ResultBuffer2d var8, PointEvaluator var9)
  void evalPoint(int var1, double var2, double var4, double var6, int var8, int var9, int var10, ResultBuffer.ResultBuffer3d var11, PointEvaluator var12)
  void evalPoint2(int var1, double var2, double var4, int var6, int var7, ResultBuffer.ResultBuffer2d var8, PointEvaluator var9)
  void evalPoint2(int var1, double var2, double var4, double var6, int var8, int var9, int var10, ResultBuffer.ResultBuffer3d var11, PointEvaluator var12)
  void collect(int var1, int var2, int var3, int var4, int var5, int var6, ResultBuffer.Bounds2d var7, T var8, PointConsumer<T> var9, PointEvaluator var10)
