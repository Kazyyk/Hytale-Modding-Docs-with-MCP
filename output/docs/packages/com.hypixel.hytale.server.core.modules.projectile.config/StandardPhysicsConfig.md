---
title: "StandardPhysicsConfig"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.projectile.config"
fqcn: "com.hypixel.hytale.server.core.modules.projectile.config.StandardPhysicsConfig"
api_surface: false
extends: null
implements:
  - "PhysicsConfig"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "projectile"
  - "physics"
  - "config"
---

**Package:** `com.hypixel.hytale.server.core.modules.projectile.config`

```java
public class StandardPhysicsConfig implements PhysicsConfig
```

Standard physics configuration for projectiles. Controls density, gravity, bounciness, bounce limits, rolling, rotation modes, terminal velocities in air and water, and drag coefficients. Serializable to protocol packets.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<StandardPhysicsConfig>` | `CODEC` |
| `public static final` | `StandardPhysicsConfig` | `DEFAULT` |
| `protected` | `double` | `density` |
| `protected` | `double` | `gravity` |
| `protected` | `double` | `bounciness` |
| `protected` | `int` | `bounceCount` |
| `protected` | `double` | `bounceLimit` |
| `protected` | `boolean` | `sticksVertically` |
| `protected` | `boolean` | `computeYaw` |
| `protected` | `boolean` | `computePitch` |
| `protected` | `RotationMode` | `rotationMode` |
| `protected` | `boolean` | `allowRolling` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `double` | `getGravity()` |
| `public` | `void` | `apply(@Nonnull Holder<EntityStore> holder, @Nullable Ref<EntityStore> creatorRef, @Nonnull Vector3d velocity, @Nonnull ComponentAccessor<EntityStore> componentAccessor, boolean predicted)` |
| `public` | `com.hypixel.hytale.protocol.PhysicsConfig` | `toPacket()` |
| `public` | `double` | `getBounciness()` |
| `public` | `int` | `getBounceCount()` |
| `public` | `double` | `getBounceLimit()` |
| `public` | `boolean` | `isSticksVertically()` |
| `public` | `boolean` | `isAllowRolling()` |
| `public` | `double` | `getRollingFrictionFactor()` |
| `public` | `double` | `getSwimmingDampingFactor()` |
| `public` | `double` | `getHitWaterImpulseLoss()` |
