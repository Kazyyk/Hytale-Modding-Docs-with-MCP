# ClientPlaceBlock

Type: class | Package: com.hypixel.hytale.protocol.packets.player | Extends: java.lang.Object | Implements: Packet, ToServerPacket

public class ClientPlaceBlock implements Packet, ToServerPacket

Sent by the client when the player places a block, containing the target position, rotation, and block type ID.

## Protocol Constants

- PACKET_ID | 117
- IS_COMPRESSED | false

## Methods


@Override
public int getId()

Returns the packet ID (`117`).


@Override
public NetworkChannel getChannel()

Returns `NetworkChannel.Default`.


@Nonnull
public static ClientPlaceBlock deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ClientPlaceBlock` from the given buffer at the specified offset.


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


public ClientPlaceBlock clone()

Creates a deep copy of this packet.

## Related Types

- `Packet` -- base packet interface
- `ToServerPacket` -- directional marker interface

Also in this package: ClearDebugShapes, ClientMovement, ClientReady, ClientTeleport, DamageInfo, DisplayDebug, JoinWorld, LoadHotbar, MouseInteraction, RemoveMapMarker, ReticleEvent, SaveHotbar, SetBlockPlacementOverride, SetClientId, SetGameMode, SetMovementStates, SyncPlayerPreferences, UpdateMemoriesFeatureStatus, UpdateMovementSettings

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static ClientPlaceBlock deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public ClientPlaceBlock clone()
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
public BlockPosition position
public BlockRotation rotation
public int placedBlockId
