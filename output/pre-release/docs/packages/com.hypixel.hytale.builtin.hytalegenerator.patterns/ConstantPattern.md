---
title: "ConstantPattern"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.patterns"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.patterns.ConstantPattern"
api_surface: false
extends: "Pattern"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "patterns"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.patterns`

```java
public class ConstantPattern extends Pattern
```

Pattern that always returns a fixed boolean value. Two singleton instances (`INSTANCE_TRUE` and `INSTANCE_FALSE`) are provided; the constructor is private.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `ConstantPattern` | `INSTANCE_TRUE` |
| `public static final` | `ConstantPattern` | `INSTANCE_FALSE` |
| `private final` | `boolean` | `value` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `matches(@NonNullDecl Pattern.Context context)` |
| `@NonNullDecl @Override public` | `Bounds3i` | `getBounds_voxelGrid()` |
