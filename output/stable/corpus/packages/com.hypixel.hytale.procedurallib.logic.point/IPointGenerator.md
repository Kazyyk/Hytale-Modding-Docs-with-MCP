# IPointGenerator

Type: interface | Package: com.hypixel.hytale.procedurallib.logic.point

public interface IPointGenerator

## Methods

- ResultBuffer.ResultBuffer2d nearest2D(int var1, double var2, double var4)
- ResultBuffer.ResultBuffer3d nearest3D(int var1, double var2, double var4, double var6)
- ResultBuffer.ResultBuffer2d transition2D(int var1, double var2, double var4)
- ResultBuffer.ResultBuffer3d transition3D(int var1, double var2, double var4, double var6)
- void collect(int var1, double var2, double var4, double var6, double var8, IPointGenerator.PointConsumer2d var10)
- double getInterval()

## Inner Types

- `IPointGenerator.PointConsumer2d`

Known implementors: DistortedPointGenerator, OffsetPointGenerator, PointGenerator, ScaledPointGenerator

Also in this package: DistortedPointGenerator, OffsetPointGenerator, PointConsumer, PointConsumer2d, PointGenerator, ScaledPointGenerator

Complete API:
  ResultBuffer.ResultBuffer2d nearest2D(int var1, double var2, double var4)
  ResultBuffer.ResultBuffer3d nearest3D(int var1, double var2, double var4, double var6)
  ResultBuffer.ResultBuffer2d transition2D(int var1, double var2, double var4)
  ResultBuffer.ResultBuffer3d transition3D(int var1, double var2, double var4, double var6)
  void collect(int var1, double var2, double var4, double var6, double var8, IPointGenerator.PointConsumer2d var10)
  double getInterval()
