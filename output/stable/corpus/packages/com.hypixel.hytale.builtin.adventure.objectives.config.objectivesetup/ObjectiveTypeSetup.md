# ObjectiveTypeSetup

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.config.objectivesetup

public abstract class ObjectiveTypeSetup

## Fields

- public static final CodecMapCodec<ObjectiveTypeSetup> CODEC

## Methods

- @Nullable public abstract String getObjectiveIdToStart()
- @Nullable public abstract Objective setup(Set<UUID> var1, UUID var2, UUID var3, Store<EntityStore> var4)
- @Nonnull @Override public String toString()

Known subclasses: SetupObjective, SetupObjectiveLine

Also in this package: SetupObjective, SetupObjectiveLine

Complete API:
  public abstract String getObjectiveIdToStart()
  public abstract Objective setup(Set<UUID> var1, UUID var2, UUID var3, Store<EntityStore> var4)
  public String toString()

Fields:
public static final CodecMapCodec<ObjectiveTypeSetup> CODEC
