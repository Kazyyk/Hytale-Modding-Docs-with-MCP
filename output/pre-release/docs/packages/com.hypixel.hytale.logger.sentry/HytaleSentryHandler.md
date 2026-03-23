---
title: "HytaleSentryHandler"
kind: "class"
package: "com.hypixel.hytale.logger.sentry"
fqcn: "com.hypixel.hytale.logger.sentry.HytaleSentryHandler"
api_surface: false
extends: "Handler"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "logger"
  - "sentry"
---

**Package:** `com.hypixel.hytale.logger.sentry`

```java
public class HytaleSentryHandler extends Handler
```

Extends `Handler` to provide HytaleSentryHandler functionality.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `String` | `MECHANISM_TYPE` | `"JulSentryHandler"` |
| `public static final` | `String` | `THREAD_ID` | `"thread_id"` |

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `private final` | `IScopes` | `scope` |  |
| `private` | `boolean` | `printfStyle` |  |
| `@Nonnull private` | `Level` | `minimumBreadcrumbLevel` | `Level.INFO` |
| `@Nonnull private` | `Level` | `minimumEventLevel` | `Level.SEVERE` |
| `@Nonnull private` | `Level` | `minimumLevel` | `Level.INFO` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `HytaleSentryHandler(@Nonnull IScopes scope)` |
| `@Override public` | `void` | `publish(@Nonnull LogRecord record)` |
| `protected` | `void` | `captureLog(@Nonnull LogRecord loggingEvent)` |
| `@Nonnull private` | `String` | `maybeFormatted(@Nonnull Object[] arguments, @Nonnull String message)` |
| `private` | `void` | `retrieveProperties()` |
| `@Nullable private static` | `SentryLevel` | `formatLevel(@Nonnull Level level)` |
| `@Nonnull private static` | `SentryLogLevel` | `toSentryLogLevel(@Nonnull Level level)` |
| `@Nonnull private` | `Level` | `parseLevelOrDefault(@Nonnull String levelName)` |
| `@Nonnull private` | `Breadcrumb` | `createBreadcrumb(@Nonnull LogRecord record)` |
| `@Nonnull private` | `List<String>` | `toParams(@Nullable Object[] arguments)` |
| `@Nonnull private` | `String` | `formatMessage(@Nonnull String message, @Nullable Object[] parameters)` |
| `@Override public` | `void` | `flush()` |
| `@Override public` | `void` | `close()` |
| `public` | `void` | `setPrintfStyle(boolean printfStyle)` |
| `public` | `void` | `setMinimumBreadcrumbLevel(@Nullable Level minimumBreadcrumbLevel)` |
| `@Nonnull public` | `Level` | `getMinimumBreadcrumbLevel()` |
| `public` | `void` | `setMinimumEventLevel(@Nullable Level minimumEventLevel)` |
| `@Nonnull public` | `Level` | `getMinimumEventLevel()` |
| `public` | `void` | `setMinimumLevel(@Nullable Level minimumLevel)` |
| `@Nonnull public` | `Level` | `getMinimumLevel()` |
| `public` | `boolean` | `isPrintfStyle()` |
