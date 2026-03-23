---
title: "SpawnBeaconSystems.PositionSelectorUpdate"
kind: "class"
package: "com.hypixel.hytale.server.spawning.beacons"
fqcn: "com.hypixel.hytale.server.spawning.beacons.SpawnBeaconSystems.PositionSelectorUpdate"
api_surface: false
extends: "EntityTickingSystem<EntityStore>"
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
public static class SpawnBeaconSystems.PositionSelectorUpdate extends EntityTickingSystem<EntityStore>
```

Rebuilds `FloodFillPositionSelector` position caches when flagged for rebuild. Uses the beacon's transform position and a `FloodFillEntryPoolProviderSimple` resource. Runs after `CheckDespawn`.

Declared as a static inner class of [SpawnBeaconSystems](SpawnBeaconSystems.md).
