---
title: "RecursivePrefabLoader.BlockSelectionLoader"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.utils"
fqcn: "com.hypixel.hytale.builtin.buildertools.utils.RecursivePrefabLoader.BlockSelectionLoader"
api_surface: false
extends: "RecursivePrefabLoader"
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "builtin"
  - "buildertools"
---
**Package:** `com.hypixel.hytale.builtin.buildertools.utils`

```java
public static class BlockSelectionLoader extends RecursivePrefabLoader<BlockSelection>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `BlockSelectionLoader(Path rootPrefabsDir, @Nonnull Function<String, BlockSelection> prefabsLoader)` |
| `protected` | `BlockSelection` | `loadPrefab(int x, int y, int z, String file, @Nonnull PrefabRotation rotation, @Nonnull Random random)` |
| `private static` | `PrefabRotation` | `getRotation(@Nonnull BlockType blockType)` |
