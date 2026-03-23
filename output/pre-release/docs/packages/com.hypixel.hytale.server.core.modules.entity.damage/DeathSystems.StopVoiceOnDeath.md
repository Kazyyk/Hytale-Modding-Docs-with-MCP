---
title: "DeathSystems.StopVoiceOnDeath"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DeathSystems.StopVoiceOnDeath"
api_surface: false
extends: "DeathSystems.OnDeathSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:22:51Z"
tags:
  - "damage"
  - "death"
  - "system"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class DeathSystems.StopVoiceOnDeath extends DeathSystems.OnDeathSystem
```

Silences the player's voice chat on death. Sets the `VoicePlayerState` to silenced and not speaking, then sends updated voice config to the player.

## Relationships

- Inner class of [DeathSystems](DeathSystems.md)
