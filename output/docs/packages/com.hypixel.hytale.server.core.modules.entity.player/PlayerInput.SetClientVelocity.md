---
title: "PlayerInput.SetClientVelocity"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerInput.SetClientVelocity"
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
  - "velocity"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public static class PlayerInput.SetClientVelocity implements PlayerInput.InputUpdate
```

An input update that sets the client-reported velocity on the entity's `Velocity` component. Converts a protocol `Vector3d` to a math `Vector3d`.

## Constructors

```java
public SetClientVelocity(com.hypixel.hytale.protocol.Vector3d velocity)
```

## Methods

```java
public Vector3d getVelocity()
```

Returns the velocity vector.

```java
@Override
public void apply(CommandBuffer<EntityStore> commandBuffer, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, int index)
```

Sets the client velocity on the `Velocity` component if present.

## Related Types

- [PlayerInput](PlayerInput.md) -- parent component
