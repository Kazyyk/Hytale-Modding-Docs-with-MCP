---
title: "ConstantDoubleCoordinateHashSupplier"
kind: "class"
package: "com.hypixel.hytale.procedurallib.supplier"
fqcn: "com.hypixel.hytale.procedurallib.supplier.ConstantDoubleCoordinateHashSupplier"
api_surface: false
extends: ~
implements: ["IDoubleCoordinateHashSupplier"]
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "procedurallib"
  - "supplier"
  - "class"
---

**Package:** `com.hypixel.hytale.procedurallib.supplier`

```java
public class ConstantDoubleCoordinateHashSupplier implements IDoubleCoordinateHashSupplier
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `ConstantDoubleCoordinateHashSupplier` | `ZERO` |
| `public static final` | `ConstantDoubleCoordinateHashSupplier` | `ONE` |
| `protected final` | `double` | `result` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `double` | `getResult()` |
| `@Override public` | `double` | `get(int seed, int x, int y, long hash)` |
| `@Override @Nonnull public` | `String` | `toString()` |
