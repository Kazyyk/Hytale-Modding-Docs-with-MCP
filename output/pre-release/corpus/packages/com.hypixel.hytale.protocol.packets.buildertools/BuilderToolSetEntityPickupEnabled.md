# BuilderToolSetEntityPickupEnabled

Type: class | Package: com.hypixel.hytale.protocol.packets.buildertools | Implements: P, a, c, k, e, t, ,,  , T, o, S, e, r, v, e, r, P, a, c, k, e, t

public class BuilderToolSetEntityPickupEnabled implements Packet, ToServerPacket

Toggles pickup capability on an entity.

## Packet Info

- Packet ID | 426
- Direction | client-to-server
- Channel | Default

## Fields

- entityId | int
- enabled | boolean

## Protocol Methods

- deserialize(ByteBuf, int) | BuilderToolSetEntityPickupEnabled | Reads this packet from a buffer at the given offset
- serialize(ByteBuf) | void | Writes this packet to a buffer
- computeSize() | int | Returns the serialized size in bytes
- validateStructure(ByteBuf, int) | ValidationResult | Validates buffer structure without full deserialization
- getId() | int | Returns the packet ID (`426`)
- getChannel() | NetworkChannel | Returns `NetworkChannel.Default

Also in this package: Axis, BrushAxis, BrushOrigin, BrushShape, BuilderToolAction, BuilderToolArg, BuilderToolArgType, BuilderToolArgUpdate, BuilderToolBlockArg, BuilderToolBoolArg, BuilderToolBrushAxisArg, BuilderToolBrushOriginArg, BuilderToolBrushShapeArg, BuilderToolEntityAction, BuilderToolExtrudeAction, BuilderToolFloatArg, BuilderToolGeneralAction, BuilderToolHideAnchors, BuilderToolIntArg, BuilderToolLaserPointer (and 28 more)

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static BuilderToolSetEntityPickupEnabled deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public BuilderToolSetEntityPickupEnabled clone()
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
public int entityId
public boolean enabled
