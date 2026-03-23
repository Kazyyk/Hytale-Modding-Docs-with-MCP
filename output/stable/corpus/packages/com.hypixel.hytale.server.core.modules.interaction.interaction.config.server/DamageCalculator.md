# DamageCalculator

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat

public class DamageCalculator

Computes damage values for combat interactions. Supports two calculation types: `ABSOLUTE` (flat damage) and `DPS` (damage scaled by duration). Base damage is specified per `DamageCause` and can be modified by a random percentage modifier and sequential hit modifiers.

## Codec Properties

- Type | DamageCalculator.Type` enum | No (inherited) | ABSOLUTE | Whether damage is absolute or duration-scaled (DPS).
- Class | DamageClass | Yes (inherited) | UNKNOWN | The damage class, used by the damage system to apply armor-based modifiers.
- BaseDamage | Object2FloatMap<String> | No (inherited) | -- | Base damage values keyed by `DamageCause` asset ID.
- SequentialModifierStep | float | No (inherited) | 0.0 | Step value for sequential hit damage reduction.
- SequentialModifierMinimum | float | No (inherited) | 0.0 | Minimum multiplier floor for sequential hits.
- RandomPercentageModifier | float | No (inherited) | 0.0 | Random variance applied to damage (must be >= 0).

## Methods


@Nullable
public Object2FloatMap<DamageCause> calculateDamage(double durationSeconds)

Calculates damage for all configured causes. Applies type-based scaling and random variance. Returns `null` if no base damage is configured.


public DamageCalculator.Type getType()


@Nonnull
public DamageClass getDamageClass()


public float getSequentialModifierStep()


public float getSequentialModifierMinimum()


@Override
public boolean equals(Object o)


@Override
public int hashCode()


@Nonnull
@Override
public String toString()

## Inner Enums

- DamageCalculator.Type -- `DPS` or `ABSOLUTE`

## See Also

- DamageClass -- classifies the damage for armor modifier lookups
- DamageEntityInteraction -- primary consumer of this class
- `DamageCause` -- asset type for individual damage causes

Also in this package: DamageClass, DamageEffects, DirectionalKnockback, ForceKnockback, Knockback, PointKnockback, TargetEntityEffect, Type

Complete API:
  public Object2FloatMap<DamageCause> calculateDamage(double durationSeconds)
  private float scaleDamage(double durationSeconds, float damage)
  public DamageCalculator.Type getType()
  public DamageClass getDamageClass()
  public float getSequentialModifierStep()
  public float getSequentialModifierMinimum()
  public boolean equals(Object o)
  public int hashCode()
  public String toString()

Fields:
public static final BuilderCodec<DamageCalculator> CODEC
protected DamageCalculator.Type type
protected DamageClass damageClass
protected Object2FloatMap<String> baseDamageRaw
protected float sequentialModifierStep
protected float sequentialModifierMinimum
protected float randomPercentageModifier
protected transient Int2FloatMap baseDamage
