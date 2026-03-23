---
title: "ActionSetStat"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.ActionSetStat"
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
public class ActionSetStat extends ActionBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected static final` | `ComponentType<EntityStore, EntityStatMap>` | `STAT_MAP_COMPONENT_TYPE` |
| `protected final` | `int` | `stat` |
| `protected final` | `float` | `value` |
| `protected final` | `boolean` | `add` |
| `` | `EntityStatMap` | `entityStatMapComponent` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ActionSetStat(@Nonnull BuilderActionSetStat builder, @Nonnull BuilderSupport support)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `canExecute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)` |
| `public` | `boolean` | `execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)` |
