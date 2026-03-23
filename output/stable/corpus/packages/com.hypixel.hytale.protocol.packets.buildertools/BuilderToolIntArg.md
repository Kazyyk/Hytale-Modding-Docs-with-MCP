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

Also in this package: Axis, BrushAxis, BrushOrigin, BrushShape, BuilderToolAction, BuilderToolArg, BuilderToolArgGroup, BuilderToolArgType, BuilderToolArgUpdate, BuilderToolBlockArg, BuilderToolBoolArg, BuilderToolBrushAxisArg, BuilderToolBrushData, BuilderToolBrushOriginArg, BuilderToolBrushShapeArg, BuilderToolEntityAction, BuilderToolExtrudeAction, BuilderToolFloatArg, BuilderToolGeneralAction, BuilderToolHideAnchors (and 26 more)

Complete API:
  public static BuilderToolIntArg deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public BuilderToolIntArg clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public int defaultValue
public int min
public int max
