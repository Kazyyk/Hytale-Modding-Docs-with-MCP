---
title: "CavePrefabContainerJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.cave"
fqcn: "com.hypixel.hytale.server.worldgen.loader.cave.CavePrefabContainerJsonLoader"
api_surface: false
extends: "JsonLoader<SeedStringResource, CavePrefabContainer>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "worldgen"
  - "cave"
  - "loader"
  - "prefab"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader.cave`

```java
public class CavePrefabContainerJsonLoader extends JsonLoader<SeedStringResource, CavePrefabContainer>
```

JSON loader for cave prefab containers. Parses the "Entries" array and delegates each entry to [CavePrefabEntryJsonLoader](CavePrefabEntryJsonLoader.md).
