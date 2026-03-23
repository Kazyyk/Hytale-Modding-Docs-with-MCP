---
title: "DebugBrushOperation"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.global"
fqcn: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.global.DebugBrushOperation"
api_surface: false
extends: "GlobalBrushOperation"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "buildertools"
  - "scriptedbrushes"
  - "operations"
  - "global"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.global`

```java
public class DebugBrushOperation extends GlobalBrushOperation
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<DebugBrushOperation>` | `CODEC` |
| `private` | `Boolean` | `printOperations` |
| `private` | `Boolean` | `stepThrough` |
| `private` | `Boolean` | `enableBreakpoints` |
| `private` | `BrushConfigCommandExecutor.DebugOutputTarget` | `outputTarget` |
| `private` | `Boolean` | `breakOnError` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `modifyBrushConfig(Ref<EntityStore> ref, BrushConfig brushConfig, BrushConfigCommandExecutor brushConfigCommandExecutor, ComponentAccessor<EntityStore> componentAccessor)` |
