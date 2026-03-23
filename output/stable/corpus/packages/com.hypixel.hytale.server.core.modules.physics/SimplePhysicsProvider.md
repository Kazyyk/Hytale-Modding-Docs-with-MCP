# SimplePhysicsProvider

Type: class | Package: com.hypixel.hytale.server.core.modules.physics | Extends: java.lang.Object

public class SimplePhysicsProvider

Provides simplified physics simulation for entities that do not require full rigid-body physics. Handles basic gravity, velocity integration, ground detection, and collision response against the block world. Used for projectiles, dropped items, and other lightweight physics objects.

Also in this package: ROTATION_MODE, RestingSupport, STATE

Complete API:
  public void setImpacted(boolean impacted)
  public boolean isImpacted()
  public void setResting(boolean resting)
  public boolean isResting()
  public IBlockCollisionConsumer.Result onCollision(int blockX, int blockY, int blockZ, Vector3d direction, BlockContactData contactData, BlockData blockData, Box collider)
  public IBlockCollisionConsumer.Result probeCollisionDamage(int blockX, int blockY, int blockZ, Vector3d direction, BlockContactData collisionData, BlockData blockData)
  public void onCollisionDamage(int blockX, int blockY, int blockZ, Vector3d direction, BlockContactData collisionData, BlockData blockData)
  public IBlockCollisionConsumer.Result onCollisionSliceFinished()
  public void onCollisionFinished()
  public Entity tick(double dt, Velocity entityVelocity, World entityWorld, TransformComponent entityTransform, Ref<EntityStore> selfRef, ComponentAccessor<EntityStore> componentAccessor)
  protected void finishTick(TransformComponent position, Velocity velocity)
  protected void rotateBody(double dt, Vector3f bodyRotation)
  public boolean isOnGround()
  public boolean isSwimming()
  public static void computeReflectedVector(Vector3d vec, Vector3d normal, Vector3d result)
  public boolean isProvidingCharacterCollisions()
  public void setProvideCharacterCollisions(boolean provideCharacterCollisions)
  public void setGravity(double gravity, BoundingBox boundingBox)
  public void setBounciness(double bounciness)
  public void setTerminalVelocities(double terminalVelocityAir, double terminalVelocityWater, BoundingBox boundingBox)
  public void setTerminalVelocities(double terminalVelocity1, double density1, double terminalVelocity2, double density2, BoundingBox boundingBox)
  public SimplePhysicsProvider setImpactSlowdown(double impactSlowdown)
  public void setSticksVertically(boolean sticksVertically)
  public boolean isComputeYaw()
  public void setComputeYaw(boolean computeYaw)
  public boolean isComputePitch()
  public void setComputePitch(boolean computePitch)
  public void setCreatorId(UUID creatorUuid)
  public void initialize(Projectile projectile, BoundingBox boundingBox)
  public Vector3d getVelocity()
  public void addVelocity(float x, float y, float z)
  public void setVelocity(Vector3d velocity)
  public void setMoveOutOfSolid(boolean moveOutOfSolid)
  public void setMoveOutOfSolid(double speed)
  protected double getDragCoefficient(double density)
  protected void recomputeDragFactors(BoundingBox boundingBoxComponent)

Fields:
protected static final double HIT_WATER_IMPULSE_LOSS
protected static final double ROTATION_FORCE
protected static final float SPEED_ROTATION_FACTOR
protected static final double SWIMMING_DAMPING_FACTOR
protected static final double DEFAULT_MOVE_OUT_OF_SOLID_SPEED
protected static final int WATER_DETECTION_EXTREMA_COUNT
protected static final HytaleLogger LOGGER
protected final BlockCollisionProvider blockCollisionProvider
protected final EntityCollisionProvider entityCollisionProvider
protected final BlockTracker triggerTracker
protected final RestingSupport restingSupport
protected World world
protected final Vector3d velocity
protected final Vector3d position
protected final Vector3d movement
protected boolean bounced
protected boolean onGround
protected boolean provideCharacterCollisions
protected double gravity
protected double bounciness
protected boolean sticksVertically
protected boolean computeYaw
protected boolean computePitch
protected SimplePhysicsProvider.ROTATION_MODE rotationMode
protected UUID creatorUuid
protected static final double minBounceEpsilon
protected static final double minBounceEpsilonSquared
protected final Vector3d tempVector
protected BiConsumer<Vector3d,ComponentAccessor<EntityStore>> bounceConsumer
protected QuadConsumer<Ref<EntityStore>,Vector3d,Ref<EntityStore>,ComponentAccessor<EntityStore>> impactConsumer
protected double moveOutOfSolidSpeed
protected boolean movedInsideSolid
protected final Vector3d moveOutOfSolidVelocity
protected final Vector3d contactPosition
protected final Vector3d contactNormal
protected double collisionStart
protected final PhysicsBodyStateUpdater stateUpdater
protected final PhysicsBodyState stateBefore
protected final PhysicsBodyState stateAfter
protected double displacedMass
protected double subSurfaceVolume
protected double enterFluid
protected double leaveFluid
protected boolean inFluid
protected int velocityExtremaCount
protected SimplePhysicsProvider.STATE state
protected ForceProviderEntity forceProviderEntity
protected ForceProvider[] forceProviders
protected final ForceProviderStandardState forceProviderStandardState
protected double terminalVelocity1
protected double density1
protected double terminalVelocity2
protected double density2
protected double dragMultiplier
protected double dragOffset
protected final BlockTracker fluidTracker
protected double hitWaterImpulseLoss
protected double rotationForce
protected float speedRotationFactor
protected double swimmingDampingFactor
protected BoundingBox boundingBox
