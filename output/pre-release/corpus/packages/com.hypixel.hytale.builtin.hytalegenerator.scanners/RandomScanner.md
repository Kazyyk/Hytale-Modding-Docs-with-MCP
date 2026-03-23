# RandomScanner

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.scanners | Extends: Scanner

public class RandomScanner extends Scanner

A scanner that searches at random positions along a single axis within a range, using a seeded RNG field.

Also in this package: Context, DirectScanner, EmptyScanner, LinearScanner, QueueScanner, RadialScanner, Scanner

Complete API:
  public void scan(Scanner.Context context)
  public void scan(Vector3i anchor, Pipe.One<Vector3i> pipe)
  public Bounds3i getBounds_voxelGrid()

Fields:
private final Axis axis
private final RangeInt range
private final Scanner childScanner
private final Bounds3i bounds
private final RngField rngField
private final FastRandom random
private final int attempts
private final Control rControl
private final Vector3i rPosition
private Pipe.One<Vector3i> rContextPipe
private final Pipe.One<Vector3i> rChildPipe
