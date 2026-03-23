# CellNoise

Type: class | Package: com.hypixel.hytale.procedurallib.logic | Implements: com.hypixel.hytale.procedurallib.NoiseFunction

public class CellNoise implements NoiseFunction

Voronoi/cellular noise that finds the nearest cell point and evaluates a configurable `CellFunction` to produce the output value. Supports both 2D and 3D evaluation. The `CellFunction` interface and the `CellMode` enum provide built-in modes: `CELL_VALUE` (hash-based random), `NOISE_LOOKUP` (sample another noise at cell center), `DISTANCE` (distance to nearest point), and `DIRECTION` (directional distance with angle, 2D only).

## Fields

- protected final CellDistanceFunction distanceFunction
- protected final PointEvaluator pointEvaluator
- protected final CellNoise.CellFunction cellFunction
- @Nullable protected final NoiseProperty noiseLookup

## Methods

- public CellDistanceFunction getDistanceFunction()
- public CellNoise.CellFunction getCellFunction()
- @Nullable public NoiseProperty getNoiseLookup()
- public double get(int seed, int offsetSeed, double x, double y)
- public double get(int seed, int offsetSeed, double x, double y, double z)

## Inner Types

### CellFunction (interface)


public interface CellFunction

- double eval(int var1, int var2, double var3, double var5, ResultBuffer.ResultBuffer2d var7, CellDistanceFunction var8, NoiseProperty var9)
- double eval(int var1, int var2, double var3, double var5, double var7, ResultBuffer.ResultBuffer3d var9, CellDistanceFunction var10, NoiseProperty var11)

### CellMode (enum)


public static enum CellMode

- CELL_VALUE | Hash-based random value per cell.
- NOISE_LOOKUP | Evaluates a secondary noise at the nearest cell center.
- DISTANCE | Returns the distance to the nearest cell point.
- DIRECTION | Directional cell function using angle and line-side distance (2D only).

- CellNoise.CellFunction getFunction()

Known subclasses: LoadedCellNoise

Also in this package: Bounds2d, BranchNoise, CellFunction, CellMode, CellularNoise, ConstantNoise, Distance2Function, Distance2Mode, DistanceNoise, Double2, Double3, DoubleArray, GeneralNoise, GridNoise, HexMeshNoise, InterpolationFunction, InterpolationMode, MeshNoise, OldSimplexNoise, PerlinNoise (and 6 more)

Complete API:
  public CellDistanceFunction getDistanceFunction()
  public CellNoise.CellFunction getCellFunction()
  public NoiseProperty getNoiseLookup()
  public double get(int seed, int offsetSeed, double x, double y)
  public double get(int seed, int offsetSeed, double x, double y, double z)
  protected ResultBuffer.ResultBuffer2d localBuffer2d()
  protected ResultBuffer.ResultBuffer3d localBuffer3d()
  public String toString()

Fields:
protected final CellDistanceFunction distanceFunction
protected final PointEvaluator pointEvaluator
protected final CellNoise.CellFunction cellFunction
protected final NoiseProperty noiseLookup
