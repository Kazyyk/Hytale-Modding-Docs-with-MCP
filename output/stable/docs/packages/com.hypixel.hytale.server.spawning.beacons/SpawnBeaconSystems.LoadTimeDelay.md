---
title: "SpawnBeaconSystems.LoadTimeDelay"
kind: "class"
package: "com.hypixel.hytale.server.spawning.beacons"
fqcn: "com.hypixel.hytale.server.spawning.beacons.SpawnBeaconSystems.LoadTimeDelay"
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
public static class SpawnBeaconSystems.LoadTimeDelay extends EntityTickingSystem<EntityStore>
```

Ticks down [InitialBeaconDelay](InitialBeaconDelay.md) components each frame. When the delay expires, removes the component so the beacon can begin spawning. Runs with `RootDependency.lastSet()` ordering.

Declared as a static inner class of [SpawnBeaconSystems](SpawnBeaconSystems.md).
