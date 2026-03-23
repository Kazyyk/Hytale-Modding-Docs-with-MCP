---
title: "PluginInit"
kind: "class"
package: "com.hypixel.hytale.server.core.plugin"
fqcn: "com.hypixel.hytale.server.core.plugin.PluginInit"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "plugin"
  - "core"
---

**Package:** `com.hypixel.hytale.server.core.plugin`

```java
public class PluginInit
```

Initialization data for creating a `PluginBase` instance. Contains the plugin manifest and data directory.

## Constructors

| Signature |
|---|
| `PluginInit(@Nonnull PluginManifest pluginManifest, @Nonnull Path dataDirectory)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `PluginManifest` | `getPluginManifest()` |
| `@Nonnull public` | `Path` | `getDataDirectory()` |
| `public` | `boolean` | `isInServerClassPath()` |
