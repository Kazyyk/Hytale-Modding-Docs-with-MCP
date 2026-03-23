---
title: "SensorTarget"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.SensorTarget"
api_surface: false
extends: "SensorWithEntityFilters"
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
public class SensorTarget extends SensorWithEntityFilters
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected static final` | `ComponentType<EntityStore, TransformComponent>` | `TRANSFORM_COMPONENT_TYPE` |
| `protected final` | `int` | `targetSlot` |
| `protected final` | `boolean` | `autoUnlockTarget` |
| `protected final` | `double` | `range` |
| `protected final` | `EntityPositionProvider` | `positionProvider` |
| `` | `Ref<EntityStore>` | `target` |
| `` | `TransformComponent` | `transformComponent` |
| `` | `Vector3d` | `position` |
| `` | `TransformComponent` | `targetTransformComponent` |
| `` | `double` | `squaredDistance` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `SensorTarget(@Nonnull BuilderSensorTarget builderSensorTarget, @Nonnull BuilderSupport support)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `matches(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store)` |
| `public` | `InfoProvider` | `getSensorInfo()` |
| `` | `protected boolean` | `fulfilsRequirements(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, @Nonnull Ref<EntityStore> target, @Nonnull Store<EntityStore> store)` |
