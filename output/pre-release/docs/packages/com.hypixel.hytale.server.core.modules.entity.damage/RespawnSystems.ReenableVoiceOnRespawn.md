---
title: "RespawnSystems.ReenableVoiceOnRespawn"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.RespawnSystems.ReenableVoiceOnRespawn"
api_surface: false
extends: "RespawnSystems.OnRespawnSystem"
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
public static class RespawnSystems.ReenableVoiceOnRespawn extends RespawnSystems.OnRespawnSystem
```

Re-enables voice chat for the player on respawn. Unsets the silenced flag on the `VoicePlayerState`, sends updated voice configuration, and schedules an immediate position update for proximity-based voice.

## Relationships

- Inner class of [RespawnSystems](RespawnSystems.md)
- Counterpart to `DeathSystems.StopVoiceOnDeath`
