# PlaceFluidInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Extends: SimpleBlockInteraction

public class PlaceFluidInteraction extends SimpleBlockInteraction

Places a specified fluid at the target position. Configured via the `FluidToPlace` codec field. Validates the fluid type and placement position, checks world config permissions, and triggers fluid ticking after placement.

## Codec

`PlaceFluidInteraction.CODEC` -- `BuilderCodec<PlaceFluidInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`

Also in this package: AddItemInteraction, AngledWielding, ApplyForceInteraction, BlockConditionInteraction, BlockIdMatcher, BlockMatcher, BreakBlockInteraction, ChainingInteraction, ChainingTag, ChangeBlockInteraction, ChangeStateInteraction, ChargingInteraction, ChargingTag, CooldownConditionInteraction, CostType, CycleBlockGroupInteraction, Data, DestroyBlockInteraction, ExplodeInteraction, FirstClickInteraction (and 13 more)

Complete API:
  public String getFluidKey()
  public WaitForDataFrom getWaitForDataFrom()
  protected void interactWithBlock(World world, CommandBuffer<EntityStore> commandBuffer, InteractionType type, InteractionContext context, ItemStack itemInHand, Vector3i targetBlock, CooldownHandler cooldownHandler)
  protected void simulateInteractWithBlock(InteractionType type, InteractionContext context, ItemStack itemInHand, World world, Vector3i targetBlock)
  public boolean needsRemoteSync()
  public String toString()

Fields:
public static final BuilderCodec<PlaceFluidInteraction> CODEC
protected String fluidKey
protected boolean removeItemInHand
