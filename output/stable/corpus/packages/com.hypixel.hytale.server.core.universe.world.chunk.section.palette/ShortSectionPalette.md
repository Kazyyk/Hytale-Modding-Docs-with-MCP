# ShortSectionPalette

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk.section.palette | Extends: AbstractShortSectionPalette

public class ShortSectionPalette extends AbstractShortSectionPalette

Extends `AbstractShortSectionPalette`.

## Constants

- public static final int MAX_SIZE
- public static final int DEMOTE_SIZE

## Methods

- super(new short[32768])
- super(externalToInternal, internalToExternal, internalIdSet, internalIdCount, blocks)
- super(new short[32768], data, unique, count)
- @Override public PaletteType getPaletteType()
- @Override protected short get0(int idx)
- @Override protected void set0(int idx, short s)
- @Override public boolean shouldDemote()
- @Nonnull public ByteSectionPalette demote()
- @Override public ISectionPalette promote()
- throw new UnsupportedOperationException("Short palette cannot be promoted.")
- @Override protected boolean isValidInternalId(int internalId)
