# InteractivelyPickupItemEvent

Type: class | Package: com.hypixel.hytale.server.core.event.events.ecs | Extends: CancellableEcsEvent

public class InteractivelyPickupItemEvent extends CancellableEcsEvent

A cancellable ECS event fired when the corresponding InteractivelyPickupItem action occurs.

## Fields

- @Nonnull private ItemStack itemStack

## Methods

- public InteractivelyPickupItemEvent(@Nonnull ItemStack itemStack)
- @Nonnull public ItemStack getItemStack()
- public void setItemStack(@Nonnull ItemStack itemStack)

Also in this package: BreakBlockEvent, ChangeGameModeEvent, CraftRecipeEvent, DamageBlockEvent, DiscoverZoneEvent, Display, Drop, DropItemEvent, PlaceBlockEvent, PlayerRequest, Post, Post, Pre, Pre, SwitchActiveSlotEvent, UseBlockEvent

Complete API:
  public ItemStack getItemStack()
  public void setItemStack(ItemStack itemStack)

Fields:
private ItemStack itemStack
