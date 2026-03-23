# QueueScanner

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.scanners | Extends: Scanner

public class QueueScanner extends Scanner

A composite scanner that executes multiple child scanners in sequence.

Also in this package: Context, DirectScanner, EmptyScanner, LinearScanner, RadialScanner, RandomScanner, Scanner

Complete API:
  public void scan(Scanner.Context context)
  public void scan(Vector3i anchor, Pipe.One<Vector3i> pipe)
  public Bounds3i getBounds_voxelGrid()

Fields:
private final List<Scanner> scanners
private final Bounds3i bounds
