# PaletteType

Type: enum | Package: com.hypixel.hytale.protocol.packets.world

public enum PaletteType

Palette encoding type for chunk data serialization. Determines the bit width of block/fluid indices in a palette-compressed chunk section.

## Values

- Empty | 0
- HalfByte | 1
- Byte | 2
- Short | 3

## Methods

- public int getValue()
- public static PaletteType fromValue(int value)
