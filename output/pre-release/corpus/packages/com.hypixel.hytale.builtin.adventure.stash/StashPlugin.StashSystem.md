# StashPlugin.StashSystem

Type: class | Package: com.hypixel.hytale.builtin.adventure.stash | Extends: RefSystem<ChunkStore>

private static class StashPlugin.StashSystem extends RefSystem<ChunkStore>

Inner ECS system of `StashPlugin` that runs on the chunk store. Registered during `StashPlugin.setup()`. Listens for chunk-store entities that have both an `ItemContainerBlock` and a `BlockModule.BlockStateInfo` component. When such an entity is added (e.g., a stash container block placed or loaded into the world), the system populates the container's inventory from its drop list by calling `StashPlugin.stash`, provided the world is not in Creative mode.

## Fields

- @Nonnull private final ComponentType<ChunkStore, ItemContainerBlock> itemContainerStateComponentType
- @Nonnull private final ComponentType<ChunkStore, BlockModule.BlockStateInfo> blockStateInfoComponentType
- @Nonnull private final Query<ChunkStore> query

## Constructors

- public StashSystem(@Nonnull ComponentType<ChunkStore, ItemContainerBlock> itemContainerStateComponentType)

## Methods

- @Override public Query<ChunkStore> getQuery()
- @Override public void onEntityAdded(@Nonnull Ref<ChunkStore> ref, @Nonnull AddReason reason, @Nonnull Store<ChunkStore> store, @Nonnull CommandBuffer<ChunkStore> commandBuffer)
- @Override public void onEntityRemove(@Nonnull Ref<ChunkStore> ref, @Nonnull RemoveReason reason, @Nonnull Store<ChunkStore> store, @Nonnull CommandBuffer<ChunkStore> commandBuffer)

## Behavior

- The query is `Query.and(itemContainerStateComponentType, blockStateInfoComponentType)`.
- `onEntityAdded` skips processing if the world game mode is `GameMode.Creative`.
- Reads the `StashGameplayConfig` from the world's gameplay config to determine whether to clear the container drop list after populating.
- Delegates to `StashPlugin.stash` for the actual item placement logic.
- `onEntityRemove` is a no-op.

## Related Types

- StashPlugin -- the enclosing plugin class
- StashGameplayConfig -- provides the `clearContainerDropList` configuration
