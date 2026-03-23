---
title: "BitConverter"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.framework.math"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.framework.math.BitConverter"
api_surface: false
extends: "null"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "framework"
  - "math"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.framework.math`

```java
public class BitConverter
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `` | `boolean[]` | `output` |
| `` | `byte` | `PRECISION` |
| `` | `boolean[]` | `bits` |
| `` | `long` | `position` |
| `` | `int` | `position` |
| `` | `byte` | `position` |
| `` | `long` | `number` |
| `` | `int` | `number` |
| `` | `byte` | `number` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `void` | `main(String[] args)` |
| `` | `public static boolean[]` | `toBitArray(long number)` |
| `` | `public static boolean[]` | `toBitArray(int number)` |
| `` | `public static boolean[]` | `toBitArray(byte number)` |
| `` | `public static long` | `toLong(@Nonnull boolean[] bits)` |
| `` | `throw new` | `IllegalArgumentException("array must have length 64")` |
| `` | `public static int` | `toInt(@Nonnull boolean[] bits)` |
| `` | `throw new` | `IllegalArgumentException("array must have length 32")` |
| `` | `public static int` | `toByte(@Nonnull boolean[] bits)` |
| `` | `throw new` | `IllegalArgumentException("array must have length 8")` |
