---
title: "PlayerInput.InputUpdate"
kind: "interface"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerInput.InputUpdate"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "player"
  - "entity"
  - "input"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public interface PlayerInput.InputUpdate
```

Interface for input update entries queued in [PlayerInput](PlayerInput.md). Each implementation applies a specific type of client input to the entity.

## Methods

```java
void apply(CommandBuffer<EntityStore> var1, ArchetypeChunk<EntityStore> var2, int var3)
```

Applies this input update to the entity at the given index in the archetype chunk.

## Implementations

- [PlayerInput.AbsoluteMovement](PlayerInput.AbsoluteMovement.md)
- [PlayerInput.RelativeMovement](PlayerInput.RelativeMovement.md)
- [PlayerInput.WishMovement](PlayerInput.WishMovement.md)
- [PlayerInput.SetBody](PlayerInput.SetBody.md)
- [PlayerInput.SetHead](PlayerInput.SetHead.md)
- [PlayerInput.SetClientVelocity](PlayerInput.SetClientVelocity.md)
- [PlayerInput.SetMovementStates](PlayerInput.SetMovementStates.md)
- [PlayerInput.SetRiderMovementStates](PlayerInput.SetRiderMovementStates.md)
