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

Also in this package: Axis, BrushAxis, BrushOrigin, BrushShape, BuilderToolAction, BuilderToolArgType, BuilderToolArgUpdate, BuilderToolBlockArg, BuilderToolBoolArg, BuilderToolBrushAxisArg, BuilderToolBrushOriginArg, BuilderToolBrushShapeArg, BuilderToolEntityAction, BuilderToolExtrudeAction, BuilderToolFloatArg, BuilderToolGeneralAction, BuilderToolHideAnchors, BuilderToolIntArg, BuilderToolLaserPointer, BuilderToolLineAction (and 28 more)

Complete API:
  public static BuilderToolArg deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public BuilderToolArg clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public boolean required
public String id
public BuilderToolArgType argType
public BuilderToolBoolArg boolArg
public BuilderToolFloatArg floatArg
public BuilderToolIntArg intArg
public BuilderToolStringArg stringArg
public BuilderToolBlockArg blockArg
public BuilderToolMaskArg maskArg
public BuilderToolBrushShapeArg brushShapeArg
public BuilderToolBrushOriginArg brushOriginArg
public BuilderToolBrushAxisArg brushAxisArg
public BuilderToolRotationArg rotationArg
public BuilderToolOptionArg optionArg
