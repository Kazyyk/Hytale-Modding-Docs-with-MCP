---
title: "PhysicsBodyStateUpdater"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.physics.util"
fqcn: "com.hypixel.hytale.server.core.modules.physics.util.PhysicsBodyStateUpdater"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "core"
  - "modules"
  - "physics"
  - "util"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.physics.util`

```java
public class PhysicsBodyStateUpdater
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected static` | `double` | `MIN_VELOCITY` |
| `@Nonnull protected` | `Vector3d` | `acceleration` |
| `protected final` | `ForceAccumulator` | `accumulator` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `update(@Nonnull PhysicsBodyState before, @Nonnull PhysicsBodyState after, double mass, double dt, boolean onGround, @Nonnull ForceProvider[] forceProvider)` |
| `protected static` | `void` | `updatePositionBeforeVelocity(@Nonnull PhysicsBodyState before, @Nonnull PhysicsBodyState after, double dt)` |
| `protected static` | `void` | `updatePositionAfterVelocity(@Nonnull PhysicsBodyState before, @Nonnull PhysicsBodyState after, double dt)` |
| `protected` | `void` | `updateAndClampVelocity(@Nonnull PhysicsBodyState before, @Nonnull PhysicsBodyState after, double dt)` |
| `protected` | `void` | `updateVelocity(@Nonnull PhysicsBodyState before, @Nonnull PhysicsBodyState after, double dt)` |
| `protected` | `void` | `computeAcceleration(double mass)` |
| `protected` | `void` | `computeAcceleration(@Nonnull PhysicsBodyState state, boolean onGround, @Nonnull ForceProvider[] forceProviders, double mass, double timeStep)` |
| `protected` | `void` | `assignAcceleration(@Nonnull PhysicsBodyState state)` |
| `protected` | `void` | `addAcceleration(@Nonnull PhysicsBodyState state, double scale)` |
| `protected` | `void` | `addAcceleration(@Nonnull PhysicsBodyState state)` |
| `protected` | `void` | `convertAccelerationToVelocity(@Nonnull PhysicsBodyState before, @Nonnull PhysicsBodyState after, double scale)` |
