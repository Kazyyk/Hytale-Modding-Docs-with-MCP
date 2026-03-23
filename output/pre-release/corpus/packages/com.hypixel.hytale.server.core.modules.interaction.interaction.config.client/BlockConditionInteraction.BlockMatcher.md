# BlockConditionInteraction.BlockMatcher

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Implements: NetworkSerializable<BlockMatcher>

public static class BlockConditionInteraction.BlockMatcher implements NetworkSerializable<BlockMatcher>

Matches a block against criteria including block identity (via `BlockIdMatcher`), face direction, and static face flag. When `staticFace` is false, the face matching accounts for the block's rotation.

Also in this package: AddItemInteraction, AngledWielding, ApplyForceInteraction, BlockConditionInteraction, BlockIdMatcher, BreakBlockInteraction, ChainingInteraction, ChainingTag, ChangeBlockInteraction, ChangeStateInteraction, ChargingInteraction, ChargingTag, CooldownConditionInteraction, CostType, CycleBlockGroupInteraction, Data, DestroyBlockInteraction, ExplodeInteraction, FirstClickInteraction, Force (and 13 more)

Complete API:
  public com.hypixel.hytale.protocol.BlockMatcher toPacket()
  public String toString()

Fields:
public static BuilderCodec<BlockConditionInteraction.BlockMatcher> CODEC
protected BlockConditionInteraction.BlockIdMatcher block
protected BlockFace face
protected boolean staticFace
