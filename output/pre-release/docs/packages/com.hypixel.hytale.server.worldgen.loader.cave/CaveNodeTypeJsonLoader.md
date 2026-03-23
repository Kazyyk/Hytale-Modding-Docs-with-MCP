---
title: "CaveNodeTypeJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.cave"
fqcn: "com.hypixel.hytale.server.worldgen.loader.cave.CaveNodeTypeJsonLoader"
api_surface: false
extends: "com.hypixel.hytale.procedurallib.json.JsonLoader"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:30:09Z"
tags:
  - "server"
  - "worldgen"
  - "loader"
  - "cave"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader.cave`

```java
public class CaveNodeTypeJsonLoader extends JsonLoader<SeedStringResource, CaveNodeType>
```

JSON loader that parses a cave node type definition. Loads the node's prefabs, fillings, shape generator, height condition, children count bounds, cover entries, priority, environment, and child entries. Registers the resulting `CaveNodeType` in a `CaveNodeTypeStorage`.
