# ItemContainerStateSpatialSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.block.system | Extends: SpatialSystem

public class ItemContainerStateSpatialSystem extends SpatialSystem<ChunkStore>

Spatial system for efficient positional queries.

## Constants

- QUERY | Query<ChunkStore>

## Accessors

- getPosition(ArchetypeChunk<ChunkStore> archetypeChunk, int index) | Vector3d | Accessor method.
- getQuery() | Query<ChunkStore> | Accessor method.

## Methods

- tick(float dt, int systemIndex, Store<ChunkStore> store) | void | Instance method.
