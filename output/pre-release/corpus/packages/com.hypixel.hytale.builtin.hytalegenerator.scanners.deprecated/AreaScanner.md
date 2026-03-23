# AreaScanner

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.scanners.deprecated | Extends: Scanner

public class AreaScanner extends Scanner

Deprecated scanner that searches a 2D area (circle or square) around the origin position. Delegates to a child scanner for each column. This type is deprecated.

Also in this package: ColumnLinearScanner, ColumnRandomScanner, ScanShape, Strategy, Verticality

Complete API:
  public void scan(Scanner.Context context)
  public void scan(Vector3i anchor, Pipe.One<Vector3i> pipe)
  public Bounds3i getBounds_voxelGrid()

Fields:
private final int resultCap
private final Scanner childScanner
private final List<Vector2i> scanOrder
private final Bounds3i bounds_voxelGrid
