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
