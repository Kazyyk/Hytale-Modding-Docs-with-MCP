# RepeatInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.none | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInteraction

public class RepeatInteraction extends SimpleInteraction

Forks into a child interaction chain and optionally repeats it a specified number of times (or infinitely with -1). Waits for each fork to complete before repeating or running next/failed chains.

Also in this package: BuilderToolInteraction, CameraInteraction, CancelChainInteraction, ChainFlagInteraction, ChangeActiveSlotInteraction, ConditionInteraction, EffectConditionInteraction, EntityMatcher, HitEntity, ParallelInteraction, ParallelTag, ReplaceInteraction, RunRootInteraction, SelectInteraction, SerialInteraction, SerialTag, SnapshotSource, StatsConditionBaseInteraction, StatsConditionInteraction, StatsConditionWithModifierInteraction

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
public static final BuilderCodec<RepeatInteraction> CODEC
private static final MetaKey<InteractionChain> FORKED_CHAIN
private static final MetaKey<Integer> REMAINING_REPEATS
private static final StringTag TAG_FORK
private static final StringTag TAG_NEXT
private static final StringTag TAG_FAILED
protected String forkInteractions
protected int repeat
