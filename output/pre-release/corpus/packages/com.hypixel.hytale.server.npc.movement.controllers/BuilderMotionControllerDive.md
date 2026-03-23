# BuilderMotionControllerDive

Type: class | Package: com.hypixel.hytale.server.npc.movement.controllers.builders | Extends: BuilderMotionControllerBase

public class BuilderMotionControllerDive extends BuilderMotionControllerBase

JSON builder for MotionControllerDive. Reads diving/swimming-specific configuration from NPC role JSON.

## JSON Configuration Properties

- MaxSwimSpeed | double | 3.0 | Maximum horizontal swim speed
- MaxDiveSpeed | double | 8.0 | Maximum vertical speed
- MaxFallSpeed | double | 10.0 | Terminal velocity in air
- MaxSinkSpeed | double | 4.0 | Terminal velocity sinking in water
- Gravity | double | 10.0 | Gravity constant
- Acceleration | double | 3.0 | Acceleration rate
- MaxRotationSpeed | double | 360.0 | Max rotation speed (degrees/s)
- MaxSwimTurnAngle | float | 90.0 | Max swim turn angle (degrees, 0..180)
- FastSwimThreshold | double | 0.6 | Relative speed for fast swim animation (0..1)
- SwimDepth | double | 0.4 | Submersion ratio (-1..1; 0=eye height)
- SinkRatio | double | 1.0 | Vertical movement ratio while wandering
- MinDiveDepth | double | 0.0 | Minimum dive depth below surface
- MaxDiveDepth | double | MAX_VALUE | Maximum dive depth below surface
- MinDepthAboveGround | double | 1.0 | Minimum distance from floor
- MinDepthBelowSurface | double | 1.0 | Minimum distance from surface
- MinWaterDepth | double | 1.0 | Minimum required water depth
- MaxWaterDepth | double | 0.0 | Maximum required water depth
- DesiredDepthWeight | double | 0.0 | Depth preference strength (0..1)

## Spawn Validation


public SpawnTestResult canSpawn(SpawningContext context)

Requires the spawn position to be in water at the configured swim depth (`isInWater(swimDepth)`) and valid position with material check 20.

## Key Methods

- MotionControllerDive build(BuilderSupport) | Constructs a `MotionControllerDive
- Class<? extends MotionController> getClassType() | Returns `MotionControllerDive.class

Also in this package: BuilderMotionControllerBase, BuilderMotionControllerFly, BuilderMotionControllerMap, BuilderMotionControllerWalk

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public MotionControllerDive build(BuilderSupport builderSupport)
  public BuilderMotionControllerDive readConfig(JsonElement data)
  public Class<MotionController> category()
  public double getMinHorizontalSpeed()
  public double getAcceleration()
  public double getMaxVerticalSpeed()
  public double getGravity()
  public double getMaxFallSpeed()
  public double getMaxSinkSpeed()
  public float getMaxMoveTurnAngle()
  public double getMaxRotationSpeed()
  public double getMinDiveDepth()
  public double getMaxDiveDepth()
  public double getMinWaterDepth()
  public double getMaxWaterDepth()
  public double getMinDepthAboveGround()
  public double getMinDepthBelowSurface()
  public double getSwimDepth()
  public double getSinkRatio()
  public double getFastDiveThreshold()
  public double getDesiredDepthWeight()
  public SpawnTestResult canSpawn(SpawningContext context)
  public Class<? extends MotionController> getClassType()

Fields:
private double minHorizontalSpeed
private double maxVerticalSpeed
private double acceleration
private double gravity
private double maxFallSpeed
private double maxSinkSpeed
private double maxRotationSpeed
private float maxMoveTurnAngle
private double minDiveDepth
private double maxDiveDepth
private double minWaterDepth
private double maxWaterDepth
private double minDepthAboveGround
private double minDepthBelowSurface
private double swimDepth
private double sinkRatio
private double fastDiveThreshold
private double desiredDepthWeight
