---
title: "FileContext"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.context"
fqcn: "com.hypixel.hytale.server.worldgen.loader.context.FileContext"
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
public class FileContext<T extends FileContext<?>>
```

Generic file context node in the world generation loading hierarchy. Holds an ID, name, file path, and parent context reference. Provides methods to navigate to the root context and compute a content path relative to the root. Contains an inner `Registry` for named entries and a `RootContext` singleton.
