# DestroyConditionInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client.SimpleBlockInteraction

@Deprecated
public class DestroyConditionInteraction extends SimpleBlockInteraction

**Deprecated.** Checks if the target block is destroyable. If the block state implements `BreakValidatedBlockState` and `canDestroy` returns `false`, the interaction fails. Otherwise it succeeds. Waits for server data.

## Codec Properties

Inherits all codec properties from `SimpleBlockInteraction`. No additional properties.

## Methods


@Nonnull
@Override
public WaitForDataFrom getWaitForDataFrom()

Returns `WaitForDataFrom.Server`.


@Override
protected void interactWithBlock(@Nonnull World world, @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull Vector3i pos, @Nonnull CooldownHandler cooldownHandler)

Retrieves the block state at the target position. If the state is a `BreakValidatedBlockState` that disallows destruction, sets state to `Failed`. Otherwise sets state to `Finished`.


@Override
protected void simulateInteractWithBlock(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull World world, @Nonnull Vector3i targetBlock)

No-op for simulation.

## See Also

- `BreakValidatedBlockState` -- block state interface that validates destruction permission
