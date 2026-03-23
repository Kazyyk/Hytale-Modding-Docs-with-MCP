# FloatRangeNoiseSupplier

Type: class | Package: com.hypixel.hytale.procedurallib.supplier | Implements: IFloatCoordinateSupplier

public class FloatRangeNoiseSupplier implements IFloatCoordinateSupplier

## Fields

- protected final IFloatRange range
- protected final NoiseProperty noiseProperty
- protected final IDoubleCoordinateSupplier2d supplier2d
- protected final IDoubleCoordinateSupplier3d supplier3d

## Methods

- @Override public float get(int seed, double x, double y)
- @Override public float get(int seed, double x, double y, double z)
- @Override @Nonnull public String toString()

Also in this package: Constant, Constant, ConstantDoubleCoordinateHashSupplier, ConstantFloatCoordinateHashSupplier, DoubleRange, DoubleRangeCoordinateHashSupplier, DoubleRangeNoiseSupplier, FloatRange, FloatSupplier, IDoubleCoordinateHashSupplier, IDoubleCoordinateSupplier, IDoubleCoordinateSupplier2d, IDoubleCoordinateSupplier3d, IDoubleRange, IFloatCoordinateHashSupplier, IFloatCoordinateSupplier, IFloatRange, ISeedDoubleRange, Multiple, Normal (and 1 more)

Complete API:
  public float get(int seed, double x, double y)
  public float get(int seed, double x, double y, double z)
  public String toString()

Fields:
protected final IFloatRange range
protected final NoiseProperty noiseProperty
protected final IDoubleCoordinateSupplier2d supplier2d
protected final IDoubleCoordinateSupplier3d supplier3d
