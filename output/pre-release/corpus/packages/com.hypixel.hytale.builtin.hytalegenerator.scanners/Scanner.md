# Scanner

Type: abstract class | Package: com.hypixel.hytale.builtin.hytalegenerator.scanners

public abstract class Scanner

## Fields

- public Vector3i position
- public Pattern pattern
- public VoxelSpace<Material> materialSpace
- public WorkerIndexer.Id workerId

## Methods

- public abstract List<Vector3i> scan(@Nonnull Scanner.Context var1)
- public abstract SpaceSize scanSpace()
- @Nonnull public SpaceSize readSpaceWith(@Nonnull Pattern pattern)
- @Nonnull public static Scanner noScanner()
- @Override @Nonnull public List<Vector3i> scan(@Nonnull Scanner.Context context)
- @Override @Nonnull public SpaceSize scanSpace()

## Inner Types

- `Scanner.Context`

Known subclasses: AreaScanner, ColumnLinearScanner, ColumnRandomScanner, DirectScanner, EmptyScanner, LinearScanner, QueueScanner, RadialScanner, RandomScanner

Also in this package: Context, DirectScanner, EmptyScanner, LinearScanner, QueueScanner, RadialScanner, RandomScanner

Complete API:
  public abstract void scan(Scanner.Context var1)
  public abstract void scan(Vector3i var1, Pipe.One<Vector3i> var2)
  public abstract Bounds3i getBounds_voxelGrid()
  public Bounds3i getBoundsWithPattern_voxelGrid(Pattern pattern)
