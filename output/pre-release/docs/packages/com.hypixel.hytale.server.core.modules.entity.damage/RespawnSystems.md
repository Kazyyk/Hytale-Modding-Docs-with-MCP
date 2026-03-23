---
title: "RespawnSystems"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.RespawnSystems"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:22:51Z"
tags:
  - "damage"
  - "respawn"
  - "system"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public class RespawnSystems
```

Container for ECS systems that handle entity respawn (DeathComponent removal). Each inner system extends `OnRespawnSystem` and performs a specific respawn action: resetting stats, clearing effects, clearing interactions, clearing respawn UI, resetting spawn time, checking broken items, and re-enabling voice chat.

## Inner Classes

| Class | Description |
|---|---|
| RespawnSystems.CheckBrokenItemsRespawnSystem | Notifies player of broken items on respawn |
| RespawnSystems.ClearEntityEffectsRespawnSystem | Clears all entity effects on respawn |
| RespawnSystems.ClearInteractionsRespawnSystem | Clears interaction manager on respawn |
| RespawnSystems.ClearRespawnUI | Resets page to None on respawn |
| RespawnSystems.OnRespawnSystem | Abstract base watching DeathComponent removal |
| [RespawnSystems.ReenableVoiceOnRespawn](RespawnSystems.ReenableVoiceOnRespawn.md) | Re-enables voice chat on respawn |
| RespawnSystems.ResetPlayerRespawnSystem | Records last spawn time |
| RespawnSystems.ResetStatsRespawnSystem | Resets all entity stat values to defaults |
