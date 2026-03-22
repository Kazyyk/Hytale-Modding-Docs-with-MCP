---
title: "SpawnBeaconSystems.LegacyEntityAdded"
kind: "class"
package: "com.hypixel.hytale.server.spawning.beacons"
fqcn: "com.hypixel.hytale.server.spawning.beacons.SpawnBeaconSystems.LegacyEntityAdded"
api_surface: false
extends: "RefSystem<EntityStore>"
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
public static class SpawnBeaconSystems.LegacyEntityAdded extends RefSystem<EntityStore>
```

Handles [LegacySpawnBeaconEntity](LegacySpawnBeaconEntity.md) entity initialization. On add, resolves the spawn wrapper, creates a `BeaconSpawnController`, initializes a `FloodFillPositionSelector`, computes initial scaled max spawns, and adds an [InitialBeaconDelay](InitialBeaconDelay.md) on load. Removes the entity if the config is missing.

Declared as a static inner class of [SpawnBeaconSystems](SpawnBeaconSystems.md).
