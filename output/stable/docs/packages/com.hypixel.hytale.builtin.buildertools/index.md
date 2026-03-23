---
title: "com.hypixel.hytale.builtin.buildertools"
package: "com.hypixel.hytale.builtin.buildertools"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "buildertools"
  - "creative"
  - "package-index"
---

**Package:** `com.hypixel.hytale.builtin.buildertools`

Built-in builder tools module providing WorldEdit-like block editing, prefab editing, scripted brushes, OBJ/image import, and clipboard/undo-redo infrastructure for creative-mode world building. None of the types in this package are part of the public API surface.

## Plugin Entry Point

| Type | Kind | Description |
|---|---|---|
| [BuilderToolsPlugin](BuilderToolsPlugin.md) | class | Main plugin class; singleton entry point for all builder tool functionality. |

## ECS Components and Systems

| Type | Kind | Description |
|---|---|---|
| [BuilderToolsUserData](BuilderToolsUserData.md) | class | Per-player `EntityStore` component tracking selection history preference. |
| [BuilderToolsUserDataSystem](BuilderToolsUserDataSystem.md) | class | `HolderSystem` ensuring `BuilderToolsUserData` on player entities. |
| [BuilderToolsSystems](BuilderToolsSystems.md) | class | Container for builder tools ECS systems. |
| [BuilderToolsSystems.EnsureBuilderTools](BuilderToolsSystems.EnsureBuilderTools.md) | class | `HolderSystem` populating player tool inventories on join. |

## Networking

| Type | Kind | Description |
|---|---|---|
| [BuilderToolsPacketHandler](BuilderToolsPacketHandler.md) | class | Handles all client-server builder tool packets (20+ handlers). |

## Editing Infrastructure

| Type | Kind | Description |
|---|---|---|
| [EditOperation](EditOperation.md) | class | Tracks before/after block state for brush operations. |
| [CopyCutSettings](CopyCutSettings.md) | class | Bitflag constants for copy/cut clipboard operations. |

## Color Matching

| Type | Kind | Description |
|---|---|---|
| [BlockColorIndex](BlockColorIndex.md) | class | Maps block types to CIE Lab colors for image import. |
| [BlockColorIndex.BlockColorEntry](BlockColorIndex.BlockColorEntry.md) | record | Per-block color data record. |

## Per-Player Settings

| Type | Kind | Description |
|---|---|---|
| [PrototypePlayerBuilderToolSettings](PrototypePlayerBuilderToolSettings.md) | class | Per-player brush, transform, and clipboard settings. |
| [PrototypePlayerBuilderToolSettings.EntityChange](PrototypePlayerBuilderToolSettings.EntityChange.md) | record | Entity position and holder for clipboard transform. |
| [PrototypePlayerBuilderToolSettings.FluidChange](PrototypePlayerBuilderToolSettings.FluidChange.md) | record | Fluid position and state for clipboard transform. |

## Undo/Redo System

| Type | Kind | Description |
|---|---|---|
| [BuilderToolsPlugin.Action](BuilderToolsPlugin.Action.md) | enum | Action types for undo/redo entries. |
| [BuilderToolsPlugin.ActionEntry](BuilderToolsPlugin.ActionEntry.md) | class | Pairs an action with its snapshots for undo/redo. |

## Builder State

| Type | Kind | Description |
|---|---|---|
| [BuilderToolsPlugin.BuilderState](BuilderToolsPlugin.BuilderState.md) | class | Per-player selection, clipboard, undo/redo, and task queue. |
| [BuilderToolsPlugin.BuilderState.BlocksSampleData](BuilderToolsPlugin.BuilderState.BlocksSampleData.md) | class | Sampling data for block majority calculations. |
| [BuilderToolsPlugin.BuilderState.SmoothSampleData](BuilderToolsPlugin.BuilderState.SmoothSampleData.md) | class | Sampling data for smooth operations. |

## Configuration

| Type | Kind | Description |
|---|---|---|
| [BuilderToolsPlugin.BuilderToolsConfig](BuilderToolsPlugin.BuilderToolsConfig.md) | class | Plugin configuration (history count, tool expire time). |

## Internal Infrastructure

| Type | Kind | Description |
|---|---|---|
| [BuilderToolsPlugin.CachedAccessor](BuilderToolsPlugin.CachedAccessor.md) | class | Thread-local cached chunk section accessor. |
| [BuilderToolsPlugin.PrefabPasteEventSystem](BuilderToolsPlugin.PrefabPasteEventSystem.md) | class | ECS system handling prefab paste events. |
| [BuilderToolsPlugin.QueuedTask](BuilderToolsPlugin.QueuedTask.md) | class | Wrapper for queued async builder operations. |

## Exceptions

| Type | Kind | Description |
|---|---|---|
| [PrefabCopyException](PrefabCopyException.md) | class | Thrown when a prefab copy operation fails. |

## Sub-packages

This package has extensive sub-packages not covered here:

- `commands/` -- 38+ slash commands for selection, editing, clipboard, and history
- `scriptedbrushes/` -- Data-driven brush operation system with 50+ operation types
- `prefabeditor/` -- Prefab editing session management with isolated worlds
- `tooloperations/` -- Real-time brush tool operations (Paint, Sculpt, Flood, etc.)
- `snapshot/` -- Undo/redo snapshot types (block, clipboard, entity)
- `imageimport/` -- Image-to-blocks import via color matching
- `objimport/` -- OBJ 3D model voxelization import
- `interactions/` -- Custom block interactions (pickup, prefab selection)
- `utils/` -- Material value type and fluid helpers
