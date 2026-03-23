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

Also in this package: AbstractByteSectionPalette, AbstractShortSectionPalette, ByteSectionPalette, EmptySectionPalette, ISectionPalette, KeySerializer, PaletteSetProvider, PaletteTypeEnum, SetResult, ShortSectionPalette

Complete API:
  public PaletteType getPaletteType()
  protected void set0(int idx, byte b)
  protected byte get0(int idx)
  public boolean shouldDemote()
  public ISectionPalette demote()
  public ByteSectionPalette promote()
  protected boolean isValidInternalId(int internalId)
  protected int unsignedInternalId(byte internalId)
  private static int sUnsignedInternalId(byte internalId)
  public static HalfByteSectionPalette fromBytePalette(ByteSectionPalette section)

Fields:
private static final int KEY_MASK
public static final int MAX_SIZE
