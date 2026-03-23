---
title: "DestroyTreasureConditionInteraction"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.interactions"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.interactions.DestroyTreasureConditionInteraction"
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
public class DestroyTreasureConditionInteraction extends SimpleBlockInteraction
```

Server-authoritative block interaction that checks whether a treasure chest block is eligible for destruction. Registered as the `"DestroyTreasureCondition"` interaction type. The interaction succeeds (state `Finished`) only if the targeted block has a `TreasureChestBlock` component and `canDestroy` returns `true` for the interacting player; otherwise the state is set to `Failed`.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<DestroyTreasureConditionInteraction>` | `CODEC` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `WaitForDataFrom` | `getWaitForDataFrom()` |
| `@Override protected` | `void` | `interactWithBlock(@Nonnull World world, @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull Vector3i pos, @Nonnull CooldownHandler cooldownHandler)` |
| `@Override protected` | `void` | `simulateInteractWithBlock(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull World world, @Nonnull Vector3i targetBlock)` |

## Behavior

- Returns `WaitForDataFrom.Server`, meaning the client waits for the server to determine the interaction result.
- Looks up the `TreasureChestBlock` component on the block entity at the targeted position via chunk store.
- Delegates the destroy-eligibility check to `TreasureChestBlock.canDestroy`.

## Related Types

- [OpenTreasureContainerInteraction](OpenTreasureContainerInteraction.md) -- companion interaction for opening treasure containers
- [TreasureChestBlock](../com.hypixel.hytale.builtin.adventure.objectives.blockstates/TreasureChestBlock.md) -- the component this interaction queries
