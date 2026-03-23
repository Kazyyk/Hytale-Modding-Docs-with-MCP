---
title: "BlockPlacementMaskJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.prefab"
fqcn: "com.hypixel.hytale.server.worldgen.loader.prefab.BlockPlacementMaskJsonLoader"
api_surface: false
extends: "JsonLoader"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "worldgen"
  - "loader"
  - "prefab"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader.prefab`

```java
public class BlockPlacementMaskJsonLoader extends JsonLoader<SeedStringResource, BlockMaskCondition>
```

JSON loader that deserializes configuration data from JSON files.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `String` | `fileName` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public BlockMaskCondition` | `load()` |
| `` | `throw new` | `IllegalArgumentException("Unknown key! " + variant)` |
| `@Nonnull protected` | `BlockMaskCondition.MaskEntry[]` | `loadEntries(@Nonnull JsonArray jsonArray)` |
| `@Override protected` | `JsonElement` | `loadFileConstructor(String filePath)` |
