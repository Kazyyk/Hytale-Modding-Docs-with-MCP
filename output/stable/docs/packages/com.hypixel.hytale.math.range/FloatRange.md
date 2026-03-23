---
title: "FloatRange"
kind: "class"
package: "com.hypixel.hytale.math.range"
fqcn: "com.hypixel.hytale.math.range.FloatRange"
api_surface: true
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
public class FloatRange
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `FloatRangeArrayCodec` | `CODEC` |
| `private` | `float` | `inclusiveMin` |
| `private` | `float` | `inclusiveMax` |
| `private` | `float` | `range` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `float` | `getInclusiveMin()` |
| `public` | `float` | `getInclusiveMax()` |
| `public` | `void` | `setInclusiveMin(float inclusiveMin)` |
| `public` | `void` | `setInclusiveMax(float inclusiveMax)` |
| `public` | `float` | `getFloat(float factor)` |
| `public` | `float` | `getFloat(double factor)` |
| `public` | `boolean` | `includes(float value)` |
| `@Override public` | `boolean` | `equals(Object o)` |
| `@Override public` | `int` | `hashCode()` |
| `@Nonnull @Override public` | `String` | `toString()` |
