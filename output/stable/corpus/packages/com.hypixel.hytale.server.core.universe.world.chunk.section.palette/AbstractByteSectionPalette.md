# AbstractByteSectionPalette

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk.section.palette | Implements: ISectionPalette

public abstract class AbstractByteSectionPalette implements ISectionPalette

Abstract base class in the `palette` package.

## Methods

- @Override public int get(int index)
- @Override public ISectionPalette.SetResult set(int index, int id)
- protected abstract byte get0(int var1)
- protected abstract void set0(int var1, byte var2)
- @Override public boolean contains(int id)
- @Override public boolean containsAny(@Nonnull IntList ids)
- @Override public int count()
- @Override public int count(int id)
- @Override public IntSet values()
- @Override public void forEachValue(IntConsumer consumer)
- @Override public Int2ShortMap valueCounts()
- private void createBlockId(byte internalId, int blockId)
- private boolean decrementBlockCount(byte internalId)
- private void incrementBlockCount(byte internalId)
- private int nextInternalId(byte oldInternalId)
- protected abstract boolean isValidInternalId(int var1)
- protected abstract int unsignedInternalId(byte var1)
- @Override public void serializeForPacket(@Nonnull ByteBuf buf)
- @Override public void serialize(@Nonnull ISectionPalette.KeySerializer keySerializer, @Nonnull ByteBuf buf)
- @Override public void deserialize(@Nonnull ToIntFunction<ByteBuf> deserializer, @Nonnull ByteBuf buf, int version)
- @Override public void find(@Nonnull IntList ids, @Nonnull IntSet internalIdHolder, @Nonnull IntConsumer indexConsumer)

Known subclasses: ByteSectionPalette, HalfByteSectionPalette

Also in this package: AbstractShortSectionPalette, ByteSectionPalette, EmptySectionPalette, HalfByteSectionPalette, ISectionPalette, KeySerializer, PaletteTypeEnum, SetResult, ShortSectionPalette

Complete API:
  public int get(int index)
  public ISectionPalette.SetResult set(int index, int id)
  protected abstract byte get0(int var1)
  protected abstract void set0(int var1, byte var2)
  public boolean contains(int id)
  public boolean containsAny(IntList ids)
  public int count()
  public int count(int id)
  public IntSet values()
  public void forEachValue(IntConsumer consumer)
  public Int2ShortMap valueCounts()
  private void createBlockId(byte internalId, int blockId)
  private boolean decrementBlockCount(byte internalId)
  private void incrementBlockCount(byte internalId)
  private int nextInternalId(byte oldInternalId)
  protected abstract boolean isValidInternalId(int var1)
  protected abstract int unsignedInternalId(byte var1)
  public void serializeForPacket(ByteBuf buf)
  public void serialize(ISectionPalette.KeySerializer keySerializer, ByteBuf buf)
  public void deserialize(ToIntFunction<ByteBuf> deserializer, ByteBuf buf, int version)
  public void find(IntList ids, IntSet internalIdHolder, IntConsumer indexConsumer)

Fields:
protected final Int2ByteMap externalToInternal
protected final Byte2IntMap internalToExternal
protected final BitSet internalIdSet
protected final Byte2ShortMap internalIdCount
protected final byte[] blocks
