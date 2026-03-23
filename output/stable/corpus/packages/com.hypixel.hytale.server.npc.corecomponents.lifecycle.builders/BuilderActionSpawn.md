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
