# BlockConditionInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Extends: SimpleBlockInteraction

public class BlockConditionInteraction extends SimpleBlockInteraction

Tests the target block against an array of `BlockMatcher` conditions. Succeeds (runs `Next`) if any matcher passes; fails otherwise. Each matcher can test against block ID, block state, block tag, and/or block face (with optional rotation-aware face matching via the `StaticFace` flag).

## Codec

`BlockConditionInteraction.CODEC` -- `BuilderCodec<BlockConditionInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`

Also in this package: AddItemInteraction, AngledWielding, ApplyForceInteraction, BlockIdMatcher, BlockMatcher, BreakBlockInteraction, ChainingInteraction, ChainingTag, ChangeBlockInteraction, ChangeStateInteraction, ChargingInteraction, ChargingTag, CooldownConditionInteraction, CostType, CycleBlockGroupInteraction, Data, DestroyBlockInteraction, ExplodeInteraction, FirstClickInteraction, Force (and 13 more)

Complete API:
  protected void interactWithBlock(World world, CommandBuffer<EntityStore> commandBuffer, InteractionType type, InteractionContext context, ItemStack itemInHand, Vector3i targetBlock, CooldownHandler cooldownHandler)
  protected void simulateInteractWithBlock(InteractionType type, InteractionContext context, ItemStack itemInHand, World world, Vector3i targetBlock)
  private void doInteraction(InteractionContext context, World world, Vector3i targetBlock, BlockFace face)
  protected Interaction generatePacket()
  protected void configurePacket(Interaction packet)
  public String toString()

Fields:
public static final BuilderCodec<BlockConditionInteraction> CODEC
private BlockConditionInteraction.BlockMatcher[] matchers
