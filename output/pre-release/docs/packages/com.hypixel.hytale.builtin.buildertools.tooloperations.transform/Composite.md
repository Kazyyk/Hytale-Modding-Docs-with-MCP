---
title: "Composite"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.tooloperations.transform"
fqcn: "com.hypixel.hytale.builtin.buildertools.tooloperations.transform.Composite"
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
public class Composite implements Transform
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Transform` | `first` |
| `private final` | `Transform` | `second` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `apply(Vector3i vector3i)` |
| `@Nonnull @Override public` | `String` | `toString()` |
| `public static` | `Transform` | `of(Transform first, Transform second)` |
