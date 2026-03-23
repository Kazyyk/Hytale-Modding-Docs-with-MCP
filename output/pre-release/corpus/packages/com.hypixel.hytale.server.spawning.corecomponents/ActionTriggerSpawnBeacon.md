# ActionTriggerSpawnBeacon

Type: class | Package: com.hypixel.hytale.server.spawning.corecomponents | Extends: ActionBase

public class ActionTriggerSpawnBeacon extends ActionBase

## Fields

- protected final int beaconId
- protected final int range
- protected final int targetSlot

## Methods

- @Override public boolean canExecute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
- @Override public void registerWithSupport(Role role)
- @Override public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)

Complete API:
  public boolean canExecute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  public void registerWithSupport(Role role)
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)

Fields:
protected final int beaconId
protected final int range
protected final int targetSlot
