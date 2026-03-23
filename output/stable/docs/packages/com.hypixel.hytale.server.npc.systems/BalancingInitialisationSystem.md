---
title: "BalancingInitialisationSystem"
kind: "class"
package: "com.hypixel.hytale.server.npc.systems"
fqcn: "com.hypixel.hytale.server.npc.systems.BalancingInitialisationSystem"
api_surface: false
extends: "HolderSystem<EntityStore>"
implements: ~
generator_version: "2.0.0"
generated_at: "2026-03-21T02:17:06Z"
tags:
  - "npc"
  - "ecs-system"
---

**Package:** `com.hypixel.hytale.server.npc.systems`

```java
public class BalancingInitialisationSystem extends HolderSystem<EntityStore>
```

Sets up NPC entity stats (health) from the role's configuration when an NPC entity is added. Reads the `initialMaxHealth` from the role, computes the difference from the default stat max, and applies a `StaticModifier` with key `"NPC_Max"` to adjust the maximum health. After applying the modifier, the stat value is maximized so the NPC spawns at full health.

## Execution Order

| Dependency | Direction |
|---|---|
| `RoleBuilderSystem` | AFTER |
| `EntityStatsSystems.Setup` | AFTER |

## Query

Matches entities with both `NPCEntity` and `EntityStatMap` components.

## Lifecycle

```java
@Override
public void onEntityAdd(@Nonnull Holder<EntityStore> holder, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store)
```

1. Gets the role from the NPC component.
2. Reads `initialMaxHealth` from the role.
3. Looks up the `"Health"` stat index from `EntityStatType.getAssetMap()`.
4. Creates a `StaticModifier` (ADDITIVE on MAX) with the delta between the role health and the default max.
5. Puts the modifier with key `"NPC_Max"`.
6. Calls `maximizeStatValue` to fill health to the new maximum.

```java
@Override
public void onEntityRemoved(@Nonnull Holder<EntityStore> holder, @Nonnull RemoveReason reason, @Nonnull Store<EntityStore> store)
```

No-op.

## Constants

| Constant | Value | Description |
|---|---|---|
| `NPC_MAX_MODIFIER` | `"NPC_Max"` | Modifier key applied to the health stat. |
| `HEALTH_STAT_INDEX` | `"Health"` | Stat type key used for health lookup. |

## Related Types

- [RoleBuilderSystem](RoleBuilderSystem.md) -- constructs the role before this system runs
- [RoleSystems](RoleSystems.md) -- behavior tick that uses the initialized stats
