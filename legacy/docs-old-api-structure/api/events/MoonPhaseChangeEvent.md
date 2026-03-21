---
title: "MoonPhaseChangeEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.universe.world.events.ecs"
fqcn: "com.hypixel.hytale.server.core.universe.world.events.ecs.MoonPhaseChangeEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - ecs
  - world
  - time
---

> Package: `com.hypixel.hytale.server.core.universe.world.events.ecs`
> Extends: `EcsEvent`
> Cancellable: No

ECS event dispatched when the moon phase changes during time progression. This event is not cancellable -- the moon phase change is informational.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `newMoonPhase` | `int` | `getNewMoonPhase()` | No | No |

- **newMoonPhase** -- The new moon phase value after the change.

## Fired By

- `WorldTimeResource.tick` (lines 120-121) via `componentAccessor.invoke(event)` -- ECS dispatch when the moon phase changes during time progression.

## Listening

ECS events are handled by `EntityEventSystem` subclasses, not by `getEventRegistry().register()`.

```java
public class MyMoonPhaseHandler extends EntityEventSystem<EntityStore, MoonPhaseChangeEvent> {
    @Override
    public Query<EntityStore> getQuery() {
        return MY_COMPONENT_TYPE;
    }

    @Override
    public void handle(int index, ArchetypeChunk<EntityStore> chunk,
                       Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer,
                       MoonPhaseChangeEvent event) {
        int phase = event.getNewMoonPhase();

        // Example: trigger special behavior on full moon
        if (phase == FULL_MOON) {
            triggerFullMoonEvent();
        }
    }
}

// Register in plugin setup():
getEntityStoreRegistry().registerSystem(new MyMoonPhaseHandler());
```

## Related Events

There are no directly related ECS events. Moon phase changes are a standalone world time event.
