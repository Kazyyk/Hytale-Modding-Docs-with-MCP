# StandardPhysicsConfig

Type: class | Package: com.hypixel.hytale.server.core.modules.projectile.config | Implements: PhysicsConfig

public class StandardPhysicsConfig implements PhysicsConfig

Standard physics configuration for projectiles. Controls density, gravity, bounciness, bounce limits, rolling, rotation modes, terminal velocities in air and water, and drag coefficients. Serializable to protocol packets.

## Fields

- public static final BuilderCodec<StandardPhysicsConfig> CODEC
- public static final StandardPhysicsConfig DEFAULT
- protected double density
- protected double gravity
- protected double bounciness
- protected int bounceCount
- protected double bounceLimit
- protected boolean sticksVertically
- protected boolean computeYaw
- protected boolean computePitch
- protected RotationMode rotationMode
- protected boolean allowRolling

## Methods

- public double getGravity()
- public void apply(@Nonnull Holder<EntityStore> holder, @Nullable Ref<EntityStore> creatorRef, @Nonnull Vector3d velocity, @Nonnull ComponentAccessor<EntityStore> componentAccessor, boolean predicted)
- public com.hypixel.hytale.protocol.PhysicsConfig toPacket()
- public double getBounciness()
- public int getBounceCount()
- public double getBounceLimit()
- public boolean isSticksVertically()
- public boolean isAllowRolling()
- public double getRollingFrictionFactor()
- public double getSwimmingDampingFactor()
- public double getHitWaterImpulseLoss()

Also in this package: BallisticData, BallisticDataProvider, BounceConsumer, ImpactConsumer, PhysicsConfig, ProjectileConfig, ProjectileConfigPacketGenerator, STATE, StandardPhysicsProvider

Complete API:
  public double getGravity()
  public void apply(Holder<EntityStore> holder, Ref<EntityStore> creatorRef, Vector3d velocity, ComponentAccessor<EntityStore> componentAccessor, boolean predicted)
  public com.hypixel.hytale.protocol.PhysicsConfig toPacket()
  public double getBounciness()
  public int getBounceCount()
  public double getBounceLimit()
  public boolean isSticksVertically()
  public boolean isAllowRolling()
  public double getRollingFrictionFactor()
  public double getSwimmingDampingFactor()
  public double getHitWaterImpulseLoss()

Fields:
public static final BuilderCodec<StandardPhysicsConfig> CODEC
public static final StandardPhysicsConfig DEFAULT
protected static final double HIT_WATER_IMPULSE_LOSS
protected static final double ROTATION_FORCE
protected static final float SPEED_ROTATION_FACTOR
protected static final double SWIMMING_DAMPING_FACTOR
protected double density
protected double gravity
protected double bounciness
protected int bounceCount
protected double bounceLimit
protected boolean sticksVertically
protected boolean computeYaw
protected boolean computePitch
protected RotationMode rotationMode
protected boolean allowRolling
protected double rollingFrictionFactor
protected float rollingSpeed
protected double moveOutOfSolidSpeed
protected double terminalVelocityAir
protected double densityAir
protected double terminalVelocityWater
protected double densityWater
protected double hitWaterImpulseLoss
protected double rotationForce
protected float speedRotationFactor
protected double swimmingDampingFactor
