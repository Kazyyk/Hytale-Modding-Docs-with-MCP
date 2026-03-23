# ByteSectionPalette

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk.section.palette | Extends: AbstractByteSectionPalette

public class ByteSectionPalette extends AbstractByteSectionPalette

Extends `AbstractByteSectionPalette`.

## Constants

- public static final int MAX_SIZE
- public static final int DEMOTE_SIZE

## Methods

- super(new byte[32768])
- super(externalToInternal, internalToExternal, internalIdSet, internalIdCount, blocks)
- super(new byte[32768], data, unique, count)
- @Override public PaletteType getPaletteType()
- @Override protected byte get0(int idx)
- @Override protected void set0(int idx, byte b)
- @Override public boolean shouldDemote()
- @Nonnull public HalfByteSectionPalette demote()
- @Nonnull public ShortSectionPalette promote()
- @Override protected boolean isValidInternalId(int internalId)
- @Override protected int unsignedInternalId(byte internalId)
- private static int sUnsignedInternalId(byte internalId)

Also in this package: AbstractByteSectionPalette, AbstractShortSectionPalette, EmptySectionPalette, HalfByteSectionPalette, ISectionPalette, KeySerializer, PaletteTypeEnum, SetResult, ShortSectionPalette

Complete API:
  public PaletteType getPaletteType()
  protected byte get0(int idx)
  protected void set0(int idx, byte b)
  public boolean shouldDemote()
  public HalfByteSectionPalette demote()
  public ShortSectionPalette promote()
  protected boolean isValidInternalId(int internalId)
  protected int unsignedInternalId(byte internalId)
  private static int sUnsignedInternalId(byte internalId)
  public static ByteSectionPalette fromHalfBytePalette(HalfByteSectionPalette section)
  public static ByteSectionPalette fromShortPalette(ShortSectionPalette section)

Fields:
private static final int KEY_MASK
public static final int MAX_SIZE
public static final int DEMOTE_SIZE
