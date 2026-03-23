---
title: "com.hypixel.hytale.server.core.asset.type.blocktype.config"
kind: "package"
package: "com.hypixel.hytale.server.core.asset.type.blocktype.config"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:46Z"
tags:
  - "asset"
  - "blocktype"
  - "config"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.blocktype.config`

Block type asset configuration classes. Defines the complete data model for blocks, including rotation, state variants, flip behavior, and conditional sounds.

## Classes

| Type | Description |
|---|---|
| [BlockType](BlockType.md) | Primary block type asset definition |
| [ConditionalBlockSound](ConditionalBlockSound.md) | Sound event triggered by ambience FX conditions |
| [StateData](StateData.md) | Bidirectional mapping between state names and block type keys |

## Enums

| Type | Description |
|---|---|
| [BlockFlipType](BlockFlipType.md) | How rotations transform during flip operations |
| [Rotation](Rotation.md) | 90-degree-increment rotation for block placement |

## Records

| Type | Description |
|---|---|
| [RotationTuple](RotationTuple.md) | Compound yaw/pitch/roll rotation with matrix operations |
