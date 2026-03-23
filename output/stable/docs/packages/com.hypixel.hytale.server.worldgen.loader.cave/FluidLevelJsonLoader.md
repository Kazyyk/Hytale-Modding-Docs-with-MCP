---
title: "FluidLevelJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.cave"
fqcn: "com.hypixel.hytale.server.worldgen.loader.cave.FluidLevelJsonLoader"
api_surface: false
extends: "JsonLoader<SeedStringResource, CaveType.FluidLevel>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "worldgen"
  - "cave"
  - "loader"
  - "fluid"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader.cave`

```java
public class FluidLevelJsonLoader extends JsonLoader<SeedStringResource, CaveType.FluidLevel>
```

JSON loader for cave fluid level configuration. Parses the fluid type (by block type key or fluid name), fluid level byte, and height threshold to construct a `CaveType.FluidLevel` that determines flooding behavior in cave nodes.
