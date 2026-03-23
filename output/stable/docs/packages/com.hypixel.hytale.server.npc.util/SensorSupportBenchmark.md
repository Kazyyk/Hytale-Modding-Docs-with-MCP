---
title: "SensorSupportBenchmark"
kind: "class"
package: "com.hypixel.hytale.server.npc.util"
fqcn: "com.hypixel.hytale.server.npc.util.SensorSupportBenchmark"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "utility"
---

**Package:** `com.hypixel.hytale.server.npc.util`

```java
public class SensorSupportBenchmark
```

Benchmarking utility for NPC sensor systems. Records timing and distance metrics for player/entity list collection, line-of-sight tests, inverse LoS tests, and friendly-blocking tests.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `collectPlayerList(long getNanos, double maxPlayerDistanceSorted, double maxPlayerDistance, double maxPlayerDistanceAvoidance, int numPlayers)` |
| `public` | `void` | `collectEntityList(long getNanos, double maxEntityDistanceSorted, double maxEntityDistance, double maxEntityDistanceAvoidance, int numEntities)` |
| `public` | `void` | `collectLosTest(boolean cacheHit, long time)` |
| `public` | `void` | `collectInverseLosTest(boolean cacheHit)` |
| `public` | `void` | `collectFriendlyBlockingTest(boolean cacheHit)` |
| `public` | `void` | `tickDone()` |
| `public` | `void` | `formatHeaderUpdateTimes(Formatter formatter)` |
| `public` | `void` | `formatValuesUpdateTimePlayer(Formatter formatter)` |
| `public` | `void` | `formatValuesUpdateTimeEntity(Formatter formatter)` |
| `public` | `void` | `formatValuesUpdateTime( Formatter formatter, String kind, TimeRecorder getTime, DiscreteValueRecorder count, DiscreteValueRecorder distanceSorted, DiscreteValueRecorder distance, DiscreteValueRecorder distanceAvoidance )` |
| `public` | `boolean` | `haveUpdateTimes()` |
| `public` | `void` | `formatHeaderLoS(Formatter formatter)` |
| `public` | `boolean` | `formatValuesLoS(Formatter formatter)` |
