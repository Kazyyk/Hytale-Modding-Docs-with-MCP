---
title: "RandomCoordinateCondition"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.util.condition"
fqcn: "com.hypixel.hytale.server.worldgen.util.condition.RandomCoordinateCondition"
api_surface: false
extends: null
implements: ["ICoordinateCondition"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "util"
  - "condition"
---

**Package:** `com.hypixel.hytale.server.worldgen.util.condition`

```java
public class RandomCoordinateCondition implements ICoordinateCondition
```

Condition evaluating RandomCoordinate criteria.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `double` | `chance` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `RandomCoordinateCondition(double chance)` |
| `@Override public` | `boolean` | `eval(int seed, int x, int y)` |
| `@Override public` | `boolean` | `eval(int seed, int x, int y, int z)` |
| `@Nonnull @Override public` | `String` | `toString()` |
