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
