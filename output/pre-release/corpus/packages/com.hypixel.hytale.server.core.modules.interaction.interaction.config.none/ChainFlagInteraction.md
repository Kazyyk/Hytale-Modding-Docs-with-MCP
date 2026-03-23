# ChainFlagInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.none | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInstantInteraction

public class ChainFlagInteraction extends SimpleInstantInteraction

Sets a named flag on a given chain ID that a `ChainingInteraction` can use to adjust execution flow.

Also in this package: BuilderToolInteraction, CameraInteraction, CancelChainInteraction, ChangeActiveSlotInteraction, ConditionInteraction, EffectConditionInteraction, EntityMatcher, HitEntity, ParallelInteraction, ParallelTag, RepeatInteraction, ReplaceInteraction, RunRootInteraction, SelectInteraction, SerialInteraction, SerialTag, SnapshotSource, StatsConditionBaseInteraction, StatsConditionInteraction, StatsConditionWithModifierInteraction

Complete API:
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected Interaction generatePacket()
  protected void configurePacket(Interaction packet)

Fields:
public static final BuilderCodec<ChainFlagInteraction> CODEC
protected String chainId
protected String flag
