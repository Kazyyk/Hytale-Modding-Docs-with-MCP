---
title: "com.hypixel.hytale.server.core.modules.entitystats.asset"
kind: "package"
package: "com.hypixel.hytale.server.core.modules.entitystats.asset"
fqcn: "com.hypixel.hytale.server.core.modules.entitystats.asset"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "entitystats"
  - "asset"
  - "condition"
  - "modifier"
---

**Package:** `com.hypixel.hytale.server.core.modules.entitystats.asset`

Asset definitions for the entity stat system. Defines stat types (Health, Oxygen, Stamina, etc.) with configurable min/max bounds, regeneration rules, conditional effects, and network synchronization. Includes a condition system for conditional regeneration and modifiers that scale regeneration amounts.

## Types

| Type | Kind | Description |
|---|---|---|
| [EntityStatType](EntityStatType.md) | class | Asset definition for an entity stat with value bounds, regeneration, and effects. |
| [DefaultEntityStatTypes](DefaultEntityStatTypes.md) | class | Cached asset-map indices for built-in stat types. |
| [EntityStatTypePacketGenerator](EntityStatTypePacketGenerator.md) | class | Generates network packets for stat type synchronization. |
| [Condition](Condition.md) | class | Abstract base for regeneration conditions (alive, sprinting, etc.). |
| [RegeneratingModifier](RegeneratingModifier.md) | class | Conditional multiplier for stat regeneration amounts. |
