# FloatRange

Type: class | Package: com.hypixel.hytale.procedurallib.supplier

public class FloatRange

## Fields

- public static final FloatRange.Constant ZERO
- public static final FloatRange.Constant ONE
- protected final float result
- protected final float min
- protected final float range

## Methods

- public float getResult()
- @Override public float getValue(float v)
- @Override public float getValue(FloatSupplier supplier)
- @Override public float getValue(Random random)
- @Override public float getValue(int seed, double x, double y, IDoubleCoordinateSupplier2d supplier)
- @Override public float getValue(int seed, double x, double y, double z, IDoubleCoordinateSupplier3d supplier)
- @Override @Nonnull public String toString()
- public float getMin()
- public float getRange()
- @Override public float getValue(@Nonnull FloatSupplier supplier)
- @Override public float getValue(@Nonnull Random random)
- @Override public float getValue(int seed, double x, double y, @Nonnull IDoubleCoordinateSupplier2d supplier)
- @Override public float getValue(int seed, double x, double y, double z, @Nonnull IDoubleCoordinateSupplier3d supplier)

## Inner Types

- `FloatRange.Constant`
- `FloatRange.Normal`
