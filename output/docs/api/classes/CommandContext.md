---
title: "CommandContext"
kind: "class"
package: "com.hypixel.hytale.server.core.command.system"
api_surface: "public"
extends: ~
generator_version: "1.0.0"
generated_at: "2026-02-09T23:30:00Z"
tags:
  - "commands"
  - "class"
---

> Package: `com.hypixel.hytale.server.core.command.system`

Execution context passed to a command's `execute()` or `executeSync()` method. Holds the sender, parsed argument values, the original input string, and the command that was invoked.

## Class Signature

```java
public final class CommandContext
```

## Constructor

```java
public CommandContext(@Nonnull AbstractCommand calledCommand, @Nonnull CommandSender sender, @Nonnull String inputString)
```

Constructed internally by the command dispatcher. Not typically created by plugin code.

## Argument Access

```java
public <DataType> DataType get(@Nonnull Argument<?, DataType> argument)
```

Retrieves the parsed value for a declared argument. For `DefaultArg` arguments that were not provided by the user, returns the default value. The `Argument` parameter is the field returned by `withRequiredArg()`, `withOptionalArg()`, etc.

```java
public String[] getInput(@Nonnull Argument<?, ?> argument)
```

Returns the raw string tokens that were parsed for this argument.

```java
public boolean provided(@Nonnull Argument<?, ?> argument)
```

Returns `true` if the user explicitly provided this argument. Useful for optional arguments where you need to distinguish "not provided" from "provided as default value".

## Sender Access

```java
@Nonnull
public CommandSender sender()
```

Returns the entity that executed the command.

```java
public boolean isPlayer()
```

Returns `true` if the sender is a `Player` instance.

```java
@Nonnull
public <T extends CommandSender> T senderAs(@Nonnull Class<T> senderType)
```

Casts the sender to a specific type. Throws `SenderTypeException` if the cast fails.

```java
@Nullable
public Ref<EntityStore> senderAsPlayerRef()
```

Convenience method: casts the sender to `Player` and returns its entity reference. Equivalent to `senderAs(Player.class).getReference()`.

## Utility Methods

```java
public void sendMessage(@Nonnull Message message)
```

Sends a message to the command sender. Delegates to `sender.sendMessage(message)`.

```java
@Nonnull
public String getInputString()
```

Returns the full original input string (everything after the `/`).

```java
@Nonnull
public AbstractCommand getCalledCommand()
```

Returns the `AbstractCommand` instance that was matched and invoked.

## Usage Example

```java
@Override
protected void executeSync(@Nonnull CommandContext context) {
    // Get parsed argument
    String targetName = context.get(nameArg);

    // Check if optional arg was provided
    if (context.provided(radiusArg)) {
        int radius = context.get(radiusArg);
        // use radius...
    }

    // Check sender type
    if (context.isPlayer()) {
        Ref<EntityStore> playerRef = context.senderAsPlayerRef();
        // do player-specific logic...
    }

    // Send response
    context.sendMessage(Message.raw("Done!"));
}
```

## Related

- **[AbstractCommand](AbstractCommand.md)** — Command base class
- **[CommandBase](CommandBase.md)** — Synchronous command base
- **[CommandSender](CommandSender.md)** — Sender interface
- **[Command System Overview](../commands/index.md)** — Full command system documentation
