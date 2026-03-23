---
title: "PrefabCaveNodeShape"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.cave.shape"
fqcn: "com.hypixel.hytale.server.worldgen.cave.shape.PrefabCaveNodeShape"
api_surface: false
extends: "AbstractCaveNodeShape"
implements:
  - "IWorldBounds"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "worldgen"
  - "cave"
  - "shape"
  - "prefab"
---

**Package:** `com.hypixel.hytale.server.worldgen.cave.shape`

```java
public class PrefabCaveNodeShape extends AbstractCaveNodeShape implements IWorldBounds
```

Cave node shape backed by a prefab structure. The prefab's bounding box defines the shape volume, and its rotation determines the orientation. Provides `getPrefabRotation()` for child nodes to inherit the parent's rotation when computing offsets.

## Instance Methods

```java
public PrefabRotation getPrefabRotation()
```

Returns the rotation applied to this prefab shape.
