---
title: "ForceProviderStandardState"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.physics.util"
fqcn: "com.hypixel.hytale.server.core.modules.physics.util.ForceProviderStandardState"
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
public class ForceProviderStandardState
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public` | `double` | `displacedMass` |
| `public` | `double` | `dragCoefficient` |
| `public` | `double` | `gravity` |
| `public final` | `Vector3d` | `nextTickVelocity` |
| `public final` | `Vector3d` | `externalVelocity` |
| `public final` | `Vector3d` | `externalAcceleration` |
| `public final` | `Vector3d` | `externalForce` |
| `public final` | `Vector3d` | `externalImpulse` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ForceProviderStandardState()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `convertToForces(double dt, double mass)` |
| `public` | `void` | `updateVelocity(@Nonnull Vector3d velocity)` |
| `public` | `void` | `clear()` |
