# HexMeshNoise

Type: class | Package: com.hypixel.hytale.procedurallib.logic | Implements: com.hypixel.hytale.procedurallib.NoiseFunction

public class HexMeshNoise implements NoiseFunction

Hexagonal mesh noise that draws line segments connecting neighboring cell centers on a hex grid. Controlled by density condition, thickness, jitter, and axis flags (`linesX`, `linesY`, `linesZ`) that enable connections in different hex-grid directions. Only supports 2D evaluation; the 3D overload throws `UnsupportedOperationException`.

## Fields

- protected final IIntCondition density
- protected final double thickness
- protected final double thicknessSquared
- protected final CellJitter jitter
- protected final boolean linesX
- protected final boolean linesY
- protected final boolean linesZ

## Constructor


public HexMeshNoise(IIntCondition density, double thickness, CellJitter jitter, boolean linesX, boolean linesY, boolean linesZ)

## Methods

- public double get(int seed, int offsetSeed, double x, double y)
- public double get(int seed, int offsetSeed, double x, double y, double z)
- protected double checkConnections(int offsetSeed, double x, double y, int cx, int cy, double nearest)
- protected double checkDiagonalConnections(int offsetSeed, double x, double y, int cx, int cy, double nearest)
- protected double dist2Cell(int offsetSeed, double x, double y, double adx, double ady, double ax, double ay, int cx, int cy)
