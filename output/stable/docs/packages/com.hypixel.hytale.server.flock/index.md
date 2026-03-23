---
title: "com.hypixel.hytale.server.flock"
kind: "package"
package: "com.hypixel.hytale.server.flock"
generator_version: "2.0.0"
generated_at: "2026-03-21T02:46:37Z"
tags:
  - "flock"
  - "npc"
  - "ecs"
---

**Package:** `com.hypixel.hytale.server.flock`

The flock/group behavior system for NPCs. A flock is a runtime ECS entity in the EntityStore composed of a [Flock](Flock.md) component, `EntityGroup` component, and `UUIDComponent`. Individual NPCs and players join via [FlockMembership](FlockMembership.md). Each flock has exactly one leader (elected or interim) and tracks group damage data via double-buffered `DamageData`.

Flocks are configured via [FlockAsset](FlockAsset.md) (JSON) which specifies size ranges, grow limits, and blocked roles. The plugin provides 10 NPC core component types for AI integration including steering behavior, inter-NPC messaging, combat damage sensing, and group state management.

Key behaviors:
- **Leader election** -- players always become leader; NPCs with `canLeadFlock` are eligible; if no leader can be found, the flock dissolves
- **Friendly-fire prevention** -- damage between flock members is cancelled
- **Group damage tracking** -- double-buffered per-tick tracking of incoming/outgoing damage for both the group and leader
- **Flock dissolution** -- flock is dissolved when size drops below 2 or no eligible leader exists

## Plugin

| Type | Kind | Description |
|---|---|---|
| [FlockPlugin](FlockPlugin.md) | class | Central plugin registering all ECS infrastructure and NPC component types. |

## ECS Components

| Type | Kind | Description |
|---|---|---|
| [Flock](Flock.md) | class | Core flock entity component with damage tracking and removal status. |
| [FlockMembership](FlockMembership.md) | class | Per-member component linking entity to its flock (serialized). |
| [PersistentFlockData](PersistentFlockData.md) | class | Serialized flock metadata -- max size, allowed roles, current size. |

## ECS Systems

| Type | Kind | Description |
|---|---|---|
| [FlockSystems](FlockSystems.md) | class | Flock entity lifecycle: removal, ticking, debug visualization, game mode events. |
| [FlockMembershipSystems](FlockMembershipSystems.md) | class | Membership processing: join/leave, leader election, damage tracking, friendly fire. |
| [FlockDeathSystems](FlockDeathSystems.md) | class | Removes membership on NPC/player death; notifies attacker flock of kills. |

## Storage

| Type | Kind | Description |
|---|---|---|
| [StoredFlock](StoredFlock.md) | class | Serializable container for persisting flock NPCs during spawn marker deactivation. |

## Configuration (sub-package: config)

| Type | Kind | Description |
|---|---|---|
| [FlockAsset](FlockAsset.md) | abstract class | Base class for flock JSON definitions (path: `NPC/Flocks`). |
| [RangeSizeFlockAsset](RangeSizeFlockAsset.md) | class | Default flock asset -- size from a `[min, max]` range. |
| [WeightedSizeFlockAsset](WeightedSizeFlockAsset.md) | class | Weighted flock asset -- size from weighted probability distribution. |

## Commands (sub-package: commands)

| Type | Kind | Description |
|---|---|---|
| [NPCFlockCommand](NPCFlockCommand.md) | class | `/flock` command collection: grab, join, leave, playerleave. |

## Decision Maker (sub-package: decisionmaker.conditions)

| Type | Kind | Description |
|---|---|---|
| [FlockSizeCondition](FlockSizeCondition.md) | class | Decision-maker condition returning current flock size for AI behavior. |

## Cross-References

The flock system interacts with:
- **Spawning system** -- `FlockPlugin.trySpawnFlock()` is called by spawn controllers to create flock groups; [StoredFlock](StoredFlock.md) persists NPCs during deactivation
- **NPC system** -- 10 NPC core component types provide AI integration (steering, messaging, sensing, filtering)
- **Damage system** -- `DamageEventSystem` implementations track flock damage and prevent friendly fire
- **Entity system** -- `EntityGroup` manages member references; `UUIDComponent` provides flock identity
