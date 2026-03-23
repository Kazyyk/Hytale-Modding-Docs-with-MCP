---
title: "BlockPlacementMaskRegistry"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.prefab"
fqcn: "com.hypixel.hytale.server.worldgen.loader.prefab.BlockPlacementMaskRegistry"
api_surface: false
extends: "FileMaskCache"
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
public class BlockPlacementMaskRegistry extends FileMaskCache<BlockMaskCondition>
```

Extends `FileMaskCache`.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `BlockMaskCondition` | `tempMask` |
| `private` | `BlockMaskCondition.MaskEntry` | `tempEntry` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `BlockMaskCondition` | `retainOrAllocateMask(@Nonnull BlockMaskCondition.Mask defaultMask, @Nonnull Long2ObjectMap<BlockMaskCondition.Mask> specificMasks)` |
| `@Nonnull public` | `BlockMaskCondition.MaskEntry` | `retainOrAllocateEntry(@Nonnull ResolvedBlockArray blocks, boolean replace)` |
