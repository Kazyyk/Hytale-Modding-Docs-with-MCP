---
title: EventPriority
kind: enum
package: com.hypixel.hytale.event
api_surface: true
generator_version: "1.0.0"
generated_at: "2026-02-10T06:35:00Z"
tags:
  - event
  - priority
  - enum
---

**Package:** `com.hypixel.hytale.event`

```java
public enum EventPriority
```

Defines the execution order for event listeners registered through the [EventRegistry](EventRegistry.md). Listeners with lower numeric values execute first. Five standard priority levels are provided; for finer control, registration methods also accept a raw `short` value.

## Constants

| Constant | Numeric Value | Description |
|---|---|---|
| `FIRST` | -21844 | Highest priority. Runs before all other standard levels. Use for listeners that must observe events before any other processing. |
| `EARLY` | -10922 | Runs before `NORMAL`. Use for pre-processing or validation. |
| `NORMAL` | 0 | Default priority. Most listeners should use this level. |
| `LATE` | 10922 | Runs after `NORMAL`. Use for post-processing or reactions to earlier handling. |
| `LAST` | 21844 | Lowest priority. Runs after all other standard levels. Use for cleanup, logging, or final-say handlers. |

The values are evenly spaced across the `short` range, leaving room for custom priorities between each level. For example, a priority of `5000` would run between `NORMAL` and `LATE`.

## Methods

### getValue

```java
public short getValue()
```

Returns the numeric priority value for this constant.

## Ordering Behavior

Listeners are executed in ascending numeric order:

```
FIRST (-21844) → EARLY (-10922) → NORMAL (0) → LATE (10922) → LAST (21844)
```

When two listeners have the same numeric priority, their relative execution order is unspecified. Do not rely on insertion order for same-priority listeners.

## Custom Priorities

All registration method families on [EventRegistry](EventRegistry.md) provide a `short` overload that accepts a raw numeric priority. This allows placing a listener between standard levels:

```java
// Register between NORMAL (0) and LATE (10922)
events.register((short) 5000, PlayerConnectEvent.class, event -> {
    // runs after NORMAL listeners, before LATE listeners
});
```

## Usage Examples

### Default priority (NORMAL)

```java
events.register(BootEvent.class, event -> {
    // runs at NORMAL (0) priority
});
```

### Explicit priority

```java
events.register(EventPriority.EARLY, PlayerConnectEvent.class, event -> {
    // runs before NORMAL listeners
});
```

### Priority for cancellation checking

```java
// Use LATE to check if a previous listener cancelled the event
events.register(EventPriority.LATE, PlayerSetupConnectEvent.class, event -> {
    if (event.isCancelled()) {
        getLogger().info("Connection was cancelled by an earlier listener.");
    }
});
```

## Related Types

- [EventRegistry](EventRegistry.md) -- plugin-scoped registry; all registration methods accept `EventPriority`
- [EventRegistration](EventRegistration.md) -- handle returned by registration methods
- `IEventRegistry` -- interface defining the registration contract with priority overloads
- [Events Overview](../events/index.md) -- index of all documented events
