# TargetEntityEffect

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.combat

public class TargetEntityEffect

Configures an entity effect to be applied to a damage target. Includes duration, application chance, per-entity-type duration modifiers, and overlap behavior.

## Codec Properties

- Duration | double` (stored as `float`) | No | 0.0 | Duration of the applied effect in seconds.
- Chance | double | No | 1.0 | Probability of the effect being applied (0.0 to 1.0).
- EntityTypeDurationModifiers | Object2DoubleMap<String> | No | -- | Duration multipliers keyed by entity type ID.
- OverlapBehavior | OverlapBehavior | No | IGNORE | How to handle overlapping applications of the same effect.

## Constructor


public TargetEntityEffect(float duration, double chance, Object2DoubleMap<String> entityTypeDurationModifiers, OverlapBehavior overlapBehavior)

## Methods


public float getDuration()


public double getChance()


public Object2DoubleMap<String> getEntityTypeDurationModifiers()


public OverlapBehavior getOverlapBehavior()


@Nonnull
@Override
public String toString()

## See Also

- DamageEntityInteraction.TargetedDamage -- uses `TargetEntityEffect` in its configuration
- `OverlapBehavior` -- defines how duplicate effects are handled

Also in this package: DamageCalculator, DamageClass, DamageEffects, DirectionalKnockback, ForceKnockback, Knockback, PointKnockback, Type

Complete API:
  public float getDuration()
  public double getChance()
  public Object2DoubleMap<String> getEntityTypeDurationModifiers()
  public OverlapBehavior getOverlapBehavior()
  public String toString()

Fields:
public static final BuilderCodec<TargetEntityEffect> CODEC
protected float duration
protected double chance
protected Object2DoubleMap<String> entityTypeDurationModifiers
protected OverlapBehavior overlapBehavior
