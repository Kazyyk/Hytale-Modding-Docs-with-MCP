---
title: "PlayerInput.SetMovementStates"
kind: "record"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerInput.SetMovementStates"
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
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public record PlayerInput.SetMovementStates(MovementStates movementStates) implements PlayerInput.InputUpdate
```

An input update that sets the entity's movement state flags (on ground, jumping, flying, swimming, etc.) from client-reported `MovementStates`.

## Record Components

| Component | Type | Description |
|---|---|---|
| `movementStates` | `MovementStates` | The movement state flags to apply. |

## Related Types

- [PlayerInput](PlayerInput.md) -- parent component
- [PlayerInput.SetRiderMovementStates](PlayerInput.SetRiderMovementStates.md) -- rider variant
