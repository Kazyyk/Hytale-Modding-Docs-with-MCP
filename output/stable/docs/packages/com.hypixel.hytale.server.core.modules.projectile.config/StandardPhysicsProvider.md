---
title: "StandardPhysicsProvider"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.projectile.config"
fqcn: "com.hypixel.hytale.server.core.modules.projectile.config.StandardPhysicsProvider"
api_surface: false
extends: null
implements:
  - "IBlockCollisionConsumer"
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "projectile"
  - "physics"
  - "component"
---

**Package:** `com.hypixel.hytale.server.core.modules.projectile.config`

```java
public class StandardPhysicsProvider implements IBlockCollisionConsumer, Component<EntityStore>
```

Runtime physics provider component for projectiles using standard physics. Manages per-tick physics simulation including block collision handling, fluid interaction, bounce/impact consumers, body rotation, and sliding behavior. Attached to projectile entities when `StandardPhysicsConfig.apply()` is called.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `int` | `WATER_DETECTION_EXTREMA_COUNT` |
| `public static final` | `double` | `MIN_BOUNCE_EPSILON` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<EntityStore, StandardPhysicsProvider>` | `getComponentType()` |
| `public` | `IBlockCollisionConsumer.Result` | `onCollision(int blockX, int blockY, int blockZ, @Nonnull Vector3d direction, @Nonnull BlockContactData contactData, @Nonnull BlockData blockData, @Nonnull Box collider)` |
| `public` | `void` | `finishTick(@Nonnull TransformComponent position, @Nonnull Velocity velocity)` |
| `public` | `void` | `rotateBody(double dt, @Nonnull Vector3f bodyRotation)` |
| `public` | `boolean` | `isOnGround()` |
| `public` | `boolean` | `isSwimming()` |
| `public` | `StandardPhysicsProvider.STATE` | `getState()` |
| `public` | `void` | `setState(@Nonnull StandardPhysicsProvider.STATE state)` |
| `public` | `Component<EntityStore>` | `clone()` |

## Inner Types

- [StandardPhysicsProvider.STATE](StandardPhysicsProvider.STATE.md) -- lifecycle state enum (ACTIVE, RESTING, INACTIVE)
