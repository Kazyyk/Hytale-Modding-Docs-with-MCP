# DoubleRangeNoiseSupplier

Type: class | Package: com.hypixel.hytale.procedurallib.supplier | Implements: IDoubleCoordinateSupplier

public class DoubleRangeNoiseSupplier implements IDoubleCoordinateSupplier

## Fields

- protected final IDoubleRange range
- protected final NoiseProperty noiseProperty
- protected final IDoubleCoordinateSupplier2d supplier2d
- protected final IDoubleCoordinateSupplier3d supplier3d

## Methods

- @Override public double get(int seed, double x, double y)
- @Override public double get(int seed, double x, double y, double z)
- @Override @Nonnull public String toString()

Also in this package: Constant, Constant, ConstantDoubleCoordinateHashSupplier, ConstantFloatCoordinateHashSupplier, DoubleRange, DoubleRangeCoordinateHashSupplier, FloatRange, FloatRangeNoiseSupplier, FloatSupplier, IDoubleCoordinateHashSupplier, IDoubleCoordinateSupplier, IDoubleCoordinateSupplier2d, IDoubleCoordinateSupplier3d, IDoubleRange, IFloatCoordinateHashSupplier, IFloatCoordinateSupplier, IFloatRange, ISeedDoubleRange, Multiple, Normal (and 1 more)

Complete API:
  public double get(int seed, double x, double y)
  public double get(int seed, double x, double y, double z)
  public String toString()

Fields:
protected final IDoubleRange range
protected final NoiseProperty noiseProperty
protected final IDoubleCoordinateSupplier2d supplier2d
protected final IDoubleCoordinateSupplier3d supplier3d
