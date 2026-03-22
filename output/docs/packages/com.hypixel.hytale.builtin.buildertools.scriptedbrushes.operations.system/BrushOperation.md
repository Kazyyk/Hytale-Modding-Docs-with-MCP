---
title: "BrushOperation"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.system"
fqcn: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.system.BrushOperation"
api_surface: false
extends: ~
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
public abstract class BrushOperation
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `CodecMapCodec<BrushOperation>` | `OPERATION_CODEC` |
| `public static final` | `Map<String, Supplier<BrushOperation>>` | `BRUSH_OPERATION_REGISTRY` |
| `private final` | `String` | `name` |
| `private final` | `String` | `description` |
| `private final` | `Map<String, BrushOperationSetting<?>>` | `registeredOperationSettings` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `BrushOperation(String name, String description)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public abstract` | `void` | `modifyBrushConfig(@Nonnull Ref<EntityStore> var1, @Nonnull BrushConfig var2, @Nonnull BrushConfigCommandExecutor var3, @Nonnull ComponentAccessor<EntityStore> var4)` |
| `public` | `void` | `resetInternalState()` |
| `public` | `void` | `preExecutionModifyBrushConfig(BrushConfigCommandExecutor brushConfigCommandExecutor, int operationIndex)` |
| `@Nonnull public` | `<T> BrushOperationSetting<T>` | `createBrushSetting(@Nonnull String name, String description, T defaultValue, ArgumentType<T> argumentType)` |
| `@Nonnull public` | `<T> BrushOperationSetting<T>` | `createBrushSetting(@Nonnull String name, String description, T defaultValue, ArgumentType<T> argumentType, Function<BrushOperationSetting<T>, String> toStringFunction)` |
| `public` | `String` | `getName()` |
| `public` | `String` | `getDescription()` |
| `@Nonnull public` | `Map<String, BrushOperationSetting<?>>` | `getRegisteredOperationSettings()` |
