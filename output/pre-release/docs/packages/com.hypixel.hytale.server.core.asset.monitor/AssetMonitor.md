---
title: "AssetMonitor"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.monitor"
fqcn: "com.hypixel.hytale.server.core.asset.monitor.AssetMonitor"
api_surface: false
extends: null
implements: []
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
public class AssetMonitor
```

Provides AssetMonitor functionality within the monitor subsystem.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `HytaleLogger` | `LOGGER` | `HytaleLogger.forEnclosingClass()` |
| `private static final` | `ScheduledExecutorService` | `EXECUTOR` | `Executors.newSingleThreadScheduledExecutor(ThreadUtil.daemon("AssetMonitor Thread"))` |

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `private final` | `Map<Path, List<AssetMonitorHandler>>` | `directoryMonitors` | `new ConcurrentHashMap<>()` |
| `private final` | `Map<Path, FileChangeTask>` | `fileChangeTasks` | `new ConcurrentHashMap<>()` |
| `private final` | `Map<Path, Map<AssetMonitorHandler, DirectoryHandlerChangeTask>>` | `directoryHandlerChangeTasks` | `new ConcurrentHashMap<>()` |
| `@Nonnull private final` | `PathWatcherThread` | `pathWatcherThread` | `new PathWatcherThread(this::onChange)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `AssetMonitor()` |
| `public` | `void` | `shutdown()` |
| `public` | `void` | `monitorDirectoryFiles(@Nonnull Path path, @Nonnull AssetMonitorHandler handler)` |
| `public` | `void` | `removeMonitorDirectoryFiles(@Nonnull Path path, @Nonnull Object key)` |
| `protected` | `void` | `onChange(@Nonnull Path file, EventKind eventKind)` |
| `public` | `void` | `onDelayedChange(@Nonnull Path path, @Nonnull PathEvent pathEvent)` |
| `public` | `void` | `removeFileChangeTask(@Nonnull FileChangeTask fileChangeTask)` |
| `public` | `void` | `markChanged(@Nonnull Path path)` |
| `public` | `void` | `removeHookChangeTask(@Nonnull DirectoryHandlerChangeTask directoryHandlerChangeTask)` |
| `@Nonnull public static` | `ScheduledFuture<?>` | `runTask(@Nonnull Runnable task, long millisDelay)` |
