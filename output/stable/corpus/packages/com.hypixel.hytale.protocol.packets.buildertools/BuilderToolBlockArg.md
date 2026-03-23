# BuilderToolBlockArg

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools

public class BuilderToolBlockArg

Block argument for builder tools with an optional default value and pattern support flag.

## Fields

- defaultValue | String
- allowPattern | boolean

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolBlockArg | Reads this struct from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this struct to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- clone() | BuilderToolBlockArg | Creates a shallow copy
