---
title: "BodyMotionFlock"
kind: "class"
package: "com.hypixel.hytale.server.flock.corecomponents"
fqcn: "com.hypixel.hytale.server.flock.corecomponents.BodyMotionFlock"
api_surface: false
extends: "BodyMotionBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "flock"
  - "corecomponents"
  - "class"
---

**Package:** `com.hypixel.hytale.server.flock.corecomponents`

```java
public class BodyMotionFlock extends BodyMotionBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final ComponentType<EntityStore,` | `FlockMembership>` | `FLOCK_MEMBERSHIP_COMPONENT_TYPE` |
| `private static final ComponentType<EntityStore,` | `TransformComponent>` | `TRANSFORM_COMPONENT_TYPE` |
| `private static final ComponentType<EntityStore,` | `EntityGroup>` | `ENTITY_GROUP_COMPONENT_TYPE` |
| `protected final` | `GroupSteeringAccumulator` | `groupSteeringAccumulator` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `computeSteering( @Nonnull Ref<EntityStore> ref, @Nonnull Role role, @Nullable InfoProvider sensorInfo, double dt, @Nonnull Steering desiredSteering, @Nonnull ComponentAccessor<EntityStore> componentAccessor )` |
