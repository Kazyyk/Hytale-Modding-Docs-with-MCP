# FloodFillEntryPoolProviderSimple

Type: class | Package: com.hypixel.hytale.server.spawning.util | Implements: Resource<EntityStore>

public class FloodFillEntryPoolProviderSimple implements Resource<EntityStore>

ECS resource that provides a `FloodFillEntryPoolSimple` for reuse during flood-fill spawn position calculation. Avoids repeated allocation of int arrays.

## Methods

- public static ResourceType<EntityStore, FloodFillEntryPoolProviderSimple> getResourceType()
- @Nonnull public FloodFillEntryPoolSimple getPool()
- @Nonnull @Override public Resource<EntityStore> clone()

Also in this package: ChunkColumnMask, Debug, FloodFillEntryPoolSimple, FloodFillPositionSelector, LightRangePredicate, RandomChunkColumnIterator, SortBufferProvider, WeightedPosition

Complete API:
  public static ResourceType<EntityStore,FloodFillEntryPoolProviderSimple> getResourceType()
  public FloodFillEntryPoolSimple getPool()
  public Resource<EntityStore> clone()

Fields:
private final FloodFillEntryPoolSimple pool
