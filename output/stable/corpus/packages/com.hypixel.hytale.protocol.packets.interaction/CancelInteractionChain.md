# CancelInteractionChain

Type: class | Package: com.hypixel.hytale.protocol.packets.interaction | Implements: Packet, ToClientPacket

public class CancelInteractionChain implements Packet, ToClientPacket

Server-to-client packet (ID 291) canceling an active interaction chain. Contains the chain ID and optional forked chain ID.

Also in this package: DismountNPC, MountNPC, PlayInteractionFor, SyncInteractionChain, SyncInteractionChains

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static CancelInteractionChain deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public CancelInteractionChain clone()
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
public int chainId
public ForkedChainId forkedId
