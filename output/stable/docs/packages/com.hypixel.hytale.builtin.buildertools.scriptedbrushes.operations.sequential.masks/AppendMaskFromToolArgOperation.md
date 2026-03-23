---
title: "AppendMaskFromToolArgOperation"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.masks"
fqcn: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential.masks.AppendMaskFromToolArgOperation"
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
public class AppendMaskFromToolArgOperation extends SequenceBrushOperation
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<AppendMaskFromToolArgOperation>` | `CODEC` |
| `@Nonnull public` | `String` | `argNameArg` |
| `@Nonnull public` | `boolean` | `invertArg` |
| `@Nonnull public` | `BlockFilter.FilterType` | `filterTypeArg` |
| `@Nullable public` | `String` | `additionalBlocksArg` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `AppendMaskFromToolArgOperation()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `modifyBrushConfig(@Nonnull Ref<EntityStore> ref,
        @Nonnull BrushConfig brushConfig,
        @Nonnull BrushConfigCommandExecutor brushConfigCommandExecutor,
        @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
