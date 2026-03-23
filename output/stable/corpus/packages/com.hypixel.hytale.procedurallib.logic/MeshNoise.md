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
