# Objective

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives | Implements: NetworkSerializable>

public class Objective implements NetworkSerializable<com.hypixel.hytale.protocol.Objective>

Represents an active objective instance, tracking its UUID, assigned players, current task set, completion state, and world reference. Manages task setup, completion flow, objective line progression, asset reloading, and packet serialization.

## Key Methods

- public static final BuilderCodec<Objective> CODEC = BuilderCodec.builder(Objective.class, Objective::new)
- public UUID getObjectiveUUID()
- public String getObjectiveId()
- public ObjectiveAsset getObjectiveAsset()
- public ObjectiveLineHistoryData getObjectiveLineHistoryData()
- public void setObjectiveLineHistoryData(ObjectiveLineHistoryData objectiveLineHistoryData)
- public ObjectiveHistoryData getObjectiveHistoryData()
- public ObjectiveLineAsset getObjectiveLineAsset()
- public Set<UUID> getPlayerUUIDs()
- public Set<UUID> getActivePlayerUUIDs()
- public ObjectiveTask[] getCurrentTasks()
- public int getCurrentTaskSetIndex()
- public String getCurrentDescription()
- public boolean isCompleted()
- public UUID getWorldUUID()
- public UUID getMarkerUUID()
- public boolean isDirty()
- public ItemStack getObjectiveItemStarter()
- public void setObjectiveItemStarter(ItemStack objectiveItemStarter)
- public boolean setup(Store<EntityStore> componentAccessor)

Also in this package: DialogPage, DialogPageEventData, ObjectiveDataStore, ObjectivePlugin, ObjectivePluginConfig

Complete API:
  public UUID getObjectiveUUID()
  public String getObjectiveId()
  public ObjectiveAsset getObjectiveAsset()
  public ObjectiveLineHistoryData getObjectiveLineHistoryData()
  public void setObjectiveLineHistoryData(ObjectiveLineHistoryData objectiveLineHistoryData)
  public ObjectiveHistoryData getObjectiveHistoryData()
  public ObjectiveLineAsset getObjectiveLineAsset()
  public Set<UUID> getPlayerUUIDs()
  public Set<UUID> getActivePlayerUUIDs()
  public ObjectiveTask[] getCurrentTasks()
  public int getCurrentTaskSetIndex()
  public String getCurrentDescription()
  public boolean isCompleted()
  public UUID getWorldUUID()
  public UUID getMarkerUUID()
  public boolean isDirty()
  public ItemStack getObjectiveItemStarter()
  public void setObjectiveItemStarter(ItemStack objectiveItemStarter)
  public boolean setup(Store<EntityStore> componentAccessor)
  public boolean setupCurrentTasks(Store<EntityStore> store)
  public boolean checkTaskSetCompletion(Store<EntityStore> store)
  protected void taskSetComplete(Store<EntityStore> store)
  public void complete(Store<EntityStore> store)
  public void cancel()
  public void unload()
  public void reloadObjectiveAsset(Map<String,ObjectiveAsset> reloadedAssets)
  private ObjectiveTaskAsset[] checkPossibleAssetReload(Map<String,ObjectiveAsset> reloadedAssets)
  private ObjectiveTask[] setupAndUpdateTasks(ObjectiveTaskAsset[] taskAssets, Store<EntityStore> store)
  private ObjectiveTask findMatchingObjectiveTask(ObjectiveTaskAsset taskAsset)
  private void cancelReload(ObjectiveTask[] newTasks)
  private void revertRemovedTasks(ObjectiveTask[] newTasks)
  public void forEachParticipant(Consumer<Ref<EntityStore>> consumer)
  public void forEachParticipant(BiConsumer<Ref<EntityStore>,T> consumer, T meta)
  public void forEachParticipant(TriConsumer<Ref<EntityStore>,T,U> consumer, T t, U u)
  public Vector3d getPosition(ComponentAccessor<EntityStore> componentAccessor)
  public void addActivePlayerUUID(UUID playerUUID)
  public void removeActivePlayerUUID(UUID playerUUID)
  public void markDirty()
  public boolean consumeDirty()
  public com.hypixel.hytale.protocol.Objective toPacket()
  public String toString()

Fields:
public static final BuilderCodec<Objective> CODEC
protected UUID objectiveUUID
protected String objectiveId
protected ObjectiveLineHistoryData objectiveLineHistoryData
protected ObjectiveHistoryData objectiveHistoryData
protected Set<UUID> playerUUIDs
protected Set<UUID> activePlayerUUIDs
protected ObjectiveTask[] currentTasks
protected int currentTaskSetIndex
protected boolean completed
protected UUID worldUUID
protected UUID markerUUID
protected boolean dirty
protected ItemStack objectiveItemStarter
