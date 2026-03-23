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

Known subclasses: AreaScanner, ColumnLinearScanner, ColumnRandomScanner, OriginScanner

Also in this package: AreaScanner, ColumnLinearScanner, ColumnRandomScanner, Context, OriginScanner, ScanShape, Strategy, Verticality

Complete API:
  public abstract List<Vector3i> scan(Scanner.Context var1)
  public abstract SpaceSize scanSpace()
  public SpaceSize readSpaceWith(Pattern pattern)
  public static Scanner noScanner()
