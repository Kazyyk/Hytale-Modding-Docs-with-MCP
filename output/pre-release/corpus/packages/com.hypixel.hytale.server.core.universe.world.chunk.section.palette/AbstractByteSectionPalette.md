# AbstractByteSectionPalette

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk.section.palette | Implements: ISectionPalette

public abstract class AbstractByteSectionPalette implements ISectionPalette

Abstract base for byte-backed section palettes (up to 256 unique block types). Maintains bidirectional external-to-internal ID mappings, per-ID counts, and a byte array for block storage. Handles promotion when the palette runs out of internal IDs, and supports packet serialization, disk serialization, and find operations.

Known subclasses: ByteSectionPalette, HalfByteSectionPalette

Also in this package: AbstractShortSectionPalette, ByteSectionPalette, EmptySectionPalette, HalfByteSectionPalette, ISectionPalette, KeySerializer, PaletteSetProvider, PaletteTypeEnum, SetResult, ShortSectionPalette

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
  public void find(IntList ids, IntConsumer indexConsumer)
  public void find(IntList ids, BiIntConsumer indexBlockConsumer)
  private ByteSet getThreadLocalInternalIdSet(IntList ids)

Fields:
protected final Int2ByteMap externalToInternal
protected final Byte2IntMap internalToExternal
protected final BitSet internalIdSet
protected final Byte2ShortMap internalIdCount
protected final byte[] blocks
