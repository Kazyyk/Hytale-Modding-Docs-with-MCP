---
title: "HytaleLogger"
kind: "class"
package: "com.hypixel.hytale.logger"
fqcn: "com.hypixel.hytale.logger.HytaleLogger"
api_surface: true
extends: "AbstractLogger<HytaleLogger.Api>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "logger"
---

**Package:** `com.hypixel.hytale.logger`

```java
public class HytaleLogger extends AbstractLogger<HytaleLogger.Api>
```

Extends `AbstractLogger` to provide HytaleLogger functionality.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `Map<String, HytaleLogger>` | `CACHE` |
| `private static final` | `HytaleLogger` | `LOGGER` |
| `@Nonnull private final` | `HytaleLoggerBackend` | `backend` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `private` | | `HytaleLogger(@Nonnull HytaleLoggerBackend backend)` |
| `public static` | `void` | `init()` |
| `public static` | `void` | `replaceStd()` |
| `public static` | `HytaleLogger` | `getLogger()` |
| `@Nonnull public static` | `HytaleLogger` | `forEnclosingClass()` |
| `@Nonnull public static` | `HytaleLogger` | `forEnclosingClassFull()` |
| `@Nonnull public static` | `HytaleLogger` | `get(String loggerName)` |
| `public` | `HytaleLogger.Api` | `at(@Nonnull Level level)` |
| `public` | `String` | `getName()` |
| `@Nonnull public` | `Level` | `getLevel()` |
| `public` | `void` | `setLevel(@Nonnull Level level)` |
| `@Nonnull public` | `HytaleLogger` | `getSubLogger(String name)` |
| `public` | `void` | `setSentryClient(@Nonnull IScopes scope)` |
| `public` | `void` | `setPropagatesSentryToParent(boolean propagate)` |
| `@Nonnull private static` | `String` | `classToLoggerName(@Nonnull String className)` |
