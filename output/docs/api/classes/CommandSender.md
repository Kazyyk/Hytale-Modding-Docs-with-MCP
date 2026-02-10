---
title: "CommandSender"
kind: "interface"
package: "com.hypixel.hytale.server.core.command.system"
api_surface: "public"
extends:
  - "IMessageReceiver"
  - "PermissionHolder"
generator_version: "1.0.0"
generated_at: "2026-02-09T23:30:00Z"
tags:
  - "commands"
  - "interface"
---

> Package: `com.hypixel.hytale.server.core.command.system`

Interface representing the entity that executed a command. Extends `IMessageReceiver` (can receive messages) and `PermissionHolder` (has permissions). Implemented by `Player` and the server console.

## Interface Signature

```java
public interface CommandSender extends IMessageReceiver, PermissionHolder
```

## Methods

```java
String getDisplayName();
```

Returns the display name of the sender (e.g., the player's username or `"Console"`).

```java
UUID getUuid();
```

Returns the sender's UUID.

## Inherited Methods

### From `IMessageReceiver`

```java
void sendMessage(Message message);
```

Sends a formatted message to the sender.

### From `PermissionHolder`

```java
boolean hasPermission(String permission);
```

Checks whether the sender has a specific permission.

## Known Implementors

| Class | Context |
|-------|---------|
| [`Player`](Player.md) | In-game player executing a command |
| Server console | Console command input |

## Usage

`CommandSender` is accessed through `CommandContext.sender()`:

```java
@Override
protected void executeSync(@Nonnull CommandContext context) {
    CommandSender sender = context.sender();

    // Check sender type
    if (context.isPlayer()) {
        Player player = context.senderAs(Player.class);
        // player-specific logic
    }

    // Send response (works for any sender type)
    sender.sendMessage(Message.raw("Hello, " + sender.getDisplayName()));

    // Check permissions
    if (sender.hasPermission("myplugin.admin")) {
        // admin-only logic
    }
}
```

## Related

- **[CommandContext](CommandContext.md)** — Provides `sender()` accessor
- **[AbstractCommand](AbstractCommand.md)** — Permission checking via `hasPermission(CommandSender)`
- **[Player](Player.md)** — Primary implementor; the in-game player entity
- **[Command System Overview](../commands/index.md)** — Full command system documentation
