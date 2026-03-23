# StatsConditionBaseInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.none | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInstantInteraction

public abstract class StatsConditionBaseInteraction extends SimpleInstantInteraction

Abstract base for stat-condition interactions. Defines codec fields for stat costs, less-than comparison, lenient overdraw, and value type (absolute vs percent). Subclasses implement `canAfford`.

Known subclasses: StatsConditionInteraction, StatsConditionWithModifierInteraction

Also in this package: BuilderToolInteraction, CameraInteraction, CancelChainInteraction, ChainFlagInteraction, ChangeActiveSlotInteraction, ConditionInteraction, EffectConditionInteraction, EntityMatcher, HitEntity, ParallelInteraction, ParallelTag, RepeatInteraction, ReplaceInteraction, RunRootInteraction, SelectInteraction, SerialInteraction, SerialTag, SnapshotSource, StatsConditionInteraction, StatsConditionWithModifierInteraction

Complete API:
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected abstract boolean canAfford(Ref<EntityStore> var1, ComponentAccessor<EntityStore> var2)
  protected boolean canOverdraw(float value, float min)
  public String toString()

Fields:
public static final BuilderCodec<StatsConditionBaseInteraction> CODEC
protected Object2FloatMap<String> rawCosts
protected Int2FloatMap costs
protected boolean lessThan
protected boolean lenient
protected ValueType valueType
