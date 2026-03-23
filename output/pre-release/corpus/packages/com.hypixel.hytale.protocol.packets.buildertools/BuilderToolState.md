# BuilderToolState

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools | Implements: P, a, c, k, e, t, ,,  , T, o, C, l, i, e, n, t, P, a, c, k, e, t

public class BuilderToolState implements Packet, ToClientPacket

Server-to-client packet defining the full state of the builder tool including sections, args, and brush data.

## Packet Info

- Packet ID | 402
- Direction | server-to-client
- Channel | Default

## Fields

- token | int
- sections | BuilderToolState.Section[]

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolState | Reads this packet from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this packet to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- getId() | int | Returns the packet ID (`402`)
- getChannel() | NetworkChannel | Returns `NetworkChannel.Default

Also in this package: Axis, BrushAxis, BrushOrigin, BrushShape, BuilderToolAction, BuilderToolArg, BuilderToolArgType, BuilderToolArgUpdate, BuilderToolBlockArg, BuilderToolBoolArg, BuilderToolBrushAxisArg, BuilderToolBrushOriginArg, BuilderToolBrushShapeArg, BuilderToolEntityAction, BuilderToolExtrudeAction, BuilderToolFloatArg, BuilderToolGeneralAction, BuilderToolHideAnchors, BuilderToolIntArg, BuilderToolLaserPointer (and 28 more)

Complete API:
  public static BuilderToolState deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public BuilderToolState clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public String id
public boolean isBrush
public BuilderToolArg[] args
