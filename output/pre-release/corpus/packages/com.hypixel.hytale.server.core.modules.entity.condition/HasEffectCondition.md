# HasEffectCondition

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.condition | Extends: Condition

public class HasEffectCondition extends Condition

Returns true when the entity has an active effect matching the configured `EffectId`. Lazily resolves the effect ID string to an `EntityEffect` asset.

## Static Fields

- public static final BuilderCodec<HasEffectCondition> CODEC

## Relationships

- Extends Condition

Also in this package: AliveCondition, ChargingCondition, CheckPlayerGameModeCondition, Condition, EntityStatBoundCondition, EnvironmentCondition, GlidingCondition, InFluidCondition, IsPlayerCondition, LogicCondition, NoDamageTakenCondition, Operator, OutOfCombatCondition, RegenHealthCondition, SprintingCondition, StatComparisonType, StatCondition, SuffocatingCondition, WieldingCondition

Complete API:
  public boolean eval0(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> ref, Instant currentTime)
  public String toString()

Fields:
public static final BuilderCodec<HasEffectCondition> CODEC
private String entityEffectId
private EntityEffect entityEffect
