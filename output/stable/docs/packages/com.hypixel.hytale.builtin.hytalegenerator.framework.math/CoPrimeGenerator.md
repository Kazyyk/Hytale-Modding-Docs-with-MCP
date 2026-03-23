---
title: "CoPrimeGenerator"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.framework.math"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.framework.math.CoPrimeGenerator"
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
public class CoPrimeGenerator
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `` | `Random` | `rand` |
| `` | `int[]` | `primes` |
| `` | `int[][]` | `buckets` |
| `` | `long[]` | `output` |
| `` | `int` | `indexOfBucket` |
| `` | `int` | `indexOfPrime` |
| `` | `int` | `number` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `long[]` | `generateCoPrimes(long seed, int bucketSize, int numberOfBuckets, long floor)` |
| `` | `throw new` | `IllegalArgumentException("invalid sizes")` |
| `` | `public static void` | `fillWithPrimes(@Nonnull int[] bucket)` |
| `` | `public static boolean` | `isPrime(int number)` |
