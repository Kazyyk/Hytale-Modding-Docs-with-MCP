---
title: "SpreadGrowthBehaviour"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming.config.stages.spread"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.config.stages.spread.SpreadGrowthBehaviour"
api_surface: false
extends: "null"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "farming"
  - "config"
  - "stages"
---

**Package:** `com.hypixel.hytale.builtin.adventure.farming.config.stages.spread`

```java
public abstract class SpreadGrowthBehaviour
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `CodecMapCodec<SpreadGrowthBehaviour>` | `CODEC` |
| `public static final` | `BuilderCodec<SpreadGrowthBehaviour>` | `BASE_CODEC` |
| `protected` | `WorldLocationCondition[]` | `worldLocationConditions` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public abstract void` | `execute(@Nonnull ComponentAccessor<ChunkStore> var1, @Nonnull Ref<ChunkStore> var2, @Nonnull Ref<ChunkStore> var3, int var4, int var5, int var6, float var7)` |
| `` | `protected boolean` | `validatePosition(@Nonnull World world, int worldX, int worldY, int worldZ)` |
