# SensorSelf

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity | Extends: SensorWithEntityFilters

public class SensorSelf extends SensorWithEntityFilters

## Fields

- protected final PositionProvider positionProvider

## Constructors

- public SensorSelf(@Nonnull BuilderSensorSelf builder, @Nonnull BuilderSupport support)

## Methods

- public boolean matches(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store)
- public InfoProvider getSensorInfo()

Also in this package: ActionBeacon, ActionIgnoreForAvoidance, ActionNotify, ActionOverrideAttitude, ActionReleaseTarget, ActionSetMarkedTarget, ActionSetStat, HeadMotionWatch, SensorBeacon, SensorCount, SensorEntity, SensorEntityBase, SensorKill, SensorPlayer, SensorTarget

Complete API:
  public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public InfoProvider getSensorInfo()

Fields:
protected final PositionProvider positionProvider
