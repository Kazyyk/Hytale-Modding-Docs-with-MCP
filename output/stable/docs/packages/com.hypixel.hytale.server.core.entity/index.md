---
title: "com.hypixel.hytale.server.core.entity"
package: "com.hypixel.hytale.server.core.entity"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "entity"
  - "core"
  - "package-index"
---

**Package:** `com.hypixel.hytale.server.core.entity`

Core entity types forming the foundation of the server's entity system. This root package contains the base `Entity` and `LivingEntity` abstract classes, the interaction execution infrastructure (`InteractionManager`, `InteractionChain`, `InteractionContext`, `InteractionEntry`), entity utility classes, and several ECS components.

## Entity Base Classes

| Type | Kind | Description |
|---|---|---|
| [Entity](Entity.md) | class | Abstract base for all server-side entities. |
| [LivingEntity](LivingEntity.md) | class | Abstract base for entities with health and inventory. |

## Interaction System

| Type | Kind | Description |
|---|---|---|
| [InteractionManager](InteractionManager.md) | class | Per-entity component managing active interaction chains and cooldowns. |
| [InteractionChain](InteractionChain.md) | class | Represents a running interaction chain with client-server sync. |
| [InteractionContext](InteractionContext.md) | class | Runtime context for interaction chain execution. |
| [InteractionEntry](InteractionEntry.md) | class | A single step within an interaction chain. |
| [ChainSyncStorage](ChainSyncStorage.md) | interface | Interface for interaction chain sync storage. |

## ECS Components

| Type | Kind | Description |
|---|---|---|
| [UUIDComponent](UUIDComponent.md) | class | Stores entity UUID. |
| [Frozen](Frozen.md) | class | Singleton marker component for frozen entities. |
| [StatModifiersManager](StatModifiersManager.md) | class | Equipment-based stat modifier management. |

## Utilities

| Type | Kind | Description |
|---|---|---|
| [EntityUtils](EntityUtils.md) | class | Entity component extraction utilities. |
| [AnimationUtils](AnimationUtils.md) | class | Animation playback utilities. |
| [ItemUtils](ItemUtils.md) | class | Item pickup and drop utilities. |
| [EntitySnapshot](EntitySnapshot.md) | class | Position and rotation snapshot. |

## Configuration

| Type | Kind | Description |
|---|---|---|
| [ExplosionConfig](ExplosionConfig.md) | class | JSON-configurable explosion parameters. |
| [ExplosionUtils](ExplosionUtils.md) | class | Static explosion execution utility. |
