---
title: "FilteredBlockFluidCondition"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.util.condition"
fqcn: "com.hypixel.hytale.server.worldgen.util.condition.FilteredBlockFluidCondition"
api_surface: false
extends: null
implements: ["IBlockFluidCondition"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "util"
  - "condition"
---

**Package:** `com.hypixel.hytale.server.worldgen.util.condition`

```java
public class FilteredBlockFluidCondition implements IBlockFluidCondition
```

Condition evaluating FilteredBlockFluid criteria.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `IBlockFluidCondition` | `filter` |
| `private final` | `IBlockFluidCondition` | `condition` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `FilteredBlockFluidCondition(int blockId, IBlockFluidCondition condition)` |
| `public` | | `FilteredBlockFluidCondition(IBlockFluidCondition filter, IBlockFluidCondition condition)` |
| `@Override public` | `boolean` | `eval(int block, int fluid)` |
| `@Nonnull @Override public` | `String` | `toString()` |
