# BlockPhysics

Type: class | Package: com.hypixel.hytale.server.core.blocktype.component | Implements: Component

public class BlockPhysics implements Component

## Fields

- public static final int VERSION
- public static final BuilderCodec<BlockPhysics> CODEC
- public static final int SUPPORT_DATA_SIZE
- public static final int IS_DECO_VALUE
- public static final int NULL_SUPPORT
- private final StampedLock lock
- private byte[] supportData
- private int nonZeroCount

## Methods

- public static ComponentType<ChunkStore,BlockPhysics> getComponentType()
- public boolean set(int index, int support)
- public boolean set(int x, int y, int z, int support)
- public int get(int index)
- public int get(int x, int y, int z)
- public boolean isDeco(int x, int y, int z)
- public boolean isDeco(int index)
- @Nonnull @Override public Component<ChunkStore> clone()
- private byte[] serialize(ExtraInfo extraInfo)
- private void deserialize(byte[] bytes, ExtraInfo extraInfo)
- public static void clear(Store<ChunkStore> store, Ref<ChunkStore> section, int x, int y, int z)
- public static void clear(Holder<ChunkStore> section, int x, int y, int z)
- public static void reset(Store<ChunkStore> store, Ref<ChunkStore> section, int x, int y, int z)
- public static void reset(Holder<ChunkStore> section, int x, int y, int z)
- public static void markDeco(ComponentAccessor<ChunkStore> store, Ref<ChunkStore> section, int x, int y, int z)
- public static void setSupportValue(Store<ChunkStore> store, Ref<ChunkStore> section, int x, int y, int z, int value)
- public static void setSupportValue(Holder<ChunkStore> section, int x, int y, int z, int value)

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
  public static void clear(ComponentAccessor<ChunkStore> accessor, Ref<ChunkStore> section, int x, int y, int z)
  public static void clear(Holder<ChunkStore> section, int x, int y, int z)
  public static void reset(ComponentAccessor<ChunkStore> accessor, Ref<ChunkStore> section, int x, int y, int z)
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
