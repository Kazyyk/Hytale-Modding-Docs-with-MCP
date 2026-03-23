# UseBlockInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Extends: SimpleBlockInteraction

public class UseBlockInteraction extends SimpleBlockInteraction

Attempts to use the target block, executing any interactions configured on it. Fires `UseBlockEvent` and `LivingEntityUseBlockEvent` on the block's chunk. Delegates block interaction lookup and execution to the block type's interaction configuration.

## Codec

`UseBlockInteraction.CODEC` -- `BuilderCodec<UseBlockInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`

Also in this package: AddItemInteraction, AngledWielding, ApplyForceInteraction, BlockConditionInteraction, BlockIdMatcher, BlockMatcher, BreakBlockInteraction, ChainingInteraction, ChainingTag, ChangeBlockInteraction, ChangeStateInteraction, ChargingInteraction, ChargingTag, CooldownConditionInteraction, CostType, CycleBlockGroupInteraction, Data, DestroyBlockInteraction, ExplodeInteraction, FirstClickInteraction (and 13 more)

Complete API:
  protected void interactWithBlock(World world, CommandBuffer<EntityStore> commandBuffer, InteractionType type, InteractionContext context, ItemStack itemInHand, Vector3i targetBlock, CooldownHandler cooldownHandler)
  protected void simulateInteractWithBlock(InteractionType type, InteractionContext context, ItemStack itemInHand, World world, Vector3i targetBlock)
  private static void doInteraction(InteractionType type, InteractionContext context, World world, Vector3i targetBlock, boolean fireEvent)
  protected Interaction generatePacket()
  public String toString()

Fields:
public static final BuilderCodec<UseBlockInteraction> CODEC
