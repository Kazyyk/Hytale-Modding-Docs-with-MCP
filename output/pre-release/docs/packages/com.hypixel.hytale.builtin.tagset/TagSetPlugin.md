---
title: "TagSetPlugin"
kind: "class"
package: "com.hypixel.hytale.builtin.tagset"
fqcn: "com.hypixel.hytale.builtin.tagset.TagSetPlugin"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "tags"
---

**Package:** `com.hypixel.hytale.builtin.tagset`

```java
public class TagSetPlugin extends JavaPlugin
```

Plugin that registers assets, interactions for the builtin subsystem.

## Fields

| Field | Type | Description |
|---|---|---|
| `instance` | `TagSetPlugin` | Static TagSetPlugin field. |

## Constructors

| Constructor | Description |
|---|---|
| `TagSetPlugin(@Nonnull JavaPluginInit init)` | Creates a new TagSetPlugin instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `get()` | `TagSetPlugin` | static public method. |
| `setup()` | `void` | protected method. |
| `registerTagSetType(Class<T> clazz)` | `void` | public method. |
| `get(Class<T> clazz)` | `TagSetPlugin.TagSetLookup` | static public method. |
