---
title: "FilterQuery"
kind: "class"
package: "com.hypixel.hytale.builtin.portals.utils.posqueries.predicates.generic"
fqcn: "com.hypixel.hytale.builtin.portals.utils.posqueries.predicates.generic.FilterQuery"
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
  - "predicates"
  - "generic"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.portals.utils.posqueries.predicates.generic`

```java
public class FilterQuery implements SpatialQuery
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `SpatialQuery` | `query` |
| `private final` | `PositionPredicate` | `predicate` |
| `private final` | `boolean` | `failFast` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `Stream<Vector3d>` | `createCandidates(World world, Vector3d origin, SpatialQueryDebug debug)` |
