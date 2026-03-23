---
title: "CaveTypesJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.cave"
fqcn: "com.hypixel.hytale.server.worldgen.loader.cave.CaveTypesJsonLoader"
api_surface: false
extends: "JsonLoader<SeedStringResource, CaveType[]>"
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
public class CaveTypesJsonLoader extends JsonLoader<SeedStringResource, CaveType[]>
```

JSON loader for the "Types" array in `Caves.json`. Iterates over the array entries, extracts each cave type's "Name" field, and delegates to [CaveTypeJsonLoader](CaveTypeJsonLoader.md) for full construction.
