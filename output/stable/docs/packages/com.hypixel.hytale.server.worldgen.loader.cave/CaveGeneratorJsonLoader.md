---
title: "CaveGeneratorJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.cave"
fqcn: "com.hypixel.hytale.server.worldgen.loader.cave.CaveGeneratorJsonLoader"
api_surface: false
extends: "JsonLoader<SeedStringResource, CaveGenerator>"
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
public class CaveGeneratorJsonLoader extends JsonLoader<SeedStringResource, CaveGenerator>
```

Top-level JSON loader for the cave generation system. Reads the `Caves.json` file from the cave folder and constructs a `CaveGenerator` containing an array of `CaveType` instances loaded via [CaveTypesJsonLoader](CaveTypesJsonLoader.md). Returns null if no cave file exists.
