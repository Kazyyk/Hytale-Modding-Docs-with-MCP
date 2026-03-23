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
