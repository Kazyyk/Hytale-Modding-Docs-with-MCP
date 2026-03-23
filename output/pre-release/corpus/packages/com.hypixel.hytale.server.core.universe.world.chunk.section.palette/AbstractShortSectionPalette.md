# AbstractShortSectionPalette

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk.section.palette | Implements: ISectionPalette

public abstract class AbstractShortSectionPalette implements ISectionPalette

Abstract base for short-backed section palettes (up to 65536 unique block types). Analogous to `AbstractByteSectionPalette` but uses short arrays and short-keyed maps for internal ID mapping. Used when a chunk section exceeds 256 unique block types.

Known subclasses: ShortSectionPalette

Also in this package: AbstractByteSectionPalette, ByteSectionPalette, EmptySectionPalette, HalfByteSectionPalette, ISectionPalette, KeySerializer, PaletteSetProvider, PaletteTypeEnum, SetResult, ShortSectionPalette

Complete API:
  public int get(int index)
  public ISectionPalette.SetResult set(int index, int id)
  protected abstract short get0(int var1)
  protected abstract void set0(int var1, short var2)
  public boolean contains(int id)
  public boolean containsAny(IntList ids)
  public int count()
  public int count(int id)
  public IntSet values()
  public void forEachValue(IntConsumer consumer)
  public Int2ShortMap valueCounts()
  private void createBlockId(short internalId, int blockId)
  private boolean decrementBlockCount(short internalId)
  private void incrementBlockCount(short internalId)
  private int nextInternalId(short oldInternalId)
  protected abstract boolean isValidInternalId(int var1)
  public void serializeForPacket(ByteBuf buf)
  public void serialize(ISectionPalette.KeySerializer keySerializer, ByteBuf buf)
  public void deserialize(ToIntFunction<ByteBuf> deserializer, ByteBuf buf, int version)
  public void find(IntList ids, IntConsumer indexConsumer)
  public void find(IntList ids, BiIntConsumer indexBlockConsumer)
  protected ShortSet getThreadLocalInternalIdSet(IntList ids)

Fields:
protected final Int2ShortMap externalToInternal
protected final Short2IntMap internalToExternal
protected final BitSet internalIdSet
protected final Short2ShortMap internalIdCount
protected final short[] blocks
