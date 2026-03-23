---
title: "JumpIfCompareOperation"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.flowcontrol"
fqcn: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.flowcontrol.JumpIfCompareOperation"
api_surface: false
extends: "SequenceBrushOperation"
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "builtin"
  - "buildertools"
---
**Package:** `com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.flowcontrol`

```java
public class JumpIfCompareOperation extends SequenceBrushOperation
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public` | `String` | `indexVariableNameArg` |
| `private` | `BrushConfig.DataGettingFlags` | `dataGettingFlag` |
| `private` | `ArgTypes.IntegerComparisonOperator` | `integerComparisonOperator` |
| `private` | `int` | `valueToCompareTo` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `JumpIfCompareOperation()` |
| `public` | `void` | `modifyBrushConfig( @Nonnull Ref<EntityStore> ref, @Nonnull BrushConfig brushConfig, @Nonnull BrushConfigCommandExecutor brushConfigCommandExecutor, @Nonnull ComponentAccessor<EntityStore> componentAccessor )` |
| `public` | `Boolean` | `apply(BrushConfig brushConfig)` |
| `public` | `String` | `toString()` |
