---
title: "com.hypixel.hytale.server.spawning.local"
package: "com.hypixel.hytale.server.spawning.local"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
---

**Package:** `com.hypixel.hytale.server.spawning.local`

## Classes

| Type | Description |
|---|---|
| [LocalSpawnBeacon](LocalSpawnBeacon.md) | Marker component for local spawn beacon entities |
| [LocalSpawnBeaconSystem](LocalSpawnBeaconSystem.md) | Triggers spawn controller rerun when beacon removed |
| [LocalSpawnController](LocalSpawnController.md) | Player component tracking next spawn controller run time |
| [LocalSpawnControllerSystem](LocalSpawnControllerSystem.md) | Main ticking system for local NPC spawning around players |
| [LocalSpawnForceTriggerSystem](LocalSpawnForceTriggerSystem.md) | Handles forced re-triggering of local spawn controllers |
| [LocalSpawnSetupSystem](LocalSpawnSetupSystem.md) | Ensures players get LocalSpawnController on world add |
| [LocalSpawnState](LocalSpawnState.md) | Resource tracking local spawn controller state |
