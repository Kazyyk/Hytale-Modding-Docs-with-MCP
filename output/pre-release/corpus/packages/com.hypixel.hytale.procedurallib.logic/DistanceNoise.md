# DistanceNoise

Type: class | Package: com.hypixel.hytale.procedurallib.logic | Implements: com.hypixel.hytale.procedurallib.NoiseFunction

public abstract class DistanceNoise implements NoiseFunction

Abstract noise function that computes the two nearest cell distances and combines them via a `Distance2Function`. Supports both 2D and 3D evaluation. Subclasses must provide thread-local result buffers via `localBuffer2d()` and `localBuffer3d()`.

## Fields

- protected final CellDistanceFunction cellDistanceFunction
- protected final PointEvaluator pointEvaluator
- protected final DistanceNoise.Distance2Function distance2Function

## Methods

- public CellDistanceFunction getCellDistanceFunction()
- public DistanceNoise.Distance2Function getDistance2Function()
- public double get(int seed, int offsetSeed, double x, double y)
- public double get(int seed, int offsetSeed, double x, double y, double z)
- protected abstract ResultBuffer.ResultBuffer2d localBuffer2d()
- protected abstract ResultBuffer.ResultBuffer3d localBuffer3d()

## Inner Types

### Distance2Function (interface)


@FunctionalInterface
public interface Distance2Function

- double eval(double var1, double var3)

### Distance2Mode (enum)


public static enum Distance2Mode

- ADD | Sum of two nearest distances.
- SUB | Difference (distance2 - distance).
- MUL | Product of two nearest distances.
- DIV | Ratio (distance / distance2).
- MIN | Returns the nearest distance only.
- MAX | Returns the second-nearest distance only.

- DistanceNoise.Distance2Function getFunction()

Known subclasses: LoadedDistanceNoise

Also in this package: Bounds2d, BranchNoise, CellFunction, CellMode, CellNoise, CellularNoise, ConstantNoise, Distance2Function, Distance2Mode, Double2, Double3, DoubleArray, GeneralNoise, GridNoise, HexMeshNoise, InterpolationFunction, InterpolationMode, MeshNoise, OldSimplexNoise, PerlinNoise (and 6 more)

Complete API:
  public CellDistanceFunction getCellDistanceFunction()
  public DistanceNoise.Distance2Function getDistance2Function()
  public double get(int seed, int offsetSeed, double x, double y)
  public double get(int seed, int offsetSeed, double x, double y, double z)
  protected abstract ResultBuffer.ResultBuffer2d localBuffer2d()
  protected abstract ResultBuffer.ResultBuffer3d localBuffer3d()
  public String toString()

Fields:
protected final CellDistanceFunction cellDistanceFunction
protected final PointEvaluator pointEvaluator
protected final DistanceNoise.Distance2Function distance2Function
