---
title: "PlayerInput.SetRiderMovementStates"
kind: "record"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerInput.SetRiderMovementStates"
api_surface: false
extends: ~
implements:
  - "PlayerInput.InputUpdate"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "player"
  - "entity"
  - "input"
  - "movement"
  - "mount"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public record PlayerInput.SetRiderMovementStates(MovementStates movementStates) implements PlayerInput.InputUpdate
```

An input update that carries movement state flags for a mounted player's ride. The `apply()` method is a no-op in the current implementation.

## Record Components

| Component | Type | Description |
|---|---|---|
| `movementStates` | `MovementStates` | The rider movement state flags. |

## Related Types

- [PlayerInput](PlayerInput.md) -- parent component
- [PlayerInput.SetMovementStates](PlayerInput.SetMovementStates.md) -- player's own movement states
