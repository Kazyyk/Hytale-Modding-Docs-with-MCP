# BuilderToolIntArg

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools

public class BuilderToolIntArg

Integer argument for builder tools with default, min, and max values.

## Fields

- defaultValue | int
- min | int
- max | int

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolIntArg | Reads this struct from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this struct to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- clone() | BuilderToolIntArg | Creates a shallow copy
