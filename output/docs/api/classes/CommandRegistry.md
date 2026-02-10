---
title: CommandRegistry
kind: class
package: com.hypixel.hytale.server.core.command.system
api_surface: true
extends: Registry<CommandRegistration>
generator_version: "1.0.0"
generated_at: "2026-02-09T23:30:00Z"
tags:
  - command
  - registry
  - plugin-scoped
---

**Package:** `com.hypixel.hytale.server.core.command.system`

```java
public class CommandRegistry extends Registry<CommandRegistration>
```

A plugin-scoped proxy for registering chat/console commands. Obtained via [`PluginBase.getCommandRegistry()`](PluginBase.md#commands). All registrations made through this registry are automatically unregistered when the owning plugin shuts down.

## Constructor

```java
public CommandRegistry(@Nonnull List<BooleanConsumer> registrations, BooleanSupplier precondition, String preconditionMessage, PluginBase plugin)
```

Constructed internally by `PluginBase`. The `plugin` reference is stored so that each registered command can be associated with its owning plugin via `command.setOwner(plugin)`. The `precondition` supplier checks that the plugin is in an active state.

## Methods

### registerCommand

```java
public CommandRegistration registerCommand(@Nonnull AbstractCommand command)
```

Registers a command with the server's `CommandManager`. This method:

1. Calls `checkPrecondition()` -- throws `IllegalStateException` if the plugin is not in an active state.
2. Sets the command's owner to the plugin (`command.setOwner(this.plugin)`), if the plugin reference is non-null. This triggers auto-permission generation (see below).
3. Delegates to `CommandManager.get().register(command)` to perform the actual registration with the server's command dispatcher.
4. Wraps the returned `CommandRegistration` in the plugin-scoped [Registry](Registry.md) lifecycle via `super.register()`, ensuring the command is unregistered on plugin shutdown.

Returns a `CommandRegistration` handle. Call `registration.unregister()` to remove the command before plugin shutdown, or let automatic cleanup handle it.

**Parameters:**

- `command` -- An [AbstractCommand](AbstractCommand.md) subclass defining the command's name, arguments, permissions, and execution logic.

**Throws:**

- `IllegalStateException` -- if the plugin is not in an active state (precondition fails) or if the registry has been shut down.

## Auto-Permission Generation

When `registerCommand()` sets the command's owner via `AbstractCommand.setOwner()`, permissions are auto-generated for the command and all its subcommands. The permission string is derived from the plugin's base permission:

```
{plugin.getBasePermission()}.command.{commandName}
```

For example, a plugin with manifest group `com.example` and name `myplugin` has a base permission of `com.example.myplugin`. A command named `spawn` registered through that plugin receives the permission:

```
com.example.myplugin.command.spawn
```

Subcommands append their name to the parent command's permission:

```
com.example.myplugin.command.spawn.set
com.example.myplugin.command.spawn.remove
```

You can override auto-generated permissions by calling `AbstractCommand.requirePermission()` before registration. See [AbstractCommand -- Permission Methods](AbstractCommand.md#permission-methods) for details.

## Delegation to CommandManager

The `CommandManager` is the server-level singleton responsible for command dispatch. When `CommandRegistry` delegates to `CommandManager.get().register(command)`, the command manager:

1. Indexes the command by name and all aliases.
2. Makes the command available for tab completion and execution via chat or console.
3. Returns a `CommandRegistration` handle that the `CommandRegistry` wraps in the plugin lifecycle.

The plugin does not interact with `CommandManager` directly. All registration goes through `CommandRegistry` to ensure proper ownership and lifecycle management.

## Inherited from Registry

This class inherits the following from [Registry](Registry.md):

- `isEnabled()` -- returns whether the registry is active.
- `enable()` -- re-enables the registry.
- `shutdown()` -- disables the registry and unregisters all commands.
- `register(T registration)` -- internal method for wrapping a registration in the lifecycle.
- `getRegistrations()` -- returns an unmodifiable view of the shutdown tasks.

## Usage Example

### Basic command registration

```java
@Override
protected void setup() {
    CommandRegistry commands = getCommandRegistry();

    // Register a custom command
    CommandRegistration reg = commands.registerCommand(new SpawnCommand());

    // The command is now available in-game as /spawn.
    // Permission auto-generated: {basePermission}.command.spawn
    // It will be automatically unregistered on plugin shutdown.
}
```

### Command with subcommands

```java
public class SpawnCommand extends AbstractCommandCollection {
    public SpawnCommand() {
        super("spawn", "myplugin.commands.spawn.description");
        addSubCommand(new SpawnSetCommand());
        addSubCommand(new SpawnRemoveCommand());
        addSubCommand(new SpawnListCommand());
    }
}

// In setup():
commands.registerCommand(new SpawnCommand());
// Generates permissions:
//   {basePermission}.command.spawn
//   {basePermission}.command.spawn.set
//   {basePermission}.command.spawn.remove
//   {basePermission}.command.spawn.list
```

### Manual unregistration

```java
private CommandRegistration spawnReg;

@Override
protected void setup() {
    spawnReg = getCommandRegistry().registerCommand(new SpawnCommand());
}

// Later, if needed:
public void disableSpawnCommand() {
    spawnReg.unregister();
}
```

## Related Types

- [PluginBase](PluginBase.md) -- provides `getCommandRegistry()`
- [Registry](Registry.md) -- base class providing lifecycle management
- [Registration](Registration.md) -- base handle for registrations
- `CommandRegistration` -- typed handle returned by `registerCommand()`; extends [Registration](Registration.md) and holds a reference to the `AbstractCommand`
- [AbstractCommand](AbstractCommand.md) -- base class for defining commands with arguments, permissions, and execution logic
- [CommandBase](CommandBase.md) -- synchronous command convenience base class
- `CommandManager` -- server-level command manager that performs the actual registration
- `CommandOwner` -- interface implemented by `PluginBase` for command ownership
- [Command System Overview](../commands/index.md) -- full command system documentation
