---
title: "Message"
kind: "class"
package: "com.hypixel.hytale.server.core"
fqcn: "com.hypixel.hytale.server.core.Message"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "core"
  - "message"
  - "i18n"
---

**Package:** `com.hypixel.hytale.server.core`

```java
public class Message
```

A rich text message supporting i18n translations, parameterized values, styling (bold, italic, monospace, underline, color), hyperlinks, and child message composition. Wraps the protocol-level `FormattedMessage` and provides a fluent builder API. Used throughout the server for chat messages, display names, and UI text.

## Factory Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `Message` | `empty()` |
| `@Nonnull public static` | `Message` | `translation(@Nonnull String messageId)` |
| `@Nonnull public static` | `Message` | `raw(@Nonnull String message)` |
| `@Nonnull public static` | `Message` | `parse(@Nonnull String message)` |
| `@Nonnull public static` | `Message` | `join(@Nonnull Message... messages)` |

## Builder Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `Message` | `param(@Nonnull String key, @Nonnull String value)` |
| `@Nonnull public` | `Message` | `param(@Nonnull String key, boolean value)` |
| `@Nonnull public` | `Message` | `param(@Nonnull String key, double value)` |
| `@Nonnull public` | `Message` | `param(@Nonnull String key, int value)` |
| `@Nonnull public` | `Message` | `param(@Nonnull String key, long value)` |
| `@Nonnull public` | `Message` | `param(@Nonnull String key, float value)` |
| `@Nonnull public` | `Message` | `param(@Nonnull String key, @Nonnull Message formattedMessage)` |
| `@Nonnull public` | `Message` | `bold(boolean bold)` |
| `@Nonnull public` | `Message` | `italic(boolean italic)` |
| `@Nonnull public` | `Message` | `monospace(boolean monospace)` |
| `@Nonnull public` | `Message` | `color(@Nonnull String color)` |
| `@Nonnull public` | `Message` | `color(@Nonnull Color color)` |
| `@Nonnull public` | `Message` | `link(@Nonnull String url)` |
| `@Nonnull public` | `Message` | `insert(@Nonnull Message formattedMessage)` |
| `@Nonnull public` | `Message` | `insert(@Nonnull String message)` |
| `@Nonnull public` | `Message` | `insertAll(@Nonnull Message... formattedMessages)` |
| `@Nonnull public` | `Message` | `insertAll(@Nonnull List<Message> formattedMessages)` |

## Accessor Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable public` | `String` | `getRawText()` |
| `@Nullable public` | `String` | `getMessageId()` |
| `@Nullable public` | `String` | `getColor()` |
| `@Nonnull public` | `List<Message>` | `getChildren()` |
| `@Nonnull public` | `String` | `getAnsiMessage()` |
| `public` | `FormattedMessage` | `getFormattedMessage()` |
