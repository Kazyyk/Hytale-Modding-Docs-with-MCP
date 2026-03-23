# HeadMotionAim

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.combat | Extends: HeadMotionBase | Implements: DebugSupport.DebugFlagsChangeListener

public class HeadMotionAim extends HeadMotionBase implements DebugSupport.DebugFlagsChangeListener

Head motion that aims the NPC head toward a target with debug visualization support.

Also in this package: ActionApplyEntityEffect, ActionAttack, AttackType, BallisticMode, BodyMotionAimCharge, SensorDamage, SensorIsBackingAway

Complete API:
  public void preComputeSteering(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, Store<EntityStore> store)
  public void activate(Ref<EntityStore> ref, Role role, ComponentAccessor<EntityStore> componentAccessor)
  public boolean computeSteering(Ref<EntityStore> ref, Role support, InfoProvider sensorInfo, double dt, Steering desiredSteering, ComponentAccessor<EntityStore> componentAccessor)
  public void registerWithSupport(Role role)
  public void onDebugFlagsChanged(EnumSet<RoleDebugFlags> newFlags)

Fields:
public static final double MIN_RANGED_AIMING_DISTANCE
protected static final ComponentType<EntityStore,TransformComponent> TRANSFORM_COMPONENT_TYPE
protected static final ComponentType<EntityStore,BoundingBox> BOUNDING_BOX_COMPONENT_TYPE
protected final double spread
protected final boolean deflection
protected final double hitProbability
protected final double relativeTurnSpeed
protected final AimingData aimingData
protected Ref<EntityStore> lastTargetReference
protected boolean debugAiming
protected final Vector3d startPosition
protected final Vector3d startOffset
protected final Vector3d targetPosition
protected final Vector3d targetOffset
protected final Vector3d relativeVelocity
protected final Vector3d spreadOffset
