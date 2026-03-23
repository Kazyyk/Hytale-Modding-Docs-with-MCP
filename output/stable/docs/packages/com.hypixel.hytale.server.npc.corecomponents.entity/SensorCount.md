---
title: "SensorCount"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.SensorCount"
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
public class SensorCount extends SensorBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `int` | `minCount` |
| `protected final` | `int` | `maxCount` |
| `protected final` | `double` | `minRange` |
| `protected final` | `double` | `maxRange` |
| `protected final` | `int[]` | `includeGroups` |
| `protected final` | `int[]` | `excludeGroups` |
| `protected` | `boolean` | `findPlayers` |
| `protected final` | `boolean` | `haveIncludeGroups` |
| `protected final` | `boolean` | `haveExcludeGroups` |
| `` | `int[]` | `count` |
| `` | `double[]` | `range` |
| `` | `int` | `roleIndex` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `SensorCount(@Nonnull BuilderSensorCount builderSensorCount, @Nonnull BuilderSupport support)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `registerWithSupport(@Nonnull Role role)` |
| `public` | `boolean` | `matches(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store)` |
| `public` | `InfoProvider` | `getSensorInfo()` |
| `` | `protected static boolean` | `groupListHasPlayer(@Nonnull int[] groups)` |
| `` | `protected boolean` | `filterNPC(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
