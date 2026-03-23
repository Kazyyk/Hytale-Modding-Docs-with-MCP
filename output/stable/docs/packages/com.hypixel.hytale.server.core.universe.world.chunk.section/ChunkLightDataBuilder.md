---
title: "ChunkLightDataBuilder"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.chunk.section"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.section.ChunkLightDataBuilder"
api_surface: true
extends: "ChunkLightData"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "chunk"
  - "lighting"
  - "octree"
  - "builder"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.chunk.section`

```java
public class ChunkLightDataBuilder extends ChunkLightData
```

Mutable builder for [ChunkLightData](ChunkLightData.md). Provides methods to set individual light values in the octree structure. The octree automatically grows and collapses segments as light values are set. Once all modifications are complete, call `build()` to produce an immutable `ChunkLightData` with a compacted octree.

## Constructors

```java
public ChunkLightDataBuilder(short changeId)
```

Creates a new empty builder.

```java
public ChunkLightDataBuilder(@Nonnull ChunkLightData lightData, short changeId)
```

Creates a builder initialized from existing light data. The existing octree is copied and segment tracking is reconstructed.

## Instance Methods

```java
public void setBlockLight(int x, int y, int z, byte red, byte green, byte blue)
```

Sets the RGB block light at the given coordinates, preserving the existing sky light.

```java
public void setSkyLight(int x, int y, int z, byte light)
```

Sets the sky light at the given coordinates, preserving the existing block light.

```java
public void setLight(int index, int channel, byte value)
```

Sets a single channel value at the given flat index.

```java
public void setLightRaw(int index, short value)
```

Sets the raw 16-bit light value at the given flat index. Performs octree traversal with automatic segment growth/collapse.

```java
@Nonnull
public ChunkLightData build()
```

Produces an immutable `ChunkLightData` with a compacted octree. The builder's internal octree may contain gaps from collapsed segments; `build()` produces a contiguous representation.
