# OpenCustomUIInteraction.BlockCustomPageSupplier

Type: interface | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server

@FunctionalInterface
public interface OpenCustomUIInteraction.BlockCustomPageSupplier<T extends BlockState>

**Deprecated (via registration method).** Functional interface for creating a `CustomUIPage` from a `PlayerRef` and a typed `BlockState`. Used with `OpenCustomUIInteraction.registerBlockCustomPage`.

## Methods


CustomUIPage tryCreate(@Nonnull PlayerRef var1, @Nonnull T var2)

Creates a custom UI page for the given player and block state, or returns `null` if the page cannot be created.

## See Also

- OpenCustomUIInteraction

Also in this package: AngledDamage, BlockEntityCustomPageSupplier, BlockSearchConsumer, ChangeStatBaseInteraction, ChangeStatInteraction, ChangeStatWithModifierInteraction, CheckUniqueItemUsageInteraction, ClearEntityEffectInteraction, CustomPageSupplier, DamageEntityInteraction, DestroyConditionInteraction, DoorInfo, DoorInteraction, DoorState, EntityStatOnHit, EquipItemInteraction, IncreaseBackpackCapacityInteraction, InterruptInteraction, LaunchPadInteraction, LaunchProjectileInteraction (and 13 more)

Complete API:
  CustomUIPage tryCreate(PlayerRef var1, T var2)
