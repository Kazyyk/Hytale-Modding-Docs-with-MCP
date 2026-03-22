---
title: "com.hypixel.hytale.builtin.buildertools.prefabeditor.commands"
package: "com.hypixel.hytale.builtin.buildertools.prefabeditor.commands"
generator_version: "2.0.0"
generated_at: "2026-03-21T06:08:32Z"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.prefabeditor.commands`

This package provides server commands for the prefab editor tool, enabling creation, loading, saving, editing, and management of prefab structures.

## Classes

| Type | Description |
|---|---|
| [PrefabEditCommand](PrefabEditCommand.md) | Root command collection for `/editprefab` (aliases: `prefabedit`, `pedit`) |
| [PrefabEditCreateNewCommand](PrefabEditCreateNewCommand.md) | Subcommand to create a new prefab editing session with configurable world gen type, root directory, and dimensions |
| [PrefabEditExitCommand](PrefabEditExitCommand.md) | Subcommand to exit the current prefab editing session, with unsaved-changes confirmation |
| [PrefabEditInfoCommand](PrefabEditInfoCommand.md) | Subcommand displaying information about the current prefab editing session |
| [PrefabEditKillEntitiesCommand](PrefabEditKillEntitiesCommand.md) | Subcommand to kill all entities within the current prefab editing bounds |
| [PrefabEditLoadCommand](PrefabEditLoadCommand.md) | Subcommand to load an existing prefab for editing with configurable alignment and stacking options |
| [PrefabEditModifiedCommand](PrefabEditModifiedCommand.md) | Subcommand listing prefabs modified during the current session |
| [PrefabEditSaveAsCommand](PrefabEditSaveAsCommand.md) | Subcommand to save the current prefab to a specified path |
| [PrefabEditSaveCommand](PrefabEditSaveCommand.md) | Subcommand to save the current prefab to its original path |
| [PrefabEditSaveUICommand](PrefabEditSaveUICommand.md) | Subcommand opening the save settings UI page |
| [PrefabEditSelectCommand](PrefabEditSelectCommand.md) | Subcommand to select a prefab within the editing session |
| [PrefabEditTeleportCommand](PrefabEditTeleportCommand.md) | Subcommand opening the teleport UI for navigating between prefabs |
| [PrefabEditUpdateBoxCommand](PrefabEditUpdateBoxCommand.md) | Subcommand to update the editing bounds box dimensions |
