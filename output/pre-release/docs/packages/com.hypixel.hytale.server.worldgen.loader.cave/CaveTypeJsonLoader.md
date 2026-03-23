---
title: "CaveTypeJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.cave"
fqcn: "com.hypixel.hytale.server.worldgen.loader.cave.CaveTypeJsonLoader"
api_surface: false
extends: "JsonLoader<SeedStringResource, CaveType>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "worldgen"
  - "cave"
  - "loader"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader.cave`

```java
public class CaveTypeJsonLoader extends JsonLoader<SeedStringResource, CaveType>
```

JSON loader for a complete cave type definition. Loads the entry node type, yaw/pitch/depth ranges, height radius factors, entry point generator, biome mask, block mask, noise mask, height condition, fixed entry height, fluid level, environment, surface-limited flag, submerge flag, and maximum size. The entry node type is loaded from a [CaveNodeTypeStorage](CaveNodeTypeStorage.md) instance created per cave type.
