---
title: "CaveNodeTypeJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.cave"
fqcn: "com.hypixel.hytale.server.worldgen.loader.cave.CaveNodeTypeJsonLoader"
api_surface: false
extends: "JsonLoader<SeedStringResource, CaveNodeType>"
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
public class CaveNodeTypeJsonLoader extends JsonLoader<SeedStringResource, CaveNodeType>
```

JSON loader for individual cave node types. Parses the shape generator type (dispatching to shape-specific loaders for PIPE, CYLINDER, PREFAB, ELLIPSOID, EMPTY_LINE, DISTORTED), filling blocks, prefab containers, height conditions, child count bounds, cover entries, priority, environment, and child entries. Registers the loaded type in the [CaveNodeTypeStorage](CaveNodeTypeStorage.md).
