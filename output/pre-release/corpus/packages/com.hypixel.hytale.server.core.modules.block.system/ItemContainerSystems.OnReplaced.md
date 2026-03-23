# ItemContainerSystems.OnReplaced

Type: class | Package: com.hypixel.hytale.server.core.modules.block.system | Extends: EntityEventSystem<ChunkStore, BlockReplaceEvent>

public static class ItemContainerSystems.OnReplaced extends EntityEventSystem<ChunkStore, BlockReplaceEvent>

Handles `BlockReplaceEvent` for existing block entity refs. Moves all items from the old entity's item container to the new entity's item container.

## Relationships

- Inner class of ItemContainerSystems
- Operates on ItemContainerBlock

Also in this package: ItemContainerBlockSpatialSystem, ItemContainerSystems, OnAddedOrRemoved, OnReplacedHolder

Complete API:
  public void handle(int index, ArchetypeChunk<ChunkStore> archetypeChunk, Store<ChunkStore> store, CommandBuffer<ChunkStore> commandBuffer, BlockReplaceEvent event)
  public Query<ChunkStore> getQuery()

Fields:
private final ComponentType<ChunkStore,ItemContainerBlock> itemContainerBlockComponentType
