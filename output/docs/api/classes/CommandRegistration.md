---
title: CommandRegistration
kind: class
package: com.hypixel.hytale.server.core.command.system
api_surface: true
extends: Registration
generator_version: "1.0.0"
generated_at: "2026-02-10T06:35:00Z"
tags:
  - command
  - registration
  - lifecycle
---

**Package:** `com.hypixel.hytale.server.core.command.system`

```java
public class CommandRegistration extends Registration
```

A registration handle for commands. Extends [Registration](Registration.md) with a reference to the [AbstractCommand](AbstractCommand.md) that was registered. Returned by [`CommandRegistry.registerCommand()`](CommandRegistry.md#registercommand).

## Fields

```java
@Nonnull
private final AbstractCommand abstractCommand
```

The command instance that this registration wraps. Set during construction and not publicly accessible -- the handle is used for lifecycle management (`unregister()`, `isRegistered()`), not for accessing the command.

## Constructors

### Primary constructor

```java
public CommandRegistration(@Nonnull AbstractCommand command, @Nonnull BooleanSupplier isEnabled, @Nonnull Runnable unregister)
```

Creates a new command registration for the given command.

- **command** -- the [AbstractCommand](AbstractCommand.md) instance being registered.
- **isEnabled** -- the owning registry's enabled state supplier (from [Registration](Registration.md)).
- **unregister** -- the callback that removes the command from the `CommandManager` (from [Registration](Registration.md)).

### Copy constructor

```java
public CommandRegistration(@Nonnull CommandRegistration registration, @Nonnull BooleanSupplier isEnabled, @Nonnull Runnable unregister)
```

Creates a new registration that copies the command reference from an existing `CommandRegistration` but uses new lifecycle callbacks. Used internally by [CommandRegistry](CommandRegistry.md) when wrapping a registration in the plugin-scoped lifecycle.

## Inherited from Registration

This class inherits the following from [Registration](Registration.md):

- `unregister()` -- removes the command from the server's `CommandManager`. Idempotent and shutdown-safe.
- `isRegistered()` -- returns `true` if not explicitly unregistered and the owning registry is still active.

See [Registration -- Lifecycle](Registration.md#lifecycle) for the full state diagram.

## Usage Example

```java
@Override
protected void setup() {
    CommandRegistry commands = getCommandRegistry();

    // registerCommand() returns a CommandRegistration handle
    CommandRegistration reg = commands.registerCommand(new SpawnCommand());

    // Check if still active
    if (reg.isRegistered()) {
        getLogger().info("Spawn command is registered.");
    }

    // Manually unregister (optional -- auto-cleaned on plugin shutdown)
    reg.unregister();
}
```

## Related Types

- [Registration](Registration.md) -- base class providing lifecycle management (`unregister()`, `isRegistered()`)
- [CommandRegistry](CommandRegistry.md) -- plugin-scoped registry whose `registerCommand()` returns `CommandRegistration` handles
- [AbstractCommand](AbstractCommand.md) -- base class for defining commands
- [CommandBase](CommandBase.md) -- synchronous command convenience base class
- [Registry](Registry.md) -- abstract registry managing registration lifecycle
- [PluginBase](PluginBase.md) -- provides `getCommandRegistry()`
- `CommandManager` -- server-level command dispatcher
- [Command System Overview](../commands/index.md) -- full command system documentation
