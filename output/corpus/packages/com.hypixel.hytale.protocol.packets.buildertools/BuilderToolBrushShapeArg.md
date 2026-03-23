# BuilderToolBrushShapeArg

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools

public class BuilderToolBrushShapeArg

Brush shape argument with a default `BrushShape` value.

## Fields

- defaultValue | BrushShape

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolBrushShapeArg | Reads this struct from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this struct to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- clone() | BuilderToolBrushShapeArg | Creates a shallow copy
