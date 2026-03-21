---
title: "Message"
kind: "class"
package: "com.hypixel.hytale.server.core"
fqcn: "com.hypixel.hytale.server.core.Message"
api_surface: true
extends: ~
implements: []
generator_version: "1.0.0"
generated_at: "2026-03-20T20:00:00Z"
tags:
  - "messaging"
  - "chat"
  - "i18n"
  - "formatting"
---

**Package:** `com.hypixel.hytale.server.core`

```java
public class Message
```

Represents a formatted message that can be sent to players or other message receivers. Messages support rich text formatting (bold, italic, monospace, color, links), parameterized i18n translations, raw text, child message composition, and JSON-based codec serialization. All builder-style methods return `this` for fluent chaining.

## Fields

| Field | Type | Description |
|---|---|---|
| `CODEC` | `FunctionCodec<FormattedMessage, Message>` | Public codec for serializing and deserializing `Message` instances to and from `FormattedMessage`. |

## Static Factory Methods

These are the primary entry points for creating `Message` instances.

```java
@Nonnull
public static Message empty()
```

Creates an empty message with no text or translation key.

```java
@Nonnull
public static Message translation(@Nonnull String messageId)
```

Creates a message backed by an i18n translation key. The key is resolved at render time via the server's `I18nModule`.

```java
@Nonnull
public static Message raw(@Nonnull String message)
```

Creates a message containing literal (non-translated) text.

```java
@Nonnull
public static Message parse(@Nonnull String message)
```

Parses a JSON string into a `Message` using the `CODEC`. Throws if the JSON is malformed.

```java
@Nonnull
public static Message join(@Nonnull Message... messages)
```

Creates a new empty message and inserts all provided messages as children.

## Parameter Methods

All `param` overloads attach a named parameter to the message. Parameters are substituted into translation strings at render time. Each overload returns `this` for chaining.

```java
@Nonnull
public Message param(@Nonnull String key, @Nonnull String value)
```

Attaches a string parameter.

```java
@Nonnull
public Message param(@Nonnull String key, boolean value)
```

Attaches a boolean parameter.

```java
@Nonnull
public Message param(@Nonnull String key, double value)
```

Attaches a double parameter.

```java
@Nonnull
public Message param(@Nonnull String key, int value)
```

Attaches an integer parameter.

```java
@Nonnull
public Message param(@Nonnull String key, long value)
```

Attaches a long parameter.

```java
@Nonnull
public Message param(@Nonnull String key, float value)
```

Attaches a float parameter (stored internally as a double).

```java
@Nonnull
public Message param(@Nonnull String key, @Nonnull Message formattedMessage)
```

Attaches a nested `Message` as a named message parameter. Message parameters are stored separately from primitive parameters and are resolved recursively.

## Formatting Methods

```java
@Nonnull
public Message bold(boolean bold)
```

Sets whether the message text is rendered in bold.

```java
@Nonnull
public Message italic(boolean italic)
```

Sets whether the message text is rendered in italic.

```java
@Nonnull
public Message monospace(boolean monospace)
```

Sets whether the message text is rendered in monospace font.

```java
@Nonnull
public Message color(@Nonnull String color)
```

Sets the text color using a color string (e.g., a hex color code).

```java
@Nonnull
public Message color(@Nonnull Color color)
```

Sets the text color using a `java.awt.Color` instance. The color is converted to a hex string internally.

```java
@Nonnull
public Message link(@Nonnull String url)
```

Attaches a clickable link URL to the message.

## Child Composition Methods

Messages form a tree structure. These methods append child messages to the current message.

```java
@Nonnull
public Message insert(@Nonnull Message formattedMessage)
```

Appends a child message.

```java
@Nonnull
public Message insert(@Nonnull String message)
```

Appends a raw text child message. Convenience overload that wraps the string via `raw()`.

```java
@Nonnull
public Message insertAll(@Nonnull Message... formattedMessages)
```

Appends multiple child messages from a varargs array.

```java
@Nonnull
public Message insertAll(@Nonnull List<Message> formattedMessages)
```

Appends multiple child messages from a list.

## Accessor Methods

```java
@Nullable
public String getRawText()
```

Returns the raw text content, or `null` if this message uses a translation key.

```java
@Nullable
public String getMessageId()
```

Returns the i18n translation key, or `null` if this message uses raw text.

```java
@Nullable
public String getColor()
```

Returns the color string, or `null` if no color is set.

```java
@Nonnull
public List<Message> getChildren()
```

Returns the child messages as a list. Returns an empty list if there are no children.

```java
@Nonnull
public String getAnsiMessage()
```

Resolves the message to a plain-text string. If the message has raw text, returns it directly. If it has a translation key, resolves via `I18nModule` for the `en-US` locale and formats parameters. Falls back to the raw message ID and parameters if no translation is found.

```java
public FormattedMessage getFormattedMessage()
```

Returns the underlying `FormattedMessage` protocol object.

```java
@Override
public String toString()
```

Delegates to `FormattedMessage.toString()`.

## Constructors

```java
protected Message(@Nonnull String message, boolean i18n)
```

Creates a message with either raw text or a translation key depending on the `i18n` flag.

```java
protected Message()
```

Creates an empty message with a new `FormattedMessage`.

```java
public Message(@Nonnull FormattedMessage message)
```

Wraps an existing `FormattedMessage` protocol object.

## Example

```java
// Send a formatted chat message to a player
Message msg = Message.translation("game.welcome")
    .param("playerName", player.getName())
    .bold(true)
    .color("#00FF00");
player.sendMessage(msg);

// Compose a message with children
Message composed = Message.raw("Score: ")
    .insert(Message.raw("100").bold(true).color("#FFD700"));
```

## Related Types

- [IMessageReceiver](IMessageReceiver.md) -- interface for types that can receive messages
- [Player](Player.md) -- implements `IMessageReceiver`, the primary message target
- [CommandSender](CommandSender.md) -- can send messages as command feedback
- `FormattedMessage` -- underlying protocol-level message representation
