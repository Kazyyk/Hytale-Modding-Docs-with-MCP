# OpenPageInteraction.PageUsageValidator

Type: interface | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server

@FunctionalInterface
public interface OpenPageInteraction.PageUsageValidator

Functional interface for validating whether a player can open a specific page. Registered per `Page` via `OpenPageInteraction.registerUsageValidator`.

## Methods


boolean canUse(Ref<EntityStore> var1, Player var2, InteractionContext var3, ComponentAccessor<EntityStore> var4)

Returns `true` if the player is allowed to open the page in the given context.

## See Also

- OpenPageInteraction

Also in this package: AngledDamage, BlockEntityCustomPageSupplier, BlockSearchConsumer, ChangeStatBaseInteraction, ChangeStatInteraction, ChangeStatWithModifierInteraction, CheckUniqueItemUsageInteraction, ClearEntityEffectInteraction, CustomPageSupplier, DamageEntityInteraction, DoorInfo, DoorInteraction, DoorState, EntityStatOnHit, EquipItemInteraction, IncreaseBackpackCapacityInteraction, InterruptInteraction, LaunchPadInteraction, LaunchProjectileInteraction, ModifyInventoryInteraction (and 11 more)

Complete API:
  boolean canUse(Ref<EntityStore> var1, Player var2, InteractionContext var3, ComponentAccessor<EntityStore> var4)
