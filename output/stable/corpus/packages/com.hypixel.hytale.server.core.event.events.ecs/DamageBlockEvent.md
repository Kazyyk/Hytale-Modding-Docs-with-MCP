# DamageBlockEvent

Type: class | Package: com.hypixel.hytale.server.core.event.events.ecs | Extends: CancellableEcsEvent

public class DamageBlockEvent extends CancellableEcsEvent

A cancellable ECS event fired when the corresponding DamageBlock action occurs.

## Fields

- @Nullable private final ItemStack itemInHand
- @Nonnull private Vector3i targetBlock
- @Nonnull private final BlockType blockType
- private final float currentDamage
- private float damage

## Methods

- public DamageBlockEvent(@Nullable ItemStack itemInHand, @Nonnull Vector3i targetBlock, @Nonnull BlockType blockType, float currentDamage, float damage)
- @Nullable public ItemStack getItemInHand()
- @Nonnull public Vector3i getTargetBlock()
- public void setTargetBlock(@Nonnull Vector3i targetBlock)
- @Nonnull public BlockType getBlockType()
- public float getCurrentDamage()
- public float getDamage()
- public void setDamage(float damage)
