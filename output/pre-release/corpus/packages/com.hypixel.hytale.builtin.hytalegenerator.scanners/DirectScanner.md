# DirectScanner

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.scanners | Extends: Scanner

public class DirectScanner extends Scanner

A scanner that tests only the origin position. The simplest scanner -- checks one position against the pattern.

Also in this package: Context, EmptyScanner, LinearScanner, QueueScanner, RadialScanner, RandomScanner, Scanner

Complete API:
  public void scan(Scanner.Context context)
  public void scan(Vector3i position, Pipe.One<Vector3i> pipe)
  public Bounds3i getBounds_voxelGrid()

Fields:
private static final Bounds3i BOUNDS
private final Control rControl
