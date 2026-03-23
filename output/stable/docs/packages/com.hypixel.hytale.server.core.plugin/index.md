---
title: "com.hypixel.hytale.server.core.plugin"
kind: "package"
package: "com.hypixel.hytale.server.core.plugin"
fqcn: "com.hypixel.hytale.server.core.plugin"
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

Server plugin framework. Provides the base classes, lifecycle management, class loading, and runtime load/unload/reload support for both built-in and third-party plugins.

## Types

| Type | Kind | API Surface | Description |
|---|---|---|---|
| [JavaPlugin](JavaPlugin.md) | class | yes | Base class for JAR-based plugins. |
| [JavaPluginInit](JavaPluginInit.md) | class | yes | Initialization data for Java plugins. |
| [MissingPluginDependencyException](MissingPluginDependencyException.md) | class | no | Missing plugin dependency error. |
| [PluginBase](PluginBase.md) | class | yes | Abstract base for all plugins. |
| [PluginClassLoader](PluginClassLoader.md) | class | yes | Custom class loader for plugins. |
| [PluginInit](PluginInit.md) | class | yes | Basic plugin initialization data. |
| [PluginListPageManager](PluginListPageManager.md) | class | yes | Plugin list UI page manager. |
| [PluginManager](PluginManager.md) | class | yes | Central plugin lifecycle manager. |
| [PluginState](PluginState.md) | enum | yes | Plugin lifecycle states. |
| [PluginType](PluginType.md) | enum | yes | Plugin type enumeration. |
