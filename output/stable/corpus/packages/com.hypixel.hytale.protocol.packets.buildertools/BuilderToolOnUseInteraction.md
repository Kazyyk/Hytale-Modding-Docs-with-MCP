# BuilderToolOnUseInteraction

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools | Implements: P, a, c, k, e, t, ,,  , T, o, S, e, r, v, e, r, P, a, c, k, e, t

public class BuilderToolOnUseInteraction implements Packet, ToServerPacket

Sent when the player uses a builder tool interaction at a block position. Includes interaction type, position, paint mode offsets, and modifier key states.

## Packet Info

- Packet ID | 413
- Direction | client-to-server
- Channel | Default

## Fields

- type | InteractionType
- x | int
- y | int
- z | int
- offsetForPaintModeX | int
- offsetForPaintModeY | int
- offsetForPaintModeZ | int
- isAltPlaySculptBrushModDown | boolean
- isHoldDownInteraction | boolean
- isDoServerRaytraceForPosition | boolean

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolOnUseInteraction | Reads this packet from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this packet to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- getId() | int | Returns the packet ID (`413`)
- getChannel() | NetworkChannel | Returns `NetworkChannel.Default

Also in this package: Axis, BrushAxis, BrushOrigin, BrushShape, BuilderToolAction, BuilderToolArg, BuilderToolArgGroup, BuilderToolArgType, BuilderToolArgUpdate, BuilderToolBlockArg, BuilderToolBoolArg, BuilderToolBrushAxisArg, BuilderToolBrushData, BuilderToolBrushOriginArg, BuilderToolBrushShapeArg, BuilderToolEntityAction, BuilderToolExtrudeAction, BuilderToolFloatArg, BuilderToolGeneralAction, BuilderToolHideAnchors (and 26 more)

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static BuilderToolOnUseInteraction deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public BuilderToolOnUseInteraction clone()
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
public InteractionType type
public int x
public int y
public int z
public int offsetForPaintModeX
public int offsetForPaintModeY
public int offsetForPaintModeZ
public boolean isAltPlaySculptBrushModDown
public boolean isHoldDownInteraction
public boolean isDoServerRaytraceForPosition
public boolean isShowEditNotifications
public int maxLengthToolIgnoreHistory
public float raycastOriginX
public float raycastOriginY
public float raycastOriginZ
public float raycastDirectionX
public float raycastDirectionY
public float raycastDirectionZ
