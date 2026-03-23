# BiomeDataSystem

Type: class | Package: com.hypixel.hytale.server.worldgen | Extends: DelayedEntitySystem<EntityStore>

public class BiomeDataSystem extends DelayedEntitySystem<EntityStore>

ECS system handling BiomeData tick processing.

## Methods

- public BiomeDataSystem()
- @Override public void tick(float dt,
        int index,
        @Nonnull ArchetypeChunk<EntityStore> archetypeChunk,
        @Nonnull Store<EntityStore> store,
        @Nonnull CommandBuffer<EntityStore> commandBuffer)` |
| `@Nullable @Override public` | `Query<EntityStore>` | `getQuery()` |

Also in this package: ChunkGeneratorResource, HytaleWorldGenProvider, SeedStringResource, WorldGenBuilderCodec, WorldGenConfig, WorldGenConstants

Complete API:
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  public Query<EntityStore> getQuery()
