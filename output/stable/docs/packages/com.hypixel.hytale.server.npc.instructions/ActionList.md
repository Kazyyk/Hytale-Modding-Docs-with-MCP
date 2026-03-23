---
title: "ActionList"
kind: "class"
package: "com.hypixel.hytale.server.npc.instructions"
fqcn: "com.hypixel.hytale.server.npc.instructions.ActionList"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "npc"
  - "instructions"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.instructions`

```java
public class ActionList
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `ActionList` | `EMPTY_ACTION_LIST` |
| `protected final` | `Action[]` | `actions` |
| `protected` | `boolean` | `blocking` |
| `protected` | `boolean` | `atomic` |
| `protected` | `int` | `actionIndex` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `setBlocking(boolean blocking)` |
| `public` | `void` | `setAtomic(boolean atomic)` |
| `public` | `boolean` | `canExecute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)` |
| `public` | `boolean` | `execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)` |
| `public` | `boolean` | `hasCompletedRun()` |
| `public` | `void` | `setContext(IAnnotatedComponent parent)` |
| `public` | `void` | `registerWithSupport(Role role)` |
| `public` | `void` | `motionControllerChanged( @Nullable Ref<EntityStore> ref, @Nonnull NPCEntity npcComponent, MotionController motionController, @Nullable ComponentAccessor<EntityStore> componentAccessor )` |
| `public` | `void` | `loaded(Role role)` |
| `public` | `void` | `spawned(Role role)` |
| `public` | `void` | `unloaded(Role role)` |
| `public` | `void` | `removed(Role role)` |
| `public` | `void` | `teleported(Role role, World from, World to)` |
| `public` | `void` | `clearOnce()` |
| `public` | `void` | `onEndMotion()` |
| `public` | `void` | `setOnce()` |
| `public` | `int` | `actionCount()` |
| `public` | `IAnnotatedComponent` | `getComponent(int index)` |
