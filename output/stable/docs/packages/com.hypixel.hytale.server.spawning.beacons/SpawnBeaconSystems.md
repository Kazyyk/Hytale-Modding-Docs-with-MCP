---
title: "SpawnBeaconSystems"
kind: "class"
package: "com.hypixel.hytale.server.spawning.beacons"
fqcn: "com.hypixel.hytale.server.spawning.beacons.SpawnBeaconSystems"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "spawning"
  - "beacons"
  - "ecs"
  - "systems"
---

**Package:** `com.hypixel.hytale.server.spawning.beacons`

```java
public class SpawnBeaconSystems
```

Container class for all spawn beacon ECS systems. Contains static inner classes that handle beacon lifecycle, despawn checking, position calculation, spawn controller ticking, and spawn job execution.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `double[]` | `POSITION_CALCULATION_DELAY_RANGE` | `{0.0, 1.0}` |

## Inner Classes

| Type | Kind | Description |
|---|---|---|
| [CheckDespawn](SpawnBeaconSystems.CheckDespawn.md) | class | Checks and processes beacon self-despawn timers. |
| [ControllerTick](SpawnBeaconSystems.ControllerTick.md) | class | Main spawn controller tick: player detection, spawn scaling, job generation. |
| [EntityAdded](SpawnBeaconSystems.EntityAdded.md) | class | Handles [SpawnBeacon](SpawnBeacon.md) entity initialization on add. |
| [LegacyEntityAdded](SpawnBeaconSystems.LegacyEntityAdded.md) | class | Handles [LegacySpawnBeaconEntity](LegacySpawnBeaconEntity.md) entity initialization on add. |
| [LoadTimeDelay](SpawnBeaconSystems.LoadTimeDelay.md) | class | Ticks [InitialBeaconDelay](InitialBeaconDelay.md) components and removes them when expired. |
| [PositionSelectorUpdate](SpawnBeaconSystems.PositionSelectorUpdate.md) | class | Rebuilds `FloodFillPositionSelector` caches when needed. |
| [SpawnJobTick](SpawnBeaconSystems.SpawnJobTick.md) | class | Executes pending NPC beacon spawn jobs. |
