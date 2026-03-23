---
title: "com.hypixel.hytale.server.core.modules.entity"
kind: "package"
package: "com.hypixel.hytale.server.core.modules.entity"
generator_version: "2.0.0"
generated_at: "2026-03-21T02:13:02Z"
tags:
  - "entity"
  - "module"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity`

The root entity module package contains the core plugin ([EntityModule](EntityModule.md)) that bootstraps the server's entity system, the plugin-facing entity registration API ([EntityRegistry](EntityRegistry.md) and [EntityRegistration](EntityRegistration.md)), ECS systems for block entities and projectiles, the despawn timer system, and legacy compatibility queries. All ECS components and systems for entity lifecycle, physics, tracking, and networking are registered by `EntityModule.setup()`.

Sub-packages (documented separately) contain specialized subsystems: components, damage, items, players, physics, tracking, teleportation, hitbox collision, repulsion, and more.

## API Surface Types

| Type | Kind | Description |
|---|---|---|
| [EntityRegistry](EntityRegistry.md) | class | Plugin-scoped registry for registering custom entity types. |
| [EntityRegistration](EntityRegistration.md) | class | Registration handle returned when a plugin registers an entity type. |

## Internal Types -- Module

| Type | Kind | Description |
|---|---|---|
| [EntityModule](EntityModule.md) | class | Core plugin that registers all entity ECS infrastructure. |
| [EntityModule.MigrationSystem](EntityModule.md#inner-classes) | abstract class | Base class for legacy data migration systems. |
| [EntityModule.LegacyEntityHolderSystem](EntityModule.md#inner-classes) | class | Bridges legacy `Entity` objects with the ECS on add/remove. |
| [EntityModule.LegacyEntityRefSystem](EntityModule.md#inner-classes) | class | Sets ECS references on legacy entity objects. |
| [EntityModule.LegacyTransformSystem](EntityModule.md#inner-classes) | class | Wires `TransformComponent` to legacy entities. |
| [EntityModule.LegacyUUIDSystem](EntityModule.md#inner-classes) | class | Synchronizes UUIDs between ECS and legacy entities. |
| [EntityModule.LegacyUUIDUpdateSystem](EntityModule.md#inner-classes) | class | Keeps legacy UUIDs in sync on component changes. |
| [EntityModule.HiddenFromPlayerMigrationSystem](EntityModule.md#inner-classes) | class | Deprecated migration for adventure player visibility. |
| [EntityModule.TangibleMigrationSystem](EntityModule.md#inner-classes) | class | Deprecated migration for intangible flag. |
| [EntityModule.Type](EntityModule.md#inner-classes) | enum | Scope enum: `PLAYERS` or `ALL`. |

## Internal Types -- Block Entity Systems

| Type | Kind | Description |
|---|---|---|
| [BlockEntitySystems](BlockEntitySystems.md) | class | Container for block entity ECS systems. |
| [BlockEntitySystems.BlockEntitySetupSystem](BlockEntitySystems.md#blockentitysetupsystem) | class | Initializes bounding box and physics on block entity add. |
| [BlockEntitySystems.BlockEntityTrackerSystem](BlockEntitySystems.md#blockentitytrackersystem) | class | Sends block entity updates to visible players. |
| [BlockEntitySystems.Ticking](BlockEntitySystems.md#ticking) | class | Per-tick physics for block entities. |

## Internal Types -- Projectile Systems

| Type | Kind | Description |
|---|---|---|
| [LegacyProjectileSystems](LegacyProjectileSystems.md) | class | Container for legacy projectile ECS systems. |
| [LegacyProjectileSystems.OnAddHolderSystem](LegacyProjectileSystems.md#onaddholdersystem) | class | Initializes projectile model, bounding box, and physics. |
| [LegacyProjectileSystems.OnAddRefSystem](LegacyProjectileSystems.md#onaddrefsystem) | class | Validates projectile initialization. |
| [LegacyProjectileSystems.TickingSystem](LegacyProjectileSystems.md#tickingsystem) | class | Per-tick physics and death timer for projectiles. |

## Internal Types -- Despawn

| Type | Kind | Description |
|---|---|---|
| [DespawnComponent](DespawnComponent.md) | class | ECS component scheduling automatic entity removal at a time instant. |
| [DespawnSystem](DespawnSystem.md) | class | Ticking system that removes entities past their despawn time. |

## Internal Types -- Queries

| Type | Kind | Description |
|---|---|---|
| [AllLegacyEntityTypesQuery](AllLegacyEntityTypesQuery.md) | class | Deprecated query matching all legacy entity archetypes. |
| [AllLegacyLivingEntityTypesQuery](AllLegacyLivingEntityTypesQuery.md) | class | Deprecated query matching all legacy living entity archetypes. |

## Internal Types -- Migration

| Type | Kind | Description |
|---|---|---|
| [BlockMigrationExtraInfo](BlockMigrationExtraInfo.md) | class | Block identifier remapping context for data migration. |
