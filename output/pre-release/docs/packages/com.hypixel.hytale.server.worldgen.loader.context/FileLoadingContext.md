---
title: "FileLoadingContext"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.context"
fqcn: "com.hypixel.hytale.server.worldgen.loader.context.FileLoadingContext"
api_surface: false
extends: "com.hypixel.hytale.server.worldgen.loader.context.FileContext"
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
public class FileLoadingContext extends FileContext<FileContext.RootContext>
```

Top-level file loading context extending `FileContext<RootContext>`. Maintains registries for zones and prefab categories, and sequential ID counters for zones and biomes. Created by `FileContextLoader` as the root of the loading hierarchy.
