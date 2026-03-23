---
title: "EntityStatsModule"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entitystats"
fqcn: "com.hypixel.hytale.server.core.modules.entitystats.EntityStatsModule"
api_surface: false
extends: "JavaPlugin"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "entity-stats"
  - "plugin"
  - "ecs"
---

**Package:** `com.hypixel.hytale.server.core.modules.entitystats`

```java
public class EntityStatsModule extends JavaPlugin
```

Core plugin that manages the entity stats system. Registers the [EntityStatMap](EntityStatMap.md) ECS component, all `EntityStatType` assets, `Condition` and `Modifier` codec types, and the systems in [EntityStatsSystems](EntityStatsSystems.md). Depends on `EntityModule` and `InteractionModule`.

## Static Methods

| Method | Return Type | Description |
|---|---|---|
| `get()` | `EntityStatsModule` | Returns the singleton instance. |
| `get(Entity entity)` | `EntityStatMap` | **Deprecated.** Retrieves the stat map for an entity. |
| `resolveEntityStats(Object2FloatMap<String>)` | `Int2FloatMap` | Resolves string-keyed stat values to index-keyed maps. |
| `resolveEntityStats(Map<String, T>)` | `Int2ObjectMap<T>` | Resolves string-keyed stat objects to index-keyed maps. |
| `resolveEntityStats(String[])` | `int[]` | Resolves string stat names to index array. |

## Instance Methods

| Method | Return Type | Description |
|---|---|---|
| `getEntityStatMapComponentType()` | `ComponentType<EntityStore, EntityStatMap>` | Returns the registered component type for `EntityStatMap`. |
| `getStatModifyingSystemType()` | `SystemType<EntityStore, StatModifyingSystem>` | Returns the system type for stat-modifying systems. |

## Registered Condition Types

`LogicCondition`, `RegenHealth`, `NoDamageTaken`, `Suffocating`, `Charging`, `Alive`, `Environment`, `Player`, `OutOfCombat`, `Wielding`, `Sprinting`, `Gliding`, `Stat`

## Registered Modifier Types

`Boost` and `Static` (both map to `StaticModifier`)

## Inner Types

- `PlayerRegenerateStatsSystem` -- regeneration system for Player entities

## Related Types

- [EntityStatMap](EntityStatMap.md) -- the component this module registers
- [EntityStatsSystems](EntityStatsSystems.md) -- all ECS systems for stat processing
- [DefaultEntityStatTypes](DefaultEntityStatTypes.md) -- built-in stat type indices
