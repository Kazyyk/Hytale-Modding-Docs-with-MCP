---
title: "Registry"
kind: "abstract class"
package: "com.hypixel.hytale.registry"
api_surface: true
extends: ~
generator_version: "1.0.0"
generated_at: "2026-02-09T23:30:00Z"
tags:
  - "registry"
  - "abstract"
  - "lifecycle"
  - "class"
---

**Package:** `com.hypixel.hytale.registry`

```java
public abstract class Registry<T extends Registration>
```

Abstract base class for all plugin-scoped registries. A `Registry` manages a collection of [Registration](Registration.md) objects that are tied to a plugin's lifecycle. When the plugin shuts down, the registry disables itself and all registrations it contains are automatically cleaned up.

Each registry enforces a precondition (typically that the owning plugin is in an active state) before allowing new registrations. Attempting to register when the precondition is not met throws `IllegalStateException`.

## Type Parameter

- `T extends Registration` -- the type of registration handle managed by this registry.

## Constructor

```java
protected Registry(@Nonnull List<BooleanConsumer> registrations, @Nonnull BooleanSupplier precondition, String preconditionMessage, @Nonnull Registry.RegistrationWrapFunction<T> wrappingFunction)
```

Constructs a registry with the given parameters:

- **registrations** -- a shared list of `BooleanConsumer` callbacks. Each registration appends an enable/disable callback to this list. On shutdown, every callback in this list is invoked with `false` to disable registrations.
- **precondition** -- a supplier that returns `true` when registration is allowed (e.g., the plugin is in `SETUP`, `START`, or `ENABLED` state). Checked on every call to `register()`.
- **preconditionMessage** -- the error message included in the `IllegalStateException` if the precondition fails. May be `null`.
- **wrappingFunction** -- a function that wraps each registration with lifecycle tracking. See [RegistrationWrapFunction](#inner-interface-registrationwrapfunction).

## Methods

### checkPrecondition

```java
protected void checkPrecondition()
```

Checks that the precondition supplier returns `true`. Throws `IllegalStateException` with the configured message if not. Called internally by `register()` and can be called by subclasses that need to enforce the precondition in custom registration methods.

### isEnabled

```java
public boolean isEnabled()
```

Returns `true` if the registry has not been shut down. After `shutdown()` is called, this returns `false`.

### enable

```java
public void enable()
```

Re-enables the registry. Sets the internal `enabled` flag to `true`. Purpose unknown -- inferred from usage context; no call sites found in the standard plugin lifecycle.

### shutdown

```java
public void shutdown()
```

Disables the registry by setting the enabled flag to `false`. After this call, `isEnabled()` returns `false` and all wrapped registrations that check the enabled supplier will report themselves as unregistered. This method does not individually unregister each registration -- it disables the shared enabled flag that all wrapped registrations reference.

### register

```java
public T register(@Nonnull T registration)
```

Registers a new item with this registry. The method:

1. Calls `checkPrecondition()` to verify registration is allowed.
2. Wraps the registration using the configured `wrappingFunction`, passing:
   - The original registration object.
   - The registry's `isEnabled` supplier (so the registration knows when the registry shuts down).
   - An unregister callback that is appended to the shared registrations list.
3. Returns the wrapped registration.

The wrapping step is key to lifecycle management. The wrapped registration combines the original registration's own enabled state with the registry's enabled state, so that when either the individual registration is unregistered or the entire registry shuts down, the registration reports itself as no longer active.

### getRegistrations

```java
@Nonnull
public List<BooleanConsumer> getRegistrations()
```

Returns the shared list of registration callbacks. Each entry is a `BooleanConsumer` that accepts `true` to enable or `false` to disable the corresponding registration. Used internally during plugin cleanup.

## Inner Interface: RegistrationWrapFunction

```java
public interface RegistrationWrapFunction<T extends Registration> {
    T wrap(T var1, BooleanSupplier var2, Runnable var3);
}
```

A functional interface for wrapping registrations with lifecycle tracking. Implementations receive:

- **var1** -- the original [Registration](Registration.md) to wrap.
- **var2** -- a `BooleanSupplier` representing the registry's enabled state.
- **var3** -- a `Runnable` unregister callback to invoke when the registration is removed.

The implementation should return a new registration that delegates to the original but also checks the registry's enabled state and invokes the unregister callback on cleanup. Each concrete `Registration` subclass typically provides a constructor matching this pattern (e.g., `EventRegistration::new` and `CommandRegistration::new` both serve as `RegistrationWrapFunction` implementations).

## Lifecycle Integration

The `Registry` class participates in the plugin lifecycle as follows:

1. **Plugin construction** -- [PluginBase](PluginBase.md) creates registry instances, passing a shared callback list for shutdown tasks and a precondition that checks the plugin is in an active state (`SETUP`, `START`, or `ENABLED`).

2. **Registration** -- when a plugin calls a registration method (e.g., `getEventRegistry().register(...)`), the subclass checks the precondition, delegates to the server-level manager, and calls `super.register()` to wrap the result.

3. **Manual unregister** -- calling `registration.unregister()` on the returned handle removes the shutdown callback and unregisters from the server-level manager.

4. **Plugin shutdown** -- `PluginBase.cleanup()` calls `shutdown()` on each registry (setting `enabled = false`), then iterates the shared shutdown tasks in reverse order (LIFO), invoking each callback to unregister any remaining registrations.

## Known Subclasses

| Class | Package | Purpose |
|---|---|---|
| [EventRegistry](EventRegistry.md) | `com.hypixel.hytale.event` | Event listener registration |
| [CommandRegistry](CommandRegistry.md) | `com.hypixel.hytale.server.core.command.system` | Command registration |
| `BlockStateRegistry` | `com.hypixel.hytale.server.core.universe.world.meta` | Block state registration |
| `EntityRegistry` | `com.hypixel.hytale.server.core.modules.entity` | Entity type registration |
| `TaskRegistry` | `com.hypixel.hytale.server.core.task` | Task scheduling registration |
| `AssetRegistry` | `com.hypixel.hytale.server.core.registry` | Asset registration |
| `ClientFeatureRegistry` | `com.hypixel.hytale.server.core.registry` | Client feature registration |
| `ComponentRegistryProxy` | `com.hypixel.hytale.server.core.registry` | ECS component registration |

## Related Types

- [Registration](Registration.md) -- the base handle class managed by this registry
- [PluginBase](PluginBase.md) -- creates and owns registry instances; calls `shutdown()` during cleanup
- [EventRegistry](EventRegistry.md) -- concrete subclass for event subscriptions
- [CommandRegistry](CommandRegistry.md) -- concrete subclass for commands
- [Registry System Overview](../registries/index.md) -- architectural overview of the registry system
