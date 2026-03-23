---
title: "com.hypixel.hytale.server.core.prefab.selection.mask"
kind: "package"
package: "com.hypixel.hytale.server.core.prefab.selection.mask"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "prefab"
  - "selection"
  - "mask"
---

**Package:** `com.hypixel.hytale.server.core.prefab.selection.mask`

Block filtering and masking primitives used by the prefab system, builder tools, and scripted brush operations. Masks control which blocks are affected during placement, replacement, and terrain editing operations by defining spatial filter conditions (target block, adjacent blocks, cardinal neighbors, diagonals, or selection bounds).

## Types

| Type | Kind | API Surface | Description |
|---|---|---|---|
| [BlockFilter](BlockFilter.md) | class | yes | Single filter condition testing a spatial relationship and block set. |
| [BlockMask](BlockMask.md) | class | yes | Compound mask combining multiple filters with AND logic. |
| [BlockPattern](BlockPattern.md) | class | yes | Weighted random block selection pattern. |
| [MultiBlockMask](MultiBlockMask.md) | class | no | Extends BlockMask to combine multiple mask instances. |
