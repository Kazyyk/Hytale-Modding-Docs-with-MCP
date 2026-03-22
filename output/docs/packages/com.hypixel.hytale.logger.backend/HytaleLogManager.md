---
title: "HytaleLogManager"
kind: "class"
package: "com.hypixel.hytale.logger.backend"
fqcn: "com.hypixel.hytale.logger.backend.HytaleLogManager"
api_surface: false
extends: "LogManager"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "logger"
  - "backend"
  - "class"
---

**Package:** `com.hypixel.hytale.logger.backend`

```java
public class HytaleLogManager extends LogManager
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static` | `HytaleLogManager` | `instance` |
| `private final` | `HytaleLoggerBackend` | `backend` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `reset()` |
| `private` | `void` | `reset0()` |
| `@Override @Nonnull public` | `Logger` | `getLogger(@Nonnull String name)` |
| `public static` | `void` | `resetFinally()` |
| `@Override public` | `String` | `getName()` |
| `@Override @Nonnull public` | `Level` | `getLevel()` |
| `@Override public` | `boolean` | `isLoggable(@Nonnull Level level)` |
| `@Override public` | `void` | `log(@Nonnull LogRecord record)` |
| `@Override public` | `void` | `setLevel(@Nonnull Level newLevel)` |

## Inner Types

- `HytaleLogManager.HytaleJdkLogger`
