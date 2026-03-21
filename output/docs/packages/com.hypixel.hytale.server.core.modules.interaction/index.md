---
title: "com.hypixel.hytale.server.core.modules.interaction"
kind: "package"
package: "com.hypixel.hytale.server.core.modules.interaction"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "interaction"
  - "module"
  - "combat"
  - "block"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction`

Item interaction system for the server. Provides the plugin module that registers all interaction types, the ECS component for binding interactions to entities, simulation handlers for server-side interaction execution, and utility classes for block harvesting, breaking, and placement.

## Types

| Type | Kind | Description |
|---|---|---|
| [InteractionModule](InteractionModule.md) | class | Server plugin registering all interaction types, selectors, knockback types, and ECS systems. |
| [Interactions](Interactions.md) | class | ECS component binding `InteractionType` slots to root interaction IDs on an entity. |
| [InteractionSimulationHandler](InteractionSimulationHandler.md) | class | Default simulation handler tracking button pressed state for NPC interactions. |
| [IInteractionSimulationHandler](IInteractionSimulationHandler.md) | interface | Interface for controlling interaction simulation (charging, cancellation, charge values). |
| [BlockHarvestUtils](BlockHarvestUtils.md) | class | Block harvesting, breaking, damage, and drop logic. |
| [BlockPlaceUtils](BlockPlaceUtils.md) | class | Block placement logic with event dispatching and validation. |
| [BlockInteractionUtils](BlockInteractionUtils.md) | class | Utility for determining natural vs. creative block actions. |
