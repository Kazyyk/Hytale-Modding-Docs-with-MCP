# EmptyScanner

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.scanners | Extends: Scanner

public class EmptyScanner extends Scanner

A no-op scanner that produces no results. Singleton accessed via `INSTANCE`.

Also in this package: Context, DirectScanner, LinearScanner, QueueScanner, RadialScanner, RandomScanner, Scanner

Complete API:
  public void scan(Scanner.Context context)
  public void scan(Vector3i position, Pipe.One<Vector3i> pipe)
  public Bounds3i getBounds_voxelGrid()

Fields:
public static final EmptyScanner INSTANCE
