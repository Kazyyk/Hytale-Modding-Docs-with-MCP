---
title: "ForceAccumulator"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.physics.util"
fqcn: "com.hypixel.hytale.server.core.modules.physics.util.ForceAccumulator"
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
public class ForceAccumulator
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public` | `double` | `speed` |
| `public final` | `Vector3d` | `force` |
| `public final` | `Vector3d` | `resistanceForceLimit` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `initialize(@Nonnull PhysicsBodyState state, double mass, double timeStep)` |
| `protected` | `void` | `computeResultingForce(@Nonnull PhysicsBodyState state, boolean onGround, @Nonnull ForceProvider[] forceProviders, double mass, double timeStep)` |
