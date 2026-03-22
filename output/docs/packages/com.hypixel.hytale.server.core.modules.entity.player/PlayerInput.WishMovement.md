---
title: "PlayerInput.WishMovement"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerInput.WishMovement"
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
  - "knockback"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public static class PlayerInput.WishMovement implements PlayerInput.InputUpdate
```

An input update representing wish-based movement direction, used during knockback prediction. Unlike absolute or relative movement, wish movement is not applied directly but is consumed by the knockback simulation systems.

## Constructors

```java
public WishMovement(double x, double y, double z)
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
public void apply(CommandBuffer<EntityStore> commandBuffer, ArchetypeChunk<EntityStore> archetypeChunk, int index)
```

No-op. Wish movement is consumed by [KnockbackPredictionSystems.CaptureKnockbackInput](KnockbackPredictionSystems.CaptureKnockbackInput.md), not the standard input processing.

## Related Types

- [PlayerInput](PlayerInput.md) -- parent component
- [KnockbackPredictionSystems](KnockbackPredictionSystems.md) -- systems that consume wish movement
