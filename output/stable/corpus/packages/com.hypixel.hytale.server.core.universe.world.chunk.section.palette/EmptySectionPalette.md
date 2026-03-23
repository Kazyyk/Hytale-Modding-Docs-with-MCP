# EmptySectionPalette

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk.section.palette | Implements: ISectionPalette

public class EmptySectionPalette implements ISectionPalette

Section palette implementation for mapping block IDs within chunk sections.

## Constants

- public static final int EMPTY_ID

## Methods

- @Override public PaletteType getPaletteType()
- @Override public ISectionPalette.SetResult set(int index, int id)
- @Override public int get(int index)
- @Override public boolean shouldDemote()
- @Override public ISectionPalette demote()
- throw new UnsupportedOperationException("Cannot demote empty chunk section!")
- @Override public ISectionPalette promote()
- return new HalfByteSectionPalette()
- @Override public boolean contains(int id)
- @Override public boolean containsAny(@Nonnull IntList ids)
- @Override public boolean isSolid(int id)
- @Override public int count()
- @Override public int count(int id)
- @Override public IntSet values()
- @Override public void forEachValue(@Nonnull IntConsumer consumer)
- @Override public Int2ShortMap valueCounts()
- @Override public void find(@Nonnull IntList ids, IntSet internalIdHolder, @Nonnull IntConsumer indexConsumer)
- @Override public void serializeForPacket(ByteBuf buf)
- @Override public void serialize(ISectionPalette.KeySerializer keySerializer, ByteBuf buf)
- @Override public void deserialize(ToIntFunction<ByteBuf> deserializer, ByteBuf buf, int version)

Also in this package: AbstractByteSectionPalette, AbstractShortSectionPalette, ByteSectionPalette, HalfByteSectionPalette, ISectionPalette, KeySerializer, PaletteTypeEnum, SetResult, ShortSectionPalette

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
  public void find(IntList ids, IntSet internalIdHolder, IntConsumer indexConsumer)
  public void serializeForPacket(ByteBuf buf)
  public void serialize(ISectionPalette.KeySerializer keySerializer, ByteBuf buf)
  public void deserialize(ToIntFunction<ByteBuf> deserializer, ByteBuf buf, int version)

Fields:
public static final int EMPTY_ID
public static final EmptySectionPalette INSTANCE
