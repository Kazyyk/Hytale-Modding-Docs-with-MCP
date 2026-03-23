# ArchetypeTickingSystem

Type: class | Package: com.hypixel.hytale.component.system.tick | Extends: TickingSystem<ECS_TYPE> | Implements: QuerySystem<ECS_TYPE>

public abstract class ArchetypeTickingSystem<ECS_TYPE> extends TickingSystem<ECS_TYPE> implements QuerySystem<ECS_TYPE>

## Methods

- @Override public boolean test(@Nonnull ComponentRegistry<ECS_TYPE> componentRegistry, @Nonnull Archetype<ECS_TYPE> archetype)
- public boolean isExplicitQuery()
- @Override public void tick(float dt, int systemIndex, @Nonnull Store<ECS_TYPE> store)
- public abstract void tick(float var1, @Nonnull ArchetypeChunk<ECS_TYPE> var2, @Nonnull Store<ECS_TYPE> var3, @Nonnull CommandBuffer<ECS_TYPE> var4)
