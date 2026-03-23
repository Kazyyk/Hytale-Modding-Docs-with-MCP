---
title: "FileMaskCache"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.util"
fqcn: "com.hypixel.hytale.server.worldgen.loader.util.FileMaskCache"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "worldgen"
  - "loader"
  - "util"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader.util`

```java
public class FileMaskCache<T>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public T` | `getIfPresentFileMask(String filename)` |
| `` | `public void` | `putFileMask(String filename, T value)` |
| `` | `public JsonElement` | `cachedFile(String filename, @Nonnull Function<String, JsonElement> function)` |
