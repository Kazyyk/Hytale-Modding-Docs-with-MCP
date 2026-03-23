# GenericVelocityInstructionSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.physics.systems | Extends: EntityTickingSystem

public class GenericVelocityInstructionSystem extends EntityTickingSystem

## Fields

- private final Set<Dependency<EntityStore>> dependencies
- private final Query<EntityStore> query

## Methods

- @Override public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
- @Nonnull @Override public Set<Dependency<EntityStore>> getDependencies()
- @Nonnull @Override public Query<EntityStore> getQuery()
