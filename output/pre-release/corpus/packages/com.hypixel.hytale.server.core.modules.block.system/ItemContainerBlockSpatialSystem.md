# ItemContainerBlockSpatialSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.block.system | Extends: SpatialSystem<ChunkStore>

public class ItemContainerBlockSpatialSystem extends SpatialSystem<ChunkStore>

Spatial system that maintains a KD-tree index of block entities that have an `ItemContainerBlock` component. Only rebuilds the index when `BlockStateInfoNeedRebuild` is flagged. Computes world positions from `BlockStateInfo` chunk reference and block index.

## Methods

- public Vector3d getPosition(ArchetypeChunk<ChunkStore> archetypeChunk, int index)
- public Query<ChunkStore> getQuery()

## Relationships

- Extends `SpatialSystem<ChunkStore>`
- Queries for ItemContainerBlock
