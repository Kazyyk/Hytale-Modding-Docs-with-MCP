---
title: "MountSystems.PlayerMount"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts"
fqcn: "com.hypixel.hytale.builtin.mounts.MountSystems.PlayerMount"
api_surface: false
extends: "RefChangeSystem<EntityStore, MountedComponent>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "mounts"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.mounts`

```java
public static class PlayerMount extends RefChangeSystem<EntityStore, MountedComponent>
```

Reacts to [MountedComponent](MountedComponent.md) changes on player entities (those with `PlayerInput`) to synchronize the mount network ID on the player's input component.

## Behavior

- **onComponentAdded:** Resolves the mount target entity's `NetworkId` and sets it on `PlayerInput.setMountId()`. Clears the movement update queue.
- **onComponentRemoved:** Resets `PlayerInput.setMountId(0)`.
- **onComponentSet:** No-op.

## Query

Matches entities with `PlayerInput`.

## Related Types

- [MountSystems](MountSystems.md) -- enclosing class
- [MountSystems.HandleMountInput](MountSystems.HandleMountInput.md) -- processes input while mounted
