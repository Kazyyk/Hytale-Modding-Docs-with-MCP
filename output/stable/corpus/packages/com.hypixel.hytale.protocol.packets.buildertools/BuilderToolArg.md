# BuilderToolArg

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools

public class BuilderToolArg

Composite builder tool argument supporting multiple typed sub-arguments (bool, float, int, string, block, mask, brush shape/origin/axis, rotation, option). Discriminated by `argType` field. Serializable with nullable bitfield protocol.

## Fields

- required | boolean
- argType | BuilderToolArgType
- boolArg | BuilderToolBoolArg
- floatArg | BuilderToolFloatArg
- intArg | BuilderToolIntArg
- stringArg | BuilderToolStringArg
- blockArg | BuilderToolBlockArg
- maskArg | BuilderToolMaskArg
- brushShapeArg | BuilderToolBrushShapeArg
- brushOriginArg | BuilderToolBrushOriginArg
- brushAxisArg | BuilderToolBrushAxisArg
- rotationArg | BuilderToolRotationArg
- optionArg | BuilderToolOptionArg

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolArg | Reads this struct from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this struct to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- clone() | BuilderToolArg | Creates a shallow copy
