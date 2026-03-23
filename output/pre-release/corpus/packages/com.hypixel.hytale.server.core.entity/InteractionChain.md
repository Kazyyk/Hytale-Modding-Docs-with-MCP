# InteractionChain

Type: class | Package: com.hypixel.hytale.server.core.entity | Implements: ChainSyncStorage

public class InteractionChain implements ChainSyncStorage

Represents a running interaction chain with server/client synchronization. Tracks the interaction type, chain data, operation counter, call stack, forked chains, root interaction, and synchronization state. Manages the lifecycle of interactions from first run through completion, handling client-server state reconciliation, fork management, and operation index tracking.

Also in this package: AnimationUtils, CallState, ChainCancelledException, ChainSyncStorage, DefaultAnimations, Entity, EntitySnapshot, EntityUtils, ExplosionConfig, ExplosionUtils, Frozen, InteractionContext, InteractionEntry, InteractionManager, ItemUtils, LivingEntity, SnapshotProvider, StatModifiersManager, TempChain, UUIDComponent

Complete API:
  public InteractionType getType()
  public int getChainId()
  public ForkedChainId getForkedChainId()
  public ForkedChainId getBaseForkedChainId()
  public RootInteraction getInitialRootInteraction()
  public boolean isPredicted()
  public InteractionContext getContext()
  public InteractionChainData getChainData()
  public InteractionState getServerState()
  public boolean requiresClient()
  public RootInteraction getRootInteraction()
  public RootInteraction getSimulatedRootInteraction()
  public int getOperationCounter()
  public void setOperationCounter(int operationCounter)
  public int getSimulatedOperationCounter()
  public void setSimulatedOperationCounter(int simulatedOperationCounter)
  public boolean wasPreTicked()
  public void setPreTicked(boolean preTicked)
  public int getOperationIndex()
  public void nextOperationIndex()
  public int getClientOperationIndex()
  public InteractionChain findForkedChain(ForkedChainId chainId, InteractionChainData data)
  public InteractionChain getForkedChain(ForkedChainId chainId)
  public void putForkedChain(ForkedChainId chainId, InteractionChain chain)
  public InteractionChain.TempChain getTempForkedChain(ForkedChainId chainId)
  InteractionChain.TempChain removeTempForkedChain(ForkedChainId chainId, InteractionChain forkChain)
  public boolean hasSentInitial()
  public void setSentInitial(boolean sentInitial)
  public float getTimeShift()
  public void setTimeShift(float timeShift)
  public boolean consumeFirstRun()
  public boolean isFirstRun()
  public void setFirstRun(boolean firstRun)
  public int getCallDepth()
  public int getSimulatedCallDepth()
  public void pushRoot(RootInteraction nextInteraction, boolean simulate)
  public void popRoot()
  public float getTimeInSeconds()
  public void setOnCompletion(Runnable onCompletion)
  void onCompletion(CooldownHandler cooldownHandler, boolean isRemote)
  void updateServerState()
  void updateSimulatedState()
  public InteractionState getClientState()
  public void setClientState(InteractionState state)
  public InteractionEntry getOrCreateInteractionEntry(int index)
  public InteractionEntry getInteraction(int index)
  public void removeInteractionEntry(InteractionManager interactionManager, int index)
  public void putInteractionSyncData(int index, InteractionSyncData data)
  public void clearInteractionSyncData(int operationIndex)
  public InteractionSyncData removeInteractionSyncData(int index)
  public void updateSyncPosition(int index)
  public boolean isSyncDataOutOfOrder(int index)
  public void syncFork(Ref<EntityStore> ref, InteractionManager manager, SyncInteractionChain packet)
  public void copyTempFrom(InteractionChain.TempChain temp)
  private static long forkedIdToIndex(ForkedChainId chainId)
  public void setChainId(int chainId)
  public InteractionType getBaseType()
  public void setBaseType(InteractionType baseType)
  public Long2ObjectMap<InteractionChain> getForkedChains()
  public Long2ObjectMap<InteractionChain.TempChain> getTempForkedChainData()
  public long getTimestamp()
  public void setTimestamp(long timestamp)
  public long getWaitingForServerFinished()
  public void setWaitingForServerFinished(long waitingForServerFinished)
  public long getWaitingForClientFinished()
  public void setWaitingForClientFinished(long waitingForClientFinished)
  public void setServerState(InteractionState serverState)
  public InteractionState getFinalState()
  public void setFinalState(InteractionState finalState)
  void setPredicted(boolean predicted)
  public void flagDesync()
  public boolean isDesynced()
  public List<InteractionChain> getNewForks()
  public String toString()

Fields:
private static final HytaleLogger LOGGER
private static final long NULL_FORK_ID
private final InteractionType type
private InteractionType baseType
private final InteractionChainData chainData
private int chainId
private final ForkedChainId forkedChainId
private final ForkedChainId baseForkedChainId
private boolean predicted
private final InteractionContext context
private final Long2ObjectMap<InteractionChain> forkedChains
private final Long2ObjectMap<InteractionChain.TempChain> tempForkedChainData
private final Long2LongMap forkedChainsMap
private final List<InteractionChain> newForks
private final RootInteraction initialRootInteraction
private RootInteraction rootInteraction
private int operationCounter
private final List<InteractionChain.CallState> callStack
private int simulatedCallStack
private final boolean requiresClient
private int simulatedOperationCounter
private RootInteraction simulatedRootInteraction
private int operationIndex
private int operationIndexOffset
private int clientOperationIndex
private final List<InteractionEntry> interactions
private final List<InteractionSyncData> tempSyncData
private int tempSyncDataOffset
private long timestamp
private long waitingForServerFinished
private long waitingForClientFinished
private InteractionState clientState
private InteractionState serverState
private InteractionState finalState
private Runnable onCompletion
private boolean sentInitial
private boolean desynced
private float timeShift
private boolean firstRun
private boolean isFirstRun
private boolean completed
private boolean preTicked
boolean skipChainOnClick
