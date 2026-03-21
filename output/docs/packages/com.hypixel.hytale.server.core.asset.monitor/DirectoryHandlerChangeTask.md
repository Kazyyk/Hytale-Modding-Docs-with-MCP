---
title: "DirectoryHandlerChangeTask"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.monitor"
fqcn: "com.hypixel.hytale.server.core.asset.monitor.DirectoryHandlerChangeTask"
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
public class DirectoryHandlerChangeTask implements Runnable
```

Implements `Runnable` to provide DirectoryHandlerChangeTask functionality.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `HytaleLogger` | `LOGGER` | `HytaleLogger.forEnclosingClass()` |
| `private static final` | `long` | `ACCUMULATION_DELAY_MILLIS` | `1000L` |

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `private final` | `AssetMonitor` | `assetMonitor` |  |
| `private final` | `Path` | `parent` |  |
| `private final` | `AssetMonitorHandler` | `handler` |  |
| `@Nonnull private final` | `ScheduledFuture<?>` | `task` |  |
| `private final` | `AtomicBoolean` | `changed` | `new AtomicBoolean(true)` |
| `private final` | `Map<Path, PathEvent>` | `paths` | `new Object2ObjectOpenHashMap()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `DirectoryHandlerChangeTask(AssetMonitor assetMonitor, Path parent, AssetMonitorHandler handler)` |
| `@Override public` | `void` | `run()` |
| `public` | `AssetMonitor` | `getAssetMonitor()` |
| `public` | `Path` | `getParent()` |
| `public` | `AssetMonitorHandler` | `getHandler()` |
| `public` | `void` | `addPath(Path path, PathEvent pathEvent)` |
| `public` | `void` | `removePath(Path path)` |
| `public` | `void` | `markChanged()` |
| `public` | `void` | `cancelSchedule()` |
| `@Nonnull @Override public` | `String` | `toString()` |
