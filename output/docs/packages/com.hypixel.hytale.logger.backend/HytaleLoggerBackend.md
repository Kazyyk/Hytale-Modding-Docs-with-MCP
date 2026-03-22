---
title: "HytaleLoggerBackend"
kind: "class"
package: "com.hypixel.hytale.logger.backend"
fqcn: "com.hypixel.hytale.logger.backend.HytaleLoggerBackend"
api_surface: false
extends: "LoggerBackend"
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
public class HytaleLoggerBackend extends LoggerBackend
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static Function<String,` | `Level>` | `LOG_LEVEL_LOADER` |
| `public static final` | `PrintStream` | `REAL_SOUT` |
| `public static final` | `PrintStream` | `REAL_SERR` |
| `private static final Map<String,` | `HytaleLoggerBackend>` | `CACHE` |
| `private static final` | `int` | `OFF_VALUE` |
| `private final` | `String` | `name` |
| `private final` | `HytaleLoggerBackend` | `parent` |
| `private` | `Level` | `level` |
| `private BiConsumer<Level,` | `Level>` | `onLevelChange` |
| `private` | `HytaleSentryHandler` | `sentryHandler` |
| `private` | `boolean` | `propagateSentryToParent` |
| `private` | `CopyOnWriteArrayList<CopyOnWriteArrayList<LogRecord>>` | `subscribers` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `String` | `getLoggerName()` |
| `@Nonnull public` | `Level` | `getLevel()` |
| `public` | `boolean` | `isLoggable(@Nonnull Level lvl)` |
| `public` | `void` | `log(@Nonnull LogData data)` |
| `public` | `void` | `handleError(@Nonnull RuntimeException error, @Nonnull LogData badData)` |
| `public` | `void` | `log(@Nonnull LogRecord logRecord)` |
| `public` | `void` | `log(@Nonnull LogRecord logRecord, boolean sentryHandled)` |
| `public static` | `void` | `subscribe(CopyOnWriteArrayList<LogRecord> subscriber)` |
| `public static` | `void` | `unsubscribe(CopyOnWriteArrayList<LogRecord> subscriber)` |
| `@Nonnull public` | `HytaleLoggerBackend` | `getSubLogger(String name)` |
| `public` | `void` | `setSentryClient(@Nullable IScopes scope)` |
| `public` | `void` | `setPropagatesSentryToParent(boolean propagate)` |
| `public` | `void` | `setOnLevelChange(BiConsumer<Level, Level> onLevelChange)` |
| `public` | `void` | `setLevel(@Nonnull Level newLevel)` |
| `public` | `void` | `loadLogLevel()` |
| `public static` | `void` | `loadLevels(@Nonnull List<Entry<String, Level>> list)` |
| `public static` | `void` | `reloadLogLevels()` |
| `public static` | `HytaleLoggerBackend` | `getLogger()` |
| `public static` | `HytaleLoggerBackend` | `getLogger(@Nonnull String name)` |
| `@Nonnull public static` | `HytaleLoggerBackend` | `getLogger(String name, BiConsumer<Level, Level> onLevelChange)` |
| `public static` | `void` | `setIndent(int indent)` |
| `public static` | `boolean` | `isJunitTest()` |
| `public static` | `void` | `rawLog(String message)` |

## Inner Types

- `HytaleLoggerBackend.RawLogRecord`
