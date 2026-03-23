---
title: "IntRangeBoundValidator"
kind: "class"
package: "com.hypixel.hytale.math.range"
fqcn: "com.hypixel.hytale.math.range.IntRangeBoundValidator"
api_surface: false
extends: null
implements: ["Validator"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "math"
  - "range"
  - "class"
---

**Package:** `com.hypixel.hytale.math.range`

```java
public class IntRangeBoundValidator implements Validator
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Integer` | `min` |
| `private final` | `Integer` | `max` |
| `private final` | `boolean` | `inclusive` |
| `private final` | `boolean` | `lowerBound` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `IntRangeBoundValidator` | `lowerBound(Integer min, Integer max, boolean inclusive)` |
| `@Nonnull public static` | `IntRangeBoundValidator` | `upperBound(Integer min, Integer max, boolean inclusive)` |
| `public` | `void` | `accept(IntRange intRange, ValidationResults results)` |
| `private` | `void` | `validateBound(int value, String boundName, ValidationResults results)` |
| `@Override public` | `void` | `updateSchema(SchemaContext context, Schema target)` |
| `private` | `void` | `updateSchemaBound(IntegerSchema integerSchema)` |
