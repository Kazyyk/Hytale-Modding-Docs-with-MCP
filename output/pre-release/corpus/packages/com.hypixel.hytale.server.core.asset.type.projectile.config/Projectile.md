# Projectile

Type: class | Package: com.hypixel.hytale.server.core.asset.type.projectile.config | Implements: JsonAssetWithMap<String, DefaultAssetMap<String, Projectile>>, BallisticData

public class Projectile implements JsonAssetWithMap<String, DefaultAssetMap<String, Projectile>>, BallisticData

## Fields

- public static final ValidatorCache<String> VALIDATOR_CACHE
- protected AssetExtraInfo.Data data
- protected String id
- protected String appearance
- protected double radius
- protected double height
- protected double verticalCenterShot
- protected double horizontalCenterShot
- protected double depthShot
- protected boolean pitchAdjustShot
- protected double muzzleVelocity
- protected double terminalVelocity
- protected double gravity
- protected double bounciness
- protected double impactSlowdown
- protected boolean sticksVertically
- protected boolean computeYaw
- protected boolean computePitch
- protected boolean computeRoll
- protected SimplePhysicsProvider.ROTATION_MODE rotationMode
- protected double timeToLive
- protected String bounceSoundEventId
- protected transient int bounceSoundEventIndex
- protected WorldParticle bounceParticles
- protected String hitSoundEventId
- protected transient int hitSoundEventIndex
- protected WorldParticle hitParticles
- protected int damage
- protected double deadTime
- protected String missSoundEventId

## Methods

- public static DefaultAssetMap<String, Projectile> getAssetMap()
- public String getId()
- public String getAppearance()
- public double getRadius()
- public double getHeight()
- @Override public double getVerticalCenterShot()
- @Override public double getHorizontalCenterShot()
- @Override public double getDepthShot()
- @Override public boolean isPitchAdjustShot()
- public boolean isSticksVertically()
- @Override public double getMuzzleVelocity()
- public double getTerminalVelocity()
- @Override public double getGravity()
- public double getBounciness()
- public double getImpactSlowdown()
- public double getTimeToLive()
- public int getDamage()
- public double getDeadTime()
- public double getDeadTimeMiss()
- public String getBounceSoundEventId()
- public int getBounceSoundEventIndex()
- public String getHitSoundEventId()
- public int getHitSoundEventIndex()
- public String getMissSoundEventId()
- public int getMissSoundEventIndex()
- public String getDeathSoundEventId()
- public int getDeathSoundEventIndex()
- @Nullable public WorldParticle getBounceParticles()
- @Nullable public WorldParticle getMissParticles()
- @Nullable public WorldParticle getDeathParticles()
- @Nullable public WorldParticle getHitParticles()
- public boolean isDeathEffectsOnHit()
- public boolean isComputeYaw()
- public boolean isComputePitch()
- public boolean isComputeRoll()
- public SimplePhysicsProvider.ROTATION_MODE getRotationMode()
- public double getDensity()
- public double getWaterTerminalVelocityMultiplier()
- public double getWaterHitImpulseLoss()
- public double getDampingRotation()
- public double getRotationSpeedVelocityRatio()
- public double getSwimmingDampingFactor()
- protected void processConfig()
- @Override public boolean equals(@Nullable Object o)
- @Override public int hashCode()
- @Override @Nonnull public String toString()
- @Nullable public ExplosionConfig getExplosionConfig()

Complete API:
  public static AssetStore<String,Projectile,DefaultAssetMap<String,Projectile>> getAssetStore()
  public static DefaultAssetMap<String,Projectile> getAssetMap()
  public String getId()
  public String getAppearance()
  public double getRadius()
  public double getHeight()
  public double getVerticalCenterShot()
  public double getHorizontalCenterShot()
  public double getDepthShot()
  public boolean isPitchAdjustShot()
  public boolean isSticksVertically()
  public double getMuzzleVelocity()
  public double getTerminalVelocity()
  public double getGravity()
  public double getBounciness()
  public double getImpactSlowdown()
  public double getTimeToLive()
  public int getDamage()
  public double getDeadTime()
  public double getDeadTimeMiss()
  public String getBounceSoundEventId()
  public int getBounceSoundEventIndex()
  public String getHitSoundEventId()
  public int getHitSoundEventIndex()
  public String getMissSoundEventId()
  public int getMissSoundEventIndex()
  public String getDeathSoundEventId()
  public int getDeathSoundEventIndex()
  public WorldParticle getBounceParticles()
  public WorldParticle getMissParticles()
  public WorldParticle getDeathParticles()
  public WorldParticle getHitParticles()
  public boolean isDeathEffectsOnHit()
  public boolean isComputeYaw()
  public boolean isComputePitch()
  public boolean isComputeRoll()
  public SimplePhysicsProvider.ROTATION_MODE getRotationMode()
  public double getDensity()
  public double getWaterTerminalVelocityMultiplier()
  public double getWaterHitImpulseLoss()
  public double getDampingRotation()
  public double getRotationSpeedVelocityRatio()
  public double getSwimmingDampingFactor()
  protected void processConfig()
  public boolean equals(Object o)
  public int hashCode()
  public String toString()
  public ExplosionConfig getExplosionConfig()

Fields:
public static final AssetBuilderCodec<String,Projectile> CODEC
private static AssetStore<String,Projectile,DefaultAssetMap<String,Projectile>> ASSET_STORE
public static final ValidatorCache<String> VALIDATOR_CACHE
protected AssetExtraInfo.Data data
protected String id
protected String appearance
protected double radius
protected double height
protected double verticalCenterShot
protected double horizontalCenterShot
protected double depthShot
protected boolean pitchAdjustShot
protected double muzzleVelocity
protected double terminalVelocity
protected double gravity
protected double bounciness
protected double impactSlowdown
protected boolean sticksVertically
protected boolean computeYaw
protected boolean computePitch
protected boolean computeRoll
protected SimplePhysicsProvider.ROTATION_MODE rotationMode
protected double timeToLive
protected String bounceSoundEventId
protected transient int bounceSoundEventIndex
protected WorldParticle bounceParticles
protected String hitSoundEventId
protected transient int hitSoundEventIndex
protected WorldParticle hitParticles
protected int damage
protected double deadTime
protected String missSoundEventId
protected transient int missSoundEventIndex
protected WorldParticle missParticles
protected double deadTimeMiss
protected String deathSoundEventId
protected transient int deathSoundEventIndex
protected WorldParticle deathParticles
protected boolean deathEffectsOnHit
protected ExplosionConfig explosionConfig
double density
double waterTerminalVelocityMultiplier
double waterHitImpulseLoss
double dampingRotation
double rotationSpeedVelocityRatio
double swimmingDampingFactor
