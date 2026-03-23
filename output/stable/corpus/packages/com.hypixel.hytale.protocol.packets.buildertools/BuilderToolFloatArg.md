# BuilderToolFloatArg

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools

public class BuilderToolFloatArg

Float argument for builder tools with default, min, and max values.

## Fields

- defaultValue | float
- min | float
- max | float

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolFloatArg | Reads this struct from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this struct to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- clone() | BuilderToolFloatArg | Creates a shallow copy
