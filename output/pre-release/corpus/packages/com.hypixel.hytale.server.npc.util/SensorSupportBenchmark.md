# SensorSupportBenchmark

Type: class | Package: com.hypixel.hytale.server.npc.util

public class SensorSupportBenchmark

Benchmarking utility for NPC sensor systems. Records timing and distance metrics for player/entity list collection, line-of-sight tests, inverse LoS tests, and friendly-blocking tests.

## Key Methods

- public void collectPlayerList(long getNanos, double maxPlayerDistanceSorted, double maxPlayerDistance, double maxPlayerDistanceAvoidance, int numPlayers)
- public void collectEntityList(long getNanos, double maxEntityDistanceSorted, double maxEntityDistance, double maxEntityDistanceAvoidance, int numEntities)
- public void collectLosTest(boolean cacheHit, long time)
- public void collectInverseLosTest(boolean cacheHit)
- public void collectFriendlyBlockingTest(boolean cacheHit)
- public void tickDone()
- public void formatHeaderUpdateTimes(Formatter formatter)
- public void formatValuesUpdateTimePlayer(Formatter formatter)
- public void formatValuesUpdateTimeEntity(Formatter formatter)
- public void formatValuesUpdateTime( Formatter formatter, String kind, TimeRecorder getTime, DiscreteValueRecorder count, DiscreteValueRecorder distanceSorted, DiscreteValueRecorder distance, DiscreteValueRecorder distanceAvoidance )
- public boolean haveUpdateTimes()
- public void formatHeaderLoS(Formatter formatter)
- public boolean formatValuesLoS(Formatter formatter)

Also in this package: AimingData, AimingHelper, Alarm, AttitudeMemoryEntry, BlockPlacementHelper, ComponentInfo, DamageData, Direction, IAnnotatedComponent, IAnnotatedComponentCollection, IComponentExecutionControl, IEntityByPriorityFilter, InventoryHelper, NPCPhysicsMath, PositionProbeAir, PositionProbeBase, PositionProbeWater, RayBlockHitTest, RootSolver, Timer (and 4 more)

Complete API:
  public void collectPlayerList(long getNanos, double maxPlayerDistanceSorted, double maxPlayerDistance, double maxPlayerDistanceAvoidance, int numPlayers)
  public void collectEntityList(long getNanos, double maxEntityDistanceSorted, double maxEntityDistance, double maxEntityDistanceAvoidance, int numEntities)
  public void collectLosTest(boolean cacheHit, long time)
  public void collectInverseLosTest(boolean cacheHit)
  public void collectFriendlyBlockingTest(boolean cacheHit)
  public void tickDone()
  public void formatHeaderUpdateTimes(Formatter formatter)
  public void formatValuesUpdateTimePlayer(Formatter formatter)
  public void formatValuesUpdateTimeEntity(Formatter formatter)
  public void formatValuesUpdateTime(Formatter formatter, String kind, TimeRecorder getTime, DiscreteValueRecorder count, DiscreteValueRecorder distanceSorted, DiscreteValueRecorder distance, DiscreteValueRecorder distanceAvoidance)
  public boolean haveUpdateTimes()
  public void formatHeaderLoS(Formatter formatter)
  public boolean formatValuesLoS(Formatter formatter)

Fields:
public static final char DEFAULT_COLUMN_SEPARATOR
public static final String DEFAULT_COLUMN_FORMAT_HEADER
public static final String DEFAULT_COLUMN_FORMAT_VALUE
public static final String[] DEFAULT_COLUMNS_UPDATE
public static final String[] DEFAULT_COLUMNS_LOS
protected TimeRecorder playerGetTime
protected DiscreteValueRecorder playerDistance
protected DiscreteValueRecorder playerDistanceSorted
protected DiscreteValueRecorder playerDistanceAvoidance
protected DiscreteValueRecorder playerCount
protected TimeRecorder entityGetTime
protected DiscreteValueRecorder entityDistance
protected DiscreteValueRecorder entityDistanceSorted
protected DiscreteValueRecorder entityDistanceAvoidance
protected DiscreteValueRecorder entityCount
protected DiscreteValueRecorder losTest
protected ContinuousValueRecorder losCacheHit
protected DiscreteValueRecorder inverseLosTest
protected ContinuousValueRecorder inverseLosCacheHit
protected DiscreteValueRecorder friendlyBlockingTest
protected ContinuousValueRecorder friendlyBlockingCacheHit
protected TimeRecorder losTestTime
protected long losTestTick
protected long losCacheHitTick
protected long inverseLosTestTick
protected long inverseLosCacheHitTick
protected long friendlyBlockingTestTick
protected long friendlyBlockingCacheHitTick
