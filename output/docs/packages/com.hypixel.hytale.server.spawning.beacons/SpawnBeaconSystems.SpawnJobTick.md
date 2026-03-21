---
title: "SpawnBeaconSystems.SpawnJobTick"
kind: "class"
package: "com.hypixel.hytale.server.spawning.beacons"
fqcn: "com.hypixel.hytale.server.spawning.beacons.SpawnBeaconSystems.SpawnJobTick"
api_surface: false
extends: "SpawnJobSystem<NPCBeaconSpawnJob, BeaconSpawnController>"
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
public static class SpawnBeaconSystems.SpawnJobTick extends SpawnJobSystem<NPCBeaconSpawnJob, BeaconSpawnController>
```

Executes pending NPC beacon spawn jobs. Picks spawn positions using `FloodFillPositionSelector`, spawns NPCs via `NPCPlugin`, creates flocks, and notifies the beacon on success. Handles failure by incrementing spawn attempts and preparing the next spawn timer after 5 failures. Runs after `ControllerTick`.

Declared as a static inner class of [SpawnBeaconSystems](SpawnBeaconSystems.md).
