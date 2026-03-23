---
title: "com.hypixel.hytale.server.npc.corecomponents.entity.filters"
kind: "package"
package: "com.hypixel.hytale.server.npc.corecomponents.entity.filters"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.filters"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "filter"
  - "entity"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.entity.filters`

NPC entity filter implementations for behavior tree conditions. Each filter evaluates a target entity against specific criteria -- altitude, attitude, combat state, height difference, block context, inventory, line of sight, movement state, NPC group, stat values, and view sector -- supporting boolean composition via AND, OR, NOT, and many-of operators.

## Types

| Type | Kind | Description |
|---|---|---|
| [EntityFilterAltitude](EntityFilterAltitude.md) | class | Filters entities by their height above ground, checking against a configured altitude range. |
| [EntityFilterEntityEffect](EntityFilterEntityEffect.md) | class | Filters entities by whether they have a specific active entity effect. |
| [EntityFilterAnd](EntityFilterAnd.md) | class | Composite filter returning true only when all child filters match (logical AND). |
| [EntityFilterAttitude](EntityFilterAttitude.md) | class | Filters entities by their attitude (friendly, neutral, hostile) relative to the evaluating NPC. |
| [EntityFilterCombat](EntityFilterCombat.md) | class | Filters entities based on their current combat state, checking whether they are in combat. |
| [EntityFilterHeightDifference](EntityFilterHeightDifference.md) | class | Filters entities by the vertical distance between the NPC and the target, checking against a configured range. |
| [EntityFilterInsideBlock](EntityFilterInsideBlock.md) | class | Filters entities based on whether they are standing inside a block of a specific type or tag. |
| [EntityFilterInventory](EntityFilterInventory.md) | class | Filters entities based on their inventory contents, checking for specific item types or quantities. |
| [EntityFilterItemInHand](EntityFilterItemInHand.md) | class | Filters entities based on the item currently held in their hand. |
| [EntityFilterLineOfSight](EntityFilterLineOfSight.md) | class | Filters entities by line-of-sight visibility from the evaluating NPC, performing raycasting. |
| [EntityFilterMany](EntityFilterMany.md) | class | Composite filter that evaluates multiple child filters and returns true based on a configurable threshold (e. |
| [EntityFilterMovementState](EntityFilterMovementState.md) | class | Filters entities based on their current movement state (walking, sprinting, crouching, swimming, etc. |
| [EntityFilterNot](EntityFilterNot.md) | class | Composite filter that inverts the result of a single child filter (logical NOT). |
| [EntityFilterNPCGroup](EntityFilterNPCGroup.md) | class | Filters entities by NPC group membership, checking if the target belongs to a specified group. |
| [EntityFilterOr](EntityFilterOr.md) | class | Composite filter returning true when at least one child filter matches (logical OR). |
| [EntityFilterSpotsMe](EntityFilterSpotsMe.md) | class | Filters entities based on whether the target entity has spotted (detected) the evaluating NPC. |
| [EntityFilterStandingOnBlock](EntityFilterStandingOnBlock.md) | class | Filters entities based on the block type they are currently standing on. |
| [EntityFilterStat](EntityFilterStat.md) | class | Filters entities based on a stat value, comparing it against a configured threshold using a comparison operator. |
| [EntityFilterViewSector](EntityFilterViewSector.md) | class | Filters entities based on whether the target is within the evaluating NPC's view sector (angle and distance). |
