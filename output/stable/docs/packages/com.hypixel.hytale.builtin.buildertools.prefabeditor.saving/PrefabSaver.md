---
title: "PrefabSaver"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.prefabeditor.saving"
fqcn: "com.hypixel.hytale.builtin.buildertools.prefabeditor.saving.PrefabSaver"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "buildertools"
  - "prefabeditor"
  - "saving"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.prefabeditor.saving`

```java
public class PrefabSaver
```

Provides PrefabSaver functionality within the saving subsystem.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `protected static final` | `String` | `EDITOR_BLOCK` | `"Editor_Block"` |
| `protected static final` | `String` | `EDITOR_BLOCK_PREFAB_AIR` | `"Editor_Empty"` |
| `protected static final` | `String` | `EDITOR_BLOCK_PREFAB_ANCHOR` | `"Editor_Anchor"` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `CompletableFuture<Boolean>` | `savePrefab(@Nonnull CommandSender sender,
        @Nonnull World world,
        @Nonnull Path pathToSave,
        @Nonnull Vector3i anchorPoint,
        @Nonnull Vector3i minPoint,
        @Nonnull Vector3i maxPoint,
        @Nonnull Vector3i pastePosition,
        @Nonnull Vector3i originalFileAnchor,
        @Nonnull PrefabSaverSettings settings)` |
| `@Nonnull private static` | `CompletableFuture<BlockSelection>` | `copyBlocksAsync(@Nonnull CommandSender sender,
        @Nonnull World world,
        @Nonnull Vector3i anchorPoint,
        @Nonnull Vector3i minPoint,
        @Nonnull Vector3i maxPoint,
        @Nonnull Vector3i pastePosition,
        @Nonnull Vector3i originalFileAnchor,
        @Nonnull PrefabSaverSettings settings)` |
| `@Nullable private static` | `BlockSelection` | `copyBlocksWithLoadedChunks(@Nonnull CommandSender sender,
        @Nonnull World world,
        @Nonnull Vector3i anchorPoint,
        @Nonnull Vector3i minPoint,
        @Nonnull Vector3i maxPoint,
        @Nonnull Vector3i pastePosition,
        @Nonnull Vector3i originalFileAnchor,
        @Nonnull PrefabSaverSettings settings,
        @Nonnull Long2ObjectMap<Ref<ChunkStore>> loadedChunks,
        int editorBlock,
        int editorBlockPrefabAir,
        int editorBlockPrefabAnchor)` |
| `@Nonnull private static` | `CompletableFuture<Long2ObjectMap<Ref<ChunkStore>>>` | `preloadChunksInSelectionAsync(@Nonnull ChunkStore chunkStore, @Nonnull Vector3i minPoint, @Nonnull Vector3i maxPoint)` |
| `private static` | `boolean` | `save(@Nonnull CommandSender sender, @Nonnull BlockSelection copiedSelection, @Nonnull Path saveFilePath, @Nonnull PrefabSaverSettings settings)` |
