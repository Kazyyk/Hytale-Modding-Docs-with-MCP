---
title: "DoubleRange"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.rangemaps"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.rangemaps.DoubleRange"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "rangemaps"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.rangemaps`

```java
public class DoubleRange
```

Utility type in the `rangemaps` subsystem.

## Static Methods

| Method | Returns | Description |
|---|---|---|
| `inclusive(double min, double max)` | `DoubleRange` | Static utility method. |
| `exclusive(double min, double max)` | `DoubleRange` | Static utility method. |

## Accessors

| Method | Returns | Description |
|---|---|---|
| `getMin()` | `double` | Accessor method. |
| `isInclusiveMin()` | `boolean` | Boolean accessor. |
| `getMax()` | `double` | Accessor method. |
| `isInclusiveMax()` | `boolean` | Boolean accessor. |

## Methods

| Method | Returns | Description |
|---|---|---|
| `includes(double v)` | `boolean` | Instance method. |
