---
title: "CraftRecipeEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.ecs"
fqcn: "com.hypixel.hytale.server.core.event.events.ecs.CraftRecipeEvent"
api_surface: "public"
cancellable: true
generator_version: "1.0.0"
generated_at: "2026-02-09T23:10:00Z"
tags:
  - ecs
  - crafting
  - cancellable
---

> Package: `com.hypixel.hytale.server.core.event.events.ecs`
> Extends: `CancellableEcsEvent`
> Implements: `ICancellableEcsEvent`
> Cancellable: Yes

ECS event superclass for crafting operations. Uses a Pre/Post pattern:

- **`CraftRecipeEvent.Pre`** -- Fired before crafting occurs. Can be cancelled to prevent the craft.
- **`CraftRecipeEvent.Post`** -- Fired after crafting succeeds. Informational -- while technically cancellable (inherited from `CancellableEcsEvent`), the craft has already completed.

## Fields / Accessors (Base Class)

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `craftedRecipe` | `CraftingRecipe` | `getCraftedRecipe()` | No | No |
| `quantity` | `int` | `getQuantity()` | No | No |

- **craftedRecipe** -- The recipe being crafted.
- **quantity** -- The number of times the recipe is being crafted in this operation.

---

## CraftRecipeEvent.Pre

> Extends: `CraftRecipeEvent`
> Cancellable: Yes (inherited)

Fired **before** the crafting operation takes effect. Cancelling this event prevents the craft from occurring -- ingredients are not consumed and no output is produced.

### Fired By

- `CraftingManager` (line 155) via `componentAccessor.invoke(ref, event)` -- ECS dispatch before a crafting operation executes.

### Listening

```java
public class MyCraftPreHandler extends EntityEventSystem<EntityStore, CraftRecipeEvent.Pre> {
    @Override
    public Query<EntityStore> getQuery() {
        return MY_COMPONENT_TYPE;
    }

    @Override
    public void handle(int index, ArchetypeChunk<EntityStore> chunk,
                       Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer,
                       CraftRecipeEvent.Pre event) {
        CraftingRecipe recipe = event.getCraftedRecipe();
        int quantity = event.getQuantity();

        // Example: prevent crafting of restricted recipes
        if (isRestrictedRecipe(recipe)) {
            event.setCancelled(true);
        }
    }
}

// Register in plugin setup():
getEntityStoreRegistry().registerSystem(new MyCraftPreHandler());
```

---

## CraftRecipeEvent.Post

> Extends: `CraftRecipeEvent`
> Cancellable: Yes (inherited, but craft has already completed)

Fired **after** the crafting operation has completed successfully. The ingredients have already been consumed and the output produced. While this event inherits cancellability from `CancellableEcsEvent`, cancelling it at this stage does not undo the craft. This event is primarily useful for logging, analytics, or triggering side effects.

### Fired By

- `CraftingManager` (line 184) via `componentAccessor.invoke(ref, event)` -- ECS dispatch after a crafting operation completes.

### Listening

```java
public class MyCraftPostHandler extends EntityEventSystem<EntityStore, CraftRecipeEvent.Post> {
    @Override
    public Query<EntityStore> getQuery() {
        return MY_COMPONENT_TYPE;
    }

    @Override
    public void handle(int index, ArchetypeChunk<EntityStore> chunk,
                       Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer,
                       CraftRecipeEvent.Post event) {
        CraftingRecipe recipe = event.getCraftedRecipe();
        int quantity = event.getQuantity();

        // Example: track crafting statistics
        craftingStats.recordCraft(recipe, quantity);
    }
}

// Register in plugin setup():
getEntityStoreRegistry().registerSystem(new MyCraftPostHandler());
```

## Related Events

- [`PlayerCraftEvent`](./PlayerCraftEvent.md) -- Deprecated standard-event predecessor. Use `CraftRecipeEvent` instead.
