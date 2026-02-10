---
title: "SwitchActiveSlotEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.ecs"
fqcn: "com.hypixel.hytale.server.core.event.events.ecs.SwitchActiveSlotEvent"
api_surface: "public"
cancellable: true
generator_version: "1.0.0"
generated_at: "2026-02-09T23:10:00Z"
tags:
  - ecs
  - inventory
  - cancellable
---

> Package: `com.hypixel.hytale.server.core.event.events.ecs`
> Extends: `CancellableEcsEvent`
> Implements: `ICancellableEcsEvent`
> Cancellable: Yes

ECS event dispatched when the active hotbar slot changes. This fires for both client-initiated slot switches (player pressing hotbar keys) and server-initiated slot switches (programmatic changes). The `serverRequest` field distinguishes the two origins.

Cancelling this event prevents the active slot from changing. The `newSlot` field is mutable, allowing listeners to redirect the selection to a different slot.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `inventorySectionId` | `int` | `getInventorySectionId()` | No | No |
| `previousSlot` | `int` | `getPreviousSlot()` | No | No |
| `newSlot` | `byte` | `getNewSlot()` | Yes | No |
| `serverRequest` | `boolean` | `isServerRequest()` | No | No |

- **inventorySectionId** -- The inventory section being switched within (identifies the hotbar section).
- **previousSlot** -- The slot index that was active before this switch.
- **newSlot** -- The slot index being switched to. Mutable -- changing this redirects which slot becomes active.
- **serverRequest** -- `true` if this slot switch was initiated by the server, `false` if initiated by the client (player input).

## Fired By

- `InventoryPacketHandler` (line 353) via `store.invoke(ref, event)` -- ECS dispatch for server-initiated slot switch.
- `InventoryPacketHandler` (line 406) via `store.invoke(ref, event)` -- ECS dispatch for client-initiated slot switch.

## Listening

ECS events are handled by `EntityEventSystem` subclasses, not by `getEventRegistry().register()`.

```java
public class MySlotSwitchHandler extends EntityEventSystem<EntityStore, SwitchActiveSlotEvent> {
    @Override
    public Query<EntityStore> getQuery() {
        return MY_COMPONENT_TYPE;
    }

    @Override
    public void handle(int index, ArchetypeChunk<EntityStore> chunk,
                       Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer,
                       SwitchActiveSlotEvent event) {
        int previous = event.getPreviousSlot();
        byte newSlot = event.getNewSlot();
        boolean fromServer = event.isServerRequest();

        // Example: lock the active slot during a minigame
        if (isMinigameActive()) {
            event.setCancelled(true);
        }
    }
}

// Register in plugin setup():
getEntityStoreRegistry().registerSystem(new MySlotSwitchHandler());
```

## Related Events

- [`DropItemEvent.PlayerRequest`](./DropItemEvent.md#dropitemeventplayerrequest) -- Also dispatched from `InventoryPacketHandler`, fired when a player requests to drop an item from inventory.
