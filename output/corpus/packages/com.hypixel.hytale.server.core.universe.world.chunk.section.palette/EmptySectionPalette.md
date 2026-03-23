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
