# ClipboardEntityChange

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools | Extends: java.lang.Object

public class ClipboardEntityChange

Packet describing an entity change within a clipboard operation.

Also in this package: Axis, BrushAxis, BrushOrigin, BrushShape, BuilderToolAction, BuilderToolArg, BuilderToolArgType, BuilderToolArgUpdate, BuilderToolBlockArg, BuilderToolBoolArg, BuilderToolBrushAxisArg, BuilderToolBrushOriginArg, BuilderToolBrushShapeArg, BuilderToolEntityAction, BuilderToolExtrudeAction, BuilderToolFloatArg, BuilderToolGeneralAction, BuilderToolHideAnchors, BuilderToolIntArg, BuilderToolLaserPointer (and 28 more)

Complete API:
  public static ClipboardEntityChange deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public ClipboardEntityChange clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public float x
public float y
public float z
public int blockId
public Model model
public String itemId
public Direction bodyOrientation
public Direction lookOrientation
public float scale
