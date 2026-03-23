---
title: "com.hypixel.hytale.server.core.modules.entity.item"
package: "com.hypixel.hytale.server.core.modules.entity.item"
generator_version: "2.0.0"
generated_at: "2026-03-21T06:08:32Z"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.item`

This package implements the item entity system, covering dropped items, pickup animations, merging, physics, and marker components to control item behavior.

## Classes

| Type | Description |
|---|---|
| [ItemComponent](ItemComponent.md) | ECS component representing a dropped item entity |
| [ItemMergeSystem](ItemMergeSystem.md) | ECS system that merges nearby identical item entities within a 2-block radius |
| [ItemPhysicsComponent](ItemPhysicsComponent.md) | Deprecated component storing per-frame physics state (scaled velocity, collision result) for item entities |
| [ItemPhysicsSystem](ItemPhysicsSystem.md) | ECS system applying physics to item entities |
| [ItemPrePhysicsSystem](ItemPrePhysicsSystem.md) | ECS system running before main physics |
| [ItemSystems](ItemSystems.md) | Container for item entity ECS systems: `EnsureRequiredComponents` (adds physics, bounding box, network ID, dynamic light on spawn) and `TrackerSystem` (syncs item updates to entity tracker viewers) |
| [PickupItemComponent](PickupItemComponent.md) | ECS component for an item entity being animated toward a pickup target |
| [PickupItemSystem](PickupItemSystem.md) | ECS system that lerps pickup item entities toward their target position over their lifetime, removing them on completion or invalid target |
| [PreventItemMerging](PreventItemMerging.md) | Singleton marker component that prevents an item entity from being merged with nearby items |
| [PreventPickup](PreventPickup.md) | Singleton marker component that prevents an item entity from being picked up |
