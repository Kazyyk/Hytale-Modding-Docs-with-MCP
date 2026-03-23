---
title: "EarlyPluginLoader"
kind: "class"
package: "com.hypixel.hytale.plugin.early"
fqcn: "com.hypixel.hytale.plugin.early.EarlyPluginLoader"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "plugin"
---

**Package:** `com.hypixel.hytale.plugin.early`

```java
public final class EarlyPluginLoader
```

Class in the early subsystem.

## Fields

| Field | Type | Description |
|---|---|---|
| `pluginClassLoader` | `URLClassLoader` | Static URLClassLoader field. |

## Constructors

| Constructor | Description |
|---|---|
| `EarlyPluginLoader()` | Creates a new EarlyPluginLoader instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `loadEarlyPlugins(@Nonnull String[] args)` | `void` | static public method. |
| `parseEarlyPluginPaths(@Nonnull String[] args)` | `List<Path>` | static private method. |
| `hasFlag(String[] args, String flag)` | `boolean` | static private method. |
| `collectPluginJars(Path path, List<URL> urls)` | `void` | static private method. |
| `hasTransformers()` | `boolean` | static public method. |
| `getTransformers()` | `List<ClassTransformer>` | static public method. |
| `getPluginClassLoader()` | `URLClassLoader` | static public method. |
