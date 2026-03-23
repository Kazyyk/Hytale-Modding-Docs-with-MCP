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
