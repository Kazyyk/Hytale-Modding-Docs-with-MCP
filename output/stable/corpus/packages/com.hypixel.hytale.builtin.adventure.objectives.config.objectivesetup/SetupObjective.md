# SetupObjective

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.config.objectivesetup | Extends: ObjectiveTypeSetup

public class SetupObjective extends ObjectiveTypeSetup

## Fields

- public static final BuilderCodec<SetupObjective> CODEC
- protected String objectiveId

## Methods

- @Override public String getObjectiveIdToStart()
- @Nullable @Override public Objective setup(Set<UUID> playerUUIDs, UUID worldUUID, UUID markerUUID, Store<EntityStore> store)
- @Nonnull @Override public String toString()

Also in this package: ObjectiveTypeSetup, SetupObjectiveLine

Complete API:
  public String getObjectiveIdToStart()
  public Objective setup(Set<UUID> playerUUIDs, UUID worldUUID, UUID markerUUID, Store<EntityStore> store)
  public String toString()

Fields:
public static final BuilderCodec<SetupObjective> CODEC
protected String objectiveId
