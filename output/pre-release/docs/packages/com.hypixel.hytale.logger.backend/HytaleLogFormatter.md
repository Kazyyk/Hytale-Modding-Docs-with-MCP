---
title: "HytaleLogFormatter"
kind: "class"
package: "com.hypixel.hytale.logger.backend"
fqcn: "com.hypixel.hytale.logger.backend.HytaleLogFormatter"
api_surface: false
extends: "Formatter"
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
public class HytaleLogFormatter extends Formatter
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `DateTimeFormatter` | `DATE_FORMATTER` |
| `private static final` | `Pattern` | `ANSI_CONTROL_CODES` |
| `private` | `BooleanSupplier` | `ansi` |
| `public` | `int` | `maxModuleName` |
| `private` | `int` | `shorterCount` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override @Nonnull public` | `String` | `format(@Nonnull LogRecord record)` |
| `public static` | `String` | `stripAnsi(@Nonnull String message)` |
