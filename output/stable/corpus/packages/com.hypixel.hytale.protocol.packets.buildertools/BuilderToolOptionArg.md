# BuilderToolOptionArg

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools

public class BuilderToolOptionArg

Option-list argument for builder tools with a default selection and array of option strings.

## Fields

- defaultValue | String
- options | String[]

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolOptionArg | Reads this struct from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this struct to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- clone() | BuilderToolOptionArg | Creates a shallow copy
