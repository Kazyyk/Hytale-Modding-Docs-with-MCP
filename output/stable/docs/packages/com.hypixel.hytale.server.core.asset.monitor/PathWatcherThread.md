---
title: "PathWatcherThread"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.monitor"
fqcn: "com.hypixel.hytale.server.core.asset.monitor.PathWatcherThread"
api_surface: false
extends: null
implements: ["Runnable"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "asset"
  - "monitor"
---

**Package:** `com.hypixel.hytale.server.core.asset.monitor`

```java
public class PathWatcherThread implements Runnable
```

Implements `Runnable` to provide PathWatcherThread functionality.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `HytaleLogger` | `LOGGER` | `HytaleLogger.forEnclosingClass()` |
| `public static final` | `boolean` | `HAS_FILE_TREE_SUPPORT` | `SystemUtil.TYPE == SystemUtil.SystemType.WINDOWS` |

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `private final` | `BiConsumer<Path, EventKind>` | `consumer` |  |
| `@Nonnull private final` | `Thread` | `thread` |  |
| `private final` | `WatchService` | `service` |  |
| `private final` | `Map<Path, WatchKey>` | `registered` | `new ConcurrentHashMap<>()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `PathWatcherThread(BiConsumer<Path, EventKind> consumer)` |
| `@Override public final` | `void` | `run()` |
| `public` | `void` | `start()` |
| `public` | `void` | `shutdown()` |
| `public` | `void` | `addPath(Path path)` |
| `private` | `void` | `watchPath(@Nonnull Path path)` |
