# SyncInteractionChain

Type: class | Package: com.hypixel.hytale.protocol.packets.interaction | Implements: Packet, ToClientPacket

public class SyncInteractionChain implements Packet, ToClientPacket

Server-to-client packet (ID 290) synchronizing a single interaction chain state. Contains chain ID, interaction ID string, chain time, and optional forked chain data.

Also in this package: CancelInteractionChain, DismountNPC, MountNPC, PlayInteractionFor, SyncInteractionChains

Complete API:
  public static SyncInteractionChain deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public SyncInteractionChain clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public int activeHotbarSlot
public int activeUtilitySlot
public int activeToolsSlot
public String itemInHandId
public String utilityItemId
public String toolsItemId
public boolean initial
public boolean desync
public int overrideRootInteraction
public InteractionType interactionType
public int equipSlot
public int chainId
public ForkedChainId forkedId
public InteractionChainData data
public InteractionState state
public SyncInteractionChain[] newForks
public int operationBaseIndex
public InteractionSyncData[] interactionData
