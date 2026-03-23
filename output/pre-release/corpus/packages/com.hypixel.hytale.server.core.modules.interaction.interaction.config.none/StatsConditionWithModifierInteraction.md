# StatsConditionWithModifierInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.none | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.none.StatsConditionBaseInteraction

public class StatsConditionWithModifierInteraction extends StatsConditionBaseInteraction

Stat-condition interaction that applies armor interaction modifiers (additive and multiplicative discounts) to the base cost before checking affordability.

Also in this package: BuilderToolInteraction, CameraInteraction, CancelChainInteraction, ChainFlagInteraction, ChangeActiveSlotInteraction, ConditionInteraction, EffectConditionInteraction, EntityMatcher, HitEntity, ParallelInteraction, ParallelTag, RepeatInteraction, ReplaceInteraction, RunRootInteraction, SelectInteraction, SerialInteraction, SerialTag, SnapshotSource, StatsConditionBaseInteraction, StatsConditionInteraction

Complete API:
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected boolean canAfford(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  private float calculateDiscount(ItemContainer armorContainer, int statIndex, float baseCost)
  public String toString()

Fields:
public static final BuilderCodec<StatsConditionWithModifierInteraction> CODEC
protected ItemArmor.InteractionModifierId interactionModifierId
