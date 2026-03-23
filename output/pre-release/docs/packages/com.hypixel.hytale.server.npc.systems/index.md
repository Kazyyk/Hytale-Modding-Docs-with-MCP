---
title: "NPC Systems"
kind: "package-index"
package: "com.hypixel.hytale.server.npc.systems"
fqcn: "com.hypixel.hytale.server.npc.systems.NPC Systems"
api_surface: false
extends: ~
implements: ~
generator_version: "2.0.0"
generated_at: "2026-03-21T02:17:06Z"
tags:
  - "npc"
  - "ecs-system"
  - "overview"
---

**Package:** `com.hypixel.hytale.server.npc.systems`

The NPC systems package contains 25 ECS system classes (totaling 69 types including inner classes) that implement the NPC behavior tick pipeline, spatial indexing, damage/death processing, interaction handling, spawn management, and debug visualization.

## Tick Pipeline Execution Order

The NPC systems execute in a well-defined order each tick, established through dependency annotations:

| Order | System | Purpose |
|---|---|---|
| 1 | [NPCSpatialSystem](NPCSpatialSystem.md) | Update the NPC spatial index |
| 2 | [PositionCacheSystems](PositionCacheSystems.md).UpdateSystem | Populate nearby entity caches |
| 3 | [RoleSystems](RoleSystems.md).PreBehaviourSupportTickSystem | Clear steering, validate targets |
| 4 | [StateEvaluatorSystem](StateEvaluatorSystem.md) | Utility-AI state selection |
| 5 | [RoleSystems](RoleSystems.md).BehaviourTickSystem | Core instruction tree evaluation |
| 6 | [AvoidanceSystem](AvoidanceSystem.md) | Entity avoidance/separation steering |
| 7 | [SteeringSystem](SteeringSystem.md) | Apply steering to motion controller |
| 8 | [RoleSystems](RoleSystems.md).PostBehaviourSupportTickSystem | Cleanup, state updates |
| 9 | [ComputeVelocitySystem](ComputeVelocitySystem.md) | Compute velocity from position delta |
| 10 | [MovementStatesSystem](MovementStatesSystem.md) | Update movement state flags |
| 11 | [StepCleanupSystem](StepCleanupSystem.md) | Remove step debug component (runs last) |

## Lifecycle Systems

| System | Purpose |
|---|---|
| [NPCSystems](NPCSystems.md) | 11 inner systems for add/remove, model change, death, teleport, kill feed |
| [RoleBuilderSystem](RoleBuilderSystem.md) | Constructs Role objects from JSON builder configs |
| [BalancingInitialisationSystem](BalancingInitialisationSystem.md) | Sets up entity stats (health) from role |
| [RoleChangeSystem](RoleChangeSystem.md) | Processes queued runtime role changes |
| [FailedSpawnSystem](FailedSpawnSystem.md) | Removes entities with failed role construction |
| [NewSpawnStartTickingSystem](NewSpawnStartTickingSystem.md) | Enables ticking for newly spawned entities |

## Damage and Death

| System | Purpose |
|---|---|
| [NPCDamageSystems](NPCDamageSystems.md) | 5 inner systems: damage received/dealt, event view, filtering, item drops |
| [NPCDeathSystems](NPCDeathSystems.md) | 2 inner systems: death event view, NPC kills tracking |

## World State and Messaging

| System | Purpose |
|---|---|
| [BlackboardSystems](BlackboardSystems.md) | 4 inner systems: init, periodic cleanup, block event forwarding |
| [MessageSupportSystem](MessageSupportSystem.md) | 5 inner systems: tick message slots for beacons and events |
| [PositionCacheSystems](PositionCacheSystems.md) | 3 inner systems: spatial cache update, role activation, flock join |

## Spawning

| System | Purpose |
|---|---|
| [SpawnReferenceSystems](SpawnReferenceSystems.md) | 4 inner systems: spawn marker/beacon lifecycle and validation |

## Interaction

| System | Purpose |
|---|---|
| [NPCInteractionSystems](NPCInteractionSystems.md) | 2 inner systems: add interaction manager, tick held interactions |

## Physics and Movement

| System | Purpose |
|---|---|
| [NPCPreTickSystem](NPCPreTickSystem.md) | Store tick-start position, manage despawn timers |
| [NPCSpatialSystem](NPCSpatialSystem.md) | Maintain NPC spatial index |
| [NPCVelocityInstructionSystem](NPCVelocityInstructionSystem.md) | Process velocity Set/Add instructions |
| [ComputeVelocitySystem](ComputeVelocitySystem.md) | Compute velocity from position delta |
| [MovementStatesSystem](MovementStatesSystem.md) | Update movement state flags from velocity |

## Base and Debug

| System | Purpose |
|---|---|
| [SteppableTickingSystem](SteppableTickingSystem.md) | Abstract base respecting Frozen component |
| [StepCleanupSystem](StepCleanupSystem.md) | Remove StepComponent at end of frame |
| [TimerSystem](TimerSystem.md) | Tick all Tickable timers |

## All Types (69)

| File | Top-Level | Inner Types |
|---|---|---|
| [AvoidanceSystem](AvoidanceSystem.md) | `AvoidanceSystem` | -- |
| [BalancingInitialisationSystem](BalancingInitialisationSystem.md) | `BalancingInitialisationSystem` | -- |
| [BlackboardSystems](BlackboardSystems.md) | `BlackboardSystems` | `InitSystem`, `TickingSystem`, `BreakBlockEventSystem`, `DamageBlockEventSystem` |
| [ComputeVelocitySystem](ComputeVelocitySystem.md) | `ComputeVelocitySystem` | -- |
| [FailedSpawnSystem](FailedSpawnSystem.md) | `FailedSpawnSystem` | -- |
| [MessageSupportSystem](MessageSupportSystem.md) | `MessageSupportSystem` | `BeaconSystem`, `NPCBlockEventSystem`, `NPCEntityEventSystem`, `PlayerBlockEventSystem`, `PlayerEntityEventSystem` |
| [MovementStatesSystem](MovementStatesSystem.md) | `MovementStatesSystem` | -- |
| [NewSpawnStartTickingSystem](NewSpawnStartTickingSystem.md) | `NewSpawnStartTickingSystem` | `QueueResource` |
| [NPCDamageSystems](NPCDamageSystems.md) | `NPCDamageSystems` | `DamageDealtSystem`, `DamageReceivedEventViewSystem`, `DamageReceivedSystem`, `DropDeathItems`, `FilterDamageSystem` |
| [NPCDeathSystems](NPCDeathSystems.md) | `NPCDeathSystems` | `EntityViewSystem`, `NPCKillsEntitySystem` |
| [NPCInteractionSystems](NPCInteractionSystems.md) | `NPCInteractionSystems` | `AddSimulationManagerSystem`, `TickHeldInteractionsSystem` |
| [NPCPreTickSystem](NPCPreTickSystem.md) | `NPCPreTickSystem` | -- |
| [NPCSpatialSystem](NPCSpatialSystem.md) | `NPCSpatialSystem` | -- |
| [NPCSystems](NPCSystems.md) | `NPCSystems` | `AddedSystem`, `AddedFromExternalSystem`, `AddedFromWorldGenSystem`, `AddSpawnEntityEffectSystem`, `OnDeathSystem`, `OnTeleportSystem`, `ModelChangeSystem`, `KillFeedDecedentEventSystem`, `KillFeedKillerEventSystem`, `LegacyWorldGenId`, `PrefabPlaceEntityEventSystem` |
| [NPCVelocityInstructionSystem](NPCVelocityInstructionSystem.md) | `NPCVelocityInstructionSystem` | -- |
| [PositionCacheSystems](PositionCacheSystems.md) | `PositionCacheSystems` | `UpdateSystem`, `RoleActivateSystem`, `OnFlockJoinSystem` |
| [RoleBuilderSystem](RoleBuilderSystem.md) | `RoleBuilderSystem` | -- |
| [RoleChangeSystem](RoleChangeSystem.md) | `RoleChangeSystem` | `RoleChangeQueue`, `RoleChangeRequest` |
| [RoleSystems](RoleSystems.md) | `RoleSystems` | `BehaviourTickSystem`, `PreBehaviourSupportTickSystem`, `PostBehaviourSupportTickSystem`, `RoleActivateSystem`, `RoleDebugSystem` |
| [SpawnReferenceSystems](SpawnReferenceSystems.md) | `SpawnReferenceSystems` | `BeaconAddRemoveSystem`, `MarkerAddRemoveSystem`, `TickingSpawnBeaconSystem`, `TickingSpawnMarkerSystem` |
| [StateEvaluatorSystem](StateEvaluatorSystem.md) | `StateEvaluatorSystem` | -- |
| [SteeringSystem](SteeringSystem.md) | `SteeringSystem` | -- |
| [StepCleanupSystem](StepCleanupSystem.md) | `StepCleanupSystem` | -- |
| [SteppableTickingSystem](SteppableTickingSystem.md) | `SteppableTickingSystem` | -- |
| [TimerSystem](TimerSystem.md) | `TimerSystem` | -- |

- [NPCDamageSystems.DropDeathItems](NPCDamageSystems.DropDeathItems.md)
- [NPCSystems.OnNPCAdded](NPCSystems.OnNPCAdded.md)
- [RoleSystems.RoleDebugSystem](RoleSystems.RoleDebugSystem.md)
