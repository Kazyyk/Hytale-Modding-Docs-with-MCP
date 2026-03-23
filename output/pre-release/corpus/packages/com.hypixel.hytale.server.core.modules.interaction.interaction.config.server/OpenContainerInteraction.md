# OpenContainerInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server | Extends: SimpleBlockInteraction

public class OpenContainerInteraction extends SimpleBlockInteraction

Opens the item container of the block being interacted with. Locates the `ItemContainerBlock` component via chunk block components and opens a `ContainerBlockWindow` for the player. Handles `OpenWindow`/`CloseWindow` block interaction states and plays associated sound events.

## Constants

- OPEN_WINDOW | String | "OpenWindow"
- CLOSE_WINDOW | String | "CloseWindow"

## Methods

- protected void interactWithBlock(@Nonnull World world, @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull Vector3i pos, @Nonnull CooldownHandler cooldownHandler)
- protected void simulateInteractWithBlock(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull World world, @Nonnull Vector3i targetBlock)
