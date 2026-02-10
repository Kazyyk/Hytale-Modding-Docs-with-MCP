---
title: "AbstractCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.command.system"
api_surface: "public"
extends: ~
generator_version: "1.0.0"
generated_at: "2026-02-09T23:30:00Z"
tags:
  - "commands"
  - "class"
  - "abstract"
---

> Package: `com.hypixel.hytale.server.core.command.system`

Core abstract base class for all commands. Provides the builder API for declaring arguments, subcommands, usage variants, aliases, and permissions. Subclass this (or one of its convenience subclasses) and implement `execute(CommandContext)` to define a command.

## Class Signature

```java
public abstract class AbstractCommand
```

## Constructors

```java
protected AbstractCommand(@Nullable String name, @Nullable String description, boolean requiresConfirmation)
```

Primary constructor. `name` is the command name (lowercased internally); pass `null` for usage variant commands. `description` is a translation key. If `requiresConfirmation` is `true`, a `--confirm` flag is auto-registered and required before execution.

```java
protected AbstractCommand(@Nullable String name, @Nullable String description)
```

Delegates to the primary constructor with `requiresConfirmation = false`.

```java
protected AbstractCommand(@Nullable String description)
```

Delegates with `name = null` — used for usage variant commands.

## Abstract Methods

```java
@Nullable
protected abstract CompletableFuture<Void> execute(@Nonnull CommandContext var1);
```

Called when the command is invoked and all arguments have been parsed and validated. Return `null` for synchronous commands, or a `CompletableFuture` for async commands.

## Argument Builder Methods

These methods declare the command's arguments. Call them in the constructor or `setup()`. Arguments are parsed in declaration order for required args, and by name prefix for optional args.

### Required Arguments

```java
@Nonnull
public <D> RequiredArg<D> withRequiredArg(@Nonnull String name, @Nonnull String description, @Nonnull ArgumentType<D> argType)
```

```java
public <W extends WrappedArg<D>, D> W withRequiredArg(@Nonnull String name, @Nonnull String description, @Nonnull ArgWrapper<W, D> wrapper)
```

```java
@Nonnull
public <D> RequiredArg<List<D>> withListRequiredArg(@Nonnull String name, @Nonnull String description, @Nonnull ArgumentType<D> argType)
```

### Optional Arguments

```java
@Nonnull
public <D> OptionalArg<D> withOptionalArg(@Nonnull String name, @Nonnull String description, @Nonnull ArgumentType<D> argType)
```

```java
public <W extends WrappedArg<D>, D> W withOptionalArg(@Nonnull String name, @Nonnull String description, @Nonnull ArgWrapper<W, D> wrapper)
```

```java
@Nonnull
public <D> OptionalArg<List<D>> withListOptionalArg(@Nonnull String name, @Nonnull String description, @Nonnull ArgumentType<D> argType)
```

### Default Arguments

Optional arguments with a fallback value when not provided.

```java
@Nonnull
public <D> DefaultArg<D> withDefaultArg(String name, String description, ArgumentType<D> argType, @Nullable D defaultValue, String defaultValueDescription)
```

```java
public <W extends WrappedArg<D>, D> W withDefaultArg(@Nonnull String name, @Nonnull String description, @Nonnull ArgWrapper<W, D> wrapper, D defaultValue, @Nonnull String defaultValueDescription)
```

```java
@Nonnull
public <D> DefaultArg<List<D>> withListDefaultArg(@Nonnull String name, @Nonnull String description, @Nonnull ArgumentType<D> argType, List<D> defaultValue, @Nonnull String defaultValueDescription)
```

### Flag Arguments

Boolean flags prefixed with `--`.

```java
@Nonnull
public FlagArg withFlagArg(@Nonnull String name, @Nonnull String description)
```

## Structure Methods

### Subcommands

```java
public void addSubCommand(@Nonnull AbstractCommand command)
```

Adds a named subcommand. The subcommand's name becomes the first argument token that routes to it. Each subcommand can only have one parent. Throws `IllegalStateException` if the command has already been registered.

### Usage Variants

```java
public void addUsageVariant(@Nonnull AbstractCommand command)
```

Adds a usage variant — an alternative argument pattern for the same command name. Variants are distinguished by their number of required parameters. The variant command must use the description-only constructor (no name). Example: `/kill` (self) vs `/kill <player>` (other).

### Aliases

```java
public void addAliases(@Nonnull String... aliases)
```

Adds alternative names for this command. Aliases are lowercased. Cannot add aliases after registration or to unnamed commands.

## Permission Methods

```java
public void requirePermission(@Nonnull String permission)
```

Sets an explicit permission string. If not called, permissions are auto-generated from the command hierarchy (see below).

```java
protected void setPermissionGroups(@Nonnull String... groups)
```

Restricts the command to specific permission groups.

```java
protected void setPermissionGroup(@Nullable GameMode gameMode)
```

Restricts the command to a specific game mode's permission group.

```java
public boolean hasPermission(@Nonnull CommandSender sender)
```

Checks whether the sender has permission to execute this command. Recurses up the parent command chain — all ancestors must also pass.

### Auto-Generated Permissions

When a command's owner is set (via `setOwner()`), permissions are auto-generated if not explicitly set:

- **Plugin commands:** `{plugin.getBasePermission()}.command.{commandName}`
- **Built-in commands:** `hytale.system.command.{commandName}`
- **Subcommands:** `{parentPermission}.{subcommandName}`

## Configuration Methods

```java
public void setOwner(@Nonnull CommandOwner owner)
```

Sets the command owner (either a `PluginBase` or `CommandManager`). Propagates to all subcommands and variants. Triggers auto-permission generation.

```java
protected void setUnavailableInSingleplayer(boolean unavailableInSingleplayer)
```

Marks the command as unavailable in singleplayer mode.

```java
public void setAllowsExtraArguments(boolean allowsExtraArguments)
```

Allows extra tokens beyond declared arguments (useful for commands that accept freeform input).

## Query Methods

```java
@Nullable
public String getName()
```

```java
@Nonnull
public Set<String> getAliases()
```

```java
public String getDescription()
```

```java
@Nullable
public String getPermission()
```

```java
@Nullable
public String getFullyQualifiedName()
```

Returns the full command path (e.g., `"entity clone"` for a subcommand).

```java
@Nonnull
public Map<String, AbstractCommand> getSubCommands()
```

```java
@Nonnull
public List<RequiredArg<?>> getRequiredArguments()
```

```java
public boolean isVariant()
```

Returns `true` if this command has no name (is a usage variant).

## Subclass Hierarchy

```
AbstractCommand
├── AbstractAsyncCommand          (async base: executeAsync() -> CompletableFuture<Void>)
│   ├── AbstractPlayerCommand     (player-only: resolves sender to PlayerRef, Ref, Store, World)
│   └── AbstractCommandCollection (subcommand group: shows usage listing)
├── CommandBase                   (sync base: executeSync() -> void)
└── (direct subclasses)
```

## Example

```java
public class MyCommand extends CommandBase {
    private final RequiredArg<String> nameArg;
    private final DefaultArg<Integer> countArg;

    public MyCommand() {
        super("mycommand", "server.commands.mycommand.description");
        this.nameArg = withRequiredArg("name", "server.commands.mycommand.name", ArgumentType.STRING);
        this.countArg = withDefaultArg("count", "server.commands.mycommand.count", ArgumentType.INTEGER, 1, "1");
    }

    @Override
    protected void executeSync(@Nonnull CommandContext context) {
        String name = context.get(nameArg);
        int count = context.get(countArg);
        context.sendMessage(Message.raw("Hello " + name + " x" + count));
    }
}
```

## Related

- **[CommandBase](CommandBase.md)** — Synchronous command convenience base
- **[CommandContext](CommandContext.md)** — Execution context with parsed arguments
- **[CommandSender](CommandSender.md)** — Who executed the command
- **[Command System Overview](../commands/index.md)** — Full command system documentation
- **[CommandRegistry](CommandRegistry.md)** — Plugin registration
