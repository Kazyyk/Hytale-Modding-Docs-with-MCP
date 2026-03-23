# PluginCommand

Type: class | Package: com.hypixel.hytale.server.core.plugin.commands | Extends: AbstractCommandCollection

public class PluginCommand extends AbstractCommandCollection

Command collection registered under `plugin` (aliased as `plugins`, `pl`) for runtime plugin management. Provides five subcommands for listing, loading, unloading, reloading, and managing plugins. The `load` and `unload` commands support a `--boot` flag to modify the server's boot plugin list in `HytaleServerConfig` without immediately changing the plugin state.

## Subcommands

- list: Lists all loaded plugin identifiers.
- load: Loads a plugin by identifier. Supports `--boot` flag to add to boot list only.
- unload: Unloads a plugin by identifier. Supports `--boot` flag to remove from boot list only.
- reload: Reloads an enabled plugin by identifier.
- manage: Opens a `PluginListPage` UI for the executing player.

## Constructor


public PluginCommand()

## Inner Classes

- PluginListCommand: Lists plugins via `PluginManager.getPlugins()`.
- PluginLoadCommand: Loads a plugin, validates state before loading.
- PluginUnloadCommand: Unloads a plugin, validates state before unloading.
- PluginReloadCommand: Reloads an enabled plugin.
- PluginManageCommand: Opens the plugin management page UI.

Also in this package: PluginListCommand, PluginLoadCommand, PluginManageCommand, PluginReloadCommand, PluginUnloadCommand

Fields:
private static final SingleArgumentType<PluginIdentifier> PLUGIN_IDENTIFIER_ARG_TYPE
