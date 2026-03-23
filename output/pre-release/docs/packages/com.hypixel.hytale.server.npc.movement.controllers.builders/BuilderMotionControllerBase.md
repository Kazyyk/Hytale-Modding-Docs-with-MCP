---
title: "BuilderMotionControllerBase"
kind: "class"
package: "com.hypixel.hytale.server.npc.movement.controllers.builders"
fqcn: "com.hypixel.hytale.server.npc.movement.controllers.builders.BuilderMotionControllerBase"
api_surface: false
extends: "BuilderBaseWithType<MotionController>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "movement"
  - "controllers"
  - "builders"
---

**Package:** `com.hypixel.hytale.server.npc.movement.controllers.builders`

```java
public abstract class BuilderMotionControllerBase extends BuilderBaseWithType<MotionController>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `float` | `epsilonAngle` |
| `protected` | `double` | `epsilonSpeed` |
| `protected` | `double` | `forceVelocityDamping` |
| `protected final` | `DoubleHolder` | `maxHorizontalSpeed` |
| `protected final` | `DoubleHolder` | `fastHorizontalThreshold` |
| `protected` | `double` | `fastHorizontalThresholdRange` |
| `protected final` | `FloatHolder` | `maxHeadRotationSpeed` |
| `` | `BuilderInfo` | `builderInfo` |
| `` | `boolean` | `result` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Builder<MotionController>` | `readCommonConfig(@Nonnull JsonElement data)` |
| `public final` | `boolean` | `isEnabled(ExecutionContext context)` |
| `public` | `String` | `getIdentifier()` |
| `public` | `boolean` | `validate(String configName, @Nonnull NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, @Nonnull List<String> errors)` |
| `` | `public float` | `getEpsilonAngle()` |
| `` | `public double` | `getEpsilonSpeed()` |
| `` | `public double` | `getForceVelocityDamping()` |
| `` | `public double` | `getMaxHorizontalSpeed(@Nonnull BuilderSupport builderSupport)` |
| `` | `public float` | `getMaxHeadRotationSpeed(@Nonnull BuilderSupport support)` |
| `` | `public double` | `getFastHorizontalThreshold(@Nonnull BuilderSupport builderSupport)` |
| `` | `public double` | `getFastHorizontalThresholdRange()` |
| `` | `public abstract Class<? extends MotionController>` | `getClassType()` |
