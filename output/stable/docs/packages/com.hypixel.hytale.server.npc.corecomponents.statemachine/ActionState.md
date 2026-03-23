---
title: "ActionState"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.statemachine"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.statemachine.ActionState"
api_surface: false
extends: "ActionBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "corecomponents"
  - "statemachine"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.statemachine`

```java
public class ActionState extends ActionBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `int` | `state` |
| `protected final` | `int` | `subState` |
| `protected final` | `boolean` | `clearOnce` |
| `protected final` | `boolean` | `componentLocal` |
| `protected final` | `int` | `componentIndex` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)` |
| `@Override public` | `void` | `getInfo(Role role, ComponentInfo holder)` |
