---
title: "LoggerUtil"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.LoggerUtil"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "hytalegenerator"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator`

```java
public class LoggerUtil
```

Logging utilities for the HytaleGenerator system including exception formatting and nanosecond-to-millisecond conversion.

## Constants

| Type | Name |
|---|---|
| `String` | `HYTALE_GENERATOR_NAME` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `Logger` | `getLogger()` |
| `public static` | `void` | `logException(@Nonnull String contextDescription, @Nonnull Throwable e)` |
| `public static` | `void` | `logException(@Nonnull String contextDescription, @Nonnull Throwable e, @Nonnull Logger logger)` |
| `public static` | `String` | `nsToMsDecimal(long ns)` |
