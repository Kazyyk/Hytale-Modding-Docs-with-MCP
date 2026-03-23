# BuilderToolRotationArg

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools

public class BuilderToolRotationArg

Rotation argument with a default `Rotation` value.

## Fields

- defaultValue | Rotation

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolRotationArg | Reads this struct from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this struct to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- clone() | BuilderToolRotationArg | Creates a shallow copy
