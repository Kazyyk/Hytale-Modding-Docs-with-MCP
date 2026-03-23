---
title: "MountSystems.HandleMountInput"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts"
fqcn: "com.hypixel.hytale.builtin.mounts.MountSystems.HandleMountInput"
api_surface: false
extends: "EntityTickingSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "mounts"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.mounts`

```java
public static class HandleMountInput extends EntityTickingSystem<EntityStore>
```

Ticking system that processes player movement input while the player is mounted. Runs before `PlayerSystems.ProcessPlayerInput`.

## Query

Matches entities with both [MountedComponent](MountedComponent.md) and `PlayerInput`.

## Behavior

Each tick, iterates the player's `PlayerInput.getMovementUpdateQueue()` and processes each input update:

- **Block mount + movement input:** If the mount duration is at least 600 ms, removes the `MountedComponent` to dismount. Movement inputs within the first 600 ms are ignored to prevent accidental immediate dismount.
- **SetRiderMovementStates:** Updates the rider's `MovementStatesComponent`.
- **RelativeMovement:** Applies to both the rider and the mount target's `TransformComponent` position.
- **AbsoluteMovement:** Applies to both the rider and the mount target's `TransformComponent` position.
- **SetMovementStates:** Updates the mount target's `MovementStatesComponent`.
- **SetBody:** Applies body rotation to both the rider and the mount target's `TransformComponent` rotation.
- **SetHead:** Applies head rotation to the rider only.
- **WishMovement:** Ignored while mounted.

The queue is cleared after processing.

## Dependencies

Ordered `BEFORE` `PlayerSystems.ProcessPlayerInput`.

## Related Types

- [MountSystems](MountSystems.md) -- enclosing class
- [MountSystems.PlayerMount](MountSystems.PlayerMount.md) -- sets mount IDs on player input
