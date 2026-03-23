# InteractionManager

Type: class | Package: com.hypixel.hytale.server.core.entity | Implements: Component<EntityStore>

public class InteractionManager implements Component<EntityStore>

Per-entity `EntityStore` component that manages all active interaction chains and cooldowns. Maintains a map of active `InteractionChain` instances keyed by chain ID, a `CooldownHandler`, and references to the owning `LivingEntity` and `PlayerRef`. Provides the primary `tick()` method for advancing all chains, methods for starting/cancelling chains, and static utilities for walking interaction trees (`walkInteraction()`). Defines `MAX_REACH_DISTANCE = 8.0` and `DEFAULT_CHARGE_TIMES`.

Also in this package: AnimationUtils, CallState, ChainCancelledException, ChainSyncStorage, DefaultAnimations, Entity, EntitySnapshot, EntityUtils, ExplosionConfig, ExplosionUtils, Frozen, InteractionChain, InteractionContext, InteractionEntry, ItemUtils, LivingEntity, SnapshotProvider, StatModifiersManager, TempChain, UUIDComponent

Complete API:
  public Int2ObjectMap<InteractionChain> getChains()
  public IInteractionSimulationHandler getInteractionSimulationHandler()
  private long getOperationTimeoutThreshold()
  private boolean waitingForClient(Ref<EntityStore> ref)
  public void setHasRemoteClient(boolean hasRemoteClient)
  public void copyFrom(InteractionManager interactionManager)
  public void tick(Ref<EntityStore> ref, CommandBuffer<EntityStore> commandBuffer, float dt)
  private boolean tryConsumePacketQueue(Ref<EntityStore> ref, Deque<SyncInteractionChain> packetQueue)
  private InteractionChain getChain(int chainId, ForkedChainId forkedChainId)
  private boolean tickChain(InteractionChain chain)
  private void handleCancelledChain(Ref<EntityStore> ref, InteractionChain chain)
  private void doTickChain(Ref<EntityStore> ref, InteractionChain chain)
  private InteractionSyncData serverTick(Ref<EntityStore> ref, InteractionChain chain, long tickTime)
  private void removeInteractionIfFinished(Ref<EntityStore> ref, InteractionChain chain, InteractionEntry entry)
  private void simulationTick(Ref<EntityStore> ref, InteractionChain chain, long tickTime)
  private boolean syncStart(Ref<EntityStore> ref, SyncInteractionChain packet)
  public void sync(Ref<EntityStore> ref, ChainSyncStorage chainSyncStorage, SyncInteractionChain packet)
  public boolean canRun(InteractionType type, RootInteraction rootInteraction)
  public boolean canRun(InteractionType type, short equipSlot, RootInteraction rootInteraction)
  public boolean applyRules(InteractionContext context, InteractionChainData data, InteractionType type, RootInteraction rootInteraction)
  public void cancelChains(InteractionChain chain)
  private static boolean applyRules(InteractionChainData data, InteractionType type, int heldItemSlot, RootInteraction rootInteraction, Map<?,InteractionChain> chains, List<InteractionChain> chainsToCancel)
  public boolean tryStartChain(Ref<EntityStore> ref, CommandBuffer<EntityStore> commandBuffer, InteractionType type, InteractionContext context, RootInteraction rootInteraction)
  public void startChain(Ref<EntityStore> ref, CommandBuffer<EntityStore> commandBuffer, InteractionType type, InteractionContext context, RootInteraction rootInteraction)
  public InteractionChain initChain(InteractionType type, InteractionContext context, RootInteraction rootInteraction, boolean forceRemoteSync)
  public InteractionChain initChain(InteractionType type, InteractionContext context, RootInteraction rootInteraction, int entityId, BlockPosition blockPosition, boolean forceRemoteSync)
  public InteractionChain initChain(InteractionChainData data, InteractionType type, InteractionContext context, RootInteraction rootInteraction, Runnable onCompletion, boolean forceRemoteSync)
  public void queueExecuteChain(InteractionChain chain)
  public void executeChain(Ref<EntityStore> ref, CommandBuffer<EntityStore> commandBuffer, InteractionChain chain)
  private void executeChain0(Ref<EntityStore> ref, InteractionChain chain)
  private boolean isOnCooldown(Ref<EntityStore> ref, InteractionType type, RootInteraction root, boolean remote)
  public void tryRunHeldInteraction(Ref<EntityStore> ref, CommandBuffer<EntityStore> commandBuffer, InteractionType type)
  public void tryRunHeldInteraction(Ref<EntityStore> ref, CommandBuffer<EntityStore> commandBuffer, InteractionType type, short equipSlot)
  public void sendSyncPacket(InteractionChain chain, int operationBaseIndex, List<InteractionSyncData> interactionData)
  private static SyncInteractionChain makeSyncPacket(InteractionChain chain, int operationBaseIndex, List<InteractionSyncData> interactionData)
  private void sendCancelPacket(InteractionChain chain)
  public void sendCancelPacket(int chainId, ForkedChainId forkedChainId)
  public void clear()
  public void clearAllGlobalTimeShift(float dt)
  public void setGlobalTimeShift(InteractionType type, float shift)
  public float getGlobalTimeShift(InteractionType type)
  public T forEachInteraction(TriFunction<InteractionChain,Interaction,T,T> func, T val)
  private static T forEachInteraction(Map<?,InteractionChain> chains, TriFunction<InteractionChain,Interaction,T,T> func, T val)
  public void walkChain(Ref<EntityStore> ref, Collector collector, InteractionType type, ComponentAccessor<EntityStore> componentAccessor)
  public void walkChain(Ref<EntityStore> ref, Collector collector, InteractionType type, RootInteraction rootInteraction, ComponentAccessor<EntityStore> componentAccessor)
  public static void walkChain(Collector collector, InteractionType type, InteractionContext context, RootInteraction rootInteraction)
  public static boolean walkInteractions(Collector collector, InteractionContext context, CollectorTag tag, String[] interactionIds)
  public static boolean walkInteraction(Collector collector, InteractionContext context, CollectorTag tag, String id)
  public ObjectList<SyncInteractionChain> getSyncPackets()
  public Component<EntityStore> clone()

Fields:
public static final double MAX_REACH_DISTANCE
public static final float[] DEFAULT_CHARGE_TIMES
private static final HytaleLogger LOGGER
private final Int2ObjectMap<InteractionChain> chains
private final Int2ObjectMap<InteractionChain> unmodifiableChains
private final CooldownHandler cooldownHandler
private final LivingEntity entity
private final PlayerRef playerRef
private boolean hasRemoteClient
private final IInteractionSimulationHandler interactionSimulationHandler
private final ObjectList<InteractionSyncData> tempSyncDataList
private int lastServerChainId
private int lastClientChainId
private long packetQueueTime
private final float[] globalTimeShift
private final boolean[] globalTimeShiftDirty
private boolean timeShiftsDirty
private final ObjectList<SyncInteractionChain> syncPackets
private long currentTime
private final ObjectList<InteractionChain> chainStartQueue
private final Predicate<InteractionChain> cachedTickChain
protected CommandBuffer<EntityStore> commandBuffer
