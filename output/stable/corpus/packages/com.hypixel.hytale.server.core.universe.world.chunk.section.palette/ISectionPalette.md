# ISectionPalette

Type: interface | Package: com.hypixel.hytale.server.core.universe.world.chunk.section.palette

public interface ISectionPalette

## Methods

- PaletteType getPaletteType()
- ISectionPalette.SetResult set(int var1, int var2)
- int get(int var1)
- boolean contains(int var1)
- boolean containsAny(IntList var1)
- default boolean isSolid(int id)
- int count()
- int count(int var1)
- IntSet values()
- void forEachValue(IntConsumer var1)
- Int2ShortMap valueCounts()
- void find(IntList var1, IntSet var2, IntConsumer var3)
- boolean shouldDemote()
- void serializeForPacket(ByteBuf var1)
- void serialize(ISectionPalette.KeySerializer var1, ByteBuf var2)
- void deserialize(ToIntFunction<ByteBuf> var1, ByteBuf var2, int var3)
- return new HalfByteSectionPalette(data, unique, count)
- return new ByteSectionPalette(data, unique, count)
- return new ShortSectionPalette(data, unique, count)
- throw new UnsupportedOperationException("Too many block types for palette.")
- void serialize(ByteBuf var1, int var2)

## Enum Constants

- `ADDED_OR_REMOVED`
- `CHANGED`
- `UNCHANGED`
- `REQUIRES_PROMOTE`

Known implementors: AbstractByteSectionPalette, AbstractShortSectionPalette, EmptySectionPalette

Also in this package: AbstractByteSectionPalette, AbstractShortSectionPalette, ByteSectionPalette, EmptySectionPalette, HalfByteSectionPalette, KeySerializer, PaletteTypeEnum, SetResult, ShortSectionPalette

Complete API:
  PaletteType getPaletteType()
  ISectionPalette.SetResult set(int var1, int var2)
  int get(int var1)
  boolean contains(int var1)
  boolean containsAny(IntList var1)
  default boolean isSolid(int id)
  int count()
  int count(int var1)
  IntSet values()
  void forEachValue(IntConsumer var1)
  Int2ShortMap valueCounts()
  void find(IntList var1, IntSet var2, IntConsumer var3)
  boolean shouldDemote()
  ISectionPalette demote()
  ISectionPalette promote()
  void serializeForPacket(ByteBuf var1)
  void serialize(ISectionPalette.KeySerializer var1, ByteBuf var2)
  void deserialize(ToIntFunction<ByteBuf> var1, ByteBuf var2, int var3)
  static ISectionPalette from(int[] data, int[] unique, int count)
