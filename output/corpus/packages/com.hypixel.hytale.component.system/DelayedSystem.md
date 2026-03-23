# DelayedSystem

Type: class | Package: com.hypixel.hytale.component.system | Extends: TickingSystem<ECS_TYPE>

public abstract class DelayedSystem<ECS_TYPE> extends TickingSystem<ECS_TYPE>

## Fields

- @Nonnull private final ResourceType<ECS_TYPE, DelayedSystem.Data<ECS_TYPE>> resourceType
- private final float intervalSec

## Constructors

- public DelayedSystem(float intervalSec)

## Methods

- @Nonnull public ResourceType<ECS_TYPE, DelayedSystem.Data<ECS_TYPE>> getResourceType()
- public float getIntervalSec()
- @Override public void tick(float dt, int systemIndex, @Nonnull Store<ECS_TYPE> store)
- public abstract void delayedTick(float var1, int var2, @Nonnull Store<ECS_TYPE> var3)

## Inner Types

- `DelayedSystem.Data`
