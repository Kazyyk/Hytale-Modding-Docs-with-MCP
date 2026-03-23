# BuilderToolBoolArg

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools

public class BuilderToolBoolArg

Boolean argument for builder tools with a default value.

## Fields

- defaultValue | boolean

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolBoolArg | Reads this struct from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this struct to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- clone() | BuilderToolBoolArg | Creates a shallow copy
