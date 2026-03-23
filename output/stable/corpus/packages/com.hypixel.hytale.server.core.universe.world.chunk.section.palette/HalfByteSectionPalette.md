# HalfByteSectionPalette

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk.section.palette | Extends: AbstractByteSectionPalette

public class HalfByteSectionPalette extends AbstractByteSectionPalette

Extends `AbstractByteSectionPalette`.

## Constants

- public static final int MAX_SIZE

## Methods

- super(new byte[16384])
- super(externalToInternal, internalToExternal, internalIdSet, internalIdCount, blocks)
- super(new byte[16384], data, unique, count)
- @Override public PaletteType getPaletteType()
- @Override protected void set0(int idx, byte b)
- @Override protected byte get0(int idx)
- @Override public boolean shouldDemote()
- @Override public ISectionPalette demote()
- @Nonnull public ByteSectionPalette promote()
- @Override protected boolean isValidInternalId(int internalId)
- @Override protected int unsignedInternalId(byte internalId)
- private static int sUnsignedInternalId(byte internalId)
