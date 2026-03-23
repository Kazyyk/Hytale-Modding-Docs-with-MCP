---
title: "HistoryMaskOperation"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.masks"
fqcn: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.masks.HistoryMaskOperation"
api_surface: false
extends: "SequenceBrushOperation"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "buildertools"
  - "scriptedbrushes"
  - "operations"
  - "sequential"
  - "masks"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.masks`

```java
public class HistoryMaskOperation extends SequenceBrushOperation
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<HistoryMaskOperation>` | `CODEC` |
| `@Nonnull public` | `BrushConfig.HistoryMask` | `historyMaskArg` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `HistoryMaskOperation()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `modifyBrushConfig(@Nonnull Ref<EntityStore> ref,
        @Nonnull BrushConfig brushConfig,
        @Nonnull BrushConfigCommandExecutor brushConfigCommandExecutor,
        @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
