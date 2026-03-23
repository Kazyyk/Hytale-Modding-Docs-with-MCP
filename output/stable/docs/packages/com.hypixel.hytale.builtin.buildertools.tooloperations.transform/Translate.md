---
title: "Translate"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.tooloperations.transform"
fqcn: "com.hypixel.hytale.builtin.buildertools.tooloperations.transform.Translate"
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
public class Translate implements Transform
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `int` | `x` |
| `private final` | `int` | `y` |
| `private final` | `int` | `z` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `apply(Vector3i vector3i)` |
| `@Nonnull @Override public` | `String` | `toString()` |
| `@Nonnull public static` | `Transform` | `of(Vector3i vector)` |
| `@Nonnull public static` | `Transform` | `of(int x, int y, int z)` |
