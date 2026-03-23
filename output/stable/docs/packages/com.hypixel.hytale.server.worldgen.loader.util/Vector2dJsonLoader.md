---
title: "Vector2dJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.util"
fqcn: "com.hypixel.hytale.server.worldgen.loader.util.Vector2dJsonLoader"
api_surface: false
extends: "JsonLoader"
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
public class Vector2dJsonLoader extends JsonLoader<SeedStringResource, Vector2d>
```

JSON loader that deserializes configuration data from JSON files.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `` | `super(seed, dataFolder, json)` |
| `@Nonnull public` | `Vector2d` | `load()` |
| `` | `return new` | `Vector2d()` |
| `` | `return new` | `Vector2d(value, value)` |
| `` | `return new` | `Vector2d(x, y)` |
