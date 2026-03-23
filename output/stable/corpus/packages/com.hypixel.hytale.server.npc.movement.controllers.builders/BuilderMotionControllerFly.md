# BuilderMotionControllerFly

Type: class | Package: com.hypixel.hytale.server.npc.movement.controllers.builders | Extends: BuilderMotionControllerBase

public class BuilderMotionControllerFly extends BuilderMotionControllerBase

## Fields

- private double minAirSpeed
- private double maxClimbSpeed
- private double maxSinkSpeed
- private double maxSinkSpeedFluid
- private double maxFallSpeed
- private float maxClimbAngle
- private float maxSinkAngle
- private double acceleration
- private double deceleration
- private double gravity
- private float maxTurnSpeed
- private float maxRollAngle
- private float maxRollSpeed
- private float rollDamping
- private final DoubleHolder minHeightOverGround
- private final DoubleHolder maxHeightOverGround
- private double fastFlyThreshold
- private boolean autoLevel
- private double desiredAltitudeWeight

## Methods

- public MotionControllerFly build(@Nonnull BuilderSupport builderSupport)
- return new MotionControllerFly(builderSupport, this)
- public String getShortDescription()
- public String getLongDescription()
- public BuilderDescriptorState getBuilderDescriptorState()
- public BuilderMotionControllerFly readConfig(@Nonnull JsonElement data)
- public double getMinAirSpeed()
- public double getMaxClimbSpeed()
- public double getMaxSinkSpeed()
- public double getMaxFallSpeed()
- public double getMaxSinkSpeedFluid()
- public float getMaxClimbAngle()
- public float getMaxSinkAngle()
- public double getAcceleration()
- public double getDeceleration()
- public double getGravity()
- public float getMaxTurnSpeed()
- public float getMaxRollAngle()
- public float getMaxRollSpeed()
- public float getRollDamping()
- public double getMinHeightOverGround(BuilderSupport support)
- public double getMaxHeightOverGround(BuilderSupport support)
- public double getFastFlyThreshold()
- public boolean isAutoLevel()
- public double getDesiredAltitudeWeight()
- public Class<MotionController> category()
- public String getType()
- public SpawnTestResult canSpawn(@Nonnull SpawningContext context)
- public Class<? extends MotionController> getClassType()

## Related Types

- BuilderMotionControllerBase

Also in this package: BuilderMotionControllerBase, BuilderMotionControllerDive, BuilderMotionControllerMap, BuilderMotionControllerWalk

Complete API:
  public MotionControllerFly build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderMotionControllerFly readConfig(JsonElement data)
  public double getMinAirSpeed()
  public double getMaxClimbSpeed()
  public double getMaxSinkSpeed()
  public double getMaxFallSpeed()
  public double getMaxSinkSpeedFluid()
  public float getMaxClimbAngle()
  public float getMaxSinkAngle()
  public double getAcceleration()
  public double getDeceleration()
  public double getGravity()
  public float getMaxTurnSpeed()
  public float getMaxRollAngle()
  public float getMaxRollSpeed()
  public float getRollDamping()
  public double getMinHeightOverGround(BuilderSupport support)
  public double getMaxHeightOverGround(BuilderSupport support)
  public double getFastFlyThreshold()
  public boolean isAutoLevel()
  public double getDesiredAltitudeWeight()
  public Class<MotionController> category()
  public String getType()
  public SpawnTestResult canSpawn(SpawningContext context)
  public Class<? extends MotionController> getClassType()

Fields:
private double minAirSpeed
private double maxClimbSpeed
private double maxSinkSpeed
private double maxSinkSpeedFluid
private double maxFallSpeed
private float maxClimbAngle
private float maxSinkAngle
private double acceleration
private double deceleration
private double gravity
private float maxTurnSpeed
private float maxRollAngle
private float maxRollSpeed
private float rollDamping
private final DoubleHolder minHeightOverGround
private final DoubleHolder maxHeightOverGround
private double fastFlyThreshold
private boolean autoLevel
private double desiredAltitudeWeight
