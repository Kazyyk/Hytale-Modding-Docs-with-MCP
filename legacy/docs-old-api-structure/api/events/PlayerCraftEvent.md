---
title: "PlayerCraftEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.player"
fqcn: "com.hypixel.hytale.server.core.event.events.player.PlayerCraftEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - player
  - crafting
  - deprecated
---

> **DEPRECATED (forRemoval=true)** -- This event is deprecated and scheduled for removal. Use [`CraftRecipeEvent`](./CraftRecipeEvent.md) (ECS event) instead.

> Package: `com.hypixel.hytale.server.core.event.events.player`
> Extends: `PlayerEvent<String>`
> Implements: `IEvent<String>`
> Cancellable: No

Standard event dispatched after a player crafts an item. This event fires after the crafting operation has completed and cannot be cancelled. It has been replaced by the ECS-based `CraftRecipeEvent` which provides pre/post hooks and cancellation support.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `playerRef` | `Ref<EntityStore>` | `getPlayerRef()` | No | No |
| `player` | `Player` | `getPlayer()` | No | No |
| `craftedRecipe` | `CraftingRecipe` | `getCraftedRecipe()` | No | No |
| `quantity` | `int` | `getQuantity()` | No | No |

- **playerRef** -- ECS reference to the player entity. Inherited from `PlayerEvent`.
- **player** -- The player who crafted the item. Inherited from `PlayerEvent`.
- **craftedRecipe** -- The recipe that was crafted.
- **quantity** -- The number of items produced by the crafting operation.

## Fired By

- `CraftingManager.craft()` (line 194) via `eventBus dispatchFor` -- EventBus dispatch after crafting (deprecated, replaced by CraftRecipeEvent).

## Listening

```java
// DEPRECATED -- use CraftRecipeEvent (ECS event) for new code
getEventRegistry().register(PlayerCraftEvent.class, event -> {
    Player player = event.getPlayer();
    CraftingRecipe recipe = event.getCraftedRecipe();
    int quantity = event.getQuantity();

    // Example: log crafting activity
    logCraft(player, recipe, quantity);
});
```

## Migration

Replace usage with the ECS-based `CraftRecipeEvent`:

```java
// Old (deprecated, will be removed):
getEventRegistry().register(PlayerCraftEvent.class, event -> { ... });

// New (preferred):
// Register an EntityEventSystem<EntityStore, CraftRecipeEvent.Pre> instead.
// See CraftRecipeEvent documentation for the ECS event handler pattern.
```

## Related Events

- [`CraftRecipeEvent`](./CraftRecipeEvent.md) -- The ECS-based replacement. Provides Pre/Post hooks and cancellation support.
- [`LivingEntityInventoryChangeEvent`](./LivingEntityInventoryChangeEvent.md) -- Fires alongside this event when crafting modifies the player's inventory.
