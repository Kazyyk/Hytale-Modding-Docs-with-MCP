---
title: "WaterPopulator"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.chunk.populator"
fqcn: "com.hypixel.hytale.server.worldgen.chunk.populator.WaterPopulator"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "worldgen"
  - "chunk"
  - "populator"
  - "water"
  - "fluid"
---

**Package:** `com.hypixel.hytale.server.worldgen.chunk.populator`

```java
public class WaterPopulator
```

Populates a chunk with water and fluid blocks. For each column, resolves the biome's `WaterContainer` entries and fills the specified Y range with the configured block and fluid IDs. Only overwrites blocks with priority lower than 4 or those marked with the submerge flag. Non-solid blocks (as determined by `FluidTicker.isSolid`) receive the fluid ID.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `void` | `populate(int seed, @Nonnull ChunkGeneratorExecution execution)` |
