# DoorInteraction.DoorInfo

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server

public static class DoorInteraction.DoorInfo

Data class that holds information about a door block at a specific world position. Used internally by DoorInteraction for double-door detection and state management.

## Fields

- BlockType blockType
- int filler
- Vector3i blockPosition
- DoorInteraction.DoorState doorState

## Constructor


public DoorInfo(BlockType blockType, int filler, Vector3i blockPosition, DoorInteraction.DoorState doorState)

## Methods


public BlockType getBlockType()


public Vector3i getBlockPosition()


public DoorInteraction.DoorState getDoorState()

## See Also

- DoorInteraction -- uses this class for double-door logic
- DoorInteraction.DoorState

Also in this package: AngledDamage, BlockEntityCustomPageSupplier, BlockSearchConsumer, ChangeStatBaseInteraction, ChangeStatInteraction, ChangeStatWithModifierInteraction, CheckUniqueItemUsageInteraction, ClearEntityEffectInteraction, CustomPageSupplier, DamageEntityInteraction, DoorInteraction, DoorState, EntityStatOnHit, EquipItemInteraction, IncreaseBackpackCapacityInteraction, InterruptInteraction, LaunchPadInteraction, LaunchProjectileInteraction, ModifyInventoryInteraction, OpenContainerInteraction (and 11 more)

Complete API:
  public BlockType getBlockType()
  public Vector3i getBlockPosition()
  public DoorInteraction.DoorState getDoorState()

Fields:
private final BlockType blockType
private final int filler
private final Vector3i blockPosition
private final DoorInteraction.DoorState doorState
