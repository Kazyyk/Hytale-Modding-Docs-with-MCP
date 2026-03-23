# BuilderMotionControllerDive

Type: class | Package: com.hypixel.hytale.server.npc.movement.controllers.builders | Extends: BuilderMotionControllerBase

public class BuilderMotionControllerDive extends BuilderMotionControllerBase

## Fields

- private double minHorizontalSpeed
- private double maxVerticalSpeed
- private double acceleration
- private double gravity
- private double maxFallSpeed
- private double maxSinkSpeed
- private double maxRotationSpeed
- private float maxMoveTurnAngle
- private double minDiveDepth
- private double maxDiveDepth
- private double minWaterDepth
- private double maxWaterDepth
- private double minDepthAboveGround
- private double minDepthBelowSurface
- private double swimDepth
- private double sinkRatio
- private double fastDiveThreshold
- private double desiredDepthWeight
- Model model
- double swimDepth

## Methods

- public String getShortDescription()
- public String getLongDescription()
- public BuilderDescriptorState getBuilderDescriptorState()
- public MotionControllerDive build(@Nonnull BuilderSupport builderSupport)
- return new MotionControllerDive(builderSupport, this)
- public BuilderMotionControllerDive readConfig(@Nonnull JsonElement data)
- public Class<MotionController> category()
- public double getMinHorizontalSpeed()
- public double getAcceleration()
- public double getMaxVerticalSpeed()
- public double getGravity()
- public double getMaxFallSpeed()
- public double getMaxSinkSpeed()
- public float getMaxMoveTurnAngle()
- public double getMaxRotationSpeed()
- public double getMinDiveDepth()
- public double getMaxDiveDepth()
- public double getMinWaterDepth()
- public double getMaxWaterDepth()
- public double getMinDepthAboveGround()
- public double getMinDepthBelowSurface()
- public double getSwimDepth()
- public double getSinkRatio()
- public double getFastDiveThreshold()
- public double getDesiredDepthWeight()
- public SpawnTestResult canSpawn(@Nonnull SpawningContext context)
- public Class<? extends MotionController> getClassType()

## Related Types

- BuilderMotionControllerBase
