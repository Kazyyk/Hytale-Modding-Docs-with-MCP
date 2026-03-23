---
title: "IntRange"
kind: "class"
package: "com.hypixel.hytale.math.range"
fqcn: "com.hypixel.hytale.math.range.IntRange"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "math"
  - "range"
  - "class"
---

**Package:** `com.hypixel.hytale.math.range`

```java
public class IntRange
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `IntRangeArrayCodec` | `CODEC` |
| `private` | `int` | `inclusiveMin` |
| `private` | `int` | `inclusiveMax` |
| `private` | `int` | `range` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `getInclusiveMin()` |
| `public` | `int` | `getInclusiveMax()` |
| `public` | `void` | `setInclusiveMin(int inclusiveMin)` |
| `public` | `void` | `setInclusiveMax(int inclusiveMax)` |
| `public` | `int` | `getInt(float factor)` |
| `public` | `int` | `getInt(double factor)` |
| `public` | `boolean` | `includes(int value)` |
| `@Override public` | `boolean` | `equals(Object o)` |
| `@Override public` | `int` | `hashCode()` |
| `@Nonnull @Override public` | `String` | `toString()` |
