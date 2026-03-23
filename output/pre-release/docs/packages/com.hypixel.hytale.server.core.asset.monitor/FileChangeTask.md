---
title: "FileChangeTask"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.monitor"
fqcn: "com.hypixel.hytale.server.core.asset.monitor.FileChangeTask"
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
public class FileChangeTask implements Runnable
```

Implements `Runnable` to provide FileChangeTask functionality.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `HytaleLogger` | `LOGGER` | `HytaleLogger.forEnclosingClass()` |
| `private static final` | `long` | `FILE_SIZE_CHECK_DELAY_MILLIS` | `200L` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `AssetMonitor` | `assetMonitor` |
| `@Nonnull private final` | `Path` | `path` |
| `@Nonnull private final` | `PathEvent` | `pathEvent` |
| `private final` | `boolean` | `createdOrModified` |
| `@Nonnull private final` | `ScheduledFuture<?>` | `task` |
| `private` | `long` | `lastSize` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `FileChangeTask(AssetMonitor assetMonitor, @Nonnull Path path, @Nonnull PathEvent pathEvent)` |
| `public` | `AssetMonitor` | `getAssetMonitor()` |
| `@Nonnull public` | `Path` | `getPath()` |
| `@Nonnull public` | `PathEvent` | `getPathEvent()` |
| `@Override public` | `void` | `run()` |
| `public` | `void` | `cancelSchedule()` |
| `@Nonnull @Override public` | `String` | `toString()` |
