# ColumnRandomScanner

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.scanners.deprecated | Extends: Scanner

public class ColumnRandomScanner extends Scanner

Deprecated scanner that searches a column at random Y positions for pattern matches. Supports dart-throw and pick-valid strategies. This type is deprecated.

Also in this package: AreaScanner, ColumnLinearScanner, ScanShape, Strategy, Verticality

Complete API:
  public void scan(Scanner.Context context)
  public void scan(Vector3i anchor, Pipe.One<Vector3i> pipe)
  private void scanPickValid(Scanner.Context context)
  public void scanDartThrow(Scanner.Context context)
  public Bounds3i getBounds_voxelGrid()

Fields:
private final int minY
private final int maxY
private final boolean isRelativeToPosition
private final double baseHeight
private final int resultsCap
private final RngField rngField
private final ColumnRandomScanner.Strategy strategy
private final Bounds3i bounds_voxelGrid
private final List<Vector3i> rPositions
