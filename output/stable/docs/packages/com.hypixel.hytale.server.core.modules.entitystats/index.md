---
title: "entitystats"
kind: "index"
package: "com.hypixel.hytale.server.core.modules.entitystats"
fqcn: "com.hypixel.hytale.server.core.modules.entitystats"
api_surface: false
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "entity-stats"
  - "index"
---

**Package:** `com.hypixel.hytale.server.core.modules.entitystats`

Entity stats system -- manages stat values (health, mana, stamina, etc.) for all living entities with modifier support, regeneration, network replication, and asset-driven configuration.

## Types

| Type | Kind | Description |
|---|---|---|
| [EntityStatMap](EntityStatMap.md) | class | ECS component storing all stat values for an entity. |
| [EntityStatMap.Predictable](EntityStatMap.Predictable.md) | enum | Client prediction mode for stat updates. |
| [EntityStatValue](EntityStatValue.md) | class | Individual stat value with dynamic min/max bounds. |
| [EntityStatsModule](EntityStatsModule.md) | class | Plugin that registers the entity stats system. |
| [EntityStatsSystems](EntityStatsSystems.md) | class | ECS systems for stat processing. |
| [RegeneratingValue](RegeneratingValue.md) | class | Runtime regeneration tick tracker. |
| [DefaultEntityStatTypes](DefaultEntityStatTypes.md) | class | Cached indices for built-in stat types. |
| [EntityStatType](EntityStatType.md) | class | JSON asset defining a stat type. |
| [EntityStatType.EntityStatEffects](EntityStatType.EntityStatEffects.md) | class | Effects triggered at stat min/max. |
| [EntityStatType.Regenerating](EntityStatType.Regenerating.md) | class | Regeneration configuration. |
| [EntityStatType.Regenerating.RegenType](EntityStatType.Regenerating.RegenType.md) | enum | Additive vs percentage regen. |
| [EntityStatTypePacketGenerator](EntityStatTypePacketGenerator.md) | class | Network packet generator for stat type assets. |
| [Condition](Condition.md) | class | Abstract base for regeneration conditions. |
| [RegeneratingModifier](RegeneratingModifier.md) | class | Conditional multiplier for regeneration. |
| [Modifier](Modifier.md) | class | Abstract base for stat bound modifiers. |
| [Modifier.ModifierTarget](Modifier.ModifierTarget.md) | enum | MIN or MAX target. |
| [StaticModifier](StaticModifier.md) | class | Additive/multiplicative bound modifier. |
| [StaticModifier.CalculationType](StaticModifier.CalculationType.md) | enum | Additive vs multiplicative. |
| [DefaultModifiers](DefaultModifiers.md) | interface | Well-known modifier key constants. |
