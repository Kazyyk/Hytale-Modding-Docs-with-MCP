---
title: "ActionMount"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts.npc"
fqcn: "com.hypixel.hytale.builtin.mounts.npc.ActionMount"
api_surface: false
extends: "ActionBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "mounts"
  - "npc"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.mounts.npc`

```java
public class ActionMount extends ActionBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `String` | `EMPTY_ROLE_ID` |
| `protected final` | `float` | `anchorX` |
| `protected final` | `float` | `anchorY` |
| `protected final` | `float` | `anchorZ` |
| `protected final` | `String` | `movementConfigId` |
| `protected final` | `int` | `emptyRoleIndex` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `canExecute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)` |
| `@Override public` | `boolean` | `execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)` |
