---
title: "ActionBeacon"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.ActionBeacon"
api_surface: false
extends: "ActionBase"
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
public class ActionBeacon extends ActionBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `String` | `message` |
| `protected final` | `double` | `range` |
| `protected final` | `int[]` | `targetGroups` |
| `protected final` | `int` | `targetToSendSlot` |
| `protected final` | `double` | `expirationTime` |
| `protected final` | `int` | `sendCount` |
| `protected final` | `List<Ref<EntityStore>>` | `sendList` |
| `` | `Ref<EntityStore>` | `target` |
| `` | `PositionCache` | `positionCache` |
| `` | `NPCEntity` | `npcComponent` |
| `` | `Role` | `role` |
| `` | `ThreadLocalRandom` | `random` |
| `` | `Vector3f` | `color` |
| `` | `Matrix4d` | `matrix` |
| `` | `Matrix4d` | `tmp` |
| `` | `TransformComponent` | `transformComponent` |
| `` | `Vector3d` | `pos` |
| `` | `ModelComponent` | `modelComponent` |
| `` | `Model` | `model` |
| `` | `double` | `x` |
| `` | `double` | `y` |
| `` | `double` | `z` |
| `` | `TransformComponent` | `targetTransformComponent` |
| `` | `Vector3d` | `targetPos` |
| `` | `ModelComponent` | `targetModelComponent` |
| `` | `float` | `targetEyeHeight` |
| `` | `double` | `angleY` |
| `` | `double` | `angleX` |
| `` | `BeaconSupport` | `beaconSupportComponent` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ActionBeacon(@Nonnull BuilderActionBeacon builderActionBeacon, @Nonnull BuilderSupport support)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `registerWithSupport(@Nonnull Role role)` |
| `public` | `boolean` | `canExecute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)` |
| `public` | `boolean` | `execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)` |
| `` | `protected static boolean` | `filterNPCs(@Nonnull Ref<EntityStore> ref, @Nonnull ActionBeacon _this, @Nonnull Role role, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `` | `protected void` | `sendNPCMessage(@Nonnull Ref<EntityStore> self,
        @Nonnull Ref<EntityStore> targetRef,
        @Nonnull Ref<EntityStore> target,
        @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
