# DelayedEntitySystem

Type: class | Package: com.hypixel.hytale.component.system.tick | Extends: EntityTickingSystem<ECS_TYPE>

public abstract class DelayedEntitySystem<ECS_TYPE> extends EntityTickingSystem<ECS_TYPE>

## Fields

- private final ResourceType<ECS_TYPE, DelayedEntitySystem.Data<ECS_TYPE>> resourceType
- private final float intervalSec

## Constructors

- public DelayedEntitySystem(float intervalSec)

## Methods

- @Nonnull public ResourceType<ECS_TYPE, DelayedEntitySystem.Data<ECS_TYPE>> getResourceType()
- public float getIntervalSec()
- @Override public void tick(float dt, int systemIndex, @Nonnull Store<ECS_TYPE> store)

## Inner Types

- `DelayedEntitySystem.Data`
