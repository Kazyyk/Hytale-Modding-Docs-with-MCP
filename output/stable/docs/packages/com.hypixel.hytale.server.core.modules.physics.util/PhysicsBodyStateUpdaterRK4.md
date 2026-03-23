---
title: "PhysicsBodyStateUpdaterRK4"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.physics.util"
fqcn: "com.hypixel.hytale.server.core.modules.physics.util.PhysicsBodyStateUpdaterRK4"
api_surface: false
extends: "PhysicsBodyStateUpdater"
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
public class PhysicsBodyStateUpdaterRK4 extends PhysicsBodyStateUpdater
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `PhysicsBodyState` | `state` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `update(@Nonnull PhysicsBodyState before, @Nonnull PhysicsBodyState after, double mass, double dt, boolean onGround, @Nonnull ForceProvider[] forceProvider)` |
