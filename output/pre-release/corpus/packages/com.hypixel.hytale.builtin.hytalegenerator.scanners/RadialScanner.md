# RadialScanner

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.scanners | Extends: Scanner

public class RadialScanner extends Scanner

A scanner that searches positions in a 3D bounds sorted by distance from origin, delegating to a child scanner at each position.

Also in this package: Context, DirectScanner, EmptyScanner, LinearScanner, QueueScanner, RandomScanner, Scanner

Complete API:
  public void scan(Scanner.Context context)
  public void scan(Vector3i anchor, Pipe.One<Vector3i> pipe)
  public Bounds3i getBounds_voxelGrid()
  private static int indexX(int i)
  private static int indexY(int i)
  private static int indexZ(int i)

Fields:
private final Bounds3i bounds
private final Scanner childScanner
private final byte[] sortedPositions
private final int positionsCount
private final Control rControl
private final Vector3i rPosition
private Pipe.One<Vector3i> rContextPipe
private final Pipe.One<Vector3i> rChildPipe
