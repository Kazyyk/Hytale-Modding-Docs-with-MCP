---
title: "IMessageReceiver"
kind: "interface"
package: "com.hypixel.hytale.server.core.receiver"
fqcn: "com.hypixel.hytale.server.core.receiver.IMessageReceiver"
api_surface: true
extends: ~
implements: []
generator_version: "1.0.0"
generated_at: "2026-03-20T20:00:00Z"
tags:
  - "messaging"
  - "receiver"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.core.receiver`

```java
public interface IMessageReceiver
```

Defines a receiver that can accept formatted messages. This is the primary abstraction for sending chat or system messages to players and other message-capable targets. [Player](Player.md) implements this interface.

## Methods

```java
void sendMessage(@Nonnull Message var1)
```

Sends a [Message](Message.md) to this receiver. The message may contain raw text, an i18n translation key with parameters, rich formatting (bold, italic, color), or a tree of child messages.

## Example

```java
// Send a message to any IMessageReceiver
public void greet(IMessageReceiver receiver) {
    receiver.sendMessage(Message.raw("Hello!").bold(true));
}
```

## Related Types

- [Message](Message.md) -- the formatted message type sent to receivers
- [Player](Player.md) -- the primary implementation of this interface
- [IPacketReceiver](IPacketReceiver.md) -- related receiver interface for raw packets
- [CommandSender](CommandSender.md) -- command-scoped message sender
