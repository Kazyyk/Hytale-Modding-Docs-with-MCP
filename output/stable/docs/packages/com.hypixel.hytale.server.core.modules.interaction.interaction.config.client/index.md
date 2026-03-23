---
title: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.client"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "interaction"
  - "config"
  - "client"
  - "package-index"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.client`

Client-side interaction configuration types. These classes define the server-side behavior for interactions that are primarily driven by client input (clicks, holds, charges). Each type has a `CODEC` for JSON deserialization and implements `tick0()` (server) and `simulateTick0()` (client prediction) methods. Most extend `SimpleInteraction`, `SimpleBlockInteraction`, or `SimpleInstantInteraction`.

## Block Interactions

| Type | Kind | Description |
|---|---|---|
| [SimpleBlockInteraction](SimpleBlockInteraction.md) | class | Abstract base for block-targeted interactions. |
| [AddItemInteraction](AddItemInteraction.md) | class | Adds items to the entity's inventory on block interaction. |
| [BlockConditionInteraction](BlockConditionInteraction.md) | class | Tests target block against matcher conditions. |
| [BreakBlockInteraction](BreakBlockInteraction.md) | class | Breaks or harvests the target block. |
| [ChangeBlockInteraction](ChangeBlockInteraction.md) | class | Replaces target block based on a change map. |
| [ChangeStateInteraction](ChangeStateInteraction.md) | class | Changes block state based on a state map. |
| [CycleBlockGroupInteraction](CycleBlockGroupInteraction.md) | class | Cycles block through its block group. |
| [DestroyBlockInteraction](DestroyBlockInteraction.md) | class | Destroys the target block. |
| [PickBlockInteraction](PickBlockInteraction.md) | class | Picks target block to hand (client-driven). |
| [PlaceBlockInteraction](PlaceBlockInteraction.md) | class | Places a block at target position. |
| [PlaceFluidInteraction](PlaceFluidInteraction.md) | class | Places fluid at target position. |
| [UseBlockInteraction](UseBlockInteraction.md) | class | Executes block-configured interactions. |

## Entity Interactions

| Type | Kind | Description |
|---|---|---|
| [UseEntityInteraction](UseEntityInteraction.md) | class | Executes entity-configured interactions. |

## Force and Movement

| Type | Kind | Description |
|---|---|---|
| [ApplyForceInteraction](ApplyForceInteraction.md) | class | Applies forces to entity with ground/collision branching. |
| [MovementConditionInteraction](MovementConditionInteraction.md) | class | Branches by movement direction. |
| [ToggleGliderInteraction](ToggleGliderInteraction.md) | class | Toggles glider movement. |

## Chaining and Charging

| Type | Kind | Description |
|---|---|---|
| [ChainingInteraction](ChainingInteraction.md) | class | Runs chained interactions based on repeat count. |
| [ChargingInteraction](ChargingInteraction.md) | class | Hold-and-release with duration-based branching. |
| [WieldingInteraction](WieldingInteraction.md) | class | Combat charging with stat modifiers and damage. |
| [FirstClickInteraction](FirstClickInteraction.md) | class | Branches on click vs held input. |

## Cooldown Management

| Type | Kind | Description |
|---|---|---|
| [CooldownConditionInteraction](CooldownConditionInteraction.md) | class | Checks if a cooldown is active. |
| [IncrementCooldownInteraction](IncrementCooldownInteraction.md) | class | Increments cooldown time or charges. |
| [ResetCooldownInteraction](ResetCooldownInteraction.md) | class | Resets a cooldown to maximum. |
| [TriggerCooldownInteraction](TriggerCooldownInteraction.md) | class | Triggers a cooldown (deducts charge). |

## Explosion

| Type | Kind | Description |
|---|---|---|
| [ExplodeInteraction](ExplodeInteraction.md) | class | Performs explosion with configurable damage/radius. |

## Inner Types

| Type | Kind | Description |
|---|---|---|
| [ChainingInteraction.Data](ChainingInteraction.Data.md) | class | Per-entity component tracking chain state. |
| [ChainingInteraction.ChainingTag](ChainingInteraction.ChainingTag.md) | class | Collector tag for chain index. |
| [ChargingInteraction.ChargingTag](ChargingInteraction.ChargingTag.md) | class | Collector tag for charge duration. |
| [BlockConditionInteraction.BlockMatcher](BlockConditionInteraction.BlockMatcher.md) | class | Block matching criteria. |
| [BlockConditionInteraction.BlockIdMatcher](BlockConditionInteraction.BlockIdMatcher.md) | class | Block ID/state/tag matching. |
| [ApplyForceInteraction.Force](ApplyForceInteraction.Force.md) | class | Single force configuration. |
