---
title: "BeaconSpawnController"
kind: "class"
package: "com.hypixel.hytale.server.spawning.controllers"
fqcn: "com.hypixel.hytale.server.spawning.controllers.BeaconSpawnController"
api_surface: false
extends: "SpawnController<NPCBeaconSpawnJob>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "spawning"
  - "controllers"
  - "class"
---

**Package:** `com.hypixel.hytale.server.spawning.controllers`

```java
public class BeaconSpawnController extends SpawnController<NPCBeaconSpawnJob>
```

Spawn controller for beacon-based NPC spawning. Manages spawn slots, player-based threat distribution, spawn radius/beacon radius constraints, concurrent spawn limits, idle NPC despawn timers, and round-based spawn scheduling.

## Fields

| Modifier | Type | Field | Description |
|---|---|---|---|
| `public static final` | `int` | `MAX_ATTEMPTS_PER_TICK` | Max spawn attempts per tick (5) |
| `public static final` | `double` | `ROUNDING_BREAK_POINT` | Rounding break point (0.25) |
