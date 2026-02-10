---
title: "PlayerChatEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.player"
fqcn: "com.hypixel.hytale.server.core.event.events.player.PlayerChatEvent"
api_surface: "public"
cancellable: true
generator_version: "1.0.0"
generated_at: "2026-02-09T23:10:00Z"
tags:
  - player
  - chat
  - async
  - cancellable
---

> Package: `com.hypixel.hytale.server.core.event.events.player`
> Implements: `IAsyncEvent<String>`, `ICancellable`
> Cancellable: Yes
> Key type: `String`

Dispatched asynchronously when a player sends a chat message. This is the **only async event** in the Hytale event system -- listeners receive a `CompletableFuture` rather than the event directly, enabling non-blocking processing of chat messages.

All data fields are mutable, allowing listeners to modify the sender, target list, message content, and formatting before the message is delivered.

Because the key type is `String`, this event is dispatched with a string key and listeners can filter by key value.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Notes |
|-------|------|----------|---------|-------|
| `sender` | `PlayerRef` | `getSender()` | Yes | The player who sent the message. |
| `targets` | `List<PlayerRef>` | `getTargets()` | Yes | The list of players who will receive the message. |
| `content` | `String` | `getContent()` | Yes | The raw text content of the chat message. |
| `formatter` | `PlayerChatEvent.Formatter` | `getFormatter()` | Yes | The formatter used to produce the final `Message` from sender and content. |

## Inner Types

### Formatter (interface)

Functional interface that controls how the chat message is formatted for display.

```java
public interface Formatter {
    @Nonnull
    Message format(@Nonnull PlayerRef var1, @Nonnull String var2);
}
```

The `DEFAULT_FORMATTER` uses the `server.chat.playerMessage` translation key to produce the formatted message.

## Fired By

- `GamePacketHandler` (line 367) via `eventBus.dispatchForAsync()` -- async dispatch when a player sends a chat message through the game packet handler.

## Listening

Because `PlayerChatEvent` implements `IAsyncEvent`, you must use `registerAsync` instead of `register`. The callback receives a `CompletableFuture<PlayerChatEvent>` rather than the event directly.

```java
getEventRegistry().registerAsync(PlayerChatEvent.class, future -> {
    return future.thenApply(event -> {
        // Modify message content
        event.setContent(event.getContent().toUpperCase());
        return event;
    });
});
```

To cancel the event asynchronously:

```java
getEventRegistry().registerAsync(PlayerChatEvent.class, future -> {
    return future.thenApply(event -> {
        if (event.getContent().contains("blocked")) {
            event.setCancelled(true);
        }
        return event;
    });
});
```

## Related Events

This event is unique in the Hytale event system as the only async event. There are no directly related events in the same lifecycle, but it is part of the broader player event family:

- [`PlayerConnectEvent`](./PlayerConnectEvent.md) -- fired when the player connects. The player must be connected before chat events can fire.
- [`PlayerDisconnectEvent`](./PlayerDisconnectEvent.md) -- fired when the player disconnects. No further chat events fire after this.
