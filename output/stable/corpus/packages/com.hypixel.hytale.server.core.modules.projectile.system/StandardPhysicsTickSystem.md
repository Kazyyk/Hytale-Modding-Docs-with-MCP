# StandardPhysicsTickSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.projectile.system | Extends: EntityTickingSystem<EntityStore>

public class StandardPhysicsTickSystem extends EntityTickingSystem<EntityStore>

ECS system handling StandardPhysicsTick tick processing.

## Methods

- @Nonnull @Override public Set<Dependency<EntityStore>> getDependencies()
- @Nonnull @Override public Query<EntityStore> getQuery()
- @Override public void tick(float dt,
        int index,
        @Nonnull ArchetypeChunk<EntityStore> archetypeChunk,
        @Nonnull Store<EntityStore> store,
        @Nonnull CommandBuffer<EntityStore> commandBuffer)` |

Also in this package: EntityTrackerUpdate, PredictedProjectileSystems

Complete API:
  public Set<Dependency<EntityStore>> getDependencies()
  public Query<EntityStore> getQuery()
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private final Query<EntityStore> query
private final Set<Dependency<EntityStore>> dependencies
