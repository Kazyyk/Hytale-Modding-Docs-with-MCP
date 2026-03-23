# CachedPositionProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.positionproviders.cached | Extends: PositionProvider

public class CachedPositionProvider extends PositionProvider

## Fields

- private final PositionProvider positionProvider
- private final int sectionSize
- private CacheThreadMemory cache

## Methods

- @Override public void positionsIn(PositionProvider.Context context)
- public void get(PositionProvider.Context context)
- @Nonnull private Vector3i sectionAddress(Vector3d pointer)
- @Nonnull private Vector3d sectionMin(Vector3i sectionAddress)
- private int toSectionAddress(double position)
- public int sectionFloor(int voxelAddress)

Also in this package: CacheThreadMemory

Complete API:
  public void positionsIn(PositionProvider.Context context)
  public void get(PositionProvider.Context context)
  private Vector3i sectionAddress(Vector3d pointer)
  private Vector3d sectionMin(Vector3i sectionAddress)
  private int toSectionAddress(double position)
  public int sectionFloor(int voxelAddress)

Fields:
private final PositionProvider positionProvider
private final int sectionSize
private CacheThreadMemory cache
