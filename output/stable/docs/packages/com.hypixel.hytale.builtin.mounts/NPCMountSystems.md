---
title: "NPCMountSystems"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts"
fqcn: "com.hypixel.hytale.builtin.mounts.NPCMountSystems"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "mounts"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.mounts`

```java
public class NPCMountSystems
```

Container class for NPC-specific mount ECS systems. All systems are declared as static inner classes and registered by [MountPlugin.setup()](MountPlugin.md).

## Inner Classes

- [OnAdd](NPCMountSystems.OnAdd.md) -- handles NPC mount component addition
- [DismountOnPlayerDeath](NPCMountSystems.DismountOnPlayerDeath.md) -- dismounts player on death
- [DismountOnMountDeath](NPCMountSystems.DismountOnMountDeath.md) -- resets player on mount death
- [OnPlayerRemove](NPCMountSystems.OnPlayerRemove.md) -- dismounts player on entity removal

## Related Types

- [MountSystems](MountSystems.md) -- entity-mount systems
- [NPCMountComponent](NPCMountComponent.md) -- the NPC mount component
- [MountPlugin](MountPlugin.md) -- registers all systems
