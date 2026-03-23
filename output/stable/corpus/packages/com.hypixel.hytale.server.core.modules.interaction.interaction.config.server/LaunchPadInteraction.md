# LaunchPadInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client.SimpleBlockInteraction

public class LaunchPadInteraction extends SimpleBlockInteraction

Applies launch pad forces to the interacting entity. Reads the `LaunchPad` block state component from the target block's block entity, sets the entity's velocity to the configured launch values using `ChangeVelocityType.Set`, and spawns a "Splash" particle effect at the block position. Respects the `isPlayersOnly` flag on the launch pad state. Waits for server data.

## Codec Properties

Inherits all codec properties from `SimpleBlockInteraction`. No additional properties.

## Methods


@Nonnull
@Override
public WaitForDataFrom getWaitForDataFrom()

Returns `WaitForDataFrom.Server`.


@Override
protected void interactWithBlock(@Nonnull World world, @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull Vector3i targetBlock, @Nonnull CooldownHandler cooldownHandler)

Reads the `LaunchPad` state from the block entity, checks the players-only flag, sets entity velocity, and spawns splash particles within a 75-unit radius.


@Override
protected void simulateInteractWithBlock(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull World world, @Nonnull Vector3i targetBlock)

No-op for simulation.

## See Also

- `LaunchPad` -- block state component holding velocity configuration
- `Velocity` -- entity component that receives the velocity instruction
