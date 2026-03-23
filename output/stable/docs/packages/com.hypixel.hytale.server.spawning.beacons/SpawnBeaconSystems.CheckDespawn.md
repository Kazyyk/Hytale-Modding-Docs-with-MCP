---
title: "SpawnBeaconSystems.CheckDespawn"
kind: "class"
package: "com.hypixel.hytale.server.spawning.beacons"
fqcn: "com.hypixel.hytale.server.spawning.beacons.SpawnBeaconSystems.CheckDespawn"
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
public static class SpawnBeaconSystems.CheckDespawn extends EntityTickingSystem<EntityStore>
```

Checks beacon self-despawn timers. If the game time exceeds `despawnSelfAfter`, despawns all spawned NPCs and removes the beacon. Also checks `BeaconSpawnWrapper.shouldDespawn` for environment-driven despawn conditions.

Declared as a static inner class of [SpawnBeaconSystems](SpawnBeaconSystems.md).
