---
title: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes"
kind: "package"
package: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "buildertools"
  - "brush"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.scriptedbrushes`

Scripted brush system for the builder tools. Provides a configurable brush pipeline where JSON-defined operation sequences modify world blocks through shape iteration, masks, density, and pattern selection. Supports debug stepping, persistent variables, and snapshot save/restore.

## Types

| Type | Kind | Description |
|---|---|---|
| [BrushConfig](BrushConfig.md) | class | Mutable brush state: shape, dimensions, pattern, masks, density, and execution context. |
| [BrushConfigChunkAccessor](BrushConfigChunkAccessor.md) | class | Chunk accessor that overlays edit-store modifications on top of world data. |
| [BrushConfigCommandExecutor](BrushConfigCommandExecutor.md) | class | Executor that runs sequential and global brush operations with debug support. |
| [BrushConfigEditStore](BrushConfigEditStore.md) | class | Three-layer edit tracker (before/previous/current) enforcing masks and density. |
| [ScriptedBrushAsset](ScriptedBrushAsset.md) | class | JSON asset defining an ordered list of brush operations for loading into an executor. |
