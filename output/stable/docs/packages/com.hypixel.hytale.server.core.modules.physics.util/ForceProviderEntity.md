---
title: "ForceProviderEntity"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.physics.util"
fqcn: "com.hypixel.hytale.server.core.modules.physics.util.ForceProviderEntity"
api_surface: false
extends: "ForceProviderStandard"
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
@Deprecated public class ForceProviderEntity extends ForceProviderStandard
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `BoundingBox` | `boundingBox` |
| `protected` | `ForceProviderStandardState` | `forceProviderStandardState` |
| `protected` | `double` | `density` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ForceProviderEntity(BoundingBox boundingBox)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `setDensity(double density)` |
| `public` | `void` | `setForceProviderStandardState(ForceProviderStandardState forceProviderStandardState)` |
| `@Override public` | `ForceProviderStandardState` | `getForceProviderStandardState()` |
| `@Override public` | `double` | `getMass(double volume)` |
| `@Override public` | `double` | `getVolume()` |
| `@Override public` | `double` | `getProjectedArea(@Nonnull PhysicsBodyState bodyState, double speed)` |
| `@Override public` | `double` | `getDensity()` |
| `@Override public` | `double` | `getFrictionCoefficient()` |
