---
title: "DataSource"
kind: "interface"
package: "com.hypixel.hytale.builtin.asseteditor.datasource"
fqcn: "com.hypixel.hytale.builtin.asseteditor.datasource.DataSource"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "builtin"
  - "asseteditor"
  - "datasource"
---

**Package:** `com.hypixel.hytale.builtin.asseteditor.datasource`

```java
public interface DataSource
```

Abstraction over file system operations for an asset pack. Provides directory and asset CRUD, asset tree management, immutability checks, and modification tracking. The sole implementation is [StandardDataSource](StandardDataSource.md).

## Methods

### Lifecycle

| Method | Description |
|---|---|
| `void start()` | Initializes the data source (loads modification index, starts save scheduler) |
| `void shutdown()` | Shuts down (cancels scheduler, saves pending modifications) |

### Directory Operations

| Method | Description |
|---|---|
| `boolean doesDirectoryExist(Path)` | Checks if a directory exists |
| `boolean createDirectory(Path, EditorClient)` | Creates a directory |
| `boolean deleteDirectory(Path)` | Deletes a directory |
| `boolean moveDirectory(Path, Path)` | Moves/renames a directory |

### Asset Operations

| Method | Description |
|---|---|
| `boolean doesAssetExist(Path)` | Checks if an asset file exists |
| `byte[] getAssetBytes(Path)` | Reads asset file contents |
| `boolean updateAsset(Path, byte[], EditorClient)` | Writes updated asset data |
| `boolean createAsset(Path, byte[], EditorClient)` | Creates a new asset file |
| `boolean deleteAsset(Path, EditorClient)` | Deletes an asset file |
| `boolean moveAsset(Path, Path, EditorClient)` | Moves/renames an asset file |

### Asset Tree

| Method | Description |
|---|---|
| `AssetTree getAssetTree()` | Returns the current asset tree |
| `AssetTree loadAssetTree(Collection<AssetTypeHandler>)` | Builds a fresh asset tree from disk |

### Metadata

| Method | Description |
|---|---|
| `boolean shouldReloadAssetFromDisk(Path)` | Whether an external file change requires reloading |
| `Instant getLastModificationTimestamp(Path)` | Returns last modification time |
| `Path getFullPathToAssetData(Path)` | Resolves absolute path to asset file |
| `boolean isImmutable()` | Whether this data source is read-only |
| `Path getRootPath()` | Root path of the asset pack |
| `PluginManifest getManifest()` | Asset pack manifest |
| `void updateRuntimeAssets()` | Default no-op hook for runtime asset refresh |
