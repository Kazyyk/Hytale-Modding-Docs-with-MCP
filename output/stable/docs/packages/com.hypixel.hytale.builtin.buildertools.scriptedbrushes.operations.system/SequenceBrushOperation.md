---
title: "SequenceBrushOperation"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.system"
fqcn: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.system.SequenceBrushOperation"
api_surface: false
extends: "BrushOperation"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "buildertools"
  - "scriptedbrushes"
  - "operations"
  - "system"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.system`

```java
public abstract class SequenceBrushOperation extends BrushOperation
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `boolean` | `doesOperateOnBlocks` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `SequenceBrushOperation(String name, String description, boolean doesOperateOnBlocks)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `modifyBlocks(Ref<EntityStore> ref,
        BrushConfig brushConfig,
        BrushConfigCommandExecutor brushConfigCommandExecutor,
        BrushConfigEditStore edit,
        int x,
        int y,
        int z,
        ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `void` | `beginIterationIndex(int iterationIndex)` |
| `public` | `int` | `getNumModifyBlockIterations()` |
| `public` | `boolean` | `doesOperateOnBlocks()` |
