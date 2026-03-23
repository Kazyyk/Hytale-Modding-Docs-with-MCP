---
title: "NotNearPointXZ"
kind: "class"
package: "com.hypixel.hytale.builtin.portals.utils.posqueries.predicates"
fqcn: "com.hypixel.hytale.builtin.portals.utils.posqueries.predicates.NotNearPointXZ"
api_surface: false
extends: null
implements: ["PositionPredicate"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "portals"
  - "utils"
  - "posqueries"
  - "predicates"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.portals.utils.posqueries.predicates`

```java
public final class NotNearPointXZ implements PositionPredicate
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Vector3d` | `point` |
| `private final` | `double` | `radiusSq` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `test(World world, Vector3d origin)` |
