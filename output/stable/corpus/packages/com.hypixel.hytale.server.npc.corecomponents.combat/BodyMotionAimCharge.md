# BodyMotionAimCharge

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.combat | Extends: BodyMotionBase

public class BodyMotionAimCharge extends BodyMotionBase

Body motion that performs an aim-charge sequence for ranged attacks.

Also in this package: ActionApplyEntityEffect, ActionAttack, AttackType, BallisticMode, HeadMotionAim, SensorDamage, SensorIsBackingAway

Complete API:
  public void preComputeSteering(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, Store<EntityStore> store)
  public boolean computeSteering(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Steering desiredSteering, ComponentAccessor<EntityStore> componentAccessor)

Fields:
protected static final ComponentType<EntityStore,TransformComponent> TRANSFORM_COMPONENT_TYPE
protected final double relativeTurnSpeed
protected final AimingData aimingData
protected final Vector3d direction
protected final ProbeMoveData probeMoveData
