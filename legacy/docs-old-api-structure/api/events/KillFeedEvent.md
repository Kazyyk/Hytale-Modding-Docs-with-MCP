---
title: "KillFeedEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.modules.entity.damage.event"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.event.KillFeedEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - ecs
  - damage
  - killfeed
---

> Package: `com.hypixel.hytale.server.core.modules.entity.damage.event`
> Cancellable: No (container class) -- see inner classes below

Container class for kill feed notification events. `KillFeedEvent` itself is not an event -- it has no superclass and no dispatch mechanism. It serves as a namespace for three inner event classes that handle different aspects of kill feed notifications. All inner classes extend `CancellableEcsEvent`.

---

## KillFeedEvent.DecedentMessage

> Extends: `CancellableEcsEvent`
> Implements: `ICancellableEcsEvent`
> Cancellable: Yes

Fired for the death message shown to the killed entity. Cancelling suppresses the death message.

### Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `damage` | `Damage` | `getDamage()` | No | No |
| `message` | `Message` | `getMessage()` | Yes | Yes |

- **damage** -- The damage instance that caused the death.
- **message** -- The death message to display. Initially `null`. Mutable via `setMessage(@Nullable Message)`.

---

## KillFeedEvent.Display

> Extends: `CancellableEcsEvent`
> Implements: `ICancellableEcsEvent`
> Cancellable: Yes

Fired when kill feed UI should be displayed to observers. Cancelling suppresses the kill feed display.

### Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `damage` | `Damage` | `getDamage()` | No | No |
| `icon` | `String` | `getIcon()` | Yes | Yes |
| `broadcastTargets` | `List<PlayerRef>` | `getBroadcastTargets()` | No | No |

- **damage** -- The damage instance that caused the kill.
- **icon** -- The icon identifier for the kill feed entry. May be `null`. Mutable via `setIcon(@Nullable String)`.
- **broadcastTargets** -- The list of players who will see the kill feed entry.

---

## KillFeedEvent.KillerMessage

> Extends: `CancellableEcsEvent`
> Implements: `ICancellableEcsEvent`
> Cancellable: Yes

Fired for the kill message shown to the killer entity. Cancelling suppresses the kill confirmation message.

### Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `damage` | `Damage` | `getDamage()` | No | No |
| `targetRef` | `Ref<EntityStore>` | `getTargetRef()` | No | No |
| `message` | `Message` | `getMessage()` | Yes | Yes |

- **damage** -- The damage instance that caused the kill.
- **targetRef** -- ECS reference to the entity that was killed.
- **message** -- The kill confirmation message. Initially `null`. Mutable via `setMessage(@Nullable Message)`.

## Fired By

Dispatch location not identified in decompiled source. This event may be dispatched by game modules not yet mapped.

## Listening

ECS events are handled by `EntityEventSystem` subclasses, not by `getEventRegistry().register()`.

```java
public class MyKillFeedHandler extends EntityEventSystem<EntityStore, KillFeedEvent.Display> {
    @Override
    public Query<EntityStore> getQuery() {
        return MY_COMPONENT_TYPE;
    }

    @Override
    public void handle(int index, ArchetypeChunk<EntityStore> chunk,
                       Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer,
                       KillFeedEvent.Display event) {
        Damage damage = event.getDamage();
        String icon = event.getIcon();

        // Example: customize kill feed icon
        event.setIcon("custom_kill_icon");
    }
}

// Register in plugin setup():
getEntityStoreRegistry().registerSystem(new MyKillFeedHandler());
```

## Related Events

There are no directly related events. Kill feed events are standalone damage notification events.
