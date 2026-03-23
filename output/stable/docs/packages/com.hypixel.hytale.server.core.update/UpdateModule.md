---
title: "UpdateModule"
kind: "class"
package: "com.hypixel.hytale.server.core.update"
fqcn: "com.hypixel.hytale.server.core.update.UpdateModule"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:44:26Z"
tags:
  - "update"
  - "class"
  - "internal"
---

**Package:** `com.hypixel.hytale.server.core.update`

```java
public class UpdateModule extends JavaPlugin
```

Server plugin that manages automatic update checking, downloading, and staged application. Periodically checks for new server versions via authenticated HTTP requests, downloads updates to a staging directory, and supports auto-apply with configurable delay and player notification. Can be disabled via the `HYTALE_DISABLE_UPDATES` environment variable.

## Constants

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `PluginManifest` | `MANIFEST` |
| `public static final` | `boolean` | `KILL_SWITCH_ENABLED` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `UpdateModule` | `get()` |
| `public` | `UpdateService.VersionManifest` | `getLatestKnownVersion()` |
| `public` | `void` | `setLatestKnownVersion(UpdateService.VersionManifest version)` |
| `public` | `boolean` | `isDownloadInProgress()` |
| `public` | `boolean` | `tryAcquireDownloadLock()` |
| `public` | `void` | `setActiveDownload(CompletableFuture<?> download, Thread thread)` |
| `public` | `void` | `releaseDownloadLock()` |
| `public` | `void` | `updateDownloadProgress(long downloaded, long total)` |
| `public` | `UpdateModule.DownloadProgress` | `getDownloadProgress()` |
| `public` | `boolean` | `cancelDownload()` |
| `public` | `void` | `onServerReady()` |

## Inner Types

| Type | Kind | Description |
|---|---|---|
| `UpdateModule.DownloadProgress` | record | Progress data: percent, downloadedBytes, totalBytes, etaSeconds |
