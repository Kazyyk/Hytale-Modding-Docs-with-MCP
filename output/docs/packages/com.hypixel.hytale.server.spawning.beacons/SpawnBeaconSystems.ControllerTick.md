---
title: "SpawnBeaconSystems.ControllerTick"
kind: "class"
package: "com.hypixel.hytale.server.spawning.beacons"
fqcn: "com.hypixel.hytale.server.spawning.beacons.SpawnBeaconSystems.ControllerTick"
api_surface: false
extends: "SpawnControllerSystem<NPCBeaconSpawnJob, BeaconSpawnController>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "spawning"
  - "beacons"
  - "ecs"
  - "system"
---

**Package:** `com.hypixel.hytale.server.spawning.beacons`

```java
public static class SpawnBeaconSystems.ControllerTick extends SpawnControllerSystem<NPCBeaconSpawnJob, BeaconSpawnController>
```

The main spawn controller tick system for legacy beacons. Validates spawned entities (despawning idle/out-of-range NPCs), collects players in the beacon radius with Y-range filtering, scales max total and concurrent spawns using response curves, sorts players by threat, and generates spawn jobs. Depends on `PlayerSpatialSystem` and `PositionSelectorUpdate`.

Declared as a static inner class of [SpawnBeaconSystems](SpawnBeaconSystems.md).
