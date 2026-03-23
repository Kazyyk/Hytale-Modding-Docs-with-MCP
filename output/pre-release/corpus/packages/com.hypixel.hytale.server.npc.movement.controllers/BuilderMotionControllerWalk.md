# BuilderMotionControllerWalk

Type: class | Package: com.hypixel.hytale.server.npc.movement.controllers.builders | Extends: BuilderMotionControllerBase

public class BuilderMotionControllerWalk extends BuilderMotionControllerBase

JSON builder for MotionControllerWalk. Reads walking-specific configuration from NPC role JSON and validates relational constraints between parameters.

## JSON Configuration Properties

- MaxWalkSpeed | double | 3.0 | Maximum horizontal speed
- MinWalkSpeed | double | 0.1 | Minimum horizontal speed
- MaxFallSpeed | double | 8.0 | Maximum fall speed
- MaxSinkSpeedFluid | double | 4.0 | Maximum sink speed in fluids
- Gravity | double | 10.0 | Gravity constant
- Acceleration | double | 3.0 | Acceleration rate
- MaxRotationSpeed | double | 360.0 | Maximum rotation speed (degrees/s)
- MaxWalkTurnAngle | float | 90.0 | Max walk turn angle (degrees, 0..180)
- BlendRestTurnAngle | float | 60.0 | Turn angle threshold for speed reduction during heading blend (degrees)
- BlendRestRelativeSpeed | double | 0.2 | Relative speed used during heading blend rest (0..1)
- MaxClimbHeight | double | 1.3 | Maximum climbable height
- JumpHeight | double | 0.5 | Jump height above climb height
- MinJumpHeight | double | 0.6 | Minimum obstacle height to trigger jump
- MinJumpDistance | double | 0.2 | Minimum distance to execute jump
- JumpForce | double | 1.5 | Upward force multiplier
- JumpBlending | double | 1.0 | Ascent curve shape (0=curved, 1=linear)
- JumpDescentBlending | double | 1.0 | Descent curve shape (0=linear, higher=curved)
- JumpDescentSteepness | double | 1.0 | Descent steepness
- AscentAnimationType | enum | Walk | Animation during ascent (Walk, Jump, Climb, Fly, Idle)
- ClimbSpeedMult | double | 0.0 | Climb speed multiplier
- ClimbSpeedPow | double | 1.0 | Climb speed exponent
- ClimbSpeedConst | double | 5.0 | Climb speed constant
- MinDescentAnimationHeight | double | 1.0 | Min drop for descent animation switch
- DescendFlatness | double | 0.7 | Forward movement ratio during descent (0..1)
- DescendSpeedCompensation | double | 0.9 | Speed compensation during descent (0..1)
- DescentAnimationType | enum | Fall | Animation during descent (Walk, Fall, Idle)
- DescentSteepness | double | 1.4 | Descent curve steepness
- DescentBlending | double | 1.8 | Descent curve blending (0=linear, higher=curved)
- MaxDropHeight | double | 3.0 | Maximum safe drop height
- FenceBlockSet | asset | "Fence" | Block set of unclimbable blocks
- JumpRange | double[2] | [0.0, 0.0] | Jump distance range
- MinHover | double | 0.0 | Minimum hover height
- MaxHover | double | 0.0 | Maximum hover height
- MinHoverClimb | double | 0.0 | Min hover when climbing
- MinHoverDrop | double | 0.0 | Min hover when dropping
- FloatsDown | boolean | true | Gentle descent when hovering
- HoverFreq | float | 0.0 | Hover oscillation frequency
- MinHitSlowdown | double | 0.1 | Min speed reduction on hit from behind (0..1)

## Spawn Validation


public SpawnTestResult canSpawn(SpawningContext context)

Requires solid ground (`isOnSolidGround()`) and valid position with material check 20.

## Key Methods

- MotionControllerWalk build(BuilderSupport) | Constructs a `MotionControllerWalk
- Class<? extends MotionController> getClassType() | Returns `MotionControllerWalk.class

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
