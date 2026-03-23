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

Also in this package: ChunkSuppressionEntry, SpawnSuppressionComponent, SpawnSuppressionController, SuppressionSpan

Complete API:
  public static ResourceType<ChunkStore,ChunkSuppressionQueue> getResourceType()
  public List<Entry<Ref<ChunkStore>,ChunkSuppressionEntry>> getToAdd()
  public List<Ref<ChunkStore>> getToRemove()
  public void queueForAdd(Ref<ChunkStore> reference, ChunkSuppressionEntry entry)
  public void queueForRemove(Ref<ChunkStore> reference)
  public Resource<ChunkStore> clone()

Fields:
private final List<Entry<Ref<ChunkStore>,ChunkSuppressionEntry>> toAdd
private final List<Ref<ChunkStore>> toRemove
