---
title: "PlayerCraftEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.player"
fqcn: "com.hypixel.hytale.server.core.event.events.player.PlayerCraftEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-09T23:10:00Z"
tags:
  - player
  - crafting
  - deprecated
---

> **DEPRECATED (forRemoval=true)** -- This event is deprecated and scheduled for removal. Use `CraftRecipeEvent` (ECS event) instead.

> Package: `com.hypixel.hytale.server.core.event.events.player`
> Extends: `PlayerEvent<String>`
> Implements: `IEvent<String>`
> Cancellable: No
> Key type: `String`

Dispatched after a player crafts an item using a crafting recipe. This event is deprecated with `forRemoval=true`, meaning it will be removed in a future version. The ECS-based `CraftRecipeEvent` is the intended replacement.

This event cannot be cancelled -- it fires after the crafting operation has completed.

Because the key type is `String`, this event is dispatched with a keyed dispatch.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Notes |
|-------|------|----------|---------|-------|
| `playerRef` | `Ref<EntityStore>` | `getPlayerRef()` | No | ECS reference to the player entity. Inherited from `PlayerEvent`. |
| `player` | `Player` | `getPlayer()` | No | The player who crafted the item. Inherited from `PlayerEvent`. |
| `craftedRecipe` | `CraftingRecipe` | `getCraftedRecipe()` | No | The recipe that was crafted. |
| `quantity` | `int` | `getQuantity()` | No | The number of items produced by the crafting operation. |

## Fired By

- `CraftingManager.craft()` (line 194) via `eventBus.dispatchFor()` -- dispatched after a crafting operation completes successfully. This is a post-craft notification.

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

Replace usage of `PlayerCraftEvent` with the ECS-based `CraftRecipeEvent`:

```java
// Old (deprecated, will be removed):
getEventRegistry().register(PlayerCraftEvent.class, event -> { ... });

// New (preferred):
// Register an EntityEventSystem<EntityStore, CraftRecipeEvent> instead.
// See CraftRecipeEvent documentation for the ECS event handler pattern.
```

## Related Events

- `CraftRecipeEvent` -- the ECS-based replacement for this event. Provides richer context and integrates with the ECS event system.
- [`LivingEntityInventoryChangeEvent`](./LivingEntityInventoryChangeEvent.md) -- fires alongside this event when crafting modifies the player's inventory.
