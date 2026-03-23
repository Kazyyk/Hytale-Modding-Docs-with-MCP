# BuilderToolStringArg

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools

public class BuilderToolStringArg

String argument for builder tools with an optional default value.

## Fields

- defaultValue | String

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolStringArg | Reads this struct from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this struct to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- clone() | BuilderToolStringArg | Creates a shallow copy
