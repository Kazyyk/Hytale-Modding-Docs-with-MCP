---
title: "ChangeGameModeEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.ecs"
fqcn: "com.hypixel.hytale.server.core.event.events.ecs.ChangeGameModeEvent"
api_surface: "public"
cancellable: true
generator_version: "1.0.0"
generated_at: "2026-02-09T23:10:00Z"
tags:
  - ecs
  - player
  - cancellable
---

> Package: `com.hypixel.hytale.server.core.event.events.ecs`
> Extends: `CancellableEcsEvent`
> Implements: `ICancellableEcsEvent`
> Cancellable: Yes

ECS event dispatched when a player's game mode is about to change. Cancelling this event prevents the game mode change. The `gameMode` field is mutable, allowing listeners to redirect the change to a different game mode.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `gameMode` | `GameMode` | `getGameMode()` | Yes | No |

- **gameMode** -- The game mode being switched to. Mutable -- changing this alters which game mode the player will be placed in.

## Fired By

- `Player.setGameMode` (line 796) via `componentAccessor.invoke(playerRef, event)` -- ECS dispatch when a player's game mode changes.

## Listening

ECS events are handled by `EntityEventSystem` subclasses, not by `getEventRegistry().register()`.

```java
public class MyGameModeHandler extends EntityEventSystem<EntityStore, ChangeGameModeEvent> {
    @Override
    public Query<EntityStore> getQuery() {
        return MY_COMPONENT_TYPE;
    }

    @Override
    public void handle(int index, ArchetypeChunk<EntityStore> chunk,
                       Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer,
                       ChangeGameModeEvent event) {
        GameMode requestedMode = event.getGameMode();

        // Example: prevent switching to creative mode
        if (requestedMode == GameMode.CREATIVE) {
            event.setCancelled(true);
        }

        // Example: redirect spectator requests to adventure
        if (requestedMode == GameMode.SPECTATOR) {
            event.setGameMode(GameMode.ADVENTURE);
        }
    }
}

// Register in plugin setup():
getEntityStoreRegistry().registerSystem(new MyGameModeHandler());
```

## Related Events

There are no directly related ECS events. Game mode changes are a standalone player state transition.
