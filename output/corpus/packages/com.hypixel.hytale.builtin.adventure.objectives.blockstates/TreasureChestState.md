# TreasureChestState

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.blockstates | Extends: ItemContainerState | Implements: BreakValidatedBlockState

public class TreasureChestState extends ItemContainerState implements BreakValidatedBlockState

## Fields

- public static final BuilderCodec<TreasureChestState> CODEC
- protected UUID objectiveUUID
- protected UUID chestUUID
- protected boolean opened

## Methods

- @Override public boolean canOpen(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
- @Override public boolean canDestroy(Ref<EntityStore> playerRef, ComponentAccessor<EntityStore> componentAccessor)
- @Override public void onOpen(Ref<EntityStore> ref, World world, Store<EntityStore> store)
- public void setOpened(boolean opened)
- public void setObjectiveData(UUID objectiveUUID, UUID chestUUID, List<ItemStack> itemStacks)
