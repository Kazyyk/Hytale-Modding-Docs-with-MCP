---
title: "SpatialQuery"
kind: "interface"
package: "com.hypixel.hytale.builtin.portals.utils.posqueries"
fqcn: "com.hypixel.hytale.builtin.portals.utils.posqueries.SpatialQuery"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "portals"
  - "utils"
  - "posqueries"
  - "interface"
---

**Package:** `com.hypixel.hytale.builtin.portals.utils.posqueries`

```java
public interface SpatialQuery
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull` | `Stream<Vector3d>` | `createCandidates(World var1, Vector3d var2, SpatialQueryDebug var3)` |
| `@Nonnull default` | `SpatialQuery` | `then(SpatialQuery expand)` |
| `@Nonnull default` | `SpatialQuery` | `filter(PositionPredicate predicate)` |
| `@Nonnull default` | `Optional<Vector3d>` | `execute(World world, Vector3d origin)` |
| `@Nonnull default` | `Optional<Vector3d>` | `debug(World world, Vector3d origin)` |
