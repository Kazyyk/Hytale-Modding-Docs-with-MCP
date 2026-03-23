# PlaceBlockEvent

Type: class | Package: com.hypixel.hytale.server.core.event.events.ecs | Extends: CancellableEcsEvent

public class PlaceBlockEvent extends CancellableEcsEvent

A cancellable ECS event fired when the corresponding PlaceBlock action occurs.

## Fields

- @Nullable private final ItemStack itemInHand
- @Nonnull private Vector3i targetBlock
- @Nonnull private RotationTuple rotation

## Methods

- public PlaceBlockEvent(@Nullable ItemStack itemInHand, @Nonnull Vector3i targetBlock, @Nonnull RotationTuple rotation)
- @Nullable public ItemStack getItemInHand()
- @Nonnull public Vector3i getTargetBlock()
- public void setTargetBlock(@Nonnull Vector3i targetBlock)
- @Nonnull public RotationTuple getRotation()
- public void setRotation(@Nonnull RotationTuple rotation)

Also in this package: BreakBlockEvent, ChangeGameModeEvent, CraftRecipeEvent, DamageBlockEvent, DiscoverZoneEvent, Display, Drop, DropItemEvent, InteractivelyPickupItemEvent, PlayerRequest, Post, Post, Pre, Pre, SwitchActiveSlotEvent, UseBlockEvent

Complete API:
  public ItemStack getItemInHand()
  public Vector3i getTargetBlock()
  public void setTargetBlock(Vector3i targetBlock)
  public RotationTuple getRotation()
  public void setRotation(RotationTuple rotation)

Fields:
private final ItemStack itemInHand
private Vector3i targetBlock
private RotationTuple rotation
