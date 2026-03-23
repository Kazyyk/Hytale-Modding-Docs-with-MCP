# DamageEntityInteraction.TargetedDamage

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server

public static class DamageEntityInteraction.TargetedDamage

Represents a named damage override within a DamageEntityInteraction. When a hit detail matches the map key, this entry's damage calculator and effects replace the interaction's defaults.

## Codec Properties

- DamageCalculator | DamageCalculator | No (inherited) | -- | Override damage calculator for this target entry.
- TargetEntityEffects | Map<String, TargetEntityEffect> | No (inherited) | -- | Entity effects to apply to the target on hit.
- DamageEffects | DamageEffects | No (inherited) | -- | Override visual/audio effects for this target entry.
- Next | String` (interaction ref) | No (inherited) | null | Follow-up interaction to run on success for this target.

## Fields

- int index
- DamageCalculator damageCalculator
- Map<String, TargetEntityEffect> targetEntityEffects
- DamageEffects damageEffects
- String next

## Methods


@Nonnull
public com.hypixel.hytale.protocol.TargetedDamage toTargetedDamagePacket()

Converts to protocol packet form with index, damage effects, and next interaction reference.


@Nonnull
@Override
public String toString()

## Subclasses

- DamageEntityInteraction.AngledDamage -- adds angle-based matching

## See Also

- DamageEntityInteraction -- parent interaction
- TargetEntityEffect -- effect applied to target on hit

Known subclasses: AngledDamage

Also in this package: AngledDamage, BlockEntityCustomPageSupplier, BlockSearchConsumer, ChangeStatBaseInteraction, ChangeStatInteraction, ChangeStatWithModifierInteraction, CheckUniqueItemUsageInteraction, ClearEntityEffectInteraction, CustomPageSupplier, DamageEntityInteraction, DoorInfo, DoorInteraction, DoorState, EntityStatOnHit, EquipItemInteraction, IncreaseBackpackCapacityInteraction, InterruptInteraction, LaunchPadInteraction, LaunchProjectileInteraction, ModifyInventoryInteraction (and 11 more)

Complete API:
  public com.hypixel.hytale.protocol.TargetedDamage toTargetedDamagePacket()
  public String toString()

Fields:
public static final BuilderCodec<DamageEntityInteraction.TargetedDamage> CODEC
protected int index
protected DamageCalculator damageCalculator
protected Map<String,TargetEntityEffect> targetEntityEffects
protected DamageEffects damageEffects
protected String next
