# EffectConditionInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.none | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInstantInteraction

public class EffectConditionInteraction extends SimpleInstantInteraction

Succeeds or fails based on whether specified entity effects are active on a target entity. Supports `Match.All` (all must be present) and `Match.None` (none must be present).

Also in this package: BuilderToolInteraction, CameraInteraction, CancelChainInteraction, ChainFlagInteraction, ChangeActiveSlotInteraction, ConditionInteraction, EntityMatcher, HitEntity, ParallelInteraction, ParallelTag, RepeatInteraction, ReplaceInteraction, RunRootInteraction, SelectInteraction, SerialInteraction, SerialTag, SnapshotSource, StatsConditionBaseInteraction, StatsConditionInteraction, StatsConditionWithModifierInteraction

Complete API:
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  private static int[] resolveEntityEffects(String[] entityEffectIds)
  protected Interaction generatePacket()
  protected void configurePacket(Interaction packet)
  public String toString()

Fields:
public static final BuilderCodec<EffectConditionInteraction> CODEC
protected String[] entityEffectIds
protected int[] entityEffectIndexes
protected Match match
private InteractionTarget entityTarget
