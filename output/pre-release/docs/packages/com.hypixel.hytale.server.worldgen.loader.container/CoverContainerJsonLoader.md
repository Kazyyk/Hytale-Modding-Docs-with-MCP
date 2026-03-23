---
title: "CoverContainerJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.container"
fqcn: "com.hypixel.hytale.server.worldgen.loader.container.CoverContainerJsonLoader"
api_surface: false
extends: "com.hypixel.hytale.procedurallib.json.JsonLoader"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:30:09Z"
tags:
  - "server"
  - "worldgen"
  - "loader"
  - "container"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader.container`

```java
public class CoverContainerJsonLoader extends JsonLoader<SeedStringResource, CoverContainer>
```

JSON loader that parses cover container configuration for a biome. Supports both array and single-object formats. Each entry defines block types, weights, offsets, noise mask, height threshold, parent block condition, and on-water flag. Supports modify events via `ModifyEvents.BiomeCovers`.
