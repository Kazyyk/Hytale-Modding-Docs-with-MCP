---
title: "BlockPopulator"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.chunk.populator"
fqcn: "com.hypixel.hytale.server.worldgen.chunk.populator.BlockPopulator"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "worldgen"
  - "chunk"
  - "populator"
  - "terrain"
---

**Package:** `com.hypixel.hytale.server.worldgen.chunk.populator`

```java
public class BlockPopulator
```

Populates a chunk with terrain blocks by iterating over each column (32x32), evaluating height thresholds from the interpolator, placing filling blocks from the biome's `LayerContainer`, then applying dynamic/static layers and cover blocks. The `populate` method is the entry point called during world generation.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `void` | `populate(int seed, @Nonnull ChunkGeneratorExecution execution)` |

## Inner Classes

| Modifier | Name | Description |
|---|---|---|
| `private static` | `LayerPopulator` | Generates static layers (absolute Y ranges) and dynamic layers (relative to surface) for each column. |
