# BuilderToolArgType

Type: enum | Package: com.hypixel.hytale.protocol.packets.buildertools

public enum BuilderToolArgType

Type discriminator for builder tool argument values.

## Enum Constants

- Bool | 0
- Float | 1
- Int | 2
- String | 3
- Block | 4
- Mask | 5
- BrushShape | 6
- BrushOrigin | 7
- BrushAxis | 8
- Rotation | 9
- Option | 10

## Static Fields

- VALUES | BuilderToolArgType[] | Cached array of all enum constants

## Methods

- getValue() | int | Returns the integer value of this constant
- fromValue(int) | BuilderToolArgType | Returns the constant for the given value, throws `ProtocolException` if invalid
