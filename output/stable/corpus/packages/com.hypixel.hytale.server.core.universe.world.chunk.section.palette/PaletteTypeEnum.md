# PaletteTypeEnum

Type: enum | Package: com.hypixel.hytale.server.core.universe.world.chunk.section.palette

public enum PaletteTypeEnum

An enumeration with 8 constants.

## Methods

- , SHORT(PaletteType.Short, ShortSectionPalette::new)
- public static PaletteTypeEnum get(byte paletteId)
- @Nonnull public PaletteType getPaletteType()
- public Supplier<? extends ISectionPalette> getConstructor()
- public byte getPaletteId()

## Enum Constants

- `EMPTY`
- `HALF_BYTE`
- `HalfByteSectionPalette::new)`
- `BYTE`
- `ByteSectionPalette::new)`
- `SHORT`
- `ShortSectionPalette::new)`

Also in this package: AbstractByteSectionPalette, AbstractShortSectionPalette, ByteSectionPalette, EmptySectionPalette, HalfByteSectionPalette, ISectionPalette, KeySerializer, SetResult, ShortSectionPalette

Complete API:
  public static PaletteTypeEnum get(byte paletteId)
  public PaletteType getPaletteType()
  public Supplier<? extends ISectionPalette> getConstructor()
  public byte getPaletteId()

Fields:
private static final PaletteTypeEnum[] values
private final PaletteType paletteType
private final Supplier<? extends ISectionPalette> constructor
private final byte paletteId
