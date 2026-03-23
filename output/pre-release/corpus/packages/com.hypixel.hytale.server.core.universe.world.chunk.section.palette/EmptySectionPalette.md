# EmptySectionPalette

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk.section.palette | Implements: ISectionPalette

public class EmptySectionPalette implements ISectionPalette

Singleton palette for completely empty chunk sections (all blocks are ID 0). Returns `REQUIRES_PROMOTE` for any non-zero set operation. Promotes to `HalfByteSectionPalette` when a block is placed.

## Constants

- EMPTY_ID | int | 0

Also in this package: AbstractByteSectionPalette, AbstractShortSectionPalette, ByteSectionPalette, HalfByteSectionPalette, ISectionPalette, KeySerializer, PaletteSetProvider, PaletteTypeEnum, SetResult, ShortSectionPalette

Complete API:
  public PaletteType getPaletteType()
  public ISectionPalette.SetResult set(int index, int id)
  public int get(int index)
  public boolean shouldDemote()
  public ISectionPalette demote()
  public ISectionPalette promote()
  public boolean contains(int id)
  public boolean containsAny(IntList ids)
  public boolean isSolid(int id)
  public int count()
  public int count(int id)
  public IntSet values()
  public void forEachValue(IntConsumer consumer)
  public Int2ShortMap valueCounts()
  public void find(IntList ids, IntConsumer indexConsumer)
  public void find(IntList ids, BiIntConsumer indexBlockConsumer)
  public void serializeForPacket(ByteBuf buf)
  public void serialize(ISectionPalette.KeySerializer keySerializer, ByteBuf buf)
  public void deserialize(ToIntFunction<ByteBuf> deserializer, ByteBuf buf, int version)

Fields:
public static final int EMPTY_ID
public static final EmptySectionPalette INSTANCE
