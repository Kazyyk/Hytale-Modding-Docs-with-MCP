# DoubleRange

Type: class | Package: com.hypixel.hytale.procedurallib.supplier

public class DoubleRange

## Fields

- public static final DoubleRange.Constant ZERO
- public static final DoubleRange.Constant ONE
- protected final double result
- protected final double[] thresholds
- protected final double[] values
- protected final double min
- protected final double range

## Methods

- public double getResult()
- @Override public double getValue(double v)
- @Override public double getValue(DoubleSupplier supplier)
- @Override public double getValue(Random random)
- @Override public double getValue(int seed, double x, double y, IDoubleCoordinateSupplier2d supplier)
- @Override public double getValue(int seed, double x, double y, double z, IDoubleCoordinateSupplier3d supplier)
- @Override @Nonnull public String toString()
- @Override public double getValue(@Nonnull DoubleSupplier supplier)
- @Override public double getValue(@Nonnull Random random)
- @Override public double getValue(int seed, double x, double y, @Nonnull IDoubleCoordinateSupplier2d supplier)
- @Override public double getValue(int seed, double x, double y, double z, @Nonnull IDoubleCoordinateSupplier3d supplier)
- public double getMin()
- public double getRange()

## Inner Types

- `DoubleRange.Constant`
- `DoubleRange.Multiple`
- `DoubleRange.Normal`
