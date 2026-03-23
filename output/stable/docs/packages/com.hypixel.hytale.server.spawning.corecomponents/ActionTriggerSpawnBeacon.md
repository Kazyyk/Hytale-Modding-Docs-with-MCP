---
title: "ActionTriggerSpawnBeacon"
kind: "class"
package: "com.hypixel.hytale.server.spawning.corecomponents"
fqcn: "com.hypixel.hytale.server.spawning.corecomponents.ActionTriggerSpawnBeacon"
api_surface: false
extends: "ActionBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "spawning"
  - "corecomponents"
  - "class"
---

**Package:** `com.hypixel.hytale.server.spawning.corecomponents`

```java
public class ActionTriggerSpawnBeacon extends ActionBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `int` | `beaconId` |
| `protected final` | `int` | `range` |
| `protected final` | `int` | `targetSlot` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `canExecute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)` |
| `@Override public` | `void` | `registerWithSupport(Role role)` |
| `@Override public` | `boolean` | `execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)` |
