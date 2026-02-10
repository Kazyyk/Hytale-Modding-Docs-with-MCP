---
title: EcsEvent
kind: class
package: com.hypixel.hytale.component.system
api_surface: true
extends: ~
implements: []
generator_version: "1.0.0"
generated_at: "2026-02-09T23:45:00Z"
tags:
  - ecs
  - event
  - system
  - abstract
---

**Package:** `com.hypixel.hytale.component.system`

```java
public abstract class EcsEvent
```

The base class for all ECS-dispatched events in Hytale. `EcsEvent` is a minimal abstract class with no methods or fields -- subclasses add the specific data fields relevant to each event.

ECS events are dispatched through [Store.invoke()](Store.md) and are handled by systems registered on the `ComponentRegistry`. This is one of the two event dispatch mechanisms in Hytale; the other is the `EventBus` system used for standard `IEvent`/`IAsyncEvent` events (see [EventRegistry](EventRegistry.md)).

## Two Event Systems

Hytale has two distinct event dispatch mechanisms that serve different purposes:

### 1. Standard Events (EventBus)

- **Base types:** `IEvent`, `IAsyncEvent`, `IBaseEvent`
- **Dispatch:** `EventBus.dispatch()` / `EventBus.dispatchFor()`
- **Registration:** Via [EventRegistry](EventRegistry.md) (obtained from `PluginBase.getEventRegistry()`)
- **Scope:** Server-wide. Not tied to a specific entity or store.
- **Examples:** `BootEvent`, `ShutdownEvent`, `PrepareUniverseEvent`, `PlayerConnectEvent`
- **Features:** Priority ordering, keyed dispatch, async support, global/unhandled listeners

### 2. ECS Events (Store)

- **Base type:** `EcsEvent` (this class)
- **Dispatch:** `store.invoke(ref, event)` for entity-level events, `store.invoke(event)` for store-level events
- **Registration:** Via `ComponentRegistryProxy` (obtained from `PluginBase.getEntityStoreRegistry()` / `getChunkStoreRegistry()`)
- **Scope:** Tied to a specific entity (via [Ref](Ref.md)) or a specific store instance.
- **Examples:** `BreakBlockEvent`, `PlaceBlockEvent`, `ChangeGameModeEvent`, `DamageBlockEvent`, `DropItemEvent`, `CraftRecipeEvent`
- **Features:** Entity-targeted dispatch, cancellation support (via `CancellableEcsEvent`)

### When Each System Is Used

Standard `EventBus` events are used for server lifecycle events, connection events, and other events that are not tied to a specific entity. ECS events are used for gameplay events that target a specific entity or chunk -- block interactions, game mode changes, item crafting, and similar entity-scoped actions.

## Class Hierarchy

```
EcsEvent (abstract)
  +-- CancellableEcsEvent (abstract)
  |     +-- BreakBlockEvent
  |     +-- PlaceBlockEvent
  |     +-- ChangeGameModeEvent
  |     +-- UseBlockEvent
  |     +-- DamageBlockEvent
  |     +-- DropItemEvent
  |     +-- CraftRecipeEvent
  |     +-- SwitchActiveSlotEvent
  |     +-- InteractivelyPickupItemEvent
  |     +-- DiscoverZoneEvent
  +-- ChunkSaveEvent
  +-- ChunkUnloadEvent
  +-- MoonPhaseChangeEvent
```

Most ECS events extend `CancellableEcsEvent` rather than `EcsEvent` directly, because most gameplay events should be cancellable by plugin systems. Events that are purely informational (chunk save, chunk unload, moon phase change) extend `EcsEvent` directly.

## CancellableEcsEvent

```java
public abstract class CancellableEcsEvent extends EcsEvent implements ICancellableEcsEvent
```

Extends `EcsEvent` with cancellation support. Adds two methods:

```java
public final boolean isCancelled()
```

Returns `true` if the event has been cancelled by a system handler.

```java
public final void setCancelled(boolean cancelled)
```

Sets the cancellation state of the event. When cancelled, the action that triggered the event (e.g., block break, item drop) is suppressed.

Both methods are `final` -- subclasses cannot override cancellation behavior.

### ICancellableEcsEvent

```java
public interface ICancellableEcsEvent
```

The interface that defines the cancellation contract:

```java
boolean isCancelled()
void setCancelled(boolean var1)
```

`CancellableEcsEvent` is the standard implementation. The interface exists to allow the cancellation check to be performed without knowing the concrete event type.

## Dispatching ECS Events

ECS events are dispatched through the [Store](Store.md):

### Entity-Level Dispatch

```java
store.invoke(ref, event);
```

Dispatches the event to all systems that have registered an entity event handler for the event's type on the entity identified by `ref`. This is the most common dispatch pattern for gameplay events.

### Store-Level Dispatch

```java
store.invoke(event);
```

Dispatches the event to all systems that have registered a world (store-level) event handler for the event's type. Used for events that affect the store as a whole rather than a specific entity.

## Example: ChangeGameModeEvent

`ChangeGameModeEvent` is a representative ECS event that extends `CancellableEcsEvent`:

```java
public class ChangeGameModeEvent extends CancellableEcsEvent {
    @Nonnull
    private GameMode gameMode;

    public ChangeGameModeEvent(@Nonnull GameMode gameMode) {
        this.gameMode = gameMode;
    }

    @Nonnull
    public GameMode getGameMode() {
        return this.gameMode;
    }

    public void setGameMode(@Nonnull GameMode gameMode) {
        this.gameMode = gameMode;
    }
}
```

A system handler can read the proposed game mode, modify it via `setGameMode()`, or cancel the change entirely via `setCancelled(true)`.

## Related Types

- [Store](Store.md) -- dispatches ECS events via `invoke(Ref, EcsEvent)` and `invoke(EcsEvent)`
- [Ref](Ref.md) -- entity reference passed to entity-level event dispatch
- [ComponentType](ComponentType.md) -- type-safe key for component access within the ECS
- [SystemType](SystemType.md) -- type-safe handle for systems that handle ECS events
- [ComponentRegistryProxy](ComponentRegistryProxy.md) -- plugin-scoped proxy for registering systems and their event handlers
- [EventRegistry](EventRegistry.md) -- the other event system; used for `EventBus` events, not ECS events
- [PluginBase](PluginBase.md) -- provides access to both event systems via `getEventRegistry()` and `getEntityStoreRegistry()`
- `CancellableEcsEvent` -- abstract subclass adding cancellation support
- `ICancellableEcsEvent` -- interface defining the cancellation contract
- `ISystem` -- base interface for ECS systems that handle events
- `BreakBlockEvent` -- ECS event fired when a block is broken
- `PlaceBlockEvent` -- ECS event fired when a block is placed
- `ChangeGameModeEvent` -- ECS event fired when an entity's game mode changes
- `DropItemEvent` -- ECS event fired when an item is dropped
- `CraftRecipeEvent` -- ECS event fired when a recipe is crafted
- `ChunkSaveEvent` -- non-cancellable ECS event fired when a chunk is saved
- `ChunkUnloadEvent` -- non-cancellable ECS event fired when a chunk is unloaded
