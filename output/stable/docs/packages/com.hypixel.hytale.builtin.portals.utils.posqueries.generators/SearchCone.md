---
title: "SearchCone"
kind: "class"
package: "com.hypixel.hytale.builtin.portals.utils.posqueries.generators"
fqcn: "com.hypixel.hytale.builtin.portals.utils.posqueries.generators.SearchCone"
api_surface: false
extends: null
implements: ["SpatialQuery"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "portals"
  - "utils"
  - "posqueries"
  - "generators"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.portals.utils.posqueries.generators`

```java
public class SearchCone implements SpatialQuery
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Vector3d` | `direction` |
| `private final` | `double` | `minRadius` |
| `private final` | `double` | `maxRadius` |
| `private final` | `double` | `maxDegrees` |
| `private final` | `int` | `attempts` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `Stream<Vector3d>` | `createCandidates(World world, Vector3d origin, SpatialQueryDebug debug)` |
