---
title: "SensorHasTask"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.npcobjectives.npc"
fqcn: "com.hypixel.hytale.builtin.adventure.npcobjectives.npc.SensorHasTask"
api_surface: false
extends: "SensorBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "npcobjectives"
  - "npc"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.npcobjectives.npc`

```java
public class SensorHasTask extends SensorBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `String[]` | `tasksById` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)` |
| `@Override public` | `InfoProvider` | `getSensorInfo()` |
