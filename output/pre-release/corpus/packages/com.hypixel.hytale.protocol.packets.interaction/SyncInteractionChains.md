# SyncInteractionChains

Type: class | Package: com.hypixel.hytale.protocol.packets.interaction | Implements: Packet, ToClientPacket

public class SyncInteractionChains implements Packet, ToClientPacket

Server-to-client packet (ID 292) synchronizing multiple interaction chains as an array of `SyncInteractionChain` packets.

Also in this package: CancelInteractionChain, DismountNPC, MountNPC, PlayInteractionFor, SyncInteractionChain

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static SyncInteractionChains deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public SyncInteractionChains clone()
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
public SyncInteractionChain[] updates
