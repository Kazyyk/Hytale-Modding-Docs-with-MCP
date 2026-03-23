# WorldEventSystem

Type: class | Package: com.hypixel.hytale.component.system | Extends: EcsEvent> extends EventSystem<EventType> | Implements: ISystem<ECS_TYPE>

public abstract class WorldEventSystem<ECS_TYPE, EventType extends EcsEvent> extends EventSystem<EventType> implements ISystem<ECS_TYPE>

## Constructors

- protected WorldEventSystem(@Nonnull Class<EventType> eventType)

## Methods

- public abstract void handle(@Nonnull Store<ECS_TYPE> var1, @Nonnull CommandBuffer<ECS_TYPE> var2, @Nonnull EventType var3)
- public void handleInternal(@Nonnull Store<ECS_TYPE> store, @Nonnull CommandBuffer<ECS_TYPE> commandBuffer, @Nonnull EventType event)
