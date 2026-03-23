---
title: "JumpIfCompareOperation.BrushConfigIntegerComparison"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.flowcontrol"
fqcn: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.flowcontrol.JumpIfCompareOperation.BrushConfigIntegerComparison"
api_surface: false
extends: null
implements:
  - "Function"
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "builtin"
  - "buildertools"
---
**Package:** `com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.flowcontrol`

```java
public static class BrushConfigIntegerComparison implements Function<BrushConfig, Boolean>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `BrushConfig.DataGettingFlags` | `dataGettingFlag` |
| `private` | `ArgTypes.IntegerComparisonOperator` | `integerComparisonOperator` |
| `private` | `int` | `valueToCompareTo` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `BrushConfigIntegerComparison()` |
| `public` | `` | `BrushConfigIntegerComparison( BrushConfig.DataGettingFlags dataGettingFlag, ArgTypes.IntegerComparisonOperator integerComparisonOperator, int valueToCompareTo )` |
| `public` | `Boolean` | `apply(BrushConfig brushConfig)` |
| `public` | `String` | `toString()` |
