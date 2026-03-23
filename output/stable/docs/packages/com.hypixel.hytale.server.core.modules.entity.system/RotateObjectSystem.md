---
title: "RotateObjectSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.system"
fqcn: "com.hypixel.hytale.server.core.modules.entity.system.RotateObjectSystem"
api_surface: false
extends: "EntityTickingSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "ecs"
  - "entity"
  - "rotation"
  - "transform"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.system`

```java
public class RotateObjectSystem extends EntityTickingSystem<EntityStore>
```

Per-tick ECS system that continuously rotates entities with a `RotateObjectComponent` around the Y axis. Used for decorative spinning objects such as item displays or rotating props.

## Constructor

```java
public RotateObjectSystem(
    @Nonnull ComponentType<EntityStore, TransformComponent> transformComponentType,
    @Nonnull ComponentType<EntityStore, RotateObjectComponent> rotateObjectComponentType
)
```

Takes the component types for `TransformComponent` and `RotateObjectComponent`.

## Query

Queries for entities matching both `RotateObjectComponent` and `TransformComponent`.

## Behavior

On each tick:
1. Reads the `RotateObjectComponent` to get the rotation speed.
2. Reads the current rotation from `TransformComponent`.
3. Increments `rotation.y` by `rotationSpeed * dt`.
4. Wraps the Y rotation at 360 degrees using modulo.
5. Writes the updated rotation back to the `TransformComponent`.

## Related Types

- [TransformSystems](TransformSystems.md) -- sends transform changes to clients
- `RotateObjectComponent` -- ECS component specifying the rotation speed
- `TransformComponent` -- ECS component holding position and rotation
