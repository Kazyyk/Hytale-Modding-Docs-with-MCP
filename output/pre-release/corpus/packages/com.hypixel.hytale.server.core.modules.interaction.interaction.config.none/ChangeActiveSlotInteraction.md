# ChangeActiveSlotInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.none | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.Interaction

public class ChangeActiveSlotInteraction extends Interaction

Changes the active hotbar slot for the interaction user. Optionally targets a specific slot index (0-8) or reads the target from context metadata. Forks into a `SwapTo` interaction after switching.

Also in this package: BuilderToolInteraction, CameraInteraction, CancelChainInteraction, ChainFlagInteraction, ConditionInteraction, EffectConditionInteraction, EntityMatcher, HitEntity, ParallelInteraction, ParallelTag, RepeatInteraction, ReplaceInteraction, RunRootInteraction, SelectInteraction, SerialInteraction, SerialTag, SnapshotSource, StatsConditionBaseInteraction, StatsConditionInteraction, StatsConditionWithModifierInteraction

Complete API:
  public WaitForDataFrom getWaitForDataFrom()
  protected void tick0(boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected void simulateTick0(boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  public boolean walk(Collector collector, InteractionContext context)
  public boolean needsRemoteSync()
  protected com.hypixel.hytale.protocol.Interaction generatePacket()
  protected void configurePacket(com.hypixel.hytale.protocol.Interaction packet)
  public String toString()

Fields:
public static final ChangeActiveSlotInteraction DEFAULT_INTERACTION
public static final RootInteraction DEFAULT_ROOT
public static final MetaKey<Runnable> PLACE_MOVED_ITEM
private static final int UNSET_INT
public static final BuilderCodec<ChangeActiveSlotInteraction> CODEC
protected int targetSlot
