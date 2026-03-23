---
title: "PluginCommand"
kind: "class"
package: "com.hypixel.hytale.server.core.plugin.commands"
fqcn: "com.hypixel.hytale.server.core.plugin.commands.PluginCommand"
api_surface: false
extends: "AbstractCommandCollection"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "command"
  - "plugin"
  - "management"
---

**Package:** `com.hypixel.hytale.server.core.plugin.commands`

```java
public class PluginCommand extends AbstractCommandCollection
```

Command collection registered under `plugin` (aliased as `plugins`, `pl`) for runtime plugin management. Provides five subcommands for listing, loading, unloading, reloading, and managing plugins. The `load` and `unload` commands support a `--boot` flag to modify the server's boot plugin list in `HytaleServerConfig` without immediately changing the plugin state.

## Subcommands

| Name | Aliases | Description |
|---|---|---|
| `list` | `ls` | Lists all loaded plugin identifiers. |
| `load` | `l` | Loads a plugin by identifier. Supports `--boot` flag to add to boot list only. |
| `unload` | `u` | Unloads a plugin by identifier. Supports `--boot` flag to remove from boot list only. |
| `reload` | `r` | Reloads an enabled plugin by identifier. |
| `manage` | `m` | Opens a `PluginListPage` UI for the executing player. |

## Constructor

```java
public PluginCommand()
```

## Inner Classes

| Modifier | Name | Extends | Description |
|---|---|---|---|
| `private static` | `PluginListCommand` | `CommandBase` | Lists plugins via `PluginManager.getPlugins()`. |
| `private static` | `PluginLoadCommand` | `CommandBase` | Loads a plugin, validates state before loading. |
| `private static` | `PluginUnloadCommand` | `CommandBase` | Unloads a plugin, validates state before unloading. |
| `private static` | `PluginReloadCommand` | `CommandBase` | Reloads an enabled plugin. |
| `private static` | `PluginManageCommand` | `AbstractPlayerCommand` | Opens the plugin management page UI. |
