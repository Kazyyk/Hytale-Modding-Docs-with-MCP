---
title: "OpenTreasureContainerInteraction"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.interactions"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.interactions.OpenTreasureContainerInteraction"
api_surface: false
extends: "SimpleBlockInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "objectives"
  - "interaction"
  - "treasure"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives.interactions`

```java
public class OpenTreasureContainerInteraction extends SimpleBlockInteraction
```

Block interaction that opens a treasure chest container for the interacting player. Registered as the `"OpenTreasureContainer"` interaction type. Requires both an `ItemContainerBlock` and a `TreasureChestBlock` component on the targeted block. If `TreasureChestBlock.canOpen` returns `true`, creates a `ContainerBlockWindow` and sets the player's page to `Page.Bench`. Also plays open/close sound events based on the block type's interaction state, and dispatches `TreasureChestBlock.onOpen` to fire the `TreasureChestOpeningEvent`.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<OpenTreasureContainerInteraction>` | `CODEC` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `interactWithBlock(@Nonnull World world, @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull Vector3i pos, @Nonnull CooldownHandler cooldownHandler)` |
| `@Override protected` | `void` | `simulateInteractWithBlock(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull World world, @Nonnull Vector3i targetBlock)` |

## Behavior

- Resolves the `ItemContainerBlock` and `TreasureChestBlock` components from the chunk store for the target block position.
- Creates a `ContainerBlockWindow` tracked per-player via the `ItemContainerBlock.getWindows()` map, keyed by the player's UUID.
- Handles block interaction state transitions (`"OpenWindow"` / `"CloseWindow"`) including playing the associated sound events via `SoundUtil.playSoundEvent3d`.
- If the required components are missing, sends a `server.interactions.invalidBlockState` error message to the player.
- The `simulateInteractWithBlock` override is a no-op.

## Related Types

- [DestroyTreasureConditionInteraction](DestroyTreasureConditionInteraction.md) -- companion interaction for destroy-eligibility checks
- [TreasureChestBlock](../com.hypixel.hytale.builtin.adventure.objectives.blockstates/TreasureChestBlock.md) -- the component this interaction reads
