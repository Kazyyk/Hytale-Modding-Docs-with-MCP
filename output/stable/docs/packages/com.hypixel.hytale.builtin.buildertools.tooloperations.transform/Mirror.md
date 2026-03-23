---
title: "Mirror"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.tooloperations.transform"
fqcn: "com.hypixel.hytale.builtin.buildertools.tooloperations.transform.Mirror"
api_surface: false
extends: null
implements: ["Transform"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "buildertools"
  - "tooloperations"
  - "transform"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.tooloperations.transform`

```java
public class Mirror implements Transform
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `Transform` | `X` |
| `public static final` | `Transform` | `Y` |
| `public static final` | `Transform` | `Z` |
| `private final` | `Axis` | `axis` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `apply(Vector3i vector3i)` |
| `@Nonnull @Override public` | `String` | `toString()` |
| `public static` | `Transform` | `forAxis(BrushAxis axis)` |
| `public static` | `Transform` | `forDirection(Vector3i direction)` |
| `public static` | `Transform` | `forDirection(Vector3i direction, boolean negativeY)` |
