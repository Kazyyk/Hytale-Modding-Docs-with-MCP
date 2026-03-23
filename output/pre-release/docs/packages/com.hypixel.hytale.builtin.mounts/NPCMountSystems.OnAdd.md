---
title: "NPCMountSystems.OnAdd"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts"
fqcn: "com.hypixel.hytale.builtin.mounts.NPCMountSystems.OnAdd"
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
public static class OnAdd extends RefSystem<EntityStore>
```

Handles [NPCMountComponent](NPCMountComponent.md) addition on NPC entities. When an NPC gains a mount component:

- **With owner player:** Resolves the NPC's `NetworkId`, sends a `MountNPC` packet to the owning player with the anchor offset and network ID, sets the player's mount entity ID, and removes the `Interactable` component to prevent further interactions.
- **Without owner player:** Resets the NPC to its original role via `RoleChangeSystem.requestRoleChange()`, removes the `NPCMountComponent`, and re-ensures the `Interactable` component. This handles the case where the mount component was loaded from persistence without an active player.

## Query

Matches entities with `NPCMountComponent`, `NPCEntity`, and `NetworkId`.

## Behavior

- **onEntityAdded:** Processes the mount component as described above.
- **onEntityRemove:** No-op.

## Related Types

- [NPCMountSystems](NPCMountSystems.md) -- enclosing class
- [NPCMountComponent](NPCMountComponent.md) -- the component being watched
- [ActionMount](ActionMount.md) -- the NPC action that creates the component
