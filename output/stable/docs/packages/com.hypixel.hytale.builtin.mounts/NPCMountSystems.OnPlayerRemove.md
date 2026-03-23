---
title: "NPCMountSystems.OnPlayerRemove"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts"
fqcn: "com.hypixel.hytale.builtin.mounts.NPCMountSystems.OnPlayerRemove"
api_surface: false
extends: "RefSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "mounts"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.mounts`

```java
public static class OnPlayerRemove extends RefSystem<EntityStore>
```

Dismounts the player from their NPC mount when the player entity is removed from the store (e.g., on disconnect). Delegates to `MountPlugin.checkDismountNpc()`.

## Query

Matches entities with `Player`.

## Behavior

- **onEntityAdded:** No-op.
- **onEntityRemove:** Reads the `Player` component and delegates to `MountPlugin.checkDismountNpc()`.

## Related Types

- [NPCMountSystems](NPCMountSystems.md) -- enclosing class
- [NPCMountSystems.DismountOnPlayerDeath](NPCMountSystems.DismountOnPlayerDeath.md) -- handles dismount on player death
