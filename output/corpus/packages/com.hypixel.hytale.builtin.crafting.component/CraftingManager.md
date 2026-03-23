# CraftingManager

Type: class | Package: com.hypixel.hytale.builtin.crafting.component | Implements: Component<EntityStore>

public class CraftingManager implements Component<EntityStore>

An `EntityStore` ECS component that manages per-player crafting state. Handles crafting job queuing, timed crafting execution, bench tier upgrades, item input removal, output distribution, and nearby chest material lookups. Each player entity has one `CraftingManager` tracking their current bench position, block type, queued crafting jobs, and any active upgrade job.

## Component Type


@Nonnull
public static ComponentType<EntityStore, CraftingManager> getComponentType()

Delegates to `CraftingPlugin.get().getCraftingManagerComponentType()`.

## Bench Management

- hasBenchSet() | boolean | Whether a bench block type is currently set.
- setBench(int x, int y, int z, @Nonnull BlockType blockType) | void | Associates this manager with a bench at the given position. Validates bench type.
- clearBench(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor) | boolean | Cancels all crafting and clears the bench reference. Returns whether jobs were cancelled.

## Crafting

- craftItem(...) | boolean | Immediately crafts an item, removing inputs and giving outputs. Fires `CraftRecipeEvent` and `PlayerCraftEvent`.
- queueCraft(...) | boolean | Queues a timed crafting job. Applies bench tier speed reduction.
- tick(@Nonnull Ref<EntityStore>, ..., float dt) | void | Advances crafting/upgrade job timers each tick. Completes jobs and distributes outputs.
- cancelAllCrafting(...) | boolean | Drains all queued jobs and refunds the current job's removed items.

## Bench Tier Upgrades

- startTierUpgrade(...) | boolean | Begins a bench tier upgrade if requirements are met. Cancels active crafting.

## Static Utilities

- getOutputItemStacks(@Nonnull CraftingRecipe recipe, int quantity) | Returns output `ItemStack` list for a recipe at the given quantity.
- getInputMaterials(@Nonnull CraftingRecipe recipe, int quantity) | Returns the list of `MaterialQuantity` inputs scaled by quantity.
- matches(@Nonnull MaterialQuantity, @Nonnull ItemStack) | Checks if an item stack satisfies a material requirement (by item ID or resource type).
- generateInventoryHints(...) | Produces a `JsonArray` of slot indices matching recipe inputs.
- matchesAnyRecipe(...) | Checks if an item stack matches any recipe at a given input slot index.
- feedExtraResourcesSection(@Nonnull BenchState, @Nonnull MaterialExtraResourcesSection) | Scans nearby chests for crafting/upgrade materials and populates the extra resources section.

## Inner Types

- CraftingManager.CraftingJob -- tracks a queued crafting operation
- CraftingManager.BenchUpgradingJob -- tracks a bench tier upgrade
- CraftingManager.ChestLookupResult -- result of nearby chest spatial query
- CraftingManager.InputRemovalType -- enum controlling input removal strategy

## Related Types

- `CraftingPlugin` -- registers this component type
- `CraftingRecipe` -- recipe asset driving crafting operations
- `BenchState` -- block state for crafting benches
