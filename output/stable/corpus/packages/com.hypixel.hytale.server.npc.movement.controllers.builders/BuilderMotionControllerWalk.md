# BuilderMotionControllerWalk

Type: class | Package: com.hypixel.hytale.server.npc.movement.controllers.builders | Extends: BuilderMotionControllerBase

public class BuilderMotionControllerWalk extends BuilderMotionControllerBase

## Fields

- private static final double[] DEFAULT_JUMP_RANGE
- private double minHorizontalSpeed
- private double maxVerticalSpeed
- private final DoubleHolder acceleration
- private double gravity
- private final DoubleHolder maxRotationSpeed
- private final FloatHolder maxMoveTurnAngle
- private final FloatHolder blendRestTurnAngle
- private final DoubleHolder blendRestRelativeSpeed
- private final DoubleHolder maxClimbHeight
- private final DoubleHolder jumpHeight
- private final DoubleHolder jumpForce
- private final DoubleHolder jumpDescentSteepness
- private final DoubleHolder minJumpHeight
- private final DoubleHolder minJumpDistance
- private final DoubleHolder jumpBlending
- private final DoubleHolder jumpDescentBlending
- private final DoubleHolder climbSpeedMult
- private final DoubleHolder climbSpeedPow
- private final DoubleHolder climbSpeedConst
- private final DoubleHolder minDescentAnimationHeight
- private final DoubleHolder descendFlatness
- private final DoubleHolder descendSpeedCompensation
- private final DoubleHolder descentSteepness
- private final DoubleHolder descentBlending
- private final DoubleHolder maxDropHeight
- private double maxVerticalSpeedFluid
- private final NumberArrayHolder jumpRange
- private double minHover
- private double maxHover
- private double minHoverClimb
- private double minHoverDrop
- private boolean floatsDown
- private float hoverFreq
- private double maxWalkSpeedAfterHitMultiplier
- private String fenceBlockSet
- private final EnumHolder<MotionControllerWalk.DescentAnimationType> descentAnimationType
- private final EnumHolder<MotionControllerWalk.AscentAnimationType> ascentAnimationType
- int index

## Methods

- public MotionControllerWalk build(@Nonnull BuilderSupport builderSupport)
- return new MotionControllerWalk(this, builderSupport)
- public String getShortDescription()
- public String getLongDescription()
- public BuilderDescriptorState getBuilderDescriptorState()
- public BuilderMotionControllerWalk readConfig(@Nonnull JsonElement data)
- public Class<MotionController> category()
- public double getMinHorizontalSpeed()
- public double getAcceleration(@Nonnull BuilderSupport builderSupport)
- public double getMaxVerticalSpeed()
- public double getMaxVerticalSpeedFluid()
- public double getGravity()
- public float getMaxMoveTurnAngle(@Nonnull BuilderSupport builderSupport)
- public double getMaxRotationSpeed(@Nonnull BuilderSupport builderSupport)
- public float getBlendRestTurnAngle(@Nonnull BuilderSupport builderSupport)
- public double getBlendRestRelativeSpeed(@Nonnull BuilderSupport builderSupport)
- public double getMaxClimbHeight(@Nonnull BuilderSupport support)
- public double getClimbSpeedMult(BuilderSupport support)
- public double getClimbSpeedPow(BuilderSupport support)
- public double getClimbSpeedConst(BuilderSupport support)
- public double getDescendForwardAmount(@Nonnull BuilderSupport builderSupport)
- public double getDescendSpeedCompensation(@Nonnull BuilderSupport builderSupport)
- public double getMaxDropHeight(@Nonnull BuilderSupport support)
- public int getFenceBlockSet()
- throw new IllegalArgumentException("Unknown key! " + this.fenceBlockSet)
- public double getMinHover()
- public double getMaxHover()
- public float getHoverFreq()
- public double getMinHoverClimb()
- public double getMinHoverDrop()
- public boolean isFloatsDown()
- public double getMaxWalkSpeedAfterHitMultiplier()
- public double getJumpHeight(@Nonnull BuilderSupport support)
- public double getMinJumpHeight(@Nonnull BuilderSupport support)
- public double getMinJumpDistance(@Nonnull BuilderSupport support)
- public double getJumpForce(@Nonnull BuilderSupport support)
- public double getJumpDescentSteepness(@Nonnull BuilderSupport support)
- public double getJumpBlending(@Nonnull BuilderSupport support)
- public double getJumpDescentBlending(@Nonnull BuilderSupport support)
- public MotionControllerWalk.DescentAnimationType getDescentAnimationType(BuilderSupport support)
- public MotionControllerWalk.AscentAnimationType getAscentAnimationType(BuilderSupport support)
- public double getDescentSteepness(@Nonnull BuilderSupport support)
- public double getDescentBlending(@Nonnull BuilderSupport support)
- public double getMinDescentAnimationHeight(@Nonnull BuilderSupport support)
- public double[] getJumpRange(@Nonnull BuilderSupport support)
- public SpawnTestResult canSpawn(@Nonnull SpawningContext context)
- public Class<? extends MotionController> getClassType()

## Related Types

- BuilderMotionControllerBase

Also in this package: BuilderMotionControllerBase, BuilderMotionControllerDive, BuilderMotionControllerFly, BuilderMotionControllerMap

Complete API:
  public MotionControllerWalk build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderMotionControllerWalk readConfig(JsonElement data)
  public Class<MotionController> category()
  public double getMinHorizontalSpeed()
  public double getAcceleration(BuilderSupport builderSupport)
  public double getMaxVerticalSpeed()
  public double getMaxVerticalSpeedFluid()
  public double getGravity()
  public float getMaxMoveTurnAngle(BuilderSupport builderSupport)
  public double getMaxRotationSpeed(BuilderSupport builderSupport)
  public float getBlendRestTurnAngle(BuilderSupport builderSupport)
  public double getBlendRestRelativeSpeed(BuilderSupport builderSupport)
  public double getMaxClimbHeight(BuilderSupport support)
  public double getClimbSpeedMult(BuilderSupport support)
  public double getClimbSpeedPow(BuilderSupport support)
  public double getClimbSpeedConst(BuilderSupport support)
  public double getDescendForwardAmount(BuilderSupport builderSupport)
  public double getDescendSpeedCompensation(BuilderSupport builderSupport)
  public double getMaxDropHeight(BuilderSupport support)
  public int getFenceBlockSet()
  public double getMinHover()
  public double getMaxHover()
  public float getHoverFreq()
  public double getMinHoverClimb()
  public double getMinHoverDrop()
  public boolean isFloatsDown()
  public double getMaxWalkSpeedAfterHitMultiplier()
  public double getJumpHeight(BuilderSupport support)
  public double getMinJumpHeight(BuilderSupport support)
  public double getMinJumpDistance(BuilderSupport support)
  public double getJumpForce(BuilderSupport support)
  public double getJumpDescentSteepness(BuilderSupport support)
  public double getJumpBlending(BuilderSupport support)
  public double getJumpDescentBlending(BuilderSupport support)
  public MotionControllerWalk.DescentAnimationType getDescentAnimationType(BuilderSupport support)
  public MotionControllerWalk.AscentAnimationType getAscentAnimationType(BuilderSupport support)
  public double getDescentSteepness(BuilderSupport support)
  public double getDescentBlending(BuilderSupport support)
  public double getMinDescentAnimationHeight(BuilderSupport support)
  public double[] getJumpRange(BuilderSupport support)
  public SpawnTestResult canSpawn(SpawningContext context)
  public Class<? extends MotionController> getClassType()

Fields:
private static final double[] DEFAULT_JUMP_RANGE
private double minHorizontalSpeed
private double maxVerticalSpeed
private final DoubleHolder acceleration
private double gravity
private final DoubleHolder maxRotationSpeed
private final FloatHolder maxMoveTurnAngle
private final FloatHolder blendRestTurnAngle
private final DoubleHolder blendRestRelativeSpeed
private final DoubleHolder maxClimbHeight
private final DoubleHolder jumpHeight
private final DoubleHolder jumpForce
private final DoubleHolder jumpDescentSteepness
private final DoubleHolder minJumpHeight
private final DoubleHolder minJumpDistance
private final DoubleHolder jumpBlending
private final DoubleHolder jumpDescentBlending
private final DoubleHolder climbSpeedMult
private final DoubleHolder climbSpeedPow
private final DoubleHolder climbSpeedConst
private final DoubleHolder minDescentAnimationHeight
private final DoubleHolder descendFlatness
private final DoubleHolder descendSpeedCompensation
private final DoubleHolder descentSteepness
private final DoubleHolder descentBlending
private final DoubleHolder maxDropHeight
private double maxVerticalSpeedFluid
private final NumberArrayHolder jumpRange
private double minHover
private double maxHover
private double minHoverClimb
private double minHoverDrop
private boolean floatsDown
private float hoverFreq
private double maxWalkSpeedAfterHitMultiplier
private String fenceBlockSet
private final EnumHolder<MotionControllerWalk.DescentAnimationType> descentAnimationType
private final EnumHolder<MotionControllerWalk.AscentAnimationType> ascentAnimationType
