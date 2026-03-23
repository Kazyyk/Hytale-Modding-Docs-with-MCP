# RotatedCoordinateRandomizer

Type: class | Package: com.hypixel.hytale.procedurallib.random | Implements: ICoordinateRandomizer

public class RotatedCoordinateRandomizer implements ICoordinateRandomizer

Implements `ICoordinateRandomizer` to provide RotatedCoordinateRandomizer functionality.

## Fields

- protected final ICoordinateRandomizer randomizer
- protected final CoordinateRotator rotation

## Methods

- public RotatedCoordinateRandomizer(ICoordinateRandomizer randomizer, CoordinateRotator rotation)
- @Override public double randomDoubleX(int seed, double x, double y)
- @Override public double randomDoubleY(int seed, double x, double y)
- @Override public double randomDoubleX(int seed, double x, double y, double z)
- @Override public double randomDoubleY(int seed, double x, double y, double z)
- @Override public double randomDoubleZ(int seed, double x, double y, double z)
- @Nonnull @Override public String toString()

Also in this package: AmplitudeNoiseProperty, CoordinateOriginRotator, CoordinateRandomizer, CoordinateRotator, EmptyCoordinateRandomizer, ICoordinateRandomizer

Complete API:
  public double randomDoubleX(int seed, double x, double y)
  public double randomDoubleY(int seed, double x, double y)
  public double randomDoubleX(int seed, double x, double y, double z)
  public double randomDoubleY(int seed, double x, double y, double z)
  public double randomDoubleZ(int seed, double x, double y, double z)
  public String toString()

Fields:
protected final ICoordinateRandomizer randomizer
protected final CoordinateRotator rotation
