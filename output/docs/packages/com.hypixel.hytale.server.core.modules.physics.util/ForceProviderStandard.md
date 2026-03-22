---
title: "ForceProviderStandard"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.physics.util"
fqcn: "com.hypixel.hytale.server.core.modules.physics.util.ForceProviderStandard"
api_surface: false
extends: ~
implements: ["ForceProvider"]
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
public abstract class ForceProviderStandard implements ForceProvider
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public static` | `HytaleLogger` | `LOGGER` |
| `@Nonnull protected` | `Vector3d` | `dragForce` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public abstract` | `double` | `getMass(double var1)` |
| `public abstract` | `double` | `getVolume()` |
| `public abstract` | `double` | `getDensity()` |
| `public abstract` | `double` | `getProjectedArea(PhysicsBodyState var1, double var2)` |
| `public abstract` | `double` | `getFrictionCoefficient()` |
| `public abstract` | `ForceProviderStandardState` | `getForceProviderStandardState()` |
| `@Override public` | `void` | `update(@Nonnull PhysicsBodyState bodyState, @Nonnull ForceAccumulator accumulator, boolean onGround)` |
| `public` | `void` | `clipForce(@Nonnull Vector3d value, @Nonnull Vector3d threshold)` |
