# CycleBlockGroupInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Extends: SimpleBlockInteraction

public class CycleBlockGroupInteraction extends SimpleBlockInteraction

Cycles the target block through its block group (set of related block types). Looks up the block's `BlockGroup`, finds the current index, and replaces the block with the next entry in the group (wrapping around). Decreases the held item's durability if applicable. Plays the block's hit sound event on successful cycle.

## Codec

`CycleBlockGroupInteraction.CODEC` -- `BuilderCodec<CycleBlockGroupInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`

Also in this package: AddItemInteraction, AngledWielding, ApplyForceInteraction, BlockConditionInteraction, BlockIdMatcher, BlockMatcher, BreakBlockInteraction, ChainingInteraction, ChainingTag, ChangeBlockInteraction, ChangeStateInteraction, ChargingInteraction, ChargingTag, CooldownConditionInteraction, CostType, Data, DestroyBlockInteraction, ExplodeInteraction, FirstClickInteraction, Force (and 13 more)

Complete API:
  protected void interactWithBlock(World world, CommandBuffer<EntityStore> commandBuffer, InteractionType type, InteractionContext context, ItemStack heldItemStack, Vector3i targetBlock, CooldownHandler cooldownHandler)
  protected void simulateInteractWithBlock(InteractionType type, InteractionContext context, ItemStack itemInHand, World world, Vector3i targetBlock)
  public String toString()

Fields:
private static final int SET_SETTINGS
public static final BuilderCodec<CycleBlockGroupInteraction> CODEC
