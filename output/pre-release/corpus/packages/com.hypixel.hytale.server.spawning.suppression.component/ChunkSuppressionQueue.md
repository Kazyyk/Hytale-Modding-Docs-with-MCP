# ChunkSuppressionQueue

Type: class | Package: com.hypixel.hytale.server.spawning.suppression.component | Implements: Resource<ChunkStore>

public class ChunkSuppressionQueue implements Resource<ChunkStore>

Implementation of `Resource<ChunkStore>`.

## Methods

- getResourceType() | ResourceType<ChunkStore, ChunkSuppressionQueue> | static public method.
- getToAdd() | List<Entry<Ref<ChunkStore>, ChunkSuppressionEntry>> | public method.
- getToRemove() | List<Ref<ChunkStore>> | public method.
- queueForAdd(@Nonnull Ref<ChunkStore> reference, @Nonnull ChunkSuppressionEntry entry) | void | public method.
- queueForRemove(Ref<ChunkStore> reference) | void | public method.
- clone() | Resource<ChunkStore> | public method.
