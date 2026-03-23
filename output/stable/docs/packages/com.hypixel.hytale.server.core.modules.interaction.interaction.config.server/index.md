---
title: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server"
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server`

Server-side interaction configurations. These classes define data-driven interactions executed on the server, including combat damage, inventory manipulation, block interactions (doors, containers, launch pads), entity stat changes, projectile launching, UI page opening, and prefab spawning. All interactions are configured via the codec system and inherit from the interaction framework's base classes.

## Interaction Classes

| Type | Description |
|---|---|
| [ChangeStatBaseInteraction](ChangeStatBaseInteraction.md) | Abstract base for entity stat modification interactions. |
| [ChangeStatInteraction](ChangeStatInteraction.md) | Changes entity stats directly. |
| [ChangeStatWithModifierInteraction](ChangeStatWithModifierInteraction.md) | Changes entity stats with armor-based modifiers. |
| [CheckUniqueItemUsageInteraction](CheckUniqueItemUsageInteraction.md) | Checks and records unique item usage per player. |
| [ClearEntityEffectInteraction](ClearEntityEffectInteraction.md) | Removes a specified entity effect from a target. |
| [DamageEntityInteraction](DamageEntityInteraction.md) | Primary combat interaction: damages target entity with full combat pipeline. |
| [DestroyConditionInteraction](DestroyConditionInteraction.md) | Checks if a block is destroyable (deprecated). |
| [DoorInteraction](DoorInteraction.md) | Opens/closes doors with double-door and collision support. |
| [EquipItemInteraction](EquipItemInteraction.md) | Equips the held item into the appropriate armor slot. |
| [IncreaseBackpackCapacityInteraction](IncreaseBackpackCapacityInteraction.md) | Increases player backpack capacity. |
| [InterruptInteraction](InterruptInteraction.md) | Cancels active interaction chains on a target entity. |
| [LaunchPadInteraction](LaunchPadInteraction.md) | Applies launch pad velocity to entities. |
| [LaunchProjectileInteraction](LaunchProjectileInteraction.md) | Launches a projectile (deprecated). |
| [ModifyInventoryInteraction](ModifyInventoryInteraction.md) | Modifies inventory items with durability, quantity, and transformation support. |
| [OpenContainerInteraction](OpenContainerInteraction.md) | Opens a block container's item interface. |
| [OpenCustomUIInteraction](OpenCustomUIInteraction.md) | Opens a registered custom UI page. |
| [OpenItemStackContainerInteraction](OpenItemStackContainerInteraction.md) | Opens a container embedded in a held item. |
| [OpenPageInteraction](OpenPageInteraction.md) | Opens a predefined page. |
| [PlacementCountConditionInteraction](PlacementCountConditionInteraction.md) | Condition based on block placement count. |
| [RefillContainerInteraction](RefillContainerInteraction.md) | Refills a container item from world fluids. |
| [RunOnBlockTypesInteraction](RunOnBlockTypesInteraction.md) | Runs interactions on matching blocks in a radius. |
| [SpawnPrefabInteraction](SpawnPrefabInteraction.md) | Spawns a prefab at entity or block position. |

## Combat Types (combat subpackage)

| Type | Kind | API | Description |
|---|---|---|---|
| [DamageCalculator](DamageCalculator.md) | class | Yes | Computes damage values (absolute or DPS). |
| [DamageCalculator.Type](DamageCalculator.Type.md) | enum | Yes | `DPS` or `ABSOLUTE` damage scaling. |
| [DamageClass](DamageClass.md) | enum | Yes | `UNKNOWN`, `LIGHT`, `CHARGED`, `SIGNATURE`. |
| [DamageEffects](DamageEffects.md) | class | No | Visual, audio, and knockback effects for damage. |
| [Knockback](Knockback.md) | class | No | Abstract knockback force calculation. |
| [DirectionalKnockback](DirectionalKnockback.md) | class | No | Directional knockback with relative offsets. |
| [ForceKnockback](ForceKnockback.md) | class | No | Fixed-direction knockback. |
| [PointKnockback](PointKnockback.md) | class | No | Point-to-target knockback. |
| [TargetEntityEffect](TargetEntityEffect.md) | class | No | Entity effect applied to damage targets. |

## Inner Types

| Type | Parent | Description |
|---|---|---|
| [DamageEntityInteraction.AngledDamage](DamageEntityInteraction.AngledDamage.md) | DamageEntityInteraction | Angle-based damage override. |
| [DamageEntityInteraction.EntityStatOnHit](DamageEntityInteraction.EntityStatOnHit.md) | DamageEntityInteraction | Stat adjustment scaled by hit count. |
| [DamageEntityInteraction.TargetedDamage](DamageEntityInteraction.TargetedDamage.md) | DamageEntityInteraction | Named damage override. |
| [DoorInteraction.DoorInfo](DoorInteraction.DoorInfo.md) | DoorInteraction | Door block info data class. |
| [DoorInteraction.DoorState](DoorInteraction.DoorState.md) | DoorInteraction | Door open/closed state enum. |
| [OpenCustomUIInteraction.BlockCustomPageSupplier](OpenCustomUIInteraction.BlockCustomPageSupplier.md) | OpenCustomUIInteraction | Block-state page supplier (deprecated). |
| [OpenCustomUIInteraction.BlockEntityCustomPageSupplier](OpenCustomUIInteraction.BlockEntityCustomPageSupplier.md) | OpenCustomUIInteraction | Block-entity page supplier. |
| [OpenCustomUIInteraction.CustomPageSupplier](OpenCustomUIInteraction.CustomPageSupplier.md) | OpenCustomUIInteraction | General page supplier. |
| [OpenPageInteraction.PageUsageValidator](OpenPageInteraction.PageUsageValidator.md) | OpenPageInteraction | Page access validator. |
| [RefillContainerInteraction.RefillState](RefillContainerInteraction.RefillState.md) | RefillContainerInteraction | Refill state configuration. |
