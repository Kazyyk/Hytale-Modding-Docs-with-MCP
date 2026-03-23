---
title: "WorldGenPrefabSupplier"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader"
fqcn: "com.hypixel.hytale.server.worldgen.loader.WorldGenPrefabSupplier"
api_surface: true
extends: null
implements:
  - "com.hypixel.hytale.server.core.prefab.selection.buffer.PrefabSupplier"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:30:09Z"
tags:
  - "server"
  - "worldgen"
  - "loader"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader`

```java
public class WorldGenPrefabSupplier implements PrefabSupplier
```

Implements `PrefabSupplier` for world generation. Lazily loads prefab buffers via `ChunkGenerator.getResource()`, resolves the prefab name from the file path, and computes chunk bounds recursively including child prefabs up to depth 10.
