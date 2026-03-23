---
title: "OffsetOperation"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.offsets"
fqcn: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.offsets.OffsetOperation"
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
  - "offsets"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.offsets`

```java
public class OffsetOperation extends SequenceBrushOperation
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<OffsetOperation>` | `CODEC` |
| `public` | `RelativeVector3i` | `offsetArg` |
| `public` | `LoadIntFromToolArgOperation.TargetField` | `targetFieldArg` |
| `public` | `boolean` | `negateArg` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `modifyBrushConfig(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor brushConfigCommandExecutor, ComponentAccessor<EntityStore> componentAccessor)` |
