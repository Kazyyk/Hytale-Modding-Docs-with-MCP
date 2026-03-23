---
title: "GroupSteeringAccumulator"
kind: "class"
package: "com.hypixel.hytale.server.npc.movement"
fqcn: "com.hypixel.hytale.server.npc.movement.GroupSteeringAccumulator"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "npc"
  - "movement"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.movement`

```java
public class GroupSteeringAccumulator
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private static final` | `ComponentType<EntityStore, TransformComponent>` | `TRANSFORM_COMPONENT_TYPE` |
| `private final` | `Vector3d` | `sumOfVelocities` |
| `private final` | `Vector3d` | `sumOfDistances` |
| `private final` | `Vector3d` | `sumOfPositions` |
| `private final` | `Vector3d` | `temp` |
| `private` | `int` | `count` |
| `private` | `double` | `x` |
| `private` | `double` | `y` |
| `private` | `double` | `z` |
| `private` | `double` | `xViewDirection` |
| `private` | `double` | `yViewDirection` |
| `private` | `double` | `zViewDirection` |
| `private` | `Vector3d` | `componentSelector` |
| `private` | `double` | `maxRangeSquared` |
| `private` | `double` | `maxDistance` |
| `private` | `float` | `collisionViewHalfAngleCosine` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `begin(double x, double y, double z, double xViewDirection, double yViewDirection, double zViewDirection)` |
| `public` | `void` | `begin(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `void` | `processEntity(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `void` | `processEntity(@Nonnull Ref<EntityStore> ref,
        double distanceWeight,
        double positionWeight,
        double velocityWeight,
        @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `void` | `end()` |
| `public` | `void` | `setComponentSelector(Vector3d componentSelector)` |
| `public` | `void` | `setMaxRange(double maxRange)` |
| `public` | `void` | `setViewConeHalfAngleCosine(float collisionViewHalfAngleCosine)` |
| `@Nonnull public` | `Vector3d` | `getSumOfVelocities()` |
| `@Nonnull public` | `Vector3d` | `getSumOfDistances()` |
| `@Nonnull public` | `Vector3d` | `getSumOfPositions()` |
| `public` | `int` | `getCount()` |
