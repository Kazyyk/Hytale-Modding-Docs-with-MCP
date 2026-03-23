# SensorKill

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity | Extends: SensorBase

public class SensorKill extends SensorBase

## Fields

- protected final int targetSlot
- protected final PositionProvider positionProvider
- NPCEntity npcComponent
- DamageData damageData
- Ref<EntityStore> targetRef
- Vector3d killPosition

## Constructors

- public SensorKill(@Nonnull BuilderSensorKill builder, @Nonnull BuilderSupport support)

## Methods

- public boolean matches(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store)
- public InfoProvider getSensorInfo()

Also in this package: ActionBeacon, ActionIgnoreForAvoidance, ActionNotify, ActionOverrideAttitude, ActionReleaseTarget, ActionSetMarkedTarget, ActionSetStat, HeadMotionWatch, SensorBeacon, SensorCount, SensorEntity, SensorEntityBase, SensorPlayer, SensorSelf, SensorTarget

Complete API:
  public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public InfoProvider getSensorInfo()

Fields:
protected final int targetSlot
protected final PositionProvider positionProvider
