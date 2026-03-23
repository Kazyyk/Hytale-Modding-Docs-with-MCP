# EntityEventSystem

Type: class | Package: com.hypixel.hytale.component.system | Extends: EcsEvent> extends EventSystem<EventType> | Implements: QuerySystem<ECS_TYPE>

public abstract class EntityEventSystem<ECS_TYPE, EventType extends EcsEvent> extends EventSystem<EventType> implements QuerySystem<ECS_TYPE>

## Constructors

- protected EntityEventSystem(@Nonnull Class<EventType> eventType)

## Methods

- public abstract void handle(int var1, @Nonnull ArchetypeChunk<ECS_TYPE> var2, @Nonnull Store<ECS_TYPE> var3, @Nonnull CommandBuffer<ECS_TYPE> var4, @Nonnull EventType var5)
- public void handleInternal(int index,
        @Nonnull ArchetypeChunk<ECS_TYPE> archetypeChunk,
        @Nonnull Store<ECS_TYPE> store,
        @Nonnull CommandBuffer<ECS_TYPE> commandBuffer,
        @Nonnull EventType event)` |
