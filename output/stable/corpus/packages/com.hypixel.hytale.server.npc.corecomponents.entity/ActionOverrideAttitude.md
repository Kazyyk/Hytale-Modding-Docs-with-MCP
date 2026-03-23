# ActionOverrideAttitude

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity | Extends: ActionBase

public class ActionOverrideAttitude extends ActionBase

## Fields

- protected final Attitude attitude
- protected final double duration
- Ref<EntityStore> target

## Constructors

- public ActionOverrideAttitude(@Nonnull BuilderActionOverrideAttitude builder, @Nonnull BuilderSupport support)

## Methods

- public boolean canExecute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, @Nullable InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)
- public boolean execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, @Nonnull InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)

Also in this package: ActionBeacon, ActionIgnoreForAvoidance, ActionNotify, ActionReleaseTarget, ActionSetMarkedTarget, ActionSetStat, HeadMotionWatch, SensorBeacon, SensorCount, SensorEntity, SensorEntityBase, SensorKill, SensorPlayer, SensorSelf, SensorTarget

Complete API:
  public boolean canExecute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)

Fields:
protected final Attitude attitude
protected final double duration
