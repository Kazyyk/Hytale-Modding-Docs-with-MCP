# MovementConfig

Type: class | Package: com.hypixel.hytale.server.core.entity.entities.player.movement | Implements: JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, MovementConfig>>, NetworkSerializable<MovementSettings>

public class MovementConfig implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, MovementConfig>>, NetworkSerializable<MovementSettings>

JSON-configured movement parameter set supporting inheritance. Defines velocity resistance, jump force, walk/sprint/crouch/swim speeds, gravity, and fly speed. Serializable to `MovementSettings` for network transmission.

Also in this package: MovementManager

Complete API:
  public static AssetStore<String,MovementConfig,IndexedLookupTableAssetMap<String,MovementConfig>> getAssetStore()
  public static IndexedLookupTableAssetMap<String,MovementConfig> getAssetMap()
  public String getId()
  public AssetExtraInfo.Data getExtraData()
  public float getVelocityResistance()
  public float getJumpForce()
  public float getSwimJumpForce()
  public float getJumpBufferDuration()
  public float getJumpBufferMaxYVelocity()
  public float getAcceleration()
  public float getAirDragMin()
  public float getAirDragMax()
  public float getAirDragMinSpeed()
  public float getAirDragMaxSpeed()
  public float getAirFrictionMin()
  public float getAirFrictionMax()
  public float getAirFrictionMinSpeed()
  public float getAirFrictionMaxSpeed()
  public float getAirSpeedMultiplier()
  public float getAirControlMinSpeed()
  public float getAirControlMaxSpeed()
  public float getAirControlMinMultiplier()
  public float getAirControlMaxMultiplier()
  public float getComboAirSpeedMultiplier()
  public float getBaseSpeed()
  public float getClimbSpeed()
  public float getClimbSpeedLateral()
  public float getClimbUpSprintSpeed()
  public float getClimbDownSprintSpeed()
  public float getHorizontalFlySpeed()
  public float getVerticalFlySpeed()
  public float getMaxSpeedMultiplier()
  public float getMinSpeedMultiplier()
  public float getWishDirectionGravityX()
  public float getWishDirectionGravityY()
  public float getWishDirectionWeightX()
  public float getWishDirectionWeightY()
  public float getCollisionExpulsionForce()
  public float getForwardWalkSpeedMultiplier()
  public float getBackwardWalkSpeedMultiplier()
  public float getStrafeWalkSpeedMultiplier()
  public float getForwardRunSpeedMultiplier()
  public float getBackwardRunSpeedMultiplier()
  public float getStrafeRunSpeedMultiplier()
  public float getForwardCrouchSpeedMultiplier()
  public float getBackwardCrouchSpeedMultiplier()
  public float getStrafeCrouchSpeedMultiplier()
  public float getForwardSprintSpeedMultiplier()
  public float getVariableJumpFallForce()
  public float getFallEffectDuration()
  public float getFallJumpForce()
  public float getFallMomentumLoss()
  public float getAutoJumpObstacleSpeedLoss()
  public float getAutoJumpObstacleSprintSpeedLoss()
  public float getAutoJumpObstacleEffectDuration()
  public float getAutoJumpObstacleSprintEffectDuration()
  public float getAutoJumpObstacleMaxAngle()
  public boolean isAutoJumpDisableJumping()
  public float getMinFallSpeedToEngageRoll()
  public float getMaxFallSpeedToEngageRoll()
  public float getFallDamagePartialMitigationPercent()
  public float getMaxFallSpeedRollFullMitigation()
  public float getRollStartSpeedModifier()
  public float getRollExitSpeedModifier()
  public float getRollTimeToComplete()
  public MovementSettings toPacket()
  public String toString()

Fields:
public static final AssetBuilderCodec<String,MovementConfig> CODEC
public static final ValidatorCache<String> VALIDATOR_CACHE
private static AssetStore<String,MovementConfig,IndexedLookupTableAssetMap<String,MovementConfig>> ASSET_STORE
public static final int DEFAULT_INDEX
public static final String DEFAULT_ID
public static final MovementConfig DEFAULT_MOVEMENT
protected AssetExtraInfo.Data extraData
protected String id
protected float velocityResistance
protected float jumpForce
protected float swimJumpForce
protected float jumpBufferDuration
protected float jumpBufferMaxYVelocity
protected float acceleration
protected float airDragMin
protected float airDragMax
protected float airDragMinSpeed
protected float airDragMaxSpeed
protected float airFrictionMin
protected float airFrictionMax
protected float airFrictionMinSpeed
protected float airFrictionMaxSpeed
protected float airSpeedMultiplier
protected float airControlMinSpeed
protected float airControlMaxSpeed
protected float airControlMinMultiplier
protected float airControlMaxMultiplier
protected float comboAirSpeedMultiplier
protected float baseSpeed
protected float climbSpeed
protected float climbSpeedLateral
protected float climbUpSprintSpeed
protected float climbDownSprintSpeed
protected float horizontalFlySpeed
protected float verticalFlySpeed
protected float maxSpeedMultiplier
protected float minSpeedMultiplier
protected float wishDirectionGravityX
protected float wishDirectionGravityY
protected float wishDirectionWeightX
protected float wishDirectionWeightY
protected float collisionExpulsionForce
protected float forwardWalkSpeedMultiplier
protected float backwardWalkSpeedMultiplier
protected float strafeWalkSpeedMultiplier
protected float forwardRunSpeedMultiplier
protected float backwardRunSpeedMultiplier
protected float strafeRunSpeedMultiplier
protected float forwardCrouchSpeedMultiplier
protected float backwardCrouchSpeedMultiplier
protected float strafeCrouchSpeedMultiplier
protected float forwardSprintSpeedMultiplier
protected float variableJumpFallForce
protected float fallEffectDuration
protected float fallJumpForce
protected float fallMomentumLoss
protected float autoJumpObstacleSpeedLoss
protected float autoJumpObstacleSprintSpeedLoss
protected float autoJumpObstacleEffectDuration
protected float autoJumpObstacleSprintEffectDuration
protected float autoJumpObstacleMaxAngle
protected boolean autoJumpDisableJumping
protected float minSlideEntrySpeed
protected float slideExitSpeed
protected float minFallSpeedToEngageRoll
protected float maxFallSpeedToEngageRoll
protected float fallDamagePartialMitigationPercent
protected float maxFallSpeedRollFullMitigation
protected float rollStartSpeedModifier
protected float rollExitSpeedModifier
protected float rollTimeToComplete
