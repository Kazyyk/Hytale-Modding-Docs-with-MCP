# RunRootInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.none | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInstantInteraction

public class RunRootInteraction extends SimpleInstantInteraction

Immediately executes a referenced root interaction by ID, finishing the current interaction and delegating to the target root.

Also in this package: BuilderToolInteraction, CameraInteraction, CancelChainInteraction, ChainFlagInteraction, ChangeActiveSlotInteraction, ConditionInteraction, EffectConditionInteraction, EntityMatcher, HitEntity, ParallelInteraction, ParallelTag, RepeatInteraction, ReplaceInteraction, SelectInteraction, SerialInteraction, SerialTag, SnapshotSource, StatsConditionBaseInteraction, StatsConditionInteraction, StatsConditionWithModifierInteraction

Complete API:
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected Interaction generatePacket()
  protected void configurePacket(Interaction packet)

Fields:
public static final BuilderCodec<RunRootInteraction> CODEC
protected String rootInteraction
