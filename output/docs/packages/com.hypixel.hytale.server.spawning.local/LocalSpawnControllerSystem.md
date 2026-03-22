---
title: "LocalSpawnControllerSystem"
kind: "class"
package: "com.hypixel.hytale.server.spawning.local"
fqcn: "com.hypixel.hytale.server.spawning.local.LocalSpawnControllerSystem"
api_surface: false
extends: "TickingSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "spawning"
  - "local"
  - "class"
---

**Package:** `com.hypixel.hytale.server.spawning.local`

```java
public class LocalSpawnControllerSystem extends TickingSystem<EntityStore>
```

Main ticking system for local NPC spawning. Evaluates each player with an active spawn controller, checks environment conditions (weather, light levels), and places spawn beacons for matching beacon types. Runs every 5 seconds per player.

## Fields

| Modifier | Type | Field | Description |
|---|---|---|---|
| `public static final` | `double` | `RUN_FREQUENCY_SECONDS` | Run frequency (5.0 seconds) |
