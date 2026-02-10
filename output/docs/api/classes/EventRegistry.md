---
title: EventRegistry
kind: class
package: com.hypixel.hytale.event
api_surface: true
extends: Registry<EventRegistration<?, ?>>
implements:
  - IEventRegistry
generator_version: "1.0.0"
generated_at: "2026-02-09T23:30:00Z"
tags:
  - event
  - registry
  - plugin-scoped
---

**Package:** `com.hypixel.hytale.event`

```java
public class EventRegistry extends Registry<EventRegistration<?, ?>> implements IEventRegistry
```

A plugin-scoped proxy for event registration. Obtained via [`PluginBase.getEventRegistry()`](PluginBase.md#events). All registrations made through this registry are automatically unregistered when the owning plugin shuts down.

Internally, `EventRegistry` delegates every registration call to a parent `IEventRegistry` (the server's `EventBus`), then wraps the returned `EventRegistration` in the plugin-scoped [Registry](Registry.md) lifecycle. This means the plugin does not need to manually unregister event handlers on shutdown.

## Constructor

```java
public EventRegistry(
    @Nonnull List<BooleanConsumer> registrations,
    @Nonnull BooleanSupplier precondition,
    String preconditionMessage,
    @Nonnull IEventRegistry parent
)
```

Constructed internally by `PluginBase`. The `parent` is the server's `EventBus`. The `precondition` supplier checks that the plugin is in an active state; if it returns `false`, registration methods throw `IllegalStateException` with the `preconditionMessage`.

## Registration Method Families

All registration methods call `checkPrecondition()` first, then delegate to the parent `IEventRegistry`, then wrap the result through `Registry.register()` for lifecycle tracking. Each returns an [EventRegistration](EventRegistration.md) handle that can be used to unregister the listener.

The following table summarizes the eight method families. Every family provides three overloads: default priority, `EventPriority` enum priority, and raw `short` priority.

| Family | Method Prefix | Key Behavior | Consumer Type | Event Constraint |
|---|---|---|---|---|
| Sync Unkeyed | `register` | Receives events with `Void` key | `Consumer<EventType>` | `IBaseEvent<Void>` |
| Sync Keyed | `register` | Receives events matching a specific key | `Consumer<EventType>` | `IBaseEvent<KeyType>` |
| Async Unkeyed | `registerAsync` | Async processing, `Void` key | `Function<CompletableFuture<EventType>, CompletableFuture<EventType>>` | `IAsyncEvent<Void>` |
| Async Keyed | `registerAsync` | Async processing, specific key | `Function<CompletableFuture<EventType>, CompletableFuture<EventType>>` | `IAsyncEvent<KeyType>` |
| Global | `registerGlobal` | Receives events for all keys | `Consumer<EventType>` | `IBaseEvent<KeyType>` |
| Async Global | `registerAsyncGlobal` | Async processing, all keys | `Function<CompletableFuture<EventType>, CompletableFuture<EventType>>` | `IAsyncEvent<KeyType>` |
| Unhandled | `registerUnhandled` | Fallback when no other listener handled | `Consumer<EventType>` | `IBaseEvent<KeyType>` |
| Async Unhandled | `registerAsyncUnhandled` | Async fallback | `Function<CompletableFuture<EventType>, CompletableFuture<EventType>>` | `IAsyncEvent<KeyType>` |

---

### Synchronous Unkeyed Registration (`register`)

For events with a `Void` key type. These are the most common registration methods.

```java
@Override
public <EventType extends IBaseEvent<Void>> EventRegistration<Void, EventType> register(
    @Nonnull Class<? super EventType> eventClass, @Nonnull Consumer<EventType> consumer
)
```

Registers a listener at default priority (`NORMAL`).

```java
@Override
public <EventType extends IBaseEvent<Void>> EventRegistration<Void, EventType> register(
    @Nonnull EventPriority priority, @Nonnull Class<? super EventType> eventClass, @Nonnull Consumer<EventType> consumer
)
```

Registers a listener at the specified `EventPriority`.

```java
@Override
public <EventType extends IBaseEvent<Void>> EventRegistration<Void, EventType> register(
    short priority, @Nonnull Class<? super EventType> eventClass, @Nonnull Consumer<EventType> consumer
)
```

Registers a listener at a custom numeric priority. Lower values run first.

---

### Synchronous Keyed Registration (`register`)

For events with a key type (e.g., `IBaseEvent<String>`). These variants filter delivery to only the specified key.

```java
@Override
public <KeyType, EventType extends IBaseEvent<KeyType>> EventRegistration<KeyType, EventType> register(
    @Nonnull Class<? super EventType> eventClass, @Nonnull KeyType key, @Nonnull Consumer<EventType> consumer
)
```

```java
@Override
public <KeyType, EventType extends IBaseEvent<KeyType>> EventRegistration<KeyType, EventType> register(
    @Nonnull EventPriority priority, @Nonnull Class<? super EventType> eventClass, @Nonnull KeyType key, @Nonnull Consumer<EventType> consumer
)
```

```java
@Override
public <KeyType, EventType extends IBaseEvent<KeyType>> EventRegistration<KeyType, EventType> register(
    short priority, @Nonnull Class<? super EventType> eventClass, @Nonnull KeyType key, @Nonnull Consumer<EventType> consumer
)
```

---

### Asynchronous Unkeyed Registration (`registerAsync`)

Register a `Function<CompletableFuture<EventType>, CompletableFuture<EventType>>` to process events asynchronously. The function receives the event wrapped in a `CompletableFuture` and must return a (possibly transformed) future.

```java
@Override
public <EventType extends IAsyncEvent<Void>> EventRegistration<Void, EventType> registerAsync(
    @Nonnull Class<? super EventType> eventClass, @Nonnull Function<CompletableFuture<EventType>, CompletableFuture<EventType>> function
)
```

```java
@Override
public <EventType extends IAsyncEvent<Void>> EventRegistration<Void, EventType> registerAsync(
    @Nonnull EventPriority priority,
    @Nonnull Class<? super EventType> eventClass,
    @Nonnull Function<CompletableFuture<EventType>, CompletableFuture<EventType>> function
)
```

```java
@Override
public <EventType extends IAsyncEvent<Void>> EventRegistration<Void, EventType> registerAsync(
    short priority, @Nonnull Class<? super EventType> eventClass, @Nonnull Function<CompletableFuture<EventType>, CompletableFuture<EventType>> function
)
```

---

### Asynchronous Keyed Registration (`registerAsync`)

```java
@Override
public <KeyType, EventType extends IAsyncEvent<KeyType>> EventRegistration<KeyType, EventType> registerAsync(
    @Nonnull Class<? super EventType> eventClass,
    @Nonnull KeyType key,
    @Nonnull Function<CompletableFuture<EventType>, CompletableFuture<EventType>> function
)
```

```java
@Override
public <KeyType, EventType extends IAsyncEvent<KeyType>> EventRegistration<KeyType, EventType> registerAsync(
    @Nonnull EventPriority priority,
    Class<? super EventType> eventClass,
    @Nonnull KeyType key,
    @Nonnull Function<CompletableFuture<EventType>, CompletableFuture<EventType>> function
)
```

```java
@Override
public <KeyType, EventType extends IAsyncEvent<KeyType>> EventRegistration<KeyType, EventType> registerAsync(
    short priority,
    @Nonnull Class<? super EventType> eventClass,
    @Nonnull KeyType key,
    @Nonnull Function<CompletableFuture<EventType>, CompletableFuture<EventType>> function
)
```

---

### Global Registration (`registerGlobal`)

Registers a listener that receives events regardless of key. Useful for observing all instances of a keyed event type without filtering by a specific key value.

```java
@Override
public <KeyType, EventType extends IBaseEvent<KeyType>> EventRegistration<KeyType, EventType> registerGlobal(
    @Nonnull Class<? super EventType> eventClass, @Nonnull Consumer<EventType> consumer
)
```

```java
@Override
public <KeyType, EventType extends IBaseEvent<KeyType>> EventRegistration<KeyType, EventType> registerGlobal(
    @Nonnull EventPriority priority, @Nonnull Class<? super EventType> eventClass, @Nonnull Consumer<EventType> consumer
)
```

```java
@Override
public <KeyType, EventType extends IBaseEvent<KeyType>> EventRegistration<KeyType, EventType> registerGlobal(
    short priority, @Nonnull Class<? super EventType> eventClass, @Nonnull Consumer<EventType> consumer
)
```

---

### Async Global Registration (`registerAsyncGlobal`)

```java
@Override
public <KeyType, EventType extends IAsyncEvent<KeyType>> EventRegistration<KeyType, EventType> registerAsyncGlobal(
    @Nonnull Class<? super EventType> eventClass, @Nonnull Function<CompletableFuture<EventType>, CompletableFuture<EventType>> function
)
```

```java
@Override
public <KeyType, EventType extends IAsyncEvent<KeyType>> EventRegistration<KeyType, EventType> registerAsyncGlobal(
    @Nonnull EventPriority priority,
    @Nonnull Class<? super EventType> eventClass,
    @Nonnull Function<CompletableFuture<EventType>, CompletableFuture<EventType>> function
)
```

```java
@Override
public <KeyType, EventType extends IAsyncEvent<KeyType>> EventRegistration<KeyType, EventType> registerAsyncGlobal(
    short priority, @Nonnull Class<? super EventType> eventClass, @Nonnull Function<CompletableFuture<EventType>, CompletableFuture<EventType>> function
)
```

---

### Unhandled Registration (`registerUnhandled`)

Registers a listener that is called only when no other (non-unhandled) listener has handled the event. Acts as a fallback.

```java
@Override
public <KeyType, EventType extends IBaseEvent<KeyType>> EventRegistration<KeyType, EventType> registerUnhandled(
    @Nonnull Class<? super EventType> eventClass, @Nonnull Consumer<EventType> consumer
)
```

```java
@Override
public <KeyType, EventType extends IBaseEvent<KeyType>> EventRegistration<KeyType, EventType> registerUnhandled(
    @Nonnull EventPriority priority, @Nonnull Class<? super EventType> eventClass, @Nonnull Consumer<EventType> consumer
)
```

```java
@Override
public <KeyType, EventType extends IBaseEvent<KeyType>> EventRegistration<KeyType, EventType> registerUnhandled(
    short priority, @Nonnull Class<? super EventType> eventClass, @Nonnull Consumer<EventType> consumer
)
```

---

### Async Unhandled Registration (`registerAsyncUnhandled`)

```java
@Override
public <KeyType, EventType extends IAsyncEvent<KeyType>> EventRegistration<KeyType, EventType> registerAsyncUnhandled(
    @Nonnull Class<? super EventType> eventClass, @Nonnull Function<CompletableFuture<EventType>, CompletableFuture<EventType>> function
)
```

```java
@Override
public <KeyType, EventType extends IAsyncEvent<KeyType>> EventRegistration<KeyType, EventType> registerAsyncUnhandled(
    @Nonnull EventPriority priority,
    @Nonnull Class<? super EventType> eventClass,
    @Nonnull Function<CompletableFuture<EventType>, CompletableFuture<EventType>> function
)
```

```java
@Override
public <KeyType, EventType extends IAsyncEvent<KeyType>> EventRegistration<KeyType, EventType> registerAsyncUnhandled(
    short priority, @Nonnull Class<? super EventType> eventClass, @Nonnull Function<CompletableFuture<EventType>, CompletableFuture<EventType>> function
)
```

---

### Direct Registration

```java
public <KeyType, EventType extends IBaseEvent<KeyType>> EventRegistration<KeyType, EventType> register(@Nonnull EventRegistration<KeyType, EventType> evt)
```

Registers an existing `EventRegistration` handle directly into the plugin-scoped lifecycle. Used internally.

## Event Priority

Priority controls the order in which listeners execute. The `EventPriority` enum provides five standard levels:

| Priority | Numeric Value |
|---|---|
| `FIRST` | -21844 |
| `EARLY` | -10922 |
| `NORMAL` | 0 |
| `LATE` | 10922 |
| `LAST` | 21844 |

Lower numeric values execute first. You can also pass a raw `short` for fine-grained control between the standard levels.

## Event Dispatch

The Hytale server uses two separate event dispatch mechanisms:

- **EventBus events** (`IEvent`/`IAsyncEvent`): Dispatched via `EventBus.dispatch()` or `EventBus.dispatchFor()`. These are the events registered through `EventRegistry`. Examples include `BootEvent`, `ShutdownEvent`, `PrepareUniverseEvent`, and player events like `PlayerConnectEvent`.

- **ECS events** (`EcsEvent`/`CancellableEcsEvent`): Dispatched via entity stores (`entityStore.invoke(ref, event)`) or component accessors. These go through the ECS system pipeline, not the `EventBus`. Examples include `BreakBlockEvent`, `PlaceBlockEvent`, and `ChangeGameModeEvent`. ECS events are registered through `getEntityStoreRegistry()` / `getChunkStoreRegistry()`, not through `EventRegistry`.

## Usage Examples

### Basic synchronous listener (default priority)

```java
@Override
protected void setup() {
    EventRegistry events = getEventRegistry();

    events.register(BootEvent.class, event -> {
        getLogger().info("Server booted!");
    });
}
```

### Listener with explicit priority

```java
events.register(EventPriority.EARLY, PlayerConnectEvent.class, event -> {
    getLogger().info("Player connecting: " + event.getPlayer().getName());
});
```

### Keyed event -- only fires for a specific key

```java
events.register(PlayerReadyEvent.class, "my-key", event -> {
    getLogger().info("Player ready with key: my-key");
});
```

### Keyed event with priority

```java
events.register(EventPriority.LATE, PlayerReadyEvent.class, "my-key", event -> {
    getLogger().info("Late handler for key: my-key");
});
```

### Global listener -- receives all keys

```java
events.registerGlobal(PlayerReadyEvent.class, event -> {
    getLogger().info("Player ready (any key)");
});
```

### Asynchronous event processing

```java
events.registerAsync(SomeAsyncEvent.class, future ->
    future.thenApply(event -> {
        // Process asynchronously -- the returned future controls
        // when the next handler in the chain receives the event.
        return event;
    })
);
```

### Async with priority

```java
events.registerAsync(EventPriority.FIRST, SomeAsyncEvent.class, future ->
    future.thenCompose(event -> {
        // Perform an async operation before passing on
        return someAsyncOperation().thenApply(result -> event);
    })
);
```

### Unhandled fallback

```java
events.registerUnhandled(CustomEvent.class, event -> {
    getLogger().warn("No handler processed: " + event);
});
```

## Related Types

- [PluginBase](PluginBase.md) -- provides `getEventRegistry()`
- [Registry](Registry.md) -- base class providing lifecycle management
- [Registration](Registration.md) -- base handle for registrations
- [EventRegistration](EventRegistration.md) -- typed handle returned by registration methods
- `IEventRegistry` -- interface defining the registration contract
- `IBaseEvent` -- base interface for all synchronous events
- `IAsyncEvent` -- base interface for all asynchronous events
- `EventPriority` -- priority enum for listener ordering
- `EventBus` -- server-level event dispatcher (the parent)
- [EcsEvent](EcsEvent.md) -- base class for the other event system (ECS events dispatched via Store, not EventBus)
- [Events Overview](../events/index.md) -- index of all documented events
