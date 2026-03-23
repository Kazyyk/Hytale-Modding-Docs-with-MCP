# ReplaceInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.none | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.Interaction

public class ReplaceInteraction extends Interaction

Looks up an interaction variable by name and runs the referenced root interaction. Falls back to a default value if the variable is not set. Logs a warning when no replacement is found and `DefaultOk` is false.

Also in this package: BuilderToolInteraction, CameraInteraction, CancelChainInteraction, ChainFlagInteraction, ChangeActiveSlotInteraction, ConditionInteraction, EffectConditionInteraction, EntityMatcher, HitEntity, ParallelInteraction, ParallelTag, RepeatInteraction, RunRootInteraction, SelectInteraction, SerialInteraction, SerialTag, SnapshotSource, StatsConditionBaseInteraction, StatsConditionInteraction, StatsConditionWithModifierInteraction

Complete API:
  public WaitForDataFrom getWaitForDataFrom()
  protected void tick0(boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected void simulateTick0(boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  private void doReplace(InteractionContext context, boolean log)
  public boolean needsRemoteSync()
  public boolean walk(Collector collector, InteractionContext context)
  protected com.hypixel.hytale.protocol.Interaction generatePacket()
  protected void configurePacket(com.hypixel.hytale.protocol.Interaction packet)
  public String toString()

Fields:
public static final BuilderCodec<ReplaceInteraction> CODEC
private static final StringTag TAG_DEFAULT
private static final StringTag TAG_VARS
protected String defaultValue
protected String variable
protected boolean defaultOk
