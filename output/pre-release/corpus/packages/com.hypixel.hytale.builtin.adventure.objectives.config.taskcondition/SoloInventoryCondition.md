# SoloInventoryCondition

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.config.taskcondition | Extends: TaskConditionAsset

public class SoloInventoryCondition extends TaskConditionAsset

## Fields

- public static final BuilderCodec<SoloInventoryCondition> CODEC
- protected BlockTagOrItemIdField blockTypeOrTagTask
- protected int quantity
- protected boolean consumeOnCompletion
- protected boolean holdInHand

## Methods

- public BlockTagOrItemIdField getBlockTypeOrTagTask()
- public int getQuantity()
- public boolean isConsumeOnCompletion()
- public boolean isHoldInHand()
- @Override public boolean isConditionFulfilled(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> ref, Set<UUID> objectivePlayers)
- @Override public void consumeCondition(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> ref, Set<UUID> objectivePlayers)
- @Override public boolean equals(Object o)
- @Override public int hashCode()
- @Nonnull @Override public String toString()
