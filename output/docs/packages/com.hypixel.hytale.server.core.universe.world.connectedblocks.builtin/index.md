---
title: "com.hypixel.hytale.server.core.universe.world.connectedblocks.builtin"
kind: "package"
package: "com.hypixel.hytale.server.core.universe.world.connectedblocks.builtin"
fqcn: "com.hypixel.hytale.server.core.universe.world.connectedblocks.builtin"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "world"
  - "connectedblocks"
  - "builtin"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.connectedblocks.builtin`

Built-in connected block rule set implementations for stair and roof block auto-connection. Handles automatic corner and inverted corner detection based on neighboring blocks.

## Types

| Type | Kind | Description |
|---|---|---|
| [ConnectedBlockOutput](ConnectedBlockOutput.md) | class | Codec-backed output definition for connected blocks. Resolve |
| [RoofConnectedBlockRuleSet](RoofConnectedBlockRuleSet.md) | class | Connected block rule set for roof blocks. Extends stair logi |
| [StairConnectedBlockRuleSet](StairConnectedBlockRuleSet.md) | class | Connected block rule set for stair blocks. Detects corners a |
| [StairConnectedBlockRuleSet.StairType](StairConnectedBlockRuleSet.StairType.md) | enum | Stair shape variants. |
| [StairConnectedBlockRuleSet.StairConnection](StairConnectedBlockRuleSet.StairConnection.md) | enum | Corner connection directions (left/right). |
| [StairLikeConnectedBlockRuleSet](StairLikeConnectedBlockRuleSet.md) | interface | Interface for connected block rule sets that behave like sta |
