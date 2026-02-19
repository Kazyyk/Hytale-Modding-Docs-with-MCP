---
title: "PlayerChatEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.player"
fqcn: "com.hypixel.hytale.server.core.event.events.player.PlayerChatEvent"
api_surface: "public"
cancellable: true
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - player
  - chat
  - async
  - cancellable
---

> Package: `com.hypixel.hytale.server.core.event.events.player`
> Implements: `IAsyncEvent<String>`, `ICancellable`
> Cancellable: Yes
> Async: Yes

Asynchronous event dispatched when a player sends a chat message. This is the only async event in the concrete event set -- listeners receive a `CompletableFuture` and can perform asynchronous operations before the message is sent.

All data fields are mutable, allowing listeners to modify the sender, target list, message content, and formatting before the message is delivered. Cancelling this event prevents the chat message from being broadcast.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `sender` | `PlayerRef` | `getSender()` | Yes | No |
| `targets` | `List<PlayerRef>` | `getTargets()` | Yes | No |
| `content` | `String` | `getContent()` | Yes | No |
| `formatter` | `PlayerChatEvent.Formatter` | `getFormatter()` | Yes | No |

- **sender** -- The player who sent the message. Mutable via `setSender(@Nonnull PlayerRef)`.
- **targets** -- The list of players who will receive the message. Mutable via `setTargets(@Nonnull List<PlayerRef>)`.
- **content** -- The text content of the chat message. Mutable via `setContent(@Nonnull String)`.
- **formatter** -- The formatter used to convert the message into a `Message` object for display. Defaults to `DEFAULT_FORMATTER` which uses the `server.chat.playerMessage` translation with `username` and `message` parameters. Mutable via `setFormatter(@Nonnull PlayerChatEvent.Formatter)`.

## Inner Types

### Formatter (interface)

Functional interface for formatting chat messages.

```java
public interface Formatter {
    @Nonnull
    Message format(@Nonnull PlayerRef var1, @Nonnull String var2);
}
```

The default formatter (`DEFAULT_FORMATTER`) uses `Message.translation("server.chat.playerMessage").param("username", playerRef.getUsername()).param("message", msg)`.

## Fired By

- `GamePacketHandler` (line 367) via `eventBus dispatchForAsync` -- EventBus async dispatch when player sends a chat message.

## Listening

Because `PlayerChatEvent` implements `IAsyncEvent`, use `registerAsync` for async handling or `register` for synchronous handling.

```java
// Synchronous listener:
getEventRegistry().register(PlayerChatEvent.class, event -> {
    String content = event.getContent();

    // Example: censor profanity
    event.setContent(censorProfanity(content));
});

// Async listener (can perform I/O):
getEventRegistry().registerAsync(PlayerChatEvent.class, future -> {
    return future.thenApply(event -> {
        event.setContent(event.getContent().toUpperCase());
        return event;
    });
});
```

## Related Events

- [`PlayerConnectEvent`](./PlayerConnectEvent.md) -- Fired when a player connects to the server.
- [`PlayerDisconnectEvent`](./PlayerDisconnectEvent.md) -- Fired when a player disconnects from the server.
