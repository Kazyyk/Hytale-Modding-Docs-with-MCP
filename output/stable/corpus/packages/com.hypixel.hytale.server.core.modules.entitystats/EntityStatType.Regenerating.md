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
