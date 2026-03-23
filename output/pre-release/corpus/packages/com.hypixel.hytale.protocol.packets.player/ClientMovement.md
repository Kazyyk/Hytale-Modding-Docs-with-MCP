# ClientMovement

Type: class | Package: com.hypixel.hytale.protocol.packets.player | Extends: java.lang.Object | Implements: Packet, ToServerPacket

public class ClientMovement implements Packet, ToServerPacket

Sent by the client each tick with the player's current movement state, position, orientation, velocity, and mount information.

## Protocol Constants

- PACKET_ID | 108
- IS_COMPRESSED | false

## Methods


@Override
public int getId()

Returns the packet ID (`108`).


@Override
public NetworkChannel getChannel()

Returns `NetworkChannel.Default`.


@Nonnull
public static ClientMovement deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ClientMovement` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the number of bytes consumed by this packet in the buffer.


@Override
public void serialize(@Nonnull ByteBuf buf)

Serializes this packet into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.


public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)

Validates buffer structure without full deserialization.


public ClientMovement clone()

Creates a deep copy of this packet.

## Related Types

- `Packet` -- base packet interface
- `ToServerPacket` -- directional marker interface

Also in this package: ClearDebugShapes, ClientPlaceBlock, ClientReady, ClientTeleport, DamageInfo, DisplayDebug, JoinWorld, LoadHotbar, MouseInteraction, RemoveMapMarker, ReticleEvent, SaveHotbar, SetBlockPlacementOverride, SetClientId, SetGameMode, SetMovementStates, SyncPlayerPreferences, UpdateMemoriesFeatureStatus, UpdateMovementSettings

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static ClientMovement deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public ClientMovement clone()
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
public MovementStates movementStates
public HalfFloatPosition relativePosition
public Position absolutePosition
public Direction bodyOrientation
public Direction lookOrientation
public TeleportAck teleportAck
public Position wishMovement
public Vector3d velocity
public int mountedTo
public MovementStates riderMovementStates
