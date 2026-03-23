---
title: "MaskOperation"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.masks"
fqcn: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.masks.MaskOperation"
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
public class MaskOperation extends SequenceBrushOperation
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<MaskOperation>` | `CODEC` |
| `@Nonnull public` | `BlockMask` | `operationMaskArg` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `MaskOperation()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `modifyBrushConfig(@Nonnull Ref<EntityStore> ref,
        @Nonnull BrushConfig brushConfig,
        @Nonnull BrushConfigCommandExecutor brushConfigCommandExecutor,
        @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
