---
title: "Event System"
kind: "overview"
package: "com.hypixel.hytale.event"
api_surface: "public"
generator_version: "1.0.0"
generated_at: "2026-02-09T23:10:00Z"
tags:
  - "events"
  - "overview"
  - "eventbus"
  - "ecs-events"
---

> Package: `com.hypixel.hytale.event` (infrastructure) + `com.hypixel.hytale.server.core.event.events` (concrete events)

Hytale has a **dual event system** with two parallel hierarchies that use completely separate dispatch mechanisms.

## Standard Events (EventBus)

Standard events implement `IEvent<KeyType>` (synchronous) or `IAsyncEvent<KeyType>` (asynchronous) and are dispatched through the `EventBus`. Registration uses `Consumer`-based callbacks — no annotations.

### Listener Registration

```java
// In a plugin's setup() or start() method:
getEventRegistry().register(BreakBlockEvent.class, event -> {
    BlockType blockType = event.getBlockType();
    if (event.isCancelled()) return;
    // handle event
});

// With priority:
getEventRegistry().register(EventPriority.EARLY, PlayerChatEvent.class, event -> {
    // runs before NORMAL priority listeners
});

// Async event (PlayerChatEvent implements IAsyncEvent):
getEventRegistry().registerAsync(PlayerChatEvent.class, future -> {
    return future.thenApply(event -> {
        event.setContent(event.getContent().toUpperCase());
        return event;
    });
});
```

### Registration Families

| Method | Dispatch | Scope |
|--------|----------|-------|
| `register(Class, Consumer)` | Sync | Keyed (specific key) |
| `registerGlobal(Class, Consumer)` | Sync | All keys |
| `registerUnhandled(Class, Consumer)` | Sync | Fallback (no specific listeners) |
| `registerAsync(Class, Function)` | Async | Keyed |
| `registerAsyncGlobal(Class, Function)` | Async | All keys |
| `registerAsyncUnhandled(Class, Function)` | Async | Fallback |

Each family has 3 overloads: default priority, `EventPriority` enum, raw `short` priority.

### Event Priority

| Priority | Value | Description |
|----------|-------|-------------|
| `FIRST` | -21844 | Highest priority, runs earliest |
| `EARLY` | -10922 | Before normal |
| `NORMAL` | 0 | Default |
| `LATE` | 10922 | After normal |
| `LAST` | 21844 | Lowest priority, runs last |

Raw `short` values allow custom priorities between enum values.

### Keyed Dispatch

Events have a `KeyType` generic parameter:
- **`KeyType=Void`** — Unkeyed (global dispatch). Example: `BootEvent`, `ShutdownEvent`.
- **`KeyType=String`** — Can be dispatched for specific string keys. Example: `PlayerReadyEvent`, `AddPlayerToWorldEvent`. Listeners can register for a specific key or use `registerGlobal()` to receive all keys.

## ECS Events

ECS events extend `EcsEvent` (or `CancellableEcsEvent`) and are dispatched through the ECS system pipeline using `store.invoke()`. They do **not** use the EventBus — this is a completely separate dispatch mechanism.

ECS events are handled by `EntityEventSystem` subclasses that declare a `Query` to filter which entities receive the event. Only entities whose archetype matches the system's query will trigger the handler.

### ECS Event Dispatch

```java
// Entity-level dispatch (most common):
store.invoke(ref, event);
componentAccessor.invoke(ref, event);

// Store-level dispatch:
store.invoke(event);
```

## Cancellation

There are **two separate cancellation interfaces** with identical method signatures:

| Interface | Hierarchy | Methods |
|-----------|-----------|---------|
| `ICancellable` | Standard events (`IEvent`) | `isCancelled()`, `setCancelled(boolean)` |
| `ICancellableEcsEvent` | ECS events (`EcsEvent`) | `isCancelled()`, `setCancelled(boolean)` |

## Type Hierarchy

### Standard Events

```
IBaseEvent<KeyType>
├── IEvent<KeyType>                    (synchronous)
│   ├── EntityEvent<EntityType, KeyType>
│   │   ├── EntityRemoveEvent
│   │   ├── LivingEntityInventoryChangeEvent
│   │   └── LivingEntityUseBlockEvent (deprecated)
│   ├── PlayerEvent<KeyType>
│   │   ├── PlayerReadyEvent
│   │   ├── PlayerCraftEvent (deprecated)
│   │   ├── PlayerInteractEvent (deprecated)
│   │   ├── PlayerMouseButtonEvent
│   │   └── PlayerMouseMotionEvent
│   ├── PlayerRefEvent<KeyType>
│   │   └── PlayerDisconnectEvent
│   ├── PlayerPermissionChangeEvent
│   │   ├── .GroupAdded
│   │   ├── .GroupRemoved
│   │   ├── .PermissionsAdded
│   │   └── .PermissionsRemoved
│   ├── PlayerGroupEvent
│   │   ├── .Added
│   │   └── .Removed
│   ├── GroupPermissionChangeEvent
│   │   ├── .Added
│   │   └── .Removed
│   ├── BootEvent
│   ├── ShutdownEvent
│   ├── PrepareUniverseEvent (deprecated)
│   ├── PlayerConnectEvent
│   ├── PlayerSetupConnectEvent (+ ICancellable)
│   ├── PlayerSetupDisconnectEvent
│   ├── PlayerChatEvent (IAsyncEvent + ICancellable)
│   ├── AddPlayerToWorldEvent
│   └── DrainPlayerFromWorldEvent
└── IAsyncEvent<KeyType>               (asynchronous)
    └── PlayerChatEvent
```

### ECS Events

```
EcsEvent
├── CancellableEcsEvent (+ ICancellableEcsEvent)
│   ├── BreakBlockEvent
│   ├── PlaceBlockEvent
│   ├── DamageBlockEvent
│   ├── ChangeGameModeEvent
│   ├── SwitchActiveSlotEvent
│   ├── InteractivelyPickupItemEvent
│   ├── DropItemEvent
│   │   ├── .Drop
│   │   └── .PlayerRequest
│   └── CraftRecipeEvent
│       ├── .Pre
│       └── .Post
├── UseBlockEvent
│   ├── .Pre (+ ICancellableEcsEvent)
│   └── .Post
└── DiscoverZoneEvent
    └── .Display (+ ICancellableEcsEvent)
```

## Concrete Events

### Lifecycle Events

| Event | Type | Cancellable | Description |
|-------|------|-------------|-------------|
| [BootEvent](BootEvent.md) | Standard | No | Server boot lifecycle |
| [ShutdownEvent](ShutdownEvent.md) | Standard | No | Server shutdown lifecycle |
| [PrepareUniverseEvent](PrepareUniverseEvent.md) | Standard | No | Universe initialization (deprecated) |

### Player Events

| Event | Type | Cancellable | Description |
|-------|------|-------------|-------------|
| [PlayerSetupConnectEvent](PlayerSetupConnectEvent.md) | Standard | Yes | Early connection (before player entity) |
| [PlayerConnectEvent](PlayerConnectEvent.md) | Standard | No | Player entity created and connected |
| [PlayerDisconnectEvent](PlayerDisconnectEvent.md) | Standard | No | Player disconnects |
| [PlayerSetupDisconnectEvent](PlayerSetupDisconnectEvent.md) | Standard | No | Setup-phase disconnect |
| [AddPlayerToWorldEvent](AddPlayerToWorldEvent.md) | Standard | No | Player enters a world |
| [DrainPlayerFromWorldEvent](DrainPlayerFromWorldEvent.md) | Standard | No | Player leaves a world |
| [PlayerReadyEvent](PlayerReadyEvent.md) | Standard | No | Player signals readiness |
| [PlayerChatEvent](PlayerChatEvent.md) | Async | Yes | Player sends chat message |
| [PlayerMouseButtonEvent](PlayerMouseButtonEvent.md) | Standard | Yes | Mouse button press/release |
| [PlayerMouseMotionEvent](PlayerMouseMotionEvent.md) | Standard | Yes | Mouse drag events |
| [PlayerCraftEvent](PlayerCraftEvent.md) | Standard | No | Crafting (deprecated) |
| [PlayerInteractEvent](PlayerInteractEvent.md) | Standard | Yes | Interaction (deprecated) |

### ECS / Block Events

| Event | Type | Cancellable | Description |
|-------|------|-------------|-------------|
| [BreakBlockEvent](BreakBlockEvent.md) | ECS | Yes | Player finishes mining a block |
| [PlaceBlockEvent](PlaceBlockEvent.md) | ECS | Yes | Player places a block |
| [DamageBlockEvent](DamageBlockEvent.md) | ECS | Yes | Mining progress tick |
| [UseBlockEvent](UseBlockEvent.md) | ECS | Pre: Yes | Block interaction (Pre/Post) |
| [ChangeGameModeEvent](ChangeGameModeEvent.md) | ECS | Yes | Game mode change |
| [SwitchActiveSlotEvent](SwitchActiveSlotEvent.md) | ECS | Yes | Hotbar slot change |
| [InteractivelyPickupItemEvent](InteractivelyPickupItemEvent.md) | ECS | Yes | Item pickup |
| [DropItemEvent](DropItemEvent.md) | ECS | Yes | Item drop (PlayerRequest/Drop) |
| [CraftRecipeEvent](CraftRecipeEvent.md) | ECS | Yes | Crafting (Pre/Post) |
| [DiscoverZoneEvent](DiscoverZoneEvent.md) | ECS | Display: Yes | Zone discovery |

### Entity Events

| Event | Type | Cancellable | Description |
|-------|------|-------------|-------------|
| [EntityRemoveEvent](EntityRemoveEvent.md) | Standard | No | Entity removed from world |
| [LivingEntityInventoryChangeEvent](LivingEntityInventoryChangeEvent.md) | Standard | No | Inventory contents changed |
| [LivingEntityUseBlockEvent](LivingEntityUseBlockEvent.md) | Standard | No | Block use (deprecated) |

### Permission Events

| Event | Type | Cancellable | Description |
|-------|------|-------------|-------------|
| [GroupPermissionChangeEvent](GroupPermissionChangeEvent.md) | Standard | No | Group permissions changed (Added/Removed) |
| [PlayerGroupEvent](PlayerGroupEvent.md) | Standard | No | Player group membership changed (Added/Removed) |
| [PlayerPermissionChangeEvent](PlayerPermissionChangeEvent.md) | Standard | No | Player permissions changed (GroupAdded/GroupRemoved/PermissionsAdded/PermissionsRemoved) |

## Related

- **[EventRegistry](../classes/EventRegistry.md)** — Plugin-scoped event registration API
- **[IEventBus](../classes/IEventBus.md)** — Core dispatch interface
- **[EventPriority](../classes/EventPriority.md)** — Priority enum
- **[EventRegistration](../classes/EventRegistration.md)** — Registration handle
