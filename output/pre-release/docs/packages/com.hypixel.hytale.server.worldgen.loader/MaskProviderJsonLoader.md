---
title: "MaskProviderJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader"
fqcn: "com.hypixel.hytale.server.worldgen.loader.MaskProviderJsonLoader"
api_surface: false
extends: "JsonLoader<SeedStringResource, MaskProvider>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "loader"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader`

```java
public class MaskProviderJsonLoader extends JsonLoader<SeedStringResource, MaskProvider>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `AssetLoader<BufferedImage>` | `IMAGE_LOADER` |
| `protected final` | `Path` | `file` |
| `protected final` | `Vector2i` | `zoomSize` |
| `protected final` | `Vector2i` | `worldOffset` |
| `` | `BufferedImage` | `mask` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `MaskProviderJsonLoader(@Nonnull SeedString<SeedStringResource> seed, Path dataFolder, JsonElement json, Path file, Vector2i zoomSize, Vector2i worldOffset)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public Class<BufferedImage>` | `type()` |
| `` | `public BufferedImage` | `load(@Nonnull InputStream in)` |
| `public` | `MaskProvider` | `load()` |
| `` | `return new` | `MaskProvider(this.loadFuzzyZoom(mask)` |
| `` | `throw new` | `Error("Error while loading MaskProvider in " + this.file.toAbsolutePath()` |
| `` | `public static BufferedImage` | `loadImage(@Nonnull Path file)` |
| `` | `throw new` | `IOException("Failed to load image " + file, var2)` |
| `protected` | `FuzzyZoom` | `loadFuzzyZoom(@Nonnull BufferedImage mask)` |
| `` | `return new` | `FuzzyZoom(new CoordinateRandomizerJsonLoader<>(this.seed, this.dataFolder, this.json)` |
| `` | `new` | `PixelProvider(mask)` |
