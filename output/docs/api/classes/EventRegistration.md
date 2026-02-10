---
title: EventRegistration
kind: class
package: com.hypixel.hytale.event
api_surface: true
extends: Registration
generator_version: "1.0.0"
generated_at: "2026-02-10T06:35:00Z"
tags:
  - event
  - registration
  - lifecycle
---

**Package:** `com.hypixel.hytale.event`

```java
public class EventRegistration<KeyType, EventType extends IBaseEvent<KeyType>> extends Registration
```

A typed registration handle for event listeners. Extends [Registration](Registration.md) with a reference to the event class being listened to. Returned by all registration methods on [EventRegistry](EventRegistry.md) and `IEventRegistry`.

## Type Parameters

| Parameter | Constraint | Description |
|---|---|---|
| `KeyType` | — | The event's key type. `Void` for unkeyed events, or a specific type (e.g., `String`) for keyed events. |
| `EventType` | `extends IBaseEvent<KeyType>` | The concrete event class being listened to. |

## Fields

```java
@Nonnull
protected final Class<EventType> eventClass
```

The event class this registration listens to. Set during construction and accessible via `getEventClass()`.

## Constructors

### Primary constructor

```java
public EventRegistration(@Nonnull Class<EventType> eventClass, @Nonnull BooleanSupplier isEnabled, @Nonnull Runnable unregister)
```

Creates a new event registration for the given event class.

- **eventClass** -- the event type this registration listens to.
- **isEnabled** -- the owning registry's enabled state supplier (from [Registration](Registration.md)).
- **unregister** -- the callback that removes the listener from the `EventBus` (from [Registration](Registration.md)).

### Copy constructor

```java
public EventRegistration(@Nonnull EventRegistration<KeyType, EventType> registration, @Nonnull BooleanSupplier isEnabled, @Nonnull Runnable unregister)
```

Creates a new registration that copies the event class from an existing `EventRegistration` but uses new lifecycle callbacks. Used internally by [EventRegistry](EventRegistry.md) when wrapping a parent registration in the plugin-scoped lifecycle.

## Methods

### getEventClass

```java
@Nonnull
public Class<EventType> getEventClass()
```

Returns the event class this registration listens to.

### toString

```java
@Nonnull
@Override
public String toString()
```

Returns a string representation including the event class and the inherited registration state.

### combine (static)

```java
@Nonnull
@SafeVarargs
public static <KeyType, EventType extends IBaseEvent<KeyType>> EventRegistration<KeyType, EventType> combine(
    @Nonnull EventRegistration<KeyType, EventType> thisRegistration,
    @Nonnull EventRegistration<KeyType, EventType>... containerRegistrations
)
```

Creates a composite registration that is enabled only when **all** of the provided registrations are enabled, and whose `unregister()` unregisters **all** of them. This allows grouping multiple event registrations into a single handle.

**Behavior:**

- **isEnabled** -- returns `true` only if `thisRegistration` and every element in `containerRegistrations` are enabled.
- **unregister** -- calls `unregister()` on `thisRegistration` and every element in `containerRegistrations`.

**Example:**

```java
EventRegistration<Void, BootEvent> bootReg =
    events.register(BootEvent.class, e -> { /* ... */ });
EventRegistration<Void, ShutdownEvent> shutdownReg =
    events.register(ShutdownEvent.class, e -> { /* ... */ });

// Combine into a single handle
EventRegistration<Void, BootEvent> combined =
    EventRegistration.combine(bootReg, shutdownReg);

// Unregistering the combined handle unregisters both listeners
combined.unregister();
```

## Inherited from Registration

This class inherits the following from [Registration](Registration.md):

- `unregister()` -- removes this listener. Idempotent and shutdown-safe.
- `isRegistered()` -- returns `true` if not explicitly unregistered and the owning registry is still active.

See [Registration -- Lifecycle](Registration.md#lifecycle) for the full state diagram.

## Usage Example

```java
@Override
protected void setup() {
    EventRegistry events = getEventRegistry();

    // register() returns an EventRegistration handle
    EventRegistration<Void, BootEvent> reg =
        events.register(BootEvent.class, event -> {
            getLogger().info("Server booted!");
        });

    // Query which event class this registration is for
    Class<?> eventClass = reg.getEventClass();
    getLogger().info("Listening to: " + eventClass.getSimpleName());

    // Check if still active
    if (reg.isRegistered()) {
        getLogger().info("Listener is active.");
    }

    // Manually unregister (optional -- auto-cleaned on plugin shutdown)
    reg.unregister();
}
```

## Related Types

- [Registration](Registration.md) -- base class providing lifecycle management (`unregister()`, `isRegistered()`)
- [EventRegistry](EventRegistry.md) -- plugin-scoped registry whose registration methods return `EventRegistration` handles
- [EventPriority](EventPriority.md) -- priority enum for listener ordering
- [Registry](Registry.md) -- abstract registry managing registration lifecycle
- [PluginBase](PluginBase.md) -- provides `getEventRegistry()`
- `IEventRegistry` -- interface defining the registration contract
- `IBaseEvent` -- base interface for all events
- [Events Overview](../events/index.md) -- index of all documented events
