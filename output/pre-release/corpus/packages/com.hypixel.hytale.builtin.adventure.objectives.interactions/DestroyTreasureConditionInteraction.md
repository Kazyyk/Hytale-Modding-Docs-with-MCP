# DestroyTreasureConditionInteraction

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.interactions | Extends: SimpleBlockInteraction

public class DestroyTreasureConditionInteraction extends SimpleBlockInteraction

Server-authoritative block interaction that checks whether a treasure chest block is eligible for destruction. Registered as the `"DestroyTreasureCondition"` interaction type. The interaction succeeds (state `Finished`) only if the targeted block has a `TreasureChestBlock` component and `canDestroy` returns `true` for the interacting player; otherwise the state is set to `Failed`.

## Fields

- public static final BuilderCodec<DestroyTreasureConditionInteraction> CODEC

## Methods

- @Nonnull @Override public WaitForDataFrom getWaitForDataFrom()
- @Override protected void interactWithBlock(@Nonnull World world, @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull Vector3i pos, @Nonnull CooldownHandler cooldownHandler)
- @Override protected void simulateInteractWithBlock(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull World world, @Nonnull Vector3i targetBlock)

## Behavior

- Returns `WaitForDataFrom.Server`, meaning the client waits for the server to determine the interaction result.
- Looks up the `TreasureChestBlock` component on the block entity at the targeted position via chunk store.
- Delegates the destroy-eligibility check to `TreasureChestBlock.canDestroy`.

## Related Types

- OpenTreasureContainerInteraction -- companion interaction for opening treasure containers
- TreasureChestBlock -- the component this interaction queries

Also in this package: CanBreakRespawnPointInteraction, OpenTreasureContainerInteraction, StartObjectiveInteraction

Complete API:
  public WaitForDataFrom getWaitForDataFrom()
  protected void interactWithBlock(World world, CommandBuffer<EntityStore> commandBuffer, InteractionType type, InteractionContext context, ItemStack itemInHand, Vector3i pos, CooldownHandler cooldownHandler)
  protected void simulateInteractWithBlock(InteractionType type, InteractionContext context, ItemStack itemInHand, World world, Vector3i targetBlock)

Fields:
public static final BuilderCodec<DestroyTreasureConditionInteraction> CODEC
