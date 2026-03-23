---
title: "PlayerInput.RelativeMovement"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerInput.RelativeMovement"
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
public static class PlayerInput.RelativeMovement implements PlayerInput.InputUpdate
```

An input update that moves the player by a relative offset from its current position. Reads the current transform position and calls `Player.moveTo()` with the offset applied.

## Constructors

```java
public RelativeMovement(double x, double y, double z)
```

## Methods

```java
public double getX()
public void setX(double x)
public double getY()
public void setY(double y)
public double getZ()
public void setZ(double z)
```

```java
@Override
public void apply(@Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, int index)
```

Adds the relative offset to the current position.

## Related Types

- [PlayerInput](PlayerInput.md) -- parent component
- [PlayerInput.AbsoluteMovement](PlayerInput.AbsoluteMovement.md) -- absolute position alternative
