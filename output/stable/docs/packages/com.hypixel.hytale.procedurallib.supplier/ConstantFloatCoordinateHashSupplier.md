---
title: "ConstantFloatCoordinateHashSupplier"
kind: "class"
package: "com.hypixel.hytale.procedurallib.supplier"
fqcn: "com.hypixel.hytale.procedurallib.supplier.ConstantFloatCoordinateHashSupplier"
api_surface: false
extends: ~
implements: ["IFloatCoordinateHashSupplier"]
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "procedurallib"
  - "supplier"
  - "class"
---

**Package:** `com.hypixel.hytale.procedurallib.supplier`

```java
public class ConstantFloatCoordinateHashSupplier implements IFloatCoordinateHashSupplier
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `ConstantFloatCoordinateHashSupplier` | `ZERO` |
| `public static final` | `ConstantFloatCoordinateHashSupplier` | `ONE` |
| `protected final` | `float` | `result` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `float` | `getResult()` |
| `@Override public` | `float` | `get(int seed, double x, double y, long hash)` |
| `@Override @Nonnull public` | `String` | `toString()` |
