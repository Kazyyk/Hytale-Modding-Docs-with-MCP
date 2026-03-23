# SerialInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.none | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.Interaction

public class SerialInteraction extends Interaction

Compiles a list of child interactions to run sequentially. The `tick0` method is never called directly; instead, `compile` inlines child interactions into the operations builder.

Also in this package: BuilderToolInteraction, CameraInteraction, CancelChainInteraction, ChainFlagInteraction, ChangeActiveSlotInteraction, ConditionInteraction, EffectConditionInteraction, EntityMatcher, HitEntity, ParallelInteraction, ParallelTag, RepeatInteraction, ReplaceInteraction, RunRootInteraction, SelectInteraction, SerialTag, SnapshotSource, StatsConditionBaseInteraction, StatsConditionInteraction, StatsConditionWithModifierInteraction

Complete API:
  protected void tick0(boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected void simulateTick0(boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  public boolean walk(Collector collector, InteractionContext context)
  public void compile(OperationsBuilder builder)
  protected com.hypixel.hytale.protocol.Interaction generatePacket()
  protected void configurePacket(com.hypixel.hytale.protocol.Interaction packet)
  public boolean needsRemoteSync()
  public WaitForDataFrom getWaitForDataFrom()

Fields:
public static final BuilderCodec<SerialInteraction> CODEC
protected String[] interactions
