---
title: "LightCalculation"
kind: "interface"
package: "com.hypixel.hytale.server.core.universe.world.lighting"
fqcn: "com.hypixel.hytale.server.core.universe.world.lighting.LightCalculation"
api_surface: true
extends: "null"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "universe"
  - "world"
  - "lighting"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.lighting`

```java
public interface LightCalculation
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `void` | `init(@Nonnull WorldChunk var1)` |
| `` | `CalculationResult` | `calculateLight(@Nonnull Vector3i var1)` |
| `` | `boolean` | `invalidateLightAtBlock(@Nonnull WorldChunk var1, int var2, int var3, int var4, @Nonnull BlockType var5, int var6, int var7)` |
| `` | `boolean` | `invalidateLightInChunkSections(@Nonnull WorldChunk var1, int var2, int var3)` |

## Related Types

- [CalculationResult](CalculationResult.md)
