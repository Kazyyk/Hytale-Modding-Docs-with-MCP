# GridNoise

Type: class | Package: com.hypixel.hytale.procedurallib.logic | Implements: com.hypixel.hytale.procedurallib.NoiseFunction

public class GridNoise implements NoiseFunction

Produces a distance-to-nearest-grid-edge value. Each axis has an independent thickness parameter controlling the width of the grid lines. Returns values in [-1, 1] where -1 is on a grid line and 1 is at maximum distance from any line. Supports both 2D and 3D evaluation.

## Fields

- protected final double thicknessX
- protected final double thicknessY
- protected final double thicknessZ

## Constructor


public GridNoise(double thicknessX, double thicknessY, double thicknessZ)

## Methods

- public double get(int seed, int offsetSeed, double x, double y)
- public double get(int seed, int offsetSeed, double x, double y, double z)
