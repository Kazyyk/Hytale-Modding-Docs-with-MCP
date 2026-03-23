# MeshNoise

Type: class | Package: com.hypixel.hytale.procedurallib.logic | Implements: com.hypixel.hytale.procedurallib.NoiseFunction

public class MeshNoise implements NoiseFunction

Rectangular mesh noise that draws line segments between adjacent Voronoi cell centers on a regular grid. Uses density conditions to selectively enable cells, and jitter parameters to offset cell centers. Only supports 2D evaluation; the 3D overload throws `UnsupportedOperationException`.

## Constants

- public static final Vector2i[] ADJACENT_CELLS

## Fields

- private final IIntCondition density
- private final double thickness
- private final double jitterX
- private final double jitterY

## Constructor


public MeshNoise(IIntCondition density, double thickness, double jitterX, double jitterY)

## Methods

- public double get(int seed, int offsetSeed, double x, double y)
- public double get(int seed, int offsetSeed, double x, double y, double z)

Also in this package: Bounds2d, BranchNoise, CellFunction, CellMode, CellNoise, CellularNoise, ConstantNoise, Distance2Function, Distance2Mode, DistanceNoise, Double2, Double3, DoubleArray, GeneralNoise, GridNoise, HexMeshNoise, InterpolationFunction, InterpolationMode, OldSimplexNoise, PerlinNoise (and 6 more)

Complete API:
  public double get(int seed, int offsetSeed, double x, double y)
  public double get(int seed, int offsetSeed, double x, double y, double z)

Fields:
public static final Vector2i[] ADJACENT_CELLS
private final IIntCondition density
private final double thickness
private final double thicknessSquared
private final double jitterX
private final double jitterY
