---
title: "CylinderCaveNodeShapeGeneratorJsonLoader"
kind: "interface"
package: "com.hypixel.hytale.server.worldgen.loader.cave.shape"
fqcn: "com.hypixel.hytale.server.worldgen.loader.cave.shape.CylinderCaveNodeShapeGeneratorJsonLoader"
api_surface: false
extends: "CaveNodeShapeGeneratorJsonLoader"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "worldgen"
  - "loader"
  - "cave"
  - "shape"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader.cave.shape`

```java
public class CylinderCaveNodeShapeGeneratorJsonLoader extends CaveNodeShapeGeneratorJsonLoader
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `CylinderCaveNodeShape.CylinderCaveNodeShapeGenerator` | `load()` |
| `@Nullable protected` | `IDoubleRange` | `loadRadius()` |
| `@Nullable protected` | `IDoubleRange` | `loadMiddleRadius()` |
| `@Nullable protected` | `IDoubleRange` | `loadLength()` |
| `protected` | `boolean` | `loadInheritParentRadius()` |
| `public` | `` | `CylinderCaveNodeShapeGeneratorJsonLoader(@Nonnull SeedString<SeedStringResource> seed, Path dataFolder, JsonElement json)` |

## Inner Types

- `CylinderCaveNodeShapeGeneratorJsonLoader.Constants`
