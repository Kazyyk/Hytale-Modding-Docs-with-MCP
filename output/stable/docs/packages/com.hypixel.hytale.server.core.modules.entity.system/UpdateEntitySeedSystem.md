---
title: "UpdateEntitySeedSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.system"
fqcn: "com.hypixel.hytale.server.core.modules.entity.system.UpdateEntitySeedSystem"
api_surface: false
extends: "DelayedSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "ecs"
  - "entity"
  - "seed"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.system`

```java
public class UpdateEntitySeedSystem extends DelayedSystem<EntityStore>
```

Delayed ECS system that periodically updates the world's entity seed. Extends `DelayedSystem` with a 1.0 second delay interval, meaning the seed update runs approximately once per second rather than every tick.

## Constructor

```java
public UpdateEntitySeedSystem()
```

Calls `super(1.0F)` to set the delay interval to 1.0 second.

## Behavior

```java
@Override
public void delayedTick(float dt, int systemIndex, @Nonnull Store<EntityStore> store)
```

When the delay elapses, calls `store.getExternalData().getWorld().updateEntitySeed(store)` to refresh the entity seed used for deterministic entity operations within the world.

## Related Types

- [SnapshotSystems](SnapshotSystems.md) -- another system that operates on world-level state
- [UpdateLocationSystems](UpdateLocationSystems.md) -- per-tick systems that also access `World` from external data
- `DelayedSystem` -- abstract base class for systems that run on a timer interval
