---
title: "SensorBeacon"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.SensorBeacon"
api_surface: false
extends: "SensorBase"
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
public class SensorBeacon extends SensorBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected static final` | `ComponentType<EntityStore, TransformComponent>` | `TRANSFORM_COMPONENT_TYPE` |
| `protected final` | `int` | `messageIndex` |
| `protected final` | `double` | `range` |
| `protected final` | `int` | `targetSlot` |
| `protected final` | `boolean` | `consume` |
| `private final` | `EntityPositionProvider` | `positionProvider` |
| `` | `BeaconSupport` | `beaconSupportComponent` |
| `` | `Ref<EntityStore>` | `target` |
| `` | `Ref<EntityStore>` | `targetRef` |
| `` | `TransformComponent` | `targetTransformComponent` |
| `` | `Vector3d` | `targetPosition` |
| `` | `TransformComponent` | `transformComponent` |
| `` | `Vector3d` | `position` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `SensorBeacon(@Nonnull BuilderSensorBeacon builderSensorBeacon, @Nonnull BuilderSupport builderSupport)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `matches(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store)` |
| `public` | `InfoProvider` | `getSensorInfo()` |
