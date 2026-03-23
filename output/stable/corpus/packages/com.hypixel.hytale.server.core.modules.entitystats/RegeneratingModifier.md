# RegeneratingModifier

Type: class | Package: com.hypixel.hytale.server.core.modules.entitystats

public class RegeneratingModifier

A conditional multiplier applied to a regeneration amount. If all conditions are met, the regeneration tick is multiplied by `amount`; otherwise the multiplier is `1.0` (no effect).

## Fields

- conditions | Condition[] | Conditions | Conditions that must be met for the modifier to activate.
- amount | float | Amount | Multiplier to apply to regeneration when conditions are met.

## Methods

- getModifier(ComponentAccessor<EntityStore>, Ref<EntityStore>, Instant) | float | Returns `amount` if conditions are met, otherwise `1.0f`.

Complete API:
  public float getModifier(ComponentAccessor<EntityStore> store, Ref<EntityStore> ref, Instant currentTime)
  public String toString()

Fields:
public static final BuilderCodec<RegeneratingModifier> CODEC
protected Condition[] conditions
protected float amount
