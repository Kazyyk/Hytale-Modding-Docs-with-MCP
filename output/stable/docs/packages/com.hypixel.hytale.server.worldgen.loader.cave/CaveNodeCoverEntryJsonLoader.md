---
title: "CaveNodeCoverEntryJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.cave"
fqcn: "com.hypixel.hytale.server.worldgen.loader.cave.CaveNodeCoverEntryJsonLoader"
api_surface: false
extends: "JsonLoader<SeedStringResource, CaveNodeType.CaveNodeCoverEntry>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "worldgen"
  - "cave"
  - "loader"
  - "cover"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader.cave`

```java
public class CaveNodeCoverEntryJsonLoader extends JsonLoader<SeedStringResource, CaveNodeType.CaveNodeCoverEntry>
```

JSON loader for cave cover entries (floor/ceiling decorations). Parses weighted block type entries, height threshold conditions, noise mask conditions, density conditions, parent block conditions, and the anchor type (FLOOR or CEILING).
