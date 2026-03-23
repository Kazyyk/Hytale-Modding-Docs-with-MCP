# MergeWaitingBlocksSystem

Type: class | Package: com.hypixel.hytale.builtin.blocktick.system | Extends: RefSystem<ChunkStore>

public class MergeWaitingBlocksSystem extends RefSystem<ChunkStore>

ECS system handling MergeWaitingBlocks tick processing.

## Constants

- @Nonnull private static final ComponentType<ChunkStore, WorldChunk> COMPONENT_TYPE

## Methods

- @Override public Query<ChunkStore> getQuery()
- @Override public void onEntityAdded(@Nonnull Ref<ChunkStore> ref, @Nonnull AddReason reason, @Nonnull Store<ChunkStore> store, @Nonnull CommandBuffer<ChunkStore> commandBuffer)
- @Override public void onEntityRemove(@Nonnull Ref<ChunkStore> ref, @Nonnull RemoveReason reason, @Nonnull Store<ChunkStore> store, @Nonnull CommandBuffer<ChunkStore> commandBuffer)
- public static void mergeTickingBlocks(@Nonnull ChunkStore store, int x, int z)
