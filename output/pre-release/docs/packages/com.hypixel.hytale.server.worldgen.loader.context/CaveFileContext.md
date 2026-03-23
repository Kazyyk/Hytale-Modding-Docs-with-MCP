---
title: "CaveFileContext"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.context"
fqcn: "com.hypixel.hytale.server.worldgen.loader.context.CaveFileContext"
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
public class CaveFileContext extends FileContext<ZoneFileContext>
```

File context for cave configuration files. Extends `FileContext<ZoneFileContext>`. Resolves the cave file path by replacing dots with the file separator and locating it under the zone's `Cave` subdirectory.
