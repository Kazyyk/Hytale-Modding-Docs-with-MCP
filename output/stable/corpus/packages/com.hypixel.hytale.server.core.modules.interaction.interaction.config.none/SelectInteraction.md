# SelectInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.none | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInteraction

public class SelectInteraction extends SimpleInteraction

Area selection interaction that uses a `Selector` to find entities and blocks each tick. Forks into `HitEntity` or `HitBlock` chains per target found. Supports entity match rules, owner ignoring, fail-on conditions, and client-sourced snapshots.

Also in this package: BuilderToolInteraction, CameraInteraction, CancelChainInteraction, ChainFlagInteraction, ChangeActiveSlotInteraction, ConditionInteraction, EffectConditionInteraction, EntityMatcher, HitEntity, ParallelInteraction, ParallelTag, RepeatInteraction, ReplaceInteraction, RunRootInteraction, SerialInteraction, SerialTag, SnapshotSource, StatsConditionBaseInteraction, StatsConditionInteraction, StatsConditionWithModifierInteraction

Complete API:
  public WaitForDataFrom getWaitForDataFrom()
  public boolean needsRemoteSync()
  protected void tick0(boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected void simulateTick0(boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  public InteractionChain mapForkChain(InteractionContext context, InteractionChainData data)
  protected com.hypixel.hytale.protocol.Interaction generatePacket()
  protected void configurePacket(com.hypixel.hytale.protocol.Interaction packet)
  public String toString()

Fields:
public static boolean SHOW_VISUAL_DEBUG
public static SelectInteraction.SnapshotSource SNAPSHOT_SOURCE
public static final BuilderCodec<SelectInteraction> CODEC
public static final MetaKey<IntSet> HIT_ENTITIES
public static final MetaKey<Set<BlockPosition>> HIT_BLOCKS
public static final MetaKey<DynamicMetaStore<Interaction>> SELECT_META_STORE
private static final MetaKey<Selector> ENTITY_SELECTOR
protected SelectorType selector
protected String hitEntity
protected SelectInteraction.HitEntity[] hitEntityRules
protected String hitBlock
protected FailOnType failOn
protected boolean ignoreOwner
