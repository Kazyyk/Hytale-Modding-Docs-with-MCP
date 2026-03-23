---
title: "PrefabLoader"
kind: "class"
package: "com.hypixel.hytale.server.core.prefab.selection.buffer"
fqcn: "com.hypixel.hytale.server.core.prefab.selection.buffer.PrefabLoader"
api_surface: false
extends: "java.lang.Object"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "prefab"
  - "loader"
---

**Package:** `com.hypixel.hytale.server.core.prefab.selection.buffer`

```java
public class PrefabLoader
```

Loads prefab files from disk in either binary or BSON format. Detects the format by file extension and delegates to the appropriate codec. Supports caching and asynchronous loading.
