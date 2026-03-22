---
title: "PlayerInput.AbsoluteMovement"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerInput.AbsoluteMovement"
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
public static class PlayerInput.AbsoluteMovement implements PlayerInput.InputUpdate
```

An input update that moves the player to absolute world coordinates. Calls `Player.moveTo()` with the specified x, y, z values.

## Constructors

```java
public AbsoluteMovement(double x, double y, double z)
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

Moves the player entity to the absolute position.

## Related Types

- [PlayerInput](PlayerInput.md) -- parent component
- [PlayerInput.RelativeMovement](PlayerInput.RelativeMovement.md) -- relative position alternative
