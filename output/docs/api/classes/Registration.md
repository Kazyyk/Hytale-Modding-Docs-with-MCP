---
title: "Registration"
kind: "class"
package: "com.hypixel.hytale.registry"
api_surface: true
extends: ~
generator_version: "1.0.0"
generated_at: "2026-02-09T23:30:00Z"
tags:
  - "registry"
  - "registration"
  - "lifecycle"
  - "class"
---

**Package:** `com.hypixel.hytale.registry`

```java
public class Registration
```

A handle representing a single item registered with a [Registry](Registry.md). Each `Registration` tracks whether it is still active and provides an `unregister()` method to remove itself. Registrations are lifecycle-aware: they become inactive either when explicitly unregistered or when the owning registry shuts down.

## Fields

```java
@Nonnull
protected final BooleanSupplier isEnabled
```

A supplier that returns `true` when the owning registry is still active. This is the registry's enabled state, passed in during construction. When the registry calls `shutdown()`, this supplier starts returning `false`, causing `isRegistered()` to return `false` even if `unregister()` was never called.

```java
@Nonnull
protected final Runnable unregister
```

A callback that performs the actual removal of this registration from the underlying system (e.g., removing an event listener from the `EventBus`, or removing a command from the dispatcher). Invoked by `unregister()` if the registration is still active.

```java
private boolean registered = true
```

Internal flag tracking whether `unregister()` has been called. Starts as `true` and is set to `false` when `unregister()` executes.

## Constructor

```java
public Registration(@Nonnull BooleanSupplier isEnabled, @Nonnull Runnable unregister)
```

Creates a registration with the given enabled supplier and unregister callback.

- **isEnabled** -- typically the owning [Registry](Registry.md)'s `isEnabled()` method reference. Used to determine whether the registration is still meaningful.
- **unregister** -- the callback that performs actual cleanup when `unregister()` is called (e.g., removing the listener, deregistering the command).

The `registered` flag is initially `true`.

## Methods

### unregister

```java
public void unregister()
```

Removes this registration. The method checks two conditions before executing the unregister callback:

1. The `registered` flag must be `true` (i.e., `unregister()` has not already been called).
2. The `isEnabled` supplier must return `true` (i.e., the owning registry has not been shut down).

If both conditions are met, the `unregister` callback is invoked and the `registered` flag is set to `false`. If either condition fails, the method is a no-op. This design ensures:

- **Idempotent:** calling `unregister()` multiple times is safe -- the callback runs at most once.
- **Shutdown-safe:** calling `unregister()` after the registry has shut down is a no-op rather than an error, because the registry's shutdown already handled cleanup.

### isRegistered

```java
public boolean isRegistered()
```

Returns `true` only if **both** of the following are true:

1. The `registered` flag is `true` (the registration has not been explicitly unregistered).
2. The `isEnabled` supplier returns `true` (the owning registry is still active).

This means a registration can become inactive in two ways:

- **Explicit unregister** -- the plugin calls `registration.unregister()`, setting `registered` to `false`.
- **Registry shutdown** -- the owning registry shuts down, causing `isEnabled` to return `false`.

In both cases, `isRegistered()` returns `false`.

## Lifecycle

A `Registration` handle progresses through these states:

```
               register()
                   |
                   v
         +-------------------+
         | registered = true |
         | isEnabled = true  |
         |  isRegistered()   |
         |   returns true    |
         +-------------------+
              |           |
    unregister()    registry.shutdown()
              |           |
              v           v
         +-------------------+
         | registered = false|   (or isEnabled = false)
         |  isRegistered()   |
         |   returns false   |
         +-------------------+
```

1. **Active** -- created by [Registry.register()](Registry.md#register). Both `isRegistered()` returns `true` and the underlying server-level registration is live.

2. **Manually unregistered** -- the plugin calls `unregister()`. The unregister callback runs, removing the registration from the server-level manager. `isRegistered()` returns `false`.

3. **Auto-unregistered on shutdown** -- when the plugin shuts down, `PluginBase.cleanup()` iterates the shared shutdown task list in reverse order (LIFO). Each task invokes the unregister callback. The `isEnabled` supplier then returns `false` (since the registry is shut down), and `isRegistered()` returns `false`.

In all cases, the unregister callback runs at most once, preventing double-removal.

## Known Subclasses

| Class | Package | Additional Context |
|---|---|---|
| `EventRegistration` | `com.hypixel.hytale.event` | Carries the event class this registration listens to |
| `CommandRegistration` | `com.hypixel.hytale.server.core.command.system` | Holds the `AbstractCommand` instance that was registered |

These subclasses inherit the lifecycle behavior from `Registration` and add domain-specific fields.

## Usage Example

```java
@Override
protected void setup() {
    // Store the handle to optionally unregister later
    EventRegistration<Void, BootEvent> bootReg =
        getEventRegistry().register(BootEvent.class, event -> {
            getLogger().info("Server booted!");
        });

    // Check if still active
    if (bootReg.isRegistered()) {
        getLogger().info("Boot listener is registered.");
    }

    // Manually unregister (optional -- auto-cleaned on shutdown)
    bootReg.unregister();

    // Now returns false
    assert !bootReg.isRegistered();

    // Safe to call again -- no-op
    bootReg.unregister();
}
```

## Related Types

- [Registry](Registry.md) -- the abstract registry that creates and manages registrations
- [Registry.RegistrationWrapFunction](Registry.md#inner-interface-registrationwrapfunction) -- wraps registrations with lifecycle tracking
- [PluginBase](PluginBase.md) -- owns the registries; shutdown triggers cascading cleanup
- [EventRegistry](EventRegistry.md) -- concrete registry whose `register()` returns event-specific registrations
- [CommandRegistry](CommandRegistry.md) -- concrete registry whose registration methods return command-specific registrations
- [Registry System Overview](../registries/index.md) -- architectural overview of the registry system
