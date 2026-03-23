# CancelChainInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.none | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInstantInteraction

public class CancelChainInteraction extends SimpleInstantInteraction

Cancels an active chaining state for a specified chain ID by removing it from the entity's `ChainingInteraction.Data` named map.

Also in this package: BuilderToolInteraction, CameraInteraction, ChainFlagInteraction, ChangeActiveSlotInteraction, ConditionInteraction, EffectConditionInteraction, EntityMatcher, HitEntity, ParallelInteraction, ParallelTag, RepeatInteraction, ReplaceInteraction, RunRootInteraction, SelectInteraction, SerialInteraction, SerialTag, SnapshotSource, StatsConditionBaseInteraction, StatsConditionInteraction, StatsConditionWithModifierInteraction

Complete API:
  protected Interaction generatePacket()
  protected void configurePacket(Interaction packet)
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected void simulateFirstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)

Fields:
public static final BuilderCodec<CancelChainInteraction> CODEC
protected String chainId
