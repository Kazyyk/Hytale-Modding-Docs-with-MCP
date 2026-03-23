---
title: "ImageBuilder"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.worldmap.provider.chunk"
fqcn: "com.hypixel.hytale.server.core.universe.world.worldmap.provider.chunk.ImageBuilder"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "worldmap"
  - "provider"
  - "chunk"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.worldmap.provider.chunk`

```java
class ImageBuilder
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nullable private` | `WorldChunk` | `worldChunk` |
| `private` | `FluidSection[]` | `fluidSections` |
| `public` | `int` | `r` |
| `public` | `int` | `g` |
| `public` | `int` | `b` |
| `public` | `int` | `a` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public long` | `getIndex()` |
| `@Nonnull public` | `MapImage` | `getImage()` |
| `@Nonnull private` | `CompletableFuture<ImageBuilder>` | `fetchChunk()` |
| `@Nonnull private` | `CompletableFuture<ImageBuilder>` | `sampleNeighborsSync()` |
| `` | `` | `getBlockColor(blockId, tint, this.outColor)` |
| `` | `` | `getFluidColor(fluidId, environmentId, fluidDepth, this.outColor)` |
| `` | `private void` | `packImageData(int ix, int iz)` |
| `` | `private static float` | `shadeFromHeights(int blockPixelX,
        int blockPixelZ,
        int blockPixelWidth,
        int blockPixelHeight,
        short height,
        short north,
        short south,
        short west,
        short east,
        short northWest,
        short northEast,
        short southWest,
        short southEast)` |
| `` | `private static void` | `getBlockColor(int blockId, int biomeTintColor, @Nonnull ImageBuilder.Color outColor)` |
| `` | `private static void` | `getFluidColor(int fluidId, int environmentId, int fluidDepth, @Nonnull ImageBuilder.Color outColor)` |
| `@Nonnull public static` | `CompletableFuture<ImageBuilder>` | `build(long index, int imageWidth, int imageHeight, World world)` |
| `` | `public int` | `pack()` |
| `` | `public void` | `multiply(float value)` |
