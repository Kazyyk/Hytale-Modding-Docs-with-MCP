# ActionNotify

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity | Extends: ActionBase

public class ActionNotify extends ActionBase

## Fields

- protected final String message
- protected final double expirationTime
- protected final int usedTargetSlot
- Ref<EntityStore> targetRef
- BeaconSupport beaconSupport

## Constructors

- public ActionNotify(@Nonnull BuilderActionNotify builderActionBase, @Nonnull BuilderSupport support)

## Methods

- public boolean execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, @Nonnull InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)

Also in this package: ActionBeacon, ActionIgnoreForAvoidance, ActionOverrideAttitude, ActionReleaseTarget, ActionSetMarkedTarget, ActionSetStat, HeadMotionWatch, SensorBeacon, SensorCount, SensorEntity, SensorEntityBase, SensorKill, SensorPlayer, SensorSelf, SensorTarget

Complete API:
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)

Fields:
protected final String message
protected final double expirationTime
protected final int usedTargetSlot
