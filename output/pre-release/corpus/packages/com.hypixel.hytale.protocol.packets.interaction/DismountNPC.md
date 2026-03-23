# DismountNPC

Type: class | Package: com.hypixel.hytale.protocol.packets.interaction | Implements: Packet, ToServerPacket

public class DismountNPC implements Packet, ToServerPacket

Client-to-server packet (ID 295) requesting dismount from a mounted NPC. Contains no fields.

Also in this package: CancelInteractionChain, MountNPC, PlayInteractionFor, SyncInteractionChain, SyncInteractionChains

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static DismountNPC deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public DismountNPC clone()
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
