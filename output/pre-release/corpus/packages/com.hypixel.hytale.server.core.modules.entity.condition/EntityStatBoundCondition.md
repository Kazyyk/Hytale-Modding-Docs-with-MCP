# EntityStatBoundCondition

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.condition | Extends: Condition

public abstract class EntityStatBoundCondition extends Condition

Abstract base for conditions that evaluate against a named entity stat. Lazily resolves the stat name to an index via `EntityStatType.getAssetMap()`. Subclasses implement `eval0(Ref, Instant, EntityStatValue)`.

## Static Fields

- public static final BuilderCodec<EntityStatBoundCondition> CODEC

## Relationships

- Extends Condition

Known subclasses: StatCondition

Also in this package: AliveCondition, ChargingCondition, CheckPlayerGameModeCondition, Condition, EnvironmentCondition, GlidingCondition, HasEffectCondition, InFluidCondition, IsPlayerCondition, LogicCondition, NoDamageTakenCondition, Operator, OutOfCombatCondition, RegenHealthCondition, SprintingCondition, StatComparisonType, StatCondition, SuffocatingCondition, WieldingCondition

Complete API:
  public boolean eval0(ComponentAccessor<EntityStore> componentAccessor, Ref<EntityStore> ref, Instant currentTime)
  public abstract boolean eval0(Ref<EntityStore> var1, Instant var2, EntityStatValue var3)
  public String toString()

Fields:
public static final BuilderCodec<EntityStatBoundCondition> CODEC
protected String unknownStat
protected int stat
