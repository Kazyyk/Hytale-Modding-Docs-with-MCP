---
title: "MessageUtil"
kind: "class"
package: "com.hypixel.hytale.server.core.util"
fqcn: "com.hypixel.hytale.server.core.util.MessageUtil"
api_surface: false
generator_version: "2.0.0"
generated_at: "2026-03-22T00:00:00Z"
tags:
  - "messaging"
  - "i18n"
  - "utility"
---

**Package:** `com.hypixel.hytale.server.core.util`

```java
public class MessageUtil
```

Utility class for message formatting, ANSI rendering, and internationalization text processing. Provides ICU-style message formatting with support for plural rules, select expressions, number/date/time formatting, and nested parameter substitution. Includes plural category implementations for 17+ languages.

## Key Static Methods

| Method | Return Type | Description |
|---|---|---|
| `toAnsiString(Message)` | `AttributedString` | Converts a `Message` to an ANSI-styled string for terminal output, applying hex color codes. |
| `hexToStyle(String)` | `AttributedStyle` | Parses a hex color string and returns the nearest 256-color ANSI style. |
| `containsControlCharacters(String)` | `boolean` | Checks for ASCII control characters, DEL, and C1 control codes (U+0080..U+009F). |
| `formatMessageToPlainString(FormattedMessage)` | `String` | Recursively formats a `FormattedMessage` to plain text, resolving translation keys via `I18nModule`. |
| `sendSuccessReply(PlayerRef, int, Message)` | `void` | Sends a `SuccessReply` packet to a player. Deprecated. |
| `sendFailureReply(PlayerRef, int, Message)` | `void` | Sends a `FailureReply` packet to a player. Deprecated. |
| `formatText(String, Map<String, ParamValue>, Map<String, FormattedMessage>)` | `String` | ICU-style text formatter supporting `{key}`, `{key, format}`, and `{key, format, options}` patterns. |

## Format Types

The `formatText` method supports these format specifiers:

| Format | Description |
|---|---|
| `upper` | Converts string parameter to uppercase. |
| `lower` | Converts string parameter to lowercase. |
| `number` | Formats as number with `integer` or `decimal` options. |
| `plural` | ICU plural selection with `zero`, `one`, `two`, `few`, `many`, `other` keywords. |
| `date` | Formats a timestamp as a localized short date. |
| `time` | Formats a timestamp as a localized short time. |
| `select` | ICU select expression choosing text by key match. |
