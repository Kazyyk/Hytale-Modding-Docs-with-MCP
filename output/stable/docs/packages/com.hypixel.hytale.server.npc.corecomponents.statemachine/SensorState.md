---
title: "SensorState"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.statemachine"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.statemachine.SensorState"
api_surface: false
extends: "SensorBase"
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
public class SensorState extends SensorBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `int` | `state` |
| `protected final` | `boolean` | `defaultSubState` |
| `protected final` | `int` | `subState` |
| `protected final` | `boolean` | `componentLocal` |
| `protected final` | `int` | `componentIndex` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)` |
| `@Override public` | `InfoProvider` | `getSensorInfo()` |
| `@Override public` | `void` | `getInfo(Role role, ComponentInfo holder)` |
