# ISectionPalette

Type: interface | Package: com.hypixel.hytale.server.core.universe.world.chunk.section.palette

public interface ISectionPalette

Interface for chunk section block palettes. Defines the contract for getting/setting block IDs by index, querying contents, counting values, finding blocks, promoting/demoting palette capacity, and serialization for both network packets and disk storage. Provides a static factory `from()` that selects the appropriate implementation based on unique ID count.

## Inner Types

- `ISectionPalette.SetResult` -- enum: `ADDED_OR_REMOVED`, `CHANGED`, `UNCHANGED`, `REQUIRES_PROMOTE`
- `ISectionPalette.KeySerializer` -- functional interface for serializing external IDs

Known implementors: AbstractByteSectionPalette, AbstractShortSectionPalette, EmptySectionPalette

Also in this package: AbstractByteSectionPalette, AbstractShortSectionPalette, ByteSectionPalette, EmptySectionPalette, HalfByteSectionPalette, KeySerializer, PaletteSetProvider, PaletteTypeEnum, SetResult, ShortSectionPalette

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
  void find(IntList var1, IntConsumer var2)
  void find(IntList var1, BiIntConsumer var2)
  default void find(IntList ids, IntSet ignoredInternalIdHolder, IntConsumer indexConsumer)
  boolean shouldDemote()
  ISectionPalette demote()
  ISectionPalette promote()
  void serializeForPacket(ByteBuf var1)
  void serialize(ISectionPalette.KeySerializer var1, ByteBuf var2)
  void deserialize(ToIntFunction<ByteBuf> var1, ByteBuf var2, int var3)
  static ISectionPalette from(int[] data, Int2ShortMap idCounts)
