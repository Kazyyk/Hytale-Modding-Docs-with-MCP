# LinearScanner

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.scanners | Extends: Scanner

public class LinearScanner extends Scanner

A scanner that searches along a single axis within a range, delegating to a child scanner at each step.

Also in this package: Context, DirectScanner, EmptyScanner, QueueScanner, RadialScanner, RandomScanner, Scanner

Complete API:
  public void scan(Scanner.Context context)
  public void scan(Vector3i anchor, Pipe.One<Vector3i> pipe)
  public Bounds3i getBounds_voxelGrid()

Fields:
private final Axis axis
private final RangeInt range
private final Scanner childScanner
private final Bounds3i bounds
private final boolean isAscendingOrder
private final Control rControl
private final Vector3i rPosition
private Pipe.One<Vector3i> rContextPipe
private final Pipe.One<Vector3i> rChildPipe
