---
title: "LayerContainerJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.container"
fqcn: "com.hypixel.hytale.server.worldgen.loader.container.LayerContainerJsonLoader"
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
public class LayerContainerJsonLoader extends JsonLoader<SeedStringResource, LayerContainer>
```

JSON loader that parses layer container configuration for a biome. Loads the default filling block, static layers (with min/max Y ranges), and dynamic layers (with noise-driven offsets). Supports modify events via `ModifyEvents.BiomeStaticLayers`.
