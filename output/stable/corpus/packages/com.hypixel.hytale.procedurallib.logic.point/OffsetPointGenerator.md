# OffsetPointGenerator

Type: class | Package: com.hypixel.hytale.procedurallib.logic.point | Implements: IPointGenerator

public class OffsetPointGenerator implements IPointGenerator

## Fields

- private final IPointGenerator generator
- private final double offsetX
- private final double offsetY
- private final double offsetZ

## Constructors

- public OffsetPointGenerator(IPointGenerator generator, double offsetX, double offsetY, double offsetZ)

## Methods

- public double getOffsetX()
- public double getOffsetY()
- public double getOffsetZ()
- @Override public ResultBuffer.ResultBuffer2d nearest2D(int seed, double x, double y)
- @Override public ResultBuffer.ResultBuffer3d nearest3D(int seed, double x, double y, double z)
- @Override public ResultBuffer.ResultBuffer2d transition2D(int seed, double x, double y)
- @Override public ResultBuffer.ResultBuffer3d transition3D(int seed, double x, double y, double z)
- @Override public void collect(int seed, double minX, double minY, double maxX, double maxY, @Nonnull IPointGenerator.PointConsumer2d consumer)
- @Override public double getInterval()
