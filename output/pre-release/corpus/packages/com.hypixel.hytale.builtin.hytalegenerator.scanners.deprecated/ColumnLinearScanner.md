# ColumnLinearScanner

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.scanners.deprecated | Extends: Scanner

public class ColumnLinearScanner extends Scanner

Deprecated scanner that searches linearly up or down a column for pattern matches. This type is deprecated.

Also in this package: AreaScanner, ColumnRandomScanner, ScanShape, Strategy, Verticality

Complete API:
  public void scan(Scanner.Context context)
  public void scan(Vector3i anchor, Pipe.One<Vector3i> pipe)
  public Bounds3i getBounds_voxelGrid()

Fields:
private final int minY
private final int maxY
private final boolean isRelativeToPosition
private final double baseHeight
private final int resultsCap
private final boolean topDownOrder
private final Bounds3i bounds_voxelGrid
