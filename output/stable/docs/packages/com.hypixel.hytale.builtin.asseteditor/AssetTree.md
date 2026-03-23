---
title: "AssetTree"
kind: "class"
package: "com.hypixel.hytale.builtin.asseteditor"
fqcn: "com.hypixel.hytale.builtin.asseteditor.AssetTree"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "builtin"
  - "asseteditor"
---

**Package:** `com.hypixel.hytale.builtin.asseteditor`

```java
public class AssetTree
```

Represents the sorted file tree for a single asset pack. Maintains two separate lists of `AssetEditorFileEntry` objects for `Server/` and `Common/` directories, protected by a `StampedLock` for concurrent read/write access. Supports file lookup via binary search, insertion with parent directory creation, removal with subtree cleanup, and batch application of asset changes.

## Constructor

```java
public AssetTree(Path rootPath, String packKey, boolean isReadOnly, boolean canBeDeleted)
```

```java
public AssetTree(Path rootPath, String packKey, boolean isReadOnly, boolean canBeDeleted, Collection<AssetTypeHandler> assetTypes)
```

The second constructor immediately loads the file tree by walking `Server/` (filtered by registered asset type paths) and `Common/` directories.

## Key Methods

| Method | Description |
|---|---|
| `void sendPackets(EditorClient)` | Sends both Server and Common file tree setup packets |
| `void replaceAssetTree(AssetTree)` | Atomically replaces both asset lists |
| `AssetEditorFileEntry ensureAsset(Path, boolean)` | Inserts a file/directory entry, creating parent dirs as needed; returns null if already present |
| `AssetEditorFileEntry getAssetFile(Path)` | Binary-searches for a file entry by path |
| `AssetEditorFileEntry removeAsset(Path)` | Removes a file or directory (and all children) |
| `boolean isDirectoryEmpty(Path)` | Checks if a directory has any child entries |
| `void applyAssetChanges(Map<Path, ModifiedAsset>, Map<Path, ModifiedAsset>)` | Batch-applies directory creations and asset modifications (new, deleted, renamed) |
