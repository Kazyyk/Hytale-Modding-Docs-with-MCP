---
title: "BlockMaskCondition"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.util.condition"
fqcn: "com.hypixel.hytale.server.worldgen.util.condition.BlockMaskCondition"
api_surface: true
extends: null
implements: []
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
public class BlockMaskCondition
```

Condition evaluating BlockMask criteria.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `BlockMaskCondition.Mask` | `DEFAULT_MASK` | `new BlockMaskCondition.Mask(true, new BlockMaskCondition.MaskEntry[0])` |
| `public static final` | `BlockMaskCondition` | `DEFAULT_TRUE` | `new BlockMaskCondition()` |
| `public static final` | `BlockMaskCondition` | `DEFAULT_FALSE` | `new BlockMaskCondition()` |

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `@Nonnull private` | `BlockMaskCondition.Mask` | `defaultMask` | `DEFAULT_MASK` |
| `@Nonnull private` | `Long2ObjectMap<BlockMaskCondition.Mask>` | `specificMasks` | `Long2ObjectMaps.emptyMap()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `set(@Nonnull BlockMaskCondition.Mask defaultMask, @Nonnull Long2ObjectMap<BlockMaskCondition.Mask> specificMasks)` |
| `public` | `boolean` | `eval(int currentBlock, int currentFluid, int nextBlockId, int nextFluidId)` |
| `@Override public` | `boolean` | `equals(@Nullable Object o)` |
| `@Override public` | `int` | `hashCode()` |
| `@Nonnull @Override public` | `String` | `toString()` |
