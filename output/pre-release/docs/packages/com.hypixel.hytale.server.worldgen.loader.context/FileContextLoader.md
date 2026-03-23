---
title: "FileContextLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.context"
fqcn: "com.hypixel.hytale.server.worldgen.loader.context.FileContextLoader"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:30:09Z"
tags:
  - "server"
  - "worldgen"
  - "loader"
  - "context"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader.context`

```java
public class FileContextLoader
```

Loads the full world generation file context hierarchy. Scans the `Zones` directory for valid zone folders (containing `Zone.json`), filters by required zone names, creates `ZoneFileContext` instances, discovers biome files by type, and loads prefab categories from `PrefabCategories.json`.
