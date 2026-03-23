# CraftRecipeEvent

Type: class | Package: com.hypixel.hytale.server.core.event.events.ecs | Extends: CancellableEcsEvent

public abstract class CraftRecipeEvent extends CancellableEcsEvent

Abstract base class extending `CancellableEcsEvent` that provides shared logic for CraftRecipeEvent subclasses.

## Fields

- @Nonnull private final CraftingRecipe craftedRecipe
- private final int quantity

## Methods

- public CraftRecipeEvent(@Nonnull CraftingRecipe craftedRecipe, int quantity)
- @Nonnull public CraftingRecipe getCraftedRecipe()
- public int getQuantity()

Known subclasses: Post, Pre

Also in this package: BreakBlockEvent, ChangeGameModeEvent, DamageBlockEvent, DiscoverZoneEvent, Display, Drop, DropItemEvent, InteractivelyPickupItemEvent, PlaceBlockEvent, PlayerRequest, Post, Post, Pre, Pre, SwitchActiveSlotEvent, UseBlockEvent

Complete API:
  public CraftingRecipe getCraftedRecipe()
  public int getQuantity()

Fields:
private final CraftingRecipe craftedRecipe
private final int quantity
