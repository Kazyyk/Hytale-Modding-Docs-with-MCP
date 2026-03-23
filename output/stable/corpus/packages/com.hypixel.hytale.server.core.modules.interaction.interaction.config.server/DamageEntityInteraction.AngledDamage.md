# DamageEntityInteraction.AngledDamage

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.DamageEntityInteraction.TargetedDamage

public static class DamageEntityInteraction.AngledDamage extends DamageEntityInteraction.TargetedDamage

Extends TargetedDamage with angle-based matching. During damage calculation, the angle between attacker and target is compared against the configured `Angle` and `AngleDistance` (both specified in degrees, converted to radians internally). If the hit falls within the angular range, this entry's damage calculator and effects override the defaults.

## Codec Properties

Inherits all codec properties from TargetedDamage, plus:

- Angle | float | No (inherited) | -- | The center angle in degrees (converted to radians on decode).
- AngleDistance | float | No (inherited) | -- | The angular tolerance in degrees. A hit matches if its angle is within this distance of `Angle`.

## Fields

- float angleRad
- float angleDistanceRad

## Methods


@Nonnull
public com.hypixel.hytale.protocol.AngledDamage toAngledDamagePacket()

Converts to protocol packet form, including damage effects and follow-up interaction reference.


@Nonnull
@Override
public String toString()

## See Also

- DamageEntityInteraction -- parent interaction
- DamageEntityInteraction.TargetedDamage -- base class

Also in this package: BlockCustomPageSupplier, BlockEntityCustomPageSupplier, BlockSearchConsumer, ChangeStatBaseInteraction, ChangeStatInteraction, ChangeStatWithModifierInteraction, CheckUniqueItemUsageInteraction, ClearEntityEffectInteraction, CustomPageSupplier, DamageEntityInteraction, DestroyConditionInteraction, DoorInfo, DoorInteraction, DoorState, EntityStatOnHit, EquipItemInteraction, IncreaseBackpackCapacityInteraction, InterruptInteraction, LaunchPadInteraction, LaunchProjectileInteraction (and 13 more)

Complete API:
  public com.hypixel.hytale.protocol.AngledDamage toAngledDamagePacket()
  public String toString()

Fields:
public static final BuilderCodec<DamageEntityInteraction.AngledDamage> CODEC
protected float angleRad
protected float angleDistanceRad
