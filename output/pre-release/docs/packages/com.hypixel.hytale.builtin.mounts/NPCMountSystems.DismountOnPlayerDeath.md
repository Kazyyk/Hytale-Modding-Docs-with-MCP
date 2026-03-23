---
title: "NPCMountSystems.DismountOnPlayerDeath"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts"
fqcn: "com.hypixel.hytale.builtin.mounts.NPCMountSystems.DismountOnPlayerDeath"
api_surface: false
extends: "DeathSystems.OnDeathSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "mounts"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.mounts`

```java
public static class DismountOnPlayerDeath extends DeathSystems.OnDeathSystem
```

Dismounts the player from their NPC mount when the player dies. Reacts to `DeathComponent` being added to player entities and delegates to `MountPlugin.checkDismountNpc()`.

## Query

Matches entities with `Player`.

## Related Types

- [NPCMountSystems](NPCMountSystems.md) -- enclosing class
- [NPCMountSystems.DismountOnMountDeath](NPCMountSystems.DismountOnMountDeath.md) -- handles the reverse case (mount dies)
