---
title: "HeadMotionWatch"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.HeadMotionWatch"
api_surface: false
extends: "HeadMotionBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "corecomponents"
  - "entity"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.entity`

```java
public class HeadMotionWatch extends HeadMotionBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected static final` | `ComponentType<EntityStore, TransformComponent>` | `TRANSFORM_COMPONENT_TYPE` |
| `protected static final` | `ComponentType<EntityStore, ModelComponent>` | `MODEL_COMPONENT_TYPE` |
| `protected final` | `double` | `relativeTurnSpeed` |
| `` | `IPositionProvider` | `positionProvider` |
| `` | `Ref<EntityStore>` | `targetRef` |
| `` | `double` | `x` |
| `` | `double` | `y` |
| `` | `double` | `z` |
| `` | `ModelComponent` | `targetModelComponent` |
| `` | `TransformComponent` | `transformComponent` |
| `` | `ModelComponent` | `modelComponent` |
| `` | `Model` | `model` |
| `` | `Vector3d` | `position` |
| `` | `float` | `yaw` |
| `` | `float` | `pitch` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `HeadMotionWatch(@Nonnull BuilderHeadMotionWatch builderHeadMotionWatch, @Nonnull BuilderSupport support)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `computeSteering(@Nonnull Ref<EntityStore> ref,
        @Nonnull Role role,
        @Nullable InfoProvider sensorInfo,
        double dt,
        @Nonnull Steering desiredSteering,
        @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
