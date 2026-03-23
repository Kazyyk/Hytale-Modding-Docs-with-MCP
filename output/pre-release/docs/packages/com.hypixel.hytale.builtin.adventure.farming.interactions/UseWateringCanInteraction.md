---
title: "UseWateringCanInteraction"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming.interactions"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.interactions.UseWateringCanInteraction"
api_surface: false
extends: "SimpleBlockInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "farming"
  - "interaction"
---

**Package:** `com.hypixel.hytale.builtin.adventure.farming.interactions`

```java
public class UseWateringCanInteraction extends SimpleBlockInteraction
```

Block interaction for using a watering can on farmland. Waters the target `TilledSoilBlock` and applies an area-of-effect based on the player's facing direction. The watered area extends forward from the target block (controlled by `RadiusZ`) and laterally (controlled by `RadiusX`), using the player's horizontal head rotation to determine direction.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public static final` | `BuilderCodec<UseWateringCanInteraction>` | `CODEC` |
| `protected` | `long` | `duration` |
| `protected` | `String[]` | `refreshModifiers` |
| `protected` | `int` | `radiusX` |
| `protected` | `int` | `radiusZ` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `interactWithBlock(@Nonnull World world, @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull Vector3i targetBlock, @Nonnull CooldownHandler cooldownHandler)` |
| `private` | `boolean` | `waterBlockAt(@Nonnull World world, int x, int y, int z, @Nonnull Instant wateredUntil)` |
| `@Override protected` | `void` | `simulateInteractWithBlock(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull World world, @Nonnull Vector3i targetBlock)` |

## Codec Fields

| Key | Type | Description |
|---|---|---|
| `Duration` | `long` | How long, in seconds, the soil remains watered. |
| `RefreshModifiers` | `String[]` | Modifier identifiers to refresh on watering. |
| `RadiusX` | `int` | Lateral extent (width) of the watering area. |
| `RadiusZ` | `int` | Forward extent (depth) of the watering area. |

## Behavior

- Determines the player's facing direction from `HeadRotation.getHorizontalAxisDirection()`. If both X and Z components are non-zero (diagonal), snaps to the Z axis.
- Iterates a rectangular area: `depth` blocks forward and `width` blocks across (centered laterally).
- For each position, calls `waterBlockAt` which locates the `TilledSoilBlock` component (checking the targeted Y and Y-1 for soil below crops), sets `wateredUntil`, enables ticking, and schedules a section tick.
- If no blocks are successfully watered, the interaction state is set to `Failed`.
- The `simulateInteractWithBlock` override is a no-op.
