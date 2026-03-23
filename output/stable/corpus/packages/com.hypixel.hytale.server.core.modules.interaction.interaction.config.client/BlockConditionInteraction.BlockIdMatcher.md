# BlockConditionInteraction.BlockIdMatcher

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Implements: NetworkSerializable<BlockIdMatcher>

public static class BlockConditionInteraction.BlockIdMatcher implements NetworkSerializable<BlockIdMatcher>

Matches a block by ID, state, and/or tag. The `tag` field is resolved to a tag index via `AssetRegistry.getOrCreateTagIndex()` during decoding.

Also in this package: AddItemInteraction, AngledWielding, ApplyForceInteraction, BlockConditionInteraction, BlockMatcher, BreakBlockInteraction, ChainingInteraction, ChainingTag, ChangeBlockInteraction, ChangeStateInteraction, ChargingInteraction, ChargingTag, CooldownConditionInteraction, CostType, CycleBlockGroupInteraction, Data, DestroyBlockInteraction, ExplodeInteraction, FirstClickInteraction, Force (and 13 more)

Complete API:
  public com.hypixel.hytale.protocol.BlockIdMatcher toPacket()
  public String toString()

Fields:
public static BuilderCodec<BlockConditionInteraction.BlockIdMatcher> CODEC
protected String id
protected String state
protected String tag
protected int tagIndex
