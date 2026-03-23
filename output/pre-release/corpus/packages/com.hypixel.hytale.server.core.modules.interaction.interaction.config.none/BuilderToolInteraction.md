# BuilderToolInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.none | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInteraction

public class BuilderToolInteraction extends SimpleInteraction

Runs a builder tool interaction, syncing client state to server state before delegating to the parent tick.

Also in this package: CameraInteraction, CancelChainInteraction, ChainFlagInteraction, ChangeActiveSlotInteraction, ConditionInteraction, EffectConditionInteraction, EntityMatcher, HitEntity, ParallelInteraction, ParallelTag, RepeatInteraction, ReplaceInteraction, RunRootInteraction, SelectInteraction, SerialInteraction, SerialTag, SnapshotSource, StatsConditionBaseInteraction, StatsConditionInteraction, StatsConditionWithModifierInteraction

Complete API:
  protected Interaction generatePacket()
  public boolean needsRemoteSync()
  public WaitForDataFrom getWaitForDataFrom()
  protected void tick0(boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  public String toString()

Fields:
public static final BuilderCodec<BuilderToolInteraction> CODEC
