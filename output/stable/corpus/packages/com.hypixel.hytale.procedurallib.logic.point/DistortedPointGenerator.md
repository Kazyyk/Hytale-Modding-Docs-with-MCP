# DistortedPointGenerator

Type: class | Package: com.hypixel.hytale.procedurallib.logic.point | Implements: IPointGenerator

public class DistortedPointGenerator implements IPointGenerator

## Fields

- protected final IPointGenerator pointGenerator
- protected final ICoordinateRandomizer coordinateRandomizer

## Constructors

- public DistortedPointGenerator(IPointGenerator pointGenerator, ICoordinateRandomizer coordinateRandomizer)

## Methods

- @Override public ResultBuffer.ResultBuffer2d nearest2D(int seed, double x, double y)
- @Override public ResultBuffer.ResultBuffer3d nearest3D(int seed, double x, double y, double z)
- @Override public ResultBuffer.ResultBuffer2d transition2D(int seed, double x, double y)
- @Override public ResultBuffer.ResultBuffer3d transition3D(int seed, double x, double y, double z)
- @Override public double getInterval()
- @Override public void collect(int seed, double minX, double minY, double maxX, double maxY, IPointGenerator.PointConsumer2d consumer)
- @Override public boolean equals(@Nullable Object o)
- @Override public int hashCode()
- @Nonnull @Override public String toString()
