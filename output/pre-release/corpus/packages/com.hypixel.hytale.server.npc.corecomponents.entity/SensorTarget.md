# SensorTarget

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity | Extends: SensorWithEntityFilters

public class SensorTarget extends SensorWithEntityFilters

## Fields

- protected static final ComponentType<EntityStore, TransformComponent> TRANSFORM_COMPONENT_TYPE
- protected final int targetSlot
- protected final boolean autoUnlockTarget
- protected final double range
- protected final EntityPositionProvider positionProvider
- Ref<EntityStore> target
- TransformComponent transformComponent
- Vector3d position
- TransformComponent targetTransformComponent
- double squaredDistance

## Constructors

- public SensorTarget(@Nonnull BuilderSensorTarget builderSensorTarget, @Nonnull BuilderSupport support)

## Methods

- public boolean matches(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store)
- public InfoProvider getSensorInfo()
- protected boolean fulfilsRequirements(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, @Nonnull Ref<EntityStore> target, @Nonnull Store<EntityStore> store)

Also in this package: ActionBeacon, ActionIgnoreForAvoidance, ActionNotify, ActionOverrideAttitude, ActionReleaseTarget, ActionSetMarkedTarget, ActionSetStat, HeadMotionWatch, SensorBeacon, SensorCount, SensorEntity, SensorEntityBase, SensorKill, SensorPlayer, SensorSelf

Complete API:
  public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public InfoProvider getSensorInfo()
  protected boolean fulfilsRequirements(Ref<EntityStore> ref, Role role, Ref<EntityStore> target, Store<EntityStore> store)

Fields:
protected static final ComponentType<EntityStore,TransformComponent> TRANSFORM_COMPONENT_TYPE
protected final int targetSlot
protected final boolean autoUnlockTarget
protected final double range
protected final EntityPositionProvider positionProvider
