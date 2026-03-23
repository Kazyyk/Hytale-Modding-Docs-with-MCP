# BodyMotionFlock

Type: class | Package: com.hypixel.hytale.server.flock.corecomponents | Extends: BodyMotionBase

public class BodyMotionFlock extends BodyMotionBase

## Fields

- private static final ComponentType<EntityStore, FlockMembership> FLOCK_MEMBERSHIP_COMPONENT_TYPE
- private static final ComponentType<EntityStore, TransformComponent> TRANSFORM_COMPONENT_TYPE
- private static final ComponentType<EntityStore, EntityGroup> ENTITY_GROUP_COMPONENT_TYPE
- protected final GroupSteeringAccumulator groupSteeringAccumulator

## Methods

- @Override public boolean computeSteering( @Nonnull Ref<EntityStore> ref, @Nonnull Role role, @Nullable InfoProvider sensorInfo, double dt, @Nonnull Steering desiredSteering, @Nonnull ComponentAccessor<EntityStore> componentAccessor )

Also in this package: ActionFlockBeacon, ActionFlockJoin, ActionFlockLeave, ActionFlockSetTarget, ActionFlockState, EntityFilterFlock, SensorFlockCombatDamage, SensorFlockLeader, SensorInflictedDamage, Target

Complete API:
  public boolean computeSteering(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Steering desiredSteering, ComponentAccessor<EntityStore> componentAccessor)

Fields:
private static final ComponentType<EntityStore,FlockMembership> FLOCK_MEMBERSHIP_COMPONENT_TYPE
private static final ComponentType<EntityStore,TransformComponent> TRANSFORM_COMPONENT_TYPE
private static final ComponentType<EntityStore,EntityGroup> ENTITY_GROUP_COMPONENT_TYPE
protected final GroupSteeringAccumulator groupSteeringAccumulator
