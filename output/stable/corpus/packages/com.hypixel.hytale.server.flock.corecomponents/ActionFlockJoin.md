# ActionFlockJoin

Type: class | Package: com.hypixel.hytale.server.flock.corecomponents | Extends: ActionBase

public class ActionFlockJoin extends ActionBase

## Fields

- protected final boolean forceJoin

## Methods

- @Override public boolean canExecute( @Nonnull Ref<EntityStore> ref, @Nonnull Role role, @Nullable InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store )
- @Override public boolean execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, @Nullable InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)

Also in this package: ActionFlockBeacon, ActionFlockLeave, ActionFlockSetTarget, ActionFlockState, BodyMotionFlock, EntityFilterFlock, SensorFlockCombatDamage, SensorFlockLeader, SensorInflictedDamage, Target

Complete API:
  public boolean canExecute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)

Fields:
protected final boolean forceJoin
