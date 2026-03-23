# BooleanVoxelSpace

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.datastructures.voxelspace | Implements: VoxelSpace<Boolean>

public class BooleanVoxelSpace implements VoxelSpace<Boolean>

## Fields

- protected final int sizeX
- protected final int sizeY
- protected final int sizeZ
- protected final int[][] cells
- protected VoxelCoordinate origin
- private boolean alignedOriginZ
- private int originZOffset

## Methods

- @Override public int sizeX()
- @Override public int sizeY()
- @Override public int sizeZ()
- @Override public void pasteFrom(@Nonnull VoxelSpace<Boolean> source)
- private int primaryAddressIndex(int x, int y)
- private int secondaryAddressIndex(int z)
- private static int setBit(int bits, int index, boolean value)
- private static boolean getBit(int bits, int index)
- public boolean set(@Nullable Boolean value, int x, int y, int z)
- public boolean set(Boolean content, @Nonnull Vector3i position)
- @Nonnull public Boolean getContent(int x, int y, int z)
- @Nonnull public Boolean getContent(@Nonnull Vector3i position)
- private int globalJ(int globalZ)
- private int localJ(int globalJ)
- public void deepCopyFrom(@Nonnull BooleanVoxelSpace other)
- public void set(Boolean content)
- @Override public void setOrigin(int x, int y, int z)
- public boolean replace(Boolean replacement, int x, int y, int z, @Nonnull Predicate<Boolean> mask)
- @Override public int getOriginX()
- @Override public int getOriginY()
- @Override public int getOriginZ()
- @Override @Nonnull public String getName()
- @Override public boolean isInsideSpace(int x, int y, int z)
- @Override public boolean isInsideSpace(@Nonnull Vector3i position)
- @Override public void forEach(@Nonnull VoxelConsumer<? super Boolean> action)
- @Override public int minX()
- @Override public int maxX()
- @Override public int minY()
- @Override public int maxY()
- @Override public int minZ()
- @Override public int maxZ()
- @Nonnull public BooleanVoxelSpace clone()
- private int arrayIndex(int x, int y, int z)
- @Override @Nonnull public String toString()
- public static boolean isAlignedOriginZ(int z)
- public static int getAlignedZ(int z)
