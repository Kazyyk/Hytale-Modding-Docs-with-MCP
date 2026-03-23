---
title: "NPCMountSystems.DismountOnMountDeath"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts"
fqcn: "com.hypixel.hytale.builtin.mounts.NPCMountSystems.DismountOnMountDeath"
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
public static class DismountOnMountDeath extends DeathSystems.OnDeathSystem
```

Resets the player's movement settings when a mounted NPC dies. Reacts to `DeathComponent` being added to NPC entities that have an [NPCMountComponent](NPCMountComponent.md). Reads the mount component's owner player reference and, if the player is still valid, calls `MountPlugin.resetOriginalPlayerMovementSettings()`.

## Query

Matches entities with `NPCMountComponent`.

## Related Types

- [NPCMountSystems](NPCMountSystems.md) -- enclosing class
- [NPCMountSystems.DismountOnPlayerDeath](NPCMountSystems.DismountOnPlayerDeath.md) -- handles the reverse case (player dies)
