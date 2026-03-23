---
title: "AssignmentsAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.assignments"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.assignments.AssignmentsAsset"
api_surface: false
extends: ~
implements: 
  - "Cleanable"
  - "JsonAssetWithMap>"
generator_version: "2.0.0"
generated_at: "2026-03-22T20:55:01Z"
tags:
  - "worldgen"
  - "asset"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.assignments`

```java
public abstract class AssignmentsAsset implements Cleanable, JsonAssetWithMap>
```

Abstract base asset class for world generator block assignments. Defines the codec dispatch hierarchy for all assignment types (constant, field function, imported, sandwich, weighted).
