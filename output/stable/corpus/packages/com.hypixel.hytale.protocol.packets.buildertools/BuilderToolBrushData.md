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

Also in this package: Axis, BrushAxis, BrushOrigin, BrushShape, BuilderToolAction, BuilderToolArg, BuilderToolArgGroup, BuilderToolArgType, BuilderToolArgUpdate, BuilderToolBlockArg, BuilderToolBoolArg, BuilderToolBrushAxisArg, BuilderToolBrushOriginArg, BuilderToolBrushShapeArg, BuilderToolEntityAction, BuilderToolExtrudeAction, BuilderToolFloatArg, BuilderToolGeneralAction, BuilderToolHideAnchors, BuilderToolIntArg (and 26 more)

Complete API:
  public static BuilderToolBrushData deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public BuilderToolBrushData clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public BuilderToolIntArg width
public BuilderToolIntArg height
public BuilderToolIntArg thickness
public BuilderToolBoolArg capped
public BuilderToolBrushShapeArg shape
public BuilderToolBrushOriginArg origin
public BuilderToolBoolArg originRotation
public BuilderToolBrushAxisArg rotationAxis
public BuilderToolRotationArg rotationAngle
public BuilderToolBrushAxisArg mirrorAxis
public BuilderToolBlockArg material
public BuilderToolBlockArg[] favoriteMaterials
public BuilderToolMaskArg mask
public BuilderToolMaskArg maskAbove
public BuilderToolMaskArg maskNot
public BuilderToolMaskArg maskBelow
public BuilderToolMaskArg maskAdjacent
public BuilderToolMaskArg maskNeighbor
public BuilderToolStringArg[] maskCommands
public BuilderToolBoolArg useMaskCommands
public BuilderToolBoolArg invertMask
