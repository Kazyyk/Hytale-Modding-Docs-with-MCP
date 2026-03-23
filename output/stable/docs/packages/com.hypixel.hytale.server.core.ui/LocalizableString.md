---
title: "LocalizableString"
kind: "class"
package: "com.hypixel.hytale.server.core.ui"
fqcn: "com.hypixel.hytale.server.core.ui.LocalizableString"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "core"
  - "ui"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.ui`

```java
public class LocalizableString
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `LocalizableString.LocalizableStringCodec` | `CODEC` |
| `public static final` | `BuilderCodec<LocalizableString>` | `MESSAGE_OBJECT_CODEC` |
| `private` | `String` | `stringValue` |
| `private` | `String` | `messageId` |
| `private` | `Map<String, String>` | `messageParams` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `LocalizableString` | `fromString(String str)` |
| `@Nonnull public static` | `LocalizableString` | `fromMessageId(String messageId)` |
| `@Nonnull public static` | `LocalizableString` | `fromMessageId(String messageId, Map<String, String> params)` |

## Inner Types

- `LocalizableString.LocalizableStringCodec`
