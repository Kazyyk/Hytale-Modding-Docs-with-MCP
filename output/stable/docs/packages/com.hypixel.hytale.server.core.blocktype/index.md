---
title: "com.hypixel.hytale.server.core.blocktype"
kind: "package"
package: "com.hypixel.hytale.server.core.blocktype"
fqcn: "com.hypixel.hytale.server.core.blocktype"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "blocktype"
  - "chunk"
  - "plugin"
---

**Package:** `com.hypixel.hytale.server.core.blocktype`

Core block type module handling filler block validation, multi-block hitbox placement, block physics support data, and legacy chunk section migration. The `BlockPhysics` component stores per-block support nibble values for each chunk section.

## Types

| Type | Kind | Description |
|---|---|---|
| [BlockTypeModule](BlockTypeModule.md) | class | Core plugin managing block type processing, filler blocks, and legacy migration. |
| [BlockPhysics](BlockPhysics.md) | class | ChunkStore component storing per-block support values as 4-bit nibbles. |
