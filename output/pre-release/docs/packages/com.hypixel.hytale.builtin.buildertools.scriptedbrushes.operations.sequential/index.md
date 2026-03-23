---
title: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential"
kind: "package"
package: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "buildertools"
  - "brush"
  - "operation"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.scriptedbrushes.operations.sequential`

Sequential brush operations for the scripted brush system in Hytale's builder tools. Each operation extends `SequenceBrushOperation` and represents a single step in a brush's operation sequence. Operations are executed in order when a scripted brush is activated, modifying the brush configuration, placing/removing blocks, or triggering side effects.

## Placement Operations

| Type | Description |
|---|---|
| [SetOperation](SetOperation.md) | Fills the brush area with the current material. |
| [DeleteOperation](DeleteOperation.md) | Removes all blocks in the brush area. |
| [ReplaceOperation](ReplaceOperation.md) | Replaces matching blocks with a target pattern. |
| [PastePrefabOperation](PastePrefabOperation.md) | Pastes a prefab at the brush position. |
| [LayerOperation](LayerOperation.md) | Places blocks in horizontal layers. |
| [HeightmapLayerOperation](HeightmapLayerOperation.md) | Places blocks following heightmap contours. |
| [SetDensity](SetDensity.md) | Sets SDF terrain density values. |

## Terrain Sculpting

| Type | Description |
|---|---|
| [ErodeOperation](ErodeOperation.md) | Erosion pass removing under-supported blocks. |
| [MeltOperation](MeltOperation.md) | Fill pass adding blocks into gaps (inverse erosion). |
| [SmoothOperation](SmoothOperation.md) | Averages neighbor heights for natural surfaces. |

## Configuration Operations

| Type | Description |
|---|---|
| [BlockPatternOperation](BlockPatternOperation.md) | Sets brush material to a weighted block pattern. |
| [MaterialOperation](MaterialOperation.md) | Sets brush material to a single block type. |
| [ShapeOperation](ShapeOperation.md) | Constrains the brush to a geometric shape. |
| [ClearOperationMaskOperation](ClearOperationMaskOperation.md) | Removes active operation mask. |
| [LiftOperation](LiftOperation.md) | Shifts brush vertical offset. |
| [LoadIntFromToolArgOperation](LoadIntFromToolArgOperation.md) | Loads an integer from tool arguments. |
| [LoadMaterialFromToolArgOperation](LoadMaterialFromToolArgOperation.md) | Loads a material from tool arguments. |

## Utility Operations

| Type | Description |
|---|---|
| [EchoOperation](EchoOperation.md) | Sends a message to the operator each execution. |
| [EchoOnceOperation](EchoOnceOperation.md) | Sends a message once per activation. |
| [BreakpointOperation](BreakpointOperation.md) | Pauses execution for debugging. |
| [RunCommandOperation](RunCommandOperation.md) | Executes a server command. |
- [ClearRotationOperation](ClearRotationOperation.md)
