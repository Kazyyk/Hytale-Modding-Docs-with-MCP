---
title: "JavaPluginInit"
kind: "class"
package: "com.hypixel.hytale.server.core.plugin"
fqcn: "com.hypixel.hytale.server.core.plugin.JavaPluginInit"
api_surface: true
extends: "PluginInit"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "plugin"
  - "core"
---

**Package:** `com.hypixel.hytale.server.core.plugin`

```java
public class JavaPluginInit extends PluginInit
```

Initialization data for `JavaPlugin` instances. Extends `PluginInit` with the JAR file path and `PluginClassLoader`.

## Constructors

| Signature |
|---|
| `JavaPluginInit(@Nonnull PluginManifest pluginManifest, @Nonnull Path dataDirectory, @Nonnull Path file, @Nonnull PluginClassLoader classLoader)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `Path` | `getFile()` |
| `@Nonnull public` | `PluginClassLoader` | `getClassLoader()` |
| `@Override public` | `boolean` | `isInServerClassPath()` |
