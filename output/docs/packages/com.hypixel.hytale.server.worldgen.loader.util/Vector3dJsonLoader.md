---
title: "Vector3dJsonLoader"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.util"
fqcn: "com.hypixel.hytale.server.worldgen.loader.util.Vector3dJsonLoader"
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
public class Vector3dJsonLoader extends JsonLoader<SeedStringResource, Vector3d>
```

JSON loader that deserializes configuration data from JSON files.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `` | `super(seed, dataFolder, json)` |
| `@Nonnull public` | `Vector3d` | `load()` |
| `` | `return new` | `Vector3d()` |
| `` | `return new` | `Vector3d(value, value, value)` |
| `` | `return new` | `Vector3d(x, y, z)` |
| `` | `throw new` | `Error("No valid definition for Vector3d found!")` |
