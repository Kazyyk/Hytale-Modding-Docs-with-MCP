# BuilderToolLaserPointer

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools | Implements: P, a, c, k, e, t, ,,  , T, o, C, l, i, e, n, t, P, a, c, k, e, t

public class BuilderToolLaserPointer implements Packet, ToClientPacket

Renders a laser pointer line between two 3D points for a player with configurable color and duration.

## Packet Info

- Packet ID | 419
- Direction | server-to-client
- Channel | Default

## Fields

- playerNetworkId | int
- startX | float
- startY | float
- startZ | float
- endX | float
- endY | float
- endZ | float
- color | int
- durationMs | int

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolLaserPointer | Reads this packet from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this packet to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- getId() | int | Returns the packet ID (`419`)
- getChannel() | NetworkChannel | Returns `NetworkChannel.Default

Also in this package: Axis, BrushAxis, BrushOrigin, BrushShape, BuilderToolAction, BuilderToolArg, BuilderToolArgGroup, BuilderToolArgType, BuilderToolArgUpdate, BuilderToolBlockArg, BuilderToolBoolArg, BuilderToolBrushAxisArg, BuilderToolBrushData, BuilderToolBrushOriginArg, BuilderToolBrushShapeArg, BuilderToolEntityAction, BuilderToolExtrudeAction, BuilderToolFloatArg, BuilderToolGeneralAction, BuilderToolHideAnchors (and 26 more)

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static BuilderToolLaserPointer deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public BuilderToolLaserPointer clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int PACKET_ID
public static final boolean IS_COMPRESSED
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public int playerNetworkId
public float startX
public float startY
public float startZ
public float endX
public float endY
public float endZ
public int color
public int durationMs
