---
title: "RandomizeDimensionsOperation"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.dimensions"
fqcn: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.dimensions.RandomizeDimensionsOperation"
api_surface: false
extends: "SequenceBrushOperation"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "buildertools"
  - "scriptedbrushes"
  - "operations"
  - "sequential"
  - "dimensions"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.dimensions`

```java
public class RandomizeDimensionsOperation extends SequenceBrushOperation
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<RandomizeDimensionsOperation>` | `CODEC` |
| `public` | `RelativeIntegerRange` | `widthRangeArg` |
| `public` | `RelativeIntegerRange` | `heightRangeArg` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `modifyBrushConfig(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor brushConfigCommandExecutor, ComponentAccessor<EntityStore> componentAccessor)` |
