# RandomCoordinateDoubleSupplier

Type: class | Package: com.hypixel.hytale.server.worldgen.util.function | Implements: ICoordinateDoubleSupplier

public class RandomCoordinateDoubleSupplier implements ICoordinateDoubleSupplier

Utility for supplying values with caching or special behavior.

## Accessors

- getRange() | IDoubleRange | Accessor method.

## Methods

- apply(int seed, int x, int y) | double | Instance method.
- apply(int seed, int x, int y, int z) | double | Instance method.

Also in this package: ConstantCoordinateDoubleSupplier, ICoordinateDoubleSupplier

Complete API:
  public IDoubleRange getRange()
  public double apply(int seed, int x, int y)
  public double apply(int seed, int x, int y, int z)

Fields:
protected final IDoubleRange range
