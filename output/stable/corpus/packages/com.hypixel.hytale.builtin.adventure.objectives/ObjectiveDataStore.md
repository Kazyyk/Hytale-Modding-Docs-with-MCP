# ObjectiveDataStore

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives

public class ObjectiveDataStore

Manages persistent storage and runtime tracking of all active objectives. Handles objective lifecycle (load, save, remove), per-player entity task mappings, and typed task reference sets.

## Key Methods

- public Objective getObjective(UUID objectiveUUID)
- public Map<String, Set<UUID>> getEntityTasksForPlayer(UUID playerUUID)
- public Collection<Objective> getObjectiveCollection()
- public <T extends ObjectiveTask> Set<ObjectiveTaskRef<T>> getTaskRefsForType(Class<T> taskClass)
- public <T extends ObjectiveTask> void addTaskRef(ObjectiveTaskRef<T> taskRef)
- public <T extends ObjectiveTask> void removeTaskRef(ObjectiveTaskRef<T> taskRef)
- public <T extends ObjectiveTask> void registerTaskRef(Class<T> taskClass)
- public void saveToDisk(String objectiveId, Objective objective)
- public void saveToDiskAllObjectives()
- public boolean removeFromDisk(String objectiveId)
- public boolean addObjective(UUID objectiveUUID, Objective objective)
- public void removeObjective(UUID objectiveUUID)
- public void addEntityTaskForPlayer(UUID playerUUID, String taskId, UUID objectiveUUID)
- public void removeEntityTask(UUID objectiveUUID, String taskId)
- public void removeEntityTaskForPlayer(UUID objectiveUUID, String taskId, UUID playerUUID)
- public Objective loadObjective(UUID objectiveUUID, Store<EntityStore> store)
- public void unloadObjective(UUID objectiveUUID)

Also in this package: DialogPage, DialogPageEventData, Objective, ObjectivePlugin, ObjectivePluginConfig

Complete API:
  public Objective getObjective(UUID objectiveUUID)
  public Map<String,Set<UUID>> getEntityTasksForPlayer(UUID playerUUID)
  public Collection<Objective> getObjectiveCollection()
  public Set<ObjectiveTaskRef<T>> getTaskRefsForType(Class<T> taskClass)
  public void addTaskRef(ObjectiveTaskRef<T> taskRef)
  public void removeTaskRef(ObjectiveTaskRef<T> taskRef)
  public void registerTaskRef(Class<T> taskClass)
  public void saveToDisk(String objectiveId, Objective objective)
  public void saveToDiskAllObjectives()
  public boolean removeFromDisk(String objectiveId)
  public boolean addObjective(UUID objectiveUUID, Objective objective)
  public void removeObjective(UUID objectiveUUID)
  public void addEntityTaskForPlayer(UUID playerUUID, String taskId, UUID objectiveUUID)
  public void removeEntityTask(UUID objectiveUUID, String taskId)
  public void removeEntityTaskForPlayer(UUID objectiveUUID, String taskId, UUID playerUUID)
  public Objective loadObjective(UUID objectiveUUID, Store<EntityStore> store)
  public void unloadObjective(UUID objectiveUUID)

Fields:
private final Map<UUID,Objective> objectives
private final Map<UUID,Map<String,Set<UUID>>> entityObjectiveUUIDsPerPlayer
private final DataStore<Objective> dataStore
private final Map<Class<? extends ObjectiveTask>,Set<ObjectiveTaskRef<? extends ObjectiveTask>>> taskRefByType
private final HytaleLogger logger
