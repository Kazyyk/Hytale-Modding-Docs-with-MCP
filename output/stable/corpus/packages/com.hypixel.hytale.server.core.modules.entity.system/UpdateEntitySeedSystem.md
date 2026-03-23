# UpdateEntitySeedSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.system | Extends: DelayedSystem<EntityStore>

public class UpdateEntitySeedSystem extends DelayedSystem<EntityStore>

Delayed ECS system that periodically updates the world's entity seed. Extends `DelayedSystem` with a 1.0 second delay interval, meaning the seed update runs approximately once per second rather than every tick.

## Constructor


public UpdateEntitySeedSystem()

Calls `super(1.0F)` to set the delay interval to 1.0 second.

## Behavior


@Override
public void delayedTick(float dt, int systemIndex, @Nonnull Store<EntityStore> store)

When the delay elapses, calls `store.getExternalData().getWorld().updateEntitySeed(store)` to refresh the entity seed used for deterministic entity operations within the world.

## Related Types

- SnapshotSystems -- another system that operates on world-level state
- UpdateLocationSystems -- per-tick systems that also access `World` from external data
- `DelayedSystem` -- abstract base class for systems that run on a timer interval
