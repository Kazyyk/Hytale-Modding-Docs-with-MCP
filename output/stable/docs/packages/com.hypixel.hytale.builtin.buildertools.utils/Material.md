---
title: "Material"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.utils"
fqcn: "com.hypixel.hytale.builtin.buildertools.utils.Material"
api_surface: false
extends: null
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "builtin"
  - "buildertools"
---
**Package:** `com.hypixel.hytale.builtin.buildertools.utils`

```java
public final class Material
```

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `Material` | `EMPTY` | `new Material(0, 0, (byte)0, 0)` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `int` | `blockId` |
| `private final` | `int` | `fluidId` |
| `private final` | `byte` | `fluidLevel` |
| `private final` | `int` | `rotation` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `private` | `` | `Material(int blockId, int fluidId, byte fluidLevel, int rotation)` |
| `public static` | `Material` | `block(int blockId)` |
| `public static` | `Material` | `block(int blockId, int rotation)` |
| `public static` | `Material` | `fluid(int fluidId, byte fluidLevel)` |
| `public static` | `Material` | `fromKey(@Nonnull String key)` |
| `public` | `boolean` | `isFluid()` |
| `public` | `boolean` | `isBlock()` |
| `public` | `boolean` | `isEmpty()` |
| `public` | `int` | `getBlockId()` |
| `public` | `int` | `getFluidId()` |
| `public` | `byte` | `getFluidLevel()` |
| `public` | `int` | `getRotation()` |
| `public` | `boolean` | `hasRotation()` |
| `public` | `String` | `toString()` |
| `public` | `boolean` | `equals(Object obj)` |
| `public` | `int` | `hashCode()` |
| `public static` | `Material` | `fromPattern(@Nonnull BlockPattern pattern, @Nonnull Random random)` |
