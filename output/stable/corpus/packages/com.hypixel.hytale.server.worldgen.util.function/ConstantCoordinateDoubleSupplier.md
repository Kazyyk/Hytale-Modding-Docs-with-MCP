# ConstantCoordinateDoubleSupplier

Type: class | Package: com.hypixel.hytale.server.worldgen.util.function | Implements: ICoordinateDoubleSupplier

public class ConstantCoordinateDoubleSupplier implements ICoordinateDoubleSupplier

Utility for supplying values with caching or special behavior.

## Constants

- DEFAULT_ZERO | ConstantCoordinateDoubleSupplier
- DEFAULT_ONE | ConstantCoordinateDoubleSupplier

## Accessors

- getValue() | double | Accessor method.

## Methods

- apply(int seed, int x, int y) | double | Instance method.
- apply(int seed, int x, int y, int z) | double | Instance method.

Also in this package: ICoordinateDoubleSupplier, RandomCoordinateDoubleSupplier

Complete API:
  public double getValue()
  public double apply(int seed, int x, int y)
  public double apply(int seed, int x, int y, int z)

Fields:
public static final ConstantCoordinateDoubleSupplier DEFAULT_ZERO
public static final ConstantCoordinateDoubleSupplier DEFAULT_ONE
protected final double value
