# InteractionEntry

Type: class | Package: com.hypixel.hytale.server.core.entity

public class InteractionEntry

A single entry (step) within an interaction chain. Maintains server state (`InteractionSyncData`), optional simulation state, optional client state, timestamps, and a `DynamicMetaStore<Interaction>` for per-entry metadata. Tracks sync state including desynced detection and waiting-for-data timeouts.

Also in this package: AnimationUtils, CallState, ChainCancelledException, ChainSyncStorage, DefaultAnimations, Entity, EntitySnapshot, EntityUtils, ExplosionConfig, ExplosionUtils, Frozen, InteractionChain, InteractionContext, InteractionManager, ItemUtils, LivingEntity, SnapshotProvider, StatModifiersManager, TempChain, UUIDComponent

Complete API:
  public int getIndex()
  public int nextForkId()
  public int getNextForkId()
  public InteractionSyncData getState()
  public void setUseSimulationState(boolean useSimulationState)
  public float getTimeInSeconds(long tickTime)
  public void setTimestamp(long timestamp, float shift)
  public long getTimestamp()
  public boolean isUseSimulationState()
  public InteractionSyncData getClientState()
  public DynamicMetaStore<Interaction> getMetaStore()
  public int getServerDataHashCode()
  public InteractionSyncData getServerState()
  public InteractionSyncData getSimulationState()
  public boolean setClientState(InteractionSyncData clientState)
  public long getWaitingForSyncData()
  public void setWaitingForSyncData(long waitingForSyncData)
  public long getWaitingForServerFinished()
  public void setWaitingForServerFinished(long waitingForServerFinished)
  public long getWaitingForClientFinished()
  public void setWaitingForClientFinished(long waitingForClientFinished)
  public boolean consumeDesyncFlag()
  public void flagDesync()
  public boolean consumeSendInitial()
  public String toString()

Fields:
private static final HytaleLogger LOGGER
private final int index
private final DynamicMetaStore<Interaction> metaStore
private long timestamp
private long simulationTimestamp
private final InteractionSyncData serverState
private InteractionSyncData simulationState
private InteractionSyncData clientState
private long waitingForSyncData
private long waitingForServerFinished
private long waitingForClientFinished
private boolean useSimulationState
private boolean desynced
private boolean shouldSendInitial
