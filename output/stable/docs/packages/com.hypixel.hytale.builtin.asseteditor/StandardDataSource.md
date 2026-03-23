---
title: "StandardDataSource"
kind: "class"
package: "com.hypixel.hytale.builtin.asseteditor.datasource"
fqcn: "com.hypixel.hytale.builtin.asseteditor.datasource.StandardDataSource"
api_surface: false
extends: null
implements:
  - "DataSource"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "builtin"
  - "asseteditor"
  - "datasource"
---

**Package:** `com.hypixel.hytale.builtin.asseteditor.datasource`

```java
public class StandardDataSource implements DataSource
```

File-system-backed implementation of [DataSource](DataSource.md). Reads/writes asset files on disk, tracks recent modifications with periodic persistence (every 60 seconds), and maintains an editor-save hash cache to detect whether file changes originated from the editor (to avoid redundant reloads from file watchers).

## Constructor

```java
public StandardDataSource(String packKey, Path rootPath, boolean isImmutable, PluginManifest manifest)
```

The data source is deleteable only if not immutable and located under the mods directory.

## Key Behaviors

### Modification Tracking

Recently modified assets are stored in `modifiedAssets` (max 50 entries, oldest evicted). The index is persisted to `assetEditor/recentAssetEdits_{packKey}.json` with a `.bak` fallback. Each `ModifiedAsset` records the path, state, timestamp, and editor username.

### Editor Save Cache

When the editor saves a file, its SHA-256 hash is recorded in `editorSaves` with a 30-second expiry. When `shouldReloadAssetFromDisk()` is called (e.g. by a file watcher), it checks whether the current file hash matches any cached editor save. If so, the reload is suppressed. Maximum 20 cached saves per path.

## Key Methods

| Method | Description |
|---|---|
| `void start()` | Loads modification index and starts 60-second save scheduler |
| `void shutdown()` | Cancels scheduler and saves pending modifications |
| `void saveRecentModifications()` | Persists the modification index if dirty |
| `boolean canAssetPackBeDeleted()` | Whether this pack can be deleted (non-immutable + in mods dir) |
| `Path resolveAbsolutePath(Path)` | Resolves and validates a path against the root |
| `void putModifiedAsset(ModifiedAsset)` | Tracks a modification with LRU eviction at 50 entries |
| `Map<Path, ModifiedAsset> getRecentlyModifiedAssets()` | Returns the modifications map |

## Inner Records

### EditorFileSaveInfo

```java
record EditorFileSaveInfo(String hash, long expiryMs)
```

Tracks a single editor-originated file save with its content hash and expiry timestamp.
