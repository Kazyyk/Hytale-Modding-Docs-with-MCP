---
title: "MacroCommandBuilder"
kind: "class"
package: "com.hypixel.hytale.builtin.commandmacro"
fqcn: "com.hypixel.hytale.builtin.commandmacro.MacroCommandBuilder"
api_surface: false
extends: ~
implements: ["JsonAssetWithMap<String, DefaultAssetMap<String, MacroCommandBuilder>>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "builtin"
  - "commandmacro"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.commandmacro`

```java
public class MacroCommandBuilder implements JsonAssetWithMap<String, DefaultAssetMap<String, MacroCommandBuilder>>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `String` | `id` |
| `private` | `String` | `name` |
| `private` | `String[]` | `aliases` |
| `private` | `String` | `description` |
| `private` | `MacroCommandParameter[]` | `parameters` |
| `private` | `String[]` | `commands` |
| `private` | `AssetExtraInfo.Data` | `data` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable public static` | `CommandRegistration` | `createAndRegisterCommand(@Nonnull MacroCommandBuilder builder)` |
| `public` | `String` | `getName()` |
| `public` | `String` | `getId()` |
