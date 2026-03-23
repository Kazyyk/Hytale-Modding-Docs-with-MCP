---
title: "SensorKill"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.SensorKill"
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
public class SensorKill extends SensorBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `int` | `targetSlot` |
| `protected final` | `PositionProvider` | `positionProvider` |
| `` | `NPCEntity` | `npcComponent` |
| `` | `DamageData` | `damageData` |
| `` | `Ref<EntityStore>` | `targetRef` |
| `` | `Vector3d` | `killPosition` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `SensorKill(@Nonnull BuilderSensorKill builder, @Nonnull BuilderSupport support)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `matches(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store)` |
| `public` | `InfoProvider` | `getSensorInfo()` |
