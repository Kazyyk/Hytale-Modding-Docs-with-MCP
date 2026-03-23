# EntityStatType.Regenerating

Type: class | Package: com.hypixel.hytale.server.core.modules.entitystats

public static class EntityStatType.Regenerating

Defines a regeneration configuration for an entity stat: interval, amount, type, conditions, and modifiers.

## Fields

- interval | float | Interval | Seconds between regeneration ticks.
- amount | float | Amount | Amount to regenerate per tick.
- clampAtZero | boolean | ClampAtZero | Prevents the stat from going below zero via this regen.
- regenType | RegenType | RegenType | Whether amount is additive or a percentage of the range.
- conditions | Condition[] | Conditions | Conditions that must all pass for regeneration to apply.
- modifiers | RegeneratingModifier[] | Modifiers | Multiplicative modifiers applied to the regen amount.

## Methods

- getInterval() | float | Returns the interval.
- getAmount() | float | Returns the regen amount.
- clampAmount(float, float, EntityStatValue) | float | Clamps the regen amount to prevent going below zero when `clampAtZero` is set.
- getRegenType() | RegenType | Returns the regen type.
- getConditions() | Condition[] | Returns conditions.
- getModifiers() | RegeneratingModifier[] | Returns modifiers.

## Inner Types

- EntityStatType.Regenerating.RegenType

Also in this package: DefaultEntityStatTypes, EntityStatEffects, EntityStatType, EntityStatTypePacketGenerator, RegenType

Complete API:
  public float getInterval()
  public float getAmount()
  public float clampAmount(float toAdd, float currentAmount, EntityStatValue statValue)
  public EntityStatType.Regenerating.RegenType getRegenType()
  public Condition[] getConditions()
  public RegeneratingModifier[] getModifiers()
  public String toString()

Fields:
public static final BuilderCodec<EntityStatType.Regenerating> CODEC
private float interval
private float amount
private boolean clampAtZero
private EntityStatType.Regenerating.RegenType regenType
private Condition[] conditions
private RegeneratingModifier[] modifiers
