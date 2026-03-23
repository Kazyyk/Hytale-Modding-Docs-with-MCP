# BuilderToolBrushData

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools

public class BuilderToolBrushData

Complete brush configuration data containing dimensions, shape, origin, rotation, mirroring, material, favorite materials, and multiple mask types. Used by `BuilderToolState` to define brush parameters.

## Fields

- width | BuilderToolIntArg
- height | BuilderToolIntArg
- thickness | BuilderToolIntArg
- capped | BuilderToolBoolArg
- shape | BuilderToolBrushShapeArg
- origin | BuilderToolBrushOriginArg
- originRotation | BuilderToolBoolArg
- rotationAxis | BuilderToolBrushAxisArg
- rotationAngle | BuilderToolRotationArg
- mirrorAxis | BuilderToolBrushAxisArg
- material | BuilderToolBlockArg
- favoriteMaterials | BuilderToolBlockArg[]
- mask | BuilderToolMaskArg
- maskAbove | BuilderToolMaskArg
- maskNot | BuilderToolMaskArg
- maskBelow | BuilderToolMaskArg
- maskAdjacent | BuilderToolMaskArg
- maskNeighbor | BuilderToolMaskArg
- maskCommands | BuilderToolStringArg[]
- useMaskCommands | BuilderToolBoolArg
- invertMask | BuilderToolBoolArg

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolBrushData | Reads this struct from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this struct to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- clone() | BuilderToolBrushData | Creates a shallow copy
