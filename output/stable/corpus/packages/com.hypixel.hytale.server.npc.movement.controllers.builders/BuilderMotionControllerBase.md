# BuilderMotionControllerBase

Type: class | Package: com.hypixel.hytale.server.npc.movement.controllers.builders | Extends: BuilderBaseWithType<MotionController>

public abstract class BuilderMotionControllerBase extends BuilderBaseWithType<MotionController>

## Fields

- protected float epsilonAngle
- protected double epsilonSpeed
- protected double forceVelocityDamping
- protected final DoubleHolder maxHorizontalSpeed
- protected final DoubleHolder fastHorizontalThreshold
- protected double fastHorizontalThresholdRange
- protected final FloatHolder maxHeadRotationSpeed
- BuilderInfo builderInfo
- boolean result

## Methods

- public Builder<MotionController> readCommonConfig(@Nonnull JsonElement data)
- public final boolean isEnabled(ExecutionContext context)
- public String getIdentifier()
- public boolean validate(String configName, @Nonnull NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, @Nonnull List<String> errors)
- public float getEpsilonAngle()
- public double getEpsilonSpeed()
- public double getForceVelocityDamping()
- public double getMaxHorizontalSpeed(@Nonnull BuilderSupport builderSupport)
- public float getMaxHeadRotationSpeed(@Nonnull BuilderSupport support)
- public double getFastHorizontalThreshold(@Nonnull BuilderSupport builderSupport)
- public double getFastHorizontalThresholdRange()
- public abstract Class<? extends MotionController> getClassType()

Known subclasses: BuilderMotionControllerDive, BuilderMotionControllerFly, BuilderMotionControllerWalk

Also in this package: BuilderMotionControllerDive, BuilderMotionControllerFly, BuilderMotionControllerMap, BuilderMotionControllerWalk

Complete API:
  public Builder<MotionController> readCommonConfig(JsonElement data)
  public final boolean isEnabled(ExecutionContext context)
  public String getIdentifier()
  public boolean validate(String configName, NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, List<String> errors)
  public float getEpsilonAngle()
  public double getEpsilonSpeed()
  public double getForceVelocityDamping()
  public double getMaxHorizontalSpeed(BuilderSupport builderSupport)
  public float getMaxHeadRotationSpeed(BuilderSupport support)
  public double getFastHorizontalThreshold(BuilderSupport builderSupport)
  public double getFastHorizontalThresholdRange()
  public abstract Class<? extends MotionController> getClassType()

Fields:
protected float epsilonAngle
protected double epsilonSpeed
protected double forceVelocityDamping
protected final DoubleHolder maxHorizontalSpeed
protected final DoubleHolder fastHorizontalThreshold
protected double fastHorizontalThresholdRange
protected final FloatHolder maxHeadRotationSpeed
