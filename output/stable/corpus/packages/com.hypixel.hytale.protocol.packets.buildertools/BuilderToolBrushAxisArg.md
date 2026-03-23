# BuilderToolBrushAxisArg

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools

public class BuilderToolBrushAxisArg

Brush axis argument for builder tools with a default `BrushAxis` value.

## Fields

- defaultValue | BrushAxis

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolBrushAxisArg | Reads this struct from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this struct to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- clone() | BuilderToolBrushAxisArg | Creates a shallow copy
