---
title: "FastRandom"
kind: "class"
package: "com.hypixel.hytale.math.util"
fqcn: "com.hypixel.hytale.math.util.FastRandom"
api_surface: false
extends: "Random"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "math"
  - "util"
  - "class"
---

**Package:** `com.hypixel.hytale.math.util`

```java
public class FastRandom extends Random
```

Extends `Random`.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `long` | `seed` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `setSeed(long seed)` |
| `` | `private static long` | `initialScramble(long seed)` |
| `@Override protected` | `int` | `next(int bits)` |
| `@Override public` | `double` | `nextGaussian()` |
| `` | `throw new` | `UnsupportedOperationException()` |
