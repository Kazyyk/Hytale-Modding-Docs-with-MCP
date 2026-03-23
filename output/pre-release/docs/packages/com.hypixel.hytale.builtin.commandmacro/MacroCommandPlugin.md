---
title: "MacroCommandPlugin"
kind: "class"
package: "com.hypixel.hytale.builtin.commandmacro"
fqcn: "com.hypixel.hytale.builtin.commandmacro.MacroCommandPlugin"
api_surface: false
extends: "JavaPlugin"
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
public class MacroCommandPlugin extends JavaPlugin
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static` | `MacroCommandPlugin` | `instance` |
| `private final Map<String,` | `CommandRegistration>` | `macroCommandRegistrations` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `MacroCommandPlugin` | `get()` |
| `@Override protected` | `void` | `setup()` |
| `public` | `void` | `loadCommandMacroAsset(@Nonnull LoadedAssetsEvent<String, MacroCommandBuilder, DefaultAssetMap<String, MacroCommandBuilder>> event)` |
