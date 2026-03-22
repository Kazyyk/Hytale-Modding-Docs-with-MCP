---
title: "com.hypixel.hytale.server.core.modules.entity.tracker"
kind: "package"
package: "com.hypixel.hytale.server.core.modules.entity.tracker"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "entity"
  - "tracker"
  - "ecs"
  - "networking"
  - "visibility"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.tracker`

The entity tracker package implements server-side entity visibility tracking and network update distribution. The core pipeline, defined in [EntityTrackerSystems](EntityTrackerSystems.md), runs each tick to determine which entities are visible to each viewer, detect visibility changes, queue component and effect updates, and send `EntityUpdates` packets to clients. Legacy visual synchronization systems for models, skins, equipment, entity hiding, and LOD culling are contained in [LegacyEntityTrackerSystems](LegacyEntityTrackerSystems.md).

All types in this package are internal (not part of the public API surface).

## Internal Types -- Core Tracker

| Type | Kind | Description |
|---|---|---|
| [EntityTrackerSystems](EntityTrackerSystems.md) | class | Container for the core entity visibility and network update ECS systems. |
| [EntityTrackerSystems.ClearEntityViewers](EntityTrackerSystems.md#clearentityviewers) | class | Resets each viewer's visible set before the visibility pass. |
| [EntityTrackerSystems.ClearPreviouslyVisible](EntityTrackerSystems.md#clearpreviouslyvisible) | class | Rotates previous/current visibility maps on `Visible` components. |
| [EntityTrackerSystems.CollectVisible](EntityTrackerSystems.md#collectvisible) | class | Spatial query to find entities within each viewer's radius. |
| [EntityTrackerSystems.EnsureVisibleComponent](EntityTrackerSystems.md#ensurevisiblecomponent) | class | Adds `Visible` component to newly visible entities. |
| [EntityTrackerSystems.AddToVisible](EntityTrackerSystems.md#addtovisible) | class | Populates `Visible.visibleTo` from viewer data. |
| [EntityTrackerSystems.RemoveEmptyVisibleComponent](EntityTrackerSystems.md#removeemptyvisiblecomponent) | class | Removes `Visible` from entities no longer seen by anyone. |
| [EntityTrackerSystems.EffectControllerSystem](EntityTrackerSystems.md#effectcontrollersystem) | class | Queues entity effect updates for network transmission. |
| [EntityTrackerSystems.SendPackets](EntityTrackerSystems.md#sendpackets) | class | Builds and sends `EntityUpdates` packets to viewers. |
| [EntityTrackerSystems.RemoveVisibleComponent](EntityTrackerSystems.md#removevisiblecomponent) | class | Removes `Visible` on entity removal from store. |

## Internal Types -- Components

| Type | Kind | Description |
|---|---|---|
| [EntityTrackerSystems.EntityViewer](EntityTrackerSystems.md#entityviewer) | class | ECS component for entities that observe other entities. |
| [EntityTrackerSystems.Visible](EntityTrackerSystems.md#visible) | class | ECS component tracking which viewers can see an entity. |
| [EntityTrackerSystems.EntityUpdate](EntityTrackerSystems.md#entityupdate) | class | Thread-safe container for pending network updates to an entity. |
| [NetworkId](NetworkId.md) | class | Immutable ECS component assigning a network integer ID to an entity. |

## Internal Types -- Legacy Tracker

| Type | Kind | Description |
|---|---|---|
| [LegacyEntityTrackerSystems](LegacyEntityTrackerSystems.md) | class | Container for legacy entity visual sync and filtering systems. |
| [LegacyEntityTrackerSystems.LegacyEntityModel](LegacyEntityTrackerSystems.md#legacyentitymodel) | class | Sends model and scale updates to viewers. |
| [LegacyEntityTrackerSystems.LegacyEntitySkin](LegacyEntityTrackerSystems.md#legacyentityskin) | class | Sends player skin updates to viewers. |
| [LegacyEntityTrackerSystems.LegacyEquipment](LegacyEntityTrackerSystems.md#legacyequipment) | class | Sends armor and held item updates to viewers. |
| [LegacyEntityTrackerSystems.LegacyHideFromEntity](LegacyEntityTrackerSystems.md#legacyhidefromentity) | class | Filters hidden entities from viewers' visible sets. |
| [LegacyEntityTrackerSystems.LegacyLODCull](LegacyEntityTrackerSystems.md#legacylodcull) | class | LOD-based distance culling of small entities. |
