# BuilderToolMaskArg

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools

public class BuilderToolMaskArg

Mask argument for builder tools with an optional default mask string.

## Fields

- defaultValue | String

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolMaskArg | Reads this struct from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this struct to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- clone() | BuilderToolMaskArg | Creates a shallow copy
