---
title: "EnvironmentContainerJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.container"
fqcn: "com.hypixel.hytale.server.worldgen.loader.container.EnvironmentContainerJsonLoader"
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
public class EnvironmentContainerJsonLoader extends JsonLoader<SeedStringResource, EnvironmentContainer>
```

JSON loader that parses environment container configuration for a biome. Loads a default entry and an array of conditional entries, each mapping environment names and weights to environment IDs via `Environment.getAssetMap()`. Supports modify events via `ModifyEvents.BiomeEnvironments`.
