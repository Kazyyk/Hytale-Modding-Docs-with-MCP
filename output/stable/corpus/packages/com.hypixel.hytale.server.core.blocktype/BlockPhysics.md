# BlockPhysics

Type: class | Package: com.hypixel.hytale.server.core.blocktype.component | Implements: Component<ChunkStore>

public class BlockPhysics implements Component<ChunkStore>

A `ChunkStore` component that stores per-block support values for a chunk section. Each block position is assigned a 4-bit (nibble) support value, packed into a byte array of 16,384 bytes (32x32x32 blocks, two nibbles per byte). A support value of `15` (`IS_DECO_VALUE`) marks a block as decorative. A value of `0` (`NULL_SUPPORT`) indicates no support data.

The data is thread-safe via a `StampedLock` and is lazily allocated -- the backing array is `null` until a non-zero value is stored. When all values return to zero, the array is released.

## Fields

- public static final int VERSION
- public static final BuilderCodec<BlockPhysics> CODEC
- public static final int SUPPORT_DATA_SIZE
- public static final int IS_DECO_VALUE
- public static final int NULL_SUPPORT

## Methods

- public static ComponentType<ChunkStore, BlockPhysics> getComponentType()
- public boolean set(int index, int support)
- public boolean set(int x, int y, int z, int support)
- public int get(int index)
- public int get(int x, int y, int z)
- public boolean isDeco(int x, int y, int z)
- public boolean isDeco(int index)
- @Nonnull public Component<ChunkStore> clone()
- public static void clear(@Nonnull Store<ChunkStore> store, @Nonnull Ref<ChunkStore> section, int x, int y, int z)
- public static void clear(@Nonnull Holder<ChunkStore> section, int x, int y, int z)
- public static void reset(@Nonnull Store<ChunkStore> store, @Nonnull Ref<ChunkStore> section, int x, int y, int z)
- public static void reset(@Nonnull Holder<ChunkStore> section, int x, int y, int z)
- public static void markDeco(@Nonnull ComponentAccessor<ChunkStore> store, @Nonnull Ref<ChunkStore> section, int x, int y, int z)
- public static void setSupportValue(@Nonnull Store<ChunkStore> store, @Nonnull Ref<ChunkStore> section, int x, int y, int z, int value)
- public static void setSupportValue(@Nonnull Holder<ChunkStore> section, int x, int y, int z, int value)

## Related Types

- BlockTypeModule -- registers this component

Complete API:
  public static ComponentType<ChunkStore,BlockPhysics> getComponentType()
  public boolean set(int index, int support)
  public boolean set(int x, int y, int z, int support)
  public int get(int index)
  public int get(int x, int y, int z)
  public boolean isDeco(int x, int y, int z)
  public boolean isDeco(int index)
  public Component<ChunkStore> clone()
  private byte[] serialize(ExtraInfo extraInfo)
  private void deserialize(byte[] bytes, ExtraInfo extraInfo)
  public static void clear(Store<ChunkStore> store, Ref<ChunkStore> section, int x, int y, int z)
  public static void clear(Holder<ChunkStore> section, int x, int y, int z)
  public static void reset(Store<ChunkStore> store, Ref<ChunkStore> section, int x, int y, int z)
  public static void reset(Holder<ChunkStore> section, int x, int y, int z)
  public static void markDeco(ComponentAccessor<ChunkStore> store, Ref<ChunkStore> section, int x, int y, int z)
  public static void setSupportValue(Store<ChunkStore> store, Ref<ChunkStore> section, int x, int y, int z, int value)
  public static void setSupportValue(Holder<ChunkStore> section, int x, int y, int z, int value)

Fields:
public static final int VERSION
public static final BuilderCodec<BlockPhysics> CODEC
public static final int SUPPORT_DATA_SIZE
public static final int IS_DECO_VALUE
public static final int NULL_SUPPORT
private final StampedLock lock
private byte[] supportData
private int nonZeroCount
