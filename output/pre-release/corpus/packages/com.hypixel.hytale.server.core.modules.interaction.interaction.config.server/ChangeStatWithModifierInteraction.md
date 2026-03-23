# ChangeStatWithModifierInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.ChangeStatBaseInteraction

public class ChangeStatWithModifierInteraction extends ChangeStatBaseInteraction

Changes entity stats with adjustments based on equipped armor modifiers. On first run, iterates the target entity's armor container and collects flat (additive) and multiplier modifiers for the configured `InteractionModifierId`. The base stat values are adjusted by adding the flat modifier and then multiplying by `max(0, 1 - multiplierModifier)`. Uses `EntityStatMap.Predictable.NONE` for prediction.

## Codec Properties

Inherits all codec properties from ChangeStatBaseInteraction, plus:

- InteractionModifierId | ItemArmor.InteractionModifierId` enum | Yes | -- | Identifies which armor interaction modifier to apply.

## Fields

- ItemArmor.InteractionModifierId interactionModifierId

## Methods


@Override
protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)

Retrieves the `EntityStatMap`, clones the base stats, iterates equipped armor pieces to accumulate flat and multiplier modifiers per stat index, adjusts values, and calls `processStatChanges`.


@Nonnull
@Override
public String toString()

## See Also

- ChangeStatBaseInteraction -- parent class
- ChangeStatInteraction -- simpler variant without armor modifiers

Also in this package: AngledDamage, BlockEntityCustomPageSupplier, BlockSearchConsumer, ChangeStatBaseInteraction, ChangeStatInteraction, CheckUniqueItemUsageInteraction, ClearEntityEffectInteraction, CustomPageSupplier, DamageEntityInteraction, DoorInfo, DoorInteraction, DoorState, EntityStatOnHit, EquipItemInteraction, IncreaseBackpackCapacityInteraction, InterruptInteraction, LaunchPadInteraction, LaunchProjectileInteraction, ModifyInventoryInteraction, OpenContainerInteraction (and 11 more)

Complete API:
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  public String toString()

Fields:
public static final BuilderCodec<ChangeStatWithModifierInteraction> CODEC
protected ItemArmor.InteractionModifierId interactionModifierId
