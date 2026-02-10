---
title: IEventBus
kind: interface
package: com.hypixel.hytale.event
api_surface: true
extends: IEventRegistry
generator_version: "1.0.0"
generated_at: "2026-02-10T06:35:00Z"
tags:
  - event
  - eventbus
  - dispatch
  - interface
---

**Package:** `com.hypixel.hytale.event`

```java
public interface IEventBus extends IEventRegistry
```

The core event dispatch interface. Extends `IEventRegistry` (which defines listener registration methods) with methods for **dispatching** events to registered listeners. The server's `EventBus` implementation is the concrete class backing this interface.

Plugins do not typically interact with `IEventBus` directly. Registration goes through the plugin-scoped [EventRegistry](EventRegistry.md), and dispatch is performed by the server internally. This interface is documented for understanding the event system architecture.

## Relationship to IEventRegistry

`IEventRegistry` defines the **registration** side of the event system -- all the `register()`, `registerAsync()`, `registerGlobal()`, `registerUnhandled()`, and their variants. `IEventBus` adds the **dispatch** side: methods that fire events to registered listeners.

```
IEventRegistry (registration)
    └── IEventBus (registration + dispatch)
            └── EventBus (concrete implementation)
```

[EventRegistry](EventRegistry.md) also implements `IEventRegistry` as a plugin-scoped proxy that delegates to `IEventBus`.

## Dispatch Methods

### dispatch

```java
default <KeyType, EventType extends IEvent<KeyType>> EventType dispatch(@Nonnull Class<EventType> eventClass)
```

Dispatches a synchronous event with no key and no pre-constructed event instance. Equivalent to `dispatchFor(eventClass, null).dispatch(null)`. Returns the event instance after all listeners have processed it.

### dispatchAsync

```java
default <EventType extends IAsyncEvent<Void>> CompletableFuture<EventType> dispatchAsync(@Nonnull Class<EventType> eventClass)
```

Dispatches an asynchronous event with a `Void` key. Returns a `CompletableFuture` that completes after all async listeners in the chain have processed the event.

### dispatchFor

```java
default <KeyType, EventType extends IEvent<KeyType>> IEventDispatcher<EventType, EventType> dispatchFor(
    @Nonnull Class<? super EventType> eventClass
)
```

Returns an `IEventDispatcher` for the given event class with no key filter. Call `dispatch(event)` on the returned dispatcher to fire the event.

```java
<KeyType, EventType extends IEvent<KeyType>> IEventDispatcher<EventType, EventType> dispatchFor(
    @Nonnull Class<? super EventType> eventClass, @Nullable KeyType key
)
```

Returns an `IEventDispatcher` for the given event class filtered to a specific key. Only listeners registered for this key (or global listeners) will receive the event.

### dispatchForAsync

```java
default <KeyType, EventType extends IAsyncEvent<KeyType>> IEventDispatcher<EventType, CompletableFuture<EventType>> dispatchForAsync(
    @Nonnull Class<? super EventType> eventClass
)
```

Returns an async `IEventDispatcher` for the given event class with no key filter.

```java
<KeyType, EventType extends IAsyncEvent<KeyType>> IEventDispatcher<EventType, CompletableFuture<EventType>> dispatchForAsync(
    @Nonnull Class<? super EventType> eventClass, @Nullable KeyType key
)
```

Returns an async `IEventDispatcher` for the given event class filtered to a specific key.

## IEventDispatcher

The `dispatchFor` and `dispatchForAsync` methods return an `IEventDispatcher`:

```java
public interface IEventDispatcher<EventType extends IBaseEvent, ReturnType> {
    default boolean hasListener() { return true; }
    ReturnType dispatch(@Nullable EventType event);
}
```

- `hasListener()` -- returns `true` if at least one listener is registered for this event/key combination. Can be used to skip event construction when no listeners exist.
- `dispatch(event)` -- fires the event to all matching listeners and returns the result (the event itself for sync, a `CompletableFuture` for async).

## Dispatch Patterns

The server uses two main dispatch patterns:

### Simple dispatch (no pre-constructed event)

```java
// Server fires BootEvent -- no event instance needed upfront
eventBus.dispatch(BootEvent.class);
```

### Keyed dispatch with pre-constructed event

```java
// Server fires a keyed event for a specific key
IEventDispatcher<PlayerReadyEvent, PlayerReadyEvent> dispatcher =
    eventBus.dispatchFor(PlayerReadyEvent.class, key);

if (dispatcher.hasListener()) {
    PlayerReadyEvent event = new PlayerReadyEvent(/* ... */);
    dispatcher.dispatch(event);
}
```

The `hasListener()` check is an optimization -- if no listeners are registered, the event object is never constructed.

## Inherited from IEventRegistry

This interface inherits all registration methods from `IEventRegistry`. See [EventRegistry](EventRegistry.md) for full documentation of each registration family:

- `register()` -- synchronous listeners (unkeyed and keyed)
- `registerAsync()` -- asynchronous listeners
- `registerGlobal()` / `registerAsyncGlobal()` -- listeners for all keys
- `registerUnhandled()` / `registerAsyncUnhandled()` -- fallback listeners

Each family has three overloads: default priority, [EventPriority](EventPriority.md) enum, and raw `short` priority.

## Related Types

- [EventRegistry](EventRegistry.md) -- plugin-scoped proxy that implements `IEventRegistry` and delegates to `IEventBus`
- [EventRegistration](EventRegistration.md) -- handle returned by registration methods
- [EventPriority](EventPriority.md) -- priority enum for listener ordering
- `IEventRegistry` -- parent interface defining registration methods
- `EventBus` -- concrete implementation (internal)
- `IBaseEvent` -- base interface for all events
- `IEvent` -- synchronous event interface
- `IAsyncEvent` -- asynchronous event interface
- [PluginBase](PluginBase.md) -- provides `getEventRegistry()` for plugin-scoped access
- [Events Overview](../events/index.md) -- index of all documented events
