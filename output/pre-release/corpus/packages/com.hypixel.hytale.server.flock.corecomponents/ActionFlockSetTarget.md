# ActionFlockSetTarget

Type: class | Package: com.hypixel.hytale.server.flock.corecomponents | Extends: ActionBase

public class ActionFlockSetTarget extends ActionBase

## Fields

- protected final boolean clear
- protected final String targetSlot

## Methods

- @Override public boolean canExecute( @Nonnull Ref<EntityStore> ref, @Nonnull Role role, @Nullable InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store )
- @Override public boolean execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, @Nonnull InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)

Also in this package: ActionFlockBeacon, ActionFlockJoin, ActionFlockLeave, ActionFlockState, BodyMotionFlock, EntityFilterFlock, SensorFlockCombatDamage, SensorFlockLeader, SensorInflictedDamage, Target

Complete API:
  public boolean canExecute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)

Fields:
protected final boolean clear
protected final String targetSlot
