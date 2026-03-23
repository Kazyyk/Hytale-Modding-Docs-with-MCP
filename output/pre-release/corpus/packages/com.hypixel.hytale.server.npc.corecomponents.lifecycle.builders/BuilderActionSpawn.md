# BuilderActionSpawn

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.lifecycle.builders | Extends: BuilderActionBase

public class BuilderActionSpawn extends BuilderActionBase

NPC behavior action builder for ActionSpawn functionality.

## Constants

- public static final double[] DEFAULT_DISTANCE_RANGE
- public static final int[] DEFAULT_COUNT_RANGE
- public static final double[] DEFAULT_DELAY_RANGE

## Fields

- protected final FloatHolder spawnDirection
- protected final FloatHolder spawnAngle
- protected final BooleanHolder fanOut
- protected final NumberArrayHolder distanceRange
- protected final NumberArrayHolder countRange
- protected final NumberArrayHolder delayRange
- protected final StringHolder kind
- protected final AssetHolder flock
- protected final BooleanHolder launchAtTarget
- protected final BooleanHolder pitchHigh
- protected final DoubleHolder spread
- protected final BooleanHolder joinFlock
- protected final StringHolder spawnState
- protected final StringHolder spawnSubState

## Methods

- @Nonnull public ActionSpawn build(@Nonnull BuilderSupport builderSupport)
- @Nonnull @Override public String getShortDescription()
- @Nonnull @Override public String getLongDescription()
- @Nonnull @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Nonnull public BuilderActionSpawn readConfig(@Nonnull JsonElement data)
- public float getSpawnDirection(@Nonnull BuilderSupport support)
- public float getSpawnAngle(@Nonnull BuilderSupport support)
- public boolean isFanOut(@Nonnull BuilderSupport support)
- public double[] getDistanceRange(@Nonnull BuilderSupport support)
- public String getKind(@Nonnull BuilderSupport support)
- public String getFlock(@Nonnull BuilderSupport support)
- public int[] getCountRange(@Nonnull BuilderSupport support)
- public double[] getDelayRange(@Nonnull BuilderSupport support)
- public boolean isLaunchAtTarget(@Nonnull BuilderSupport support)
- public boolean isPitchHigh(@Nonnull BuilderSupport support)
- public double getSpread(@Nonnull BuilderSupport support)
- public boolean isJoinFlock(@Nonnull BuilderSupport support)
- public String getSpawnState(@Nonnull BuilderSupport support)
- public String getSpawnSubState(@Nonnull BuilderSupport support)

Also in this package: BuilderActionDelayDespawn, BuilderActionDespawn, BuilderActionDie, BuilderActionRemove, BuilderActionRole, BuilderSensorAge

Complete API:
  public ActionSpawn build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderActionSpawn readConfig(JsonElement data)
  public float getSpawnDirection(BuilderSupport support)
  public float getSpawnAngle(BuilderSupport support)
  public boolean isFanOut(BuilderSupport support)
  public double[] getDistanceRange(BuilderSupport support)
  public String getKind(BuilderSupport support)
  public String getFlock(BuilderSupport support)
  public int[] getCountRange(BuilderSupport support)
  public double[] getDelayRange(BuilderSupport support)
  public boolean isLaunchAtTarget(BuilderSupport support)
  public boolean isPitchHigh(BuilderSupport support)
  public double getSpread(BuilderSupport support)
  public boolean isJoinFlock(BuilderSupport support)
  public String getSpawnState(BuilderSupport support)
  public String getSpawnSubState(BuilderSupport support)

Fields:
public static final double[] DEFAULT_DISTANCE_RANGE
public static final int[] DEFAULT_COUNT_RANGE
public static final double[] DEFAULT_DELAY_RANGE
protected final FloatHolder spawnDirection
protected final FloatHolder spawnAngle
protected final BooleanHolder fanOut
protected final NumberArrayHolder distanceRange
protected final NumberArrayHolder countRange
protected final NumberArrayHolder delayRange
protected final StringHolder kind
protected final AssetHolder flock
protected final BooleanHolder launchAtTarget
protected final BooleanHolder pitchHigh
protected final DoubleHolder spread
protected final BooleanHolder joinFlock
protected final StringHolder spawnState
protected final StringHolder spawnSubState
