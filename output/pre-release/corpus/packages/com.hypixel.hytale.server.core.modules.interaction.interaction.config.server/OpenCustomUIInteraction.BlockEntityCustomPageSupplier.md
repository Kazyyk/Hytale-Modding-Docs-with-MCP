# OpenCustomUIInteraction.BlockEntityCustomPageSupplier

Type: interface | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server

@FunctionalInterface
public interface OpenCustomUIInteraction.BlockEntityCustomPageSupplier

Functional interface for creating a `CustomUIPage` from a `PlayerRef` and a block entity reference. Used with `OpenCustomUIInteraction.registerBlockEntityCustomPage`.

## Methods


CustomUIPage tryCreate(@Nonnull PlayerRef var1, @Nonnull Ref<ChunkStore> var2)

Creates a custom UI page for the given player and block entity reference, or returns `null` if the page cannot be created.

## See Also

- OpenCustomUIInteraction

Also in this package: AngledDamage, BlockSearchConsumer, ChangeStatBaseInteraction, ChangeStatInteraction, ChangeStatWithModifierInteraction, CheckUniqueItemUsageInteraction, ClearEntityEffectInteraction, CustomPageSupplier, DamageEntityInteraction, DoorInfo, DoorInteraction, DoorState, EntityStatOnHit, EquipItemInteraction, IncreaseBackpackCapacityInteraction, InterruptInteraction, LaunchPadInteraction, LaunchProjectileInteraction, ModifyInventoryInteraction, OpenContainerInteraction (and 11 more)

Complete API:
  CustomUIPage tryCreate(PlayerRef var1, Ref<ChunkStore> var2)
