---
title: "MacroCommandParameter"
kind: "class"
package: "com.hypixel.hytale.builtin.commandmacro"
fqcn: "com.hypixel.hytale.builtin.commandmacro.MacroCommandParameter"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "builtin"
  - "commandmacro"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.commandmacro`

```java
public class MacroCommandParameter
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `String` | `name` |
| `private` | `String` | `description` |
| `private` | `MacroCommandParameter.ParameterRequirement` | `requirement` |
| `private` | `MacroCommandParameter.ArgumentTypeEnum` | `argumentType` |
| `private` | `String` | `defaultValue` |
| `private` | `String` | `defaultValueDescription` |
| `private final` | `ArgumentType<?>` | `argumentType` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `MacroCommandParameter.ParameterRequirement` | `getRequirement()` |
| `public` | `String` | `getName()` |
| `public` | `String` | `getDescription()` |
| `public` | `MacroCommandParameter.ArgumentTypeEnum` | `getArgumentType()` |
| `public` | `String` | `getDefaultValue()` |
| `public` | `String` | `getDefaultValueDescription()` |
| `public` | `ArgumentType<?>` | `getArgumentType()` |

## Inner Types

- `MacroCommandParameter.ArgumentTypeEnum`
- `MacroCommandParameter.ParameterRequirement`
