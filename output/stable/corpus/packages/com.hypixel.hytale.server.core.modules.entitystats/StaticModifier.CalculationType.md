# StaticModifier.CalculationType

Type: enum | Package: com.hypixel.hytale.server.core.modules.entitystats

public static enum StaticModifier.CalculationType

Defines how a `StaticModifier` transforms a stat bound value.

## Enum Constants

- ADDITIVE | value + amount | Adds the amount to the bound.
- MULTIPLICATIVE | value * amount | Multiplies the bound by the amount.

## Methods

- compute(float value, float amount) | float | Applies the calculation to the given inputs.
- createKey(String armor) | String | Creates a modifier map key by appending `_ADDITIVE` or `_MULTIPLICATIVE`.

Also in this package: DefaultModifiers, Modifier, ModifierTarget, StaticModifier

Complete API:
  public abstract float compute(float var1, float var2)
  public String createKey(String armor)
