---
title: "CommandBase"
kind: "class"
package: "com.hypixel.hytale.server.core.command.system.basecommands"
api_surface: "public"
extends: "AbstractCommand"
generator_version: "1.0.0"
generated_at: "2026-02-09T23:30:00Z"
tags:
  - "commands"
  - "class"
  - "abstract"
---

> Package: `com.hypixel.hytale.server.core.command.system.basecommands`

Synchronous command base class. Wraps `execute(CommandContext)` to call `executeSync(CommandContext)` and return `null` (no future). Most simple commands extend this class.

## Class Signature

```java
public abstract class CommandBase extends AbstractCommand
```

## Constructors

```java
public CommandBase(@Nonnull String name, @Nonnull String description)
```

Standard constructor with command name and description translation key.

```java
public CommandBase(@Nonnull String name, @Nonnull String description, boolean requiresConfirmation)
```

Constructor with confirmation flag — adds a `--confirm` flag that must be provided.

```java
public CommandBase(@Nonnull String description)
```

Description-only constructor for usage variant commands.

## Abstract Methods

```java
protected abstract void executeSync(@Nonnull CommandContext var1);
```

Implement this to define the command's behavior. Called synchronously on `ForkJoinPool.commonPool()`. Use `CommandContext` to access parsed arguments, the sender, and send responses.

## Implementation Detail

```java
@Nullable
@Override
protected final CompletableFuture<Void> execute(@Nonnull CommandContext context) {
    this.executeSync(context);
    return null;
}
```

The `execute()` method is `final` — it delegates to `executeSync()` and returns `null`, signaling synchronous completion to the command dispatcher.

## Example

```java
public class KickCommand extends CommandBase {
    private final RequiredArg<PlayerRef> playerArg;

    public KickCommand() {
        super("kick", "server.commands.kick.description");
        this.playerArg = withRequiredArg("player", "server.commands.kick.player", ArgumentType.PLAYER_REF);
    }

    @Override
    protected void executeSync(@Nonnull CommandContext context) {
        PlayerRef player = context.get(playerArg);
        player.disconnect(Message.raw("Kicked by " + context.sender().getDisplayName()));
    }
}
```

## Related

- **[AbstractCommand](AbstractCommand.md)** — Parent class with full builder API
- **[CommandContext](CommandContext.md)** — Execution context
- **[Command System Overview](../commands/index.md)** — Full command system documentation
