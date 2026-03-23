# BreakBlockEvent

Type: class | Package: com.hypixel.hytale.server.core.event.events.ecs | Extends: CancellableEcsEvent

public class BreakBlockEvent extends CancellableEcsEvent

A cancellable ECS event fired when the corresponding BreakBlock action occurs.

## Fields

- @Nullable private final ItemStack itemInHand
- @Nonnull private Vector3i targetBlock
- @Nonnull private final BlockType blockType

## Methods

- public BreakBlockEvent(@Nullable ItemStack itemInHand, @Nonnull Vector3i targetBlock, @Nonnull BlockType blockType)
- @Nullable public ItemStack getItemInHand()
- @Nonnull public Vector3i getTargetBlock()
- @Nonnull public BlockType getBlockType()
- public void setTargetBlock(@Nonnull Vector3i targetBlock)
