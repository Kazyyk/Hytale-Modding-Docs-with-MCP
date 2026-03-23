---
title: "BrushOperationSetting"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.system"
fqcn: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.system.BrushOperationSetting"
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
public class BrushOperationSetting<T>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `String` | `name` |
| `private final` | `String` | `description` |
| `private` | `String` | `input` |
| `private final` | `T` | `defaultValue` |
| `@Nullable private` | `T` | `value` |
| `private final` | `ArgumentType<T>` | `argumentType` |
| `@Nullable private final` | `Validator<T>` | `valueValidator` |
| `@Nullable private final` | `Function<BrushOperationSetting<T>, String>` | `toStringFunction` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `BrushOperationSetting(String name, String description, T defaultValue, ArgumentType<T> argumentType)` |
| `public` | `BrushOperationSetting(String name, String description, T defaultValue, ArgumentType<T> argumentType, Function<BrushOperationSetting<T>, String> toStringFunction)` |
| `public` | `BrushOperationSetting(String name,
        String description,
        T defaultValue,
        ArgumentType<T> argumentType,
        @Nullable Validator<T> valueValidator,
        @Nullable Function<BrushOperationSetting<T>, String> toStringFunction)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `BrushOperationSetting<T>` | `setValue(T value)` |
| `@Nonnull public` | `BrushOperationSetting<T>` | `setValueUnsafe(String input, Object value)` |
| `@Nonnull public` | `ParseResult` | `parseAndSetValue(String[] input)` |
| `@Nullable public` | `String` | `getInput()` |
| `public` | `String` | `getName()` |
| `public` | `String` | `getDescription()` |
| `public` | `T` | `getDefaultValue()` |
| `public` | `ArgumentType<T>` | `getArgumentType()` |
| `@Nullable public` | `Validator<T>` | `getValueValidator()` |
| `@Nullable public` | `T` | `getValue()` |
| `public` | `String` | `getValueString()` |
