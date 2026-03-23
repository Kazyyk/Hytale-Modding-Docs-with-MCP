---
title: "StructuralCraftingBench"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config.bench"
fqcn: "com.hypixel.hytale.server.core.asset.type.blocktype.config.bench.StructuralCraftingBench"
api_surface: false
extends: "Bench"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "blocktype"
  - "config"
  - "bench"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.blocktype.config.bench`

```java
public class StructuralCraftingBench extends Bench
```

Bench subclass for structural block crafting with pattern-based recipes.

## Constants

| Type | Name |
|---|---|
| `BuilderCodec<StructuralCraftingBench>` | `CODEC` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `isHeaderCategory(@Nonnull String category)` |
| `public` | `int` | `getCategoryIndex(@Nonnull String category)` |
| `public` | `boolean` | `shouldAllowBlockGroupCycling()` |
| `public` | `boolean` | `shouldAlwaysShowInventoryHints()` |
| `public` | `String` | `toString()` |
