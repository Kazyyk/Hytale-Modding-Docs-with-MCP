# RandomTickSystem

Type: class | Package: com.hypixel.hytale.builtin.randomtick | Extends: EntityTickingSystem

public class RandomTickSystem extends EntityTickingSystem

## Fields

- private final ComponentType<ChunkStore,BlockSection> blockSelectionComponentType
- private final ComponentType<ChunkStore,ChunkSection> chunkSectionComponentType
- private final Query<ChunkStore> query

## Methods

- @Override public void tick(float dt, int index, ArchetypeChunk<ChunkStore> archetypeChunk, Store<ChunkStore> store, CommandBuffer<ChunkStore> commandBuffer)
- @Nullable @Override public Query<ChunkStore> getQuery()
