---
title: "CaveBiomeMaskJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.cave"
fqcn: "com.hypixel.hytale.server.worldgen.loader.cave.CaveBiomeMaskJsonLoader"
api_surface: false
extends: "JsonLoader<SeedStringResource, Int2FlagsCondition>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "worldgen"
  - "cave"
  - "loader"
  - "biome"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader.cave`

```java
public class CaveBiomeMaskJsonLoader extends JsonLoader<SeedStringResource, Int2FlagsCondition>
```

JSON loader that parses cave biome mask configuration into an `Int2FlagsCondition`. Combines separate generation and population mask conditions with flag-based operators. Supports a "Terminate" flag that controls whether caves can continue through the biome boundary.
