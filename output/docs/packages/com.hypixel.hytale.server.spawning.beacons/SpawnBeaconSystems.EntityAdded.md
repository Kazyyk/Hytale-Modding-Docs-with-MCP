---
title: "SpawnBeaconSystems.EntityAdded"
kind: "class"
package: "com.hypixel.hytale.server.spawning.beacons"
fqcn: "com.hypixel.hytale.server.spawning.beacons.SpawnBeaconSystems.EntityAdded"
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
public static class SpawnBeaconSystems.EntityAdded extends RefSystem<EntityStore>
```

Handles [SpawnBeacon](SpawnBeacon.md) entity initialization. On add, resolves the spawn configuration from `BeaconNPCSpawn` asset map, creates a `FloodFillPositionSelector`, and ensures a `PrefabCopyableComponent`. Removes the entity if the config is missing.

Declared as a static inner class of [SpawnBeaconSystems](SpawnBeaconSystems.md).
