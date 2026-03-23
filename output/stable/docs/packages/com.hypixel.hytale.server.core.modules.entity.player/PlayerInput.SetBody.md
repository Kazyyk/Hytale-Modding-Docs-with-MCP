---
title: "PlayerInput.SetBody"
kind: "record"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerInput.SetBody"
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
  - "rotation"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public record PlayerInput.SetBody(Direction direction) implements PlayerInput.InputUpdate
```

An input update that sets the entity's body rotation from the client-reported `Direction` (pitch, yaw, roll). Updates the `TransformComponent` rotation.

## Record Components

| Component | Type | Description |
|---|---|---|
| `direction` | `Direction` | The body orientation to apply. |

## Related Types

- [PlayerInput](PlayerInput.md) -- parent component
- [PlayerInput.SetHead](PlayerInput.SetHead.md) -- head rotation counterpart
