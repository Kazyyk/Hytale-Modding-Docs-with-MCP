# StandardPhysicsProvider

Type: class | Package: com.hypixel.hytale.server.core.modules.projectile.config | Implements: IBlockCollisionConsumer, Component<EntityStore>

public class StandardPhysicsProvider implements IBlockCollisionConsumer, Component<EntityStore>

Runtime physics provider component for projectiles using standard physics. Manages per-tick physics simulation including block collision handling, fluid interaction, bounce/impact consumers, body rotation, and sliding behavior. Attached to projectile entities when `StandardPhysicsConfig.apply()` is called.

## Fields

- public static final int WATER_DETECTION_EXTREMA_COUNT
- public static final double MIN_BOUNCE_EPSILON

## Methods

- public static ComponentType<EntityStore, StandardPhysicsProvider> getComponentType()
- public IBlockCollisionConsumer.Result onCollision(int blockX, int blockY, int blockZ, @Nonnull Vector3d direction, @Nonnull BlockContactData contactData, @Nonnull BlockData blockData, @Nonnull Box collider)
- public void finishTick(@Nonnull TransformComponent position, @Nonnull Velocity velocity)
- public void rotateBody(double dt, @Nonnull Vector3f bodyRotation)
- public boolean isOnGround()
- public boolean isSwimming()
- public StandardPhysicsProvider.STATE getState()
- public void setState(@Nonnull StandardPhysicsProvider.STATE state)
- public Component<EntityStore> clone()

## Inner Types

- StandardPhysicsProvider.STATE -- lifecycle state enum (ACTIVE, RESTING, INACTIVE)

Also in this package: BallisticData, BallisticDataProvider, BounceConsumer, ImpactConsumer, PhysicsConfig, ProjectileConfig, ProjectileConfigPacketGenerator, STATE, StandardPhysicsConfig

Complete API:
  public static ComponentType<EntityStore,StandardPhysicsProvider> getComponentType()
  public IBlockCollisionConsumer.Result onCollision(int blockX, int blockY, int blockZ, Vector3d direction, BlockContactData contactData, BlockData blockData, Box collider)
  public IBlockCollisionConsumer.Result probeCollisionDamage(int blockX, int blockY, int blockZ, Vector3d direction, BlockContactData collisionData, BlockData blockData)
  public void onCollisionDamage(int blockX, int blockY, int blockZ, Vector3d direction, BlockContactData collisionData, BlockData blockData)
  public IBlockCollisionConsumer.Result onCollisionSliceFinished()
  public void onCollisionFinished()
  public void finishTick(TransformComponent position, Velocity velocity)
  public void rotateBody(double dt, Vector3f bodyRotation)
  public boolean isOnGround()
  public boolean isSwimming()
  public double getDragCoefficient(double density)
  protected void recomputeDragFactors(BoundingBox boundingBoxComponent)
  public StandardPhysicsProvider.STATE getState()
  public void setState(StandardPhysicsProvider.STATE state)
  public StandardPhysicsConfig getPhysicsConfig()
  public ForceProviderStandardState getForceProviderStandardState()
  public RestingSupport getRestingSupport()
  public void setWorld(World world)
  public Vector3d getPosition()
  public Vector3d getVelocity()
  public Vector3d getMovement()
  public Vector3d getNextMovement()
  public ForceProviderEntity getForceProviderEntity()
  public ForceProvider[] getForceProviders()
  public PhysicsBodyStateUpdater getStateUpdater()
  public PhysicsBodyState getStateBefore()
  public PhysicsBodyState getStateAfter()
  public boolean isProvidesCharacterCollisions()
  public UUID getCreatorUuid()
  public EntityRefCollisionProvider getEntityCollisionProvider()
  public boolean isBounced()
  public void setBounced(boolean bounced)
  public int getBounces()
  public void incrementBounces()
  public Vector3d getMoveOutOfSolidVelocity()
  public boolean isMovedInsideSolid()
  public void setMovedInsideSolid(boolean movedInsideSolid)
  public double getDisplacedMass()
  public void setDisplacedMass(double displacedMass)
  public double getSubSurfaceVolume()
  public void setSubSurfaceVolume(double subSurfaceVolume)
  public double getEnterFluid()
  public void setEnterFluid(double enterFluid)
  public double getLeaveFluid()
  public void setLeaveFluid(double leaveFluid)
  public double getCollisionStart()
  public void setCollisionStart(double collisionStart)
  public Vector3d getContactPosition()
  public Vector3d getContactNormal()
  public boolean isSliding()
  public void setSliding(boolean sliding)
  public BlockCollisionProvider getBlockCollisionProvider()
  public BlockTracker getTriggerTracker()
  public BlockTracker getFluidTracker()
  public boolean isInFluid()
  public void setInFluid(boolean inFluid)
  public int getVelocityExtremaCount()
  public void setVelocityExtremaCount(int velocityExtremaCount)
  public void decrementVelocityExtremaCount()
  public void setOnGround(boolean onGround)
  public ImpactConsumer getImpactConsumer()
  public BounceConsumer getBounceConsumer()
  public Component<EntityStore> clone()

Fields:
public static final int WATER_DETECTION_EXTREMA_COUNT
public static final double MIN_BOUNCE_EPSILON
public static final double MIN_BOUNCE_EPSILON_SQUARED
protected static final HytaleLogger LOGGER
protected final BlockCollisionProvider blockCollisionProvider
protected final EntityRefCollisionProvider entityCollisionProvider
protected final BlockTracker triggerTracker
protected final RestingSupport restingSupport
protected World world
protected final Vector3d velocity
protected final Vector3d position
protected final Vector3d movement
protected final Vector3d nextMovement
protected boolean bounced
protected int bounces
protected boolean onGround
protected boolean provideCharacterCollisions
protected final UUID creatorUuid
protected final StandardPhysicsConfig physicsConfig
protected final Vector3d tempVector
protected BounceConsumer bounceConsumer
protected ImpactConsumer impactConsumer
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
protected StandardPhysicsProvider.STATE state
protected ForceProviderEntity forceProviderEntity
protected ForceProvider[] forceProviders
protected final ForceProviderStandardState forceProviderStandardState
protected double dragMultiplier
protected double dragOffset
protected final BlockTracker fluidTracker
protected boolean isSliding
protected BoundingBox boundingBox
