---
title: "WeightedAction"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.WeightedAction"
api_surface: false
extends: "AnnotatedComponentBase"
implements: ["Action"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "npc"
  - "corecomponents"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents`

```java
public class WeightedAction extends AnnotatedComponentBase implements Action
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nullable private final` | `Action` | `action` |
| `private final` | `double` | `weight` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `WeightedAction(@Nonnull BuilderWeightedAction builder, @Nonnull BuilderSupport support)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `double` | `getWeight()` |
| `@Override public` | `boolean` | `canExecute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)` |
| `@Override public` | `boolean` | `execute(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, InfoProvider sensorInfo, double dt, @Nonnull Store<EntityStore> store)` |
| `@Override public` | `void` | `activate(Role role, InfoProvider infoProvider)` |
| `@Override public` | `void` | `deactivate(Role role, InfoProvider infoProvider)` |
| `@Override public` | `boolean` | `isActivated()` |
| `@Override public` | `void` | `getInfo(Role role, ComponentInfo holder)` |
| `@Override public` | `boolean` | `processDelay(float dt)` |
| `@Override public` | `void` | `clearOnce()` |
| `@Override public` | `void` | `setOnce()` |
| `@Override public` | `boolean` | `isTriggered()` |
| `@Override public` | `void` | `registerWithSupport(Role role)` |
| `@Override public` | `void` | `motionControllerChanged(@Nullable Ref<EntityStore> ref,
        @Nonnull NPCEntity npcComponent,
        MotionController motionController,
        @Nullable ComponentAccessor<EntityStore> componentAccessor)` |
| `@Override public` | `void` | `loaded(Role role)` |
| `@Override public` | `void` | `spawned(Role role)` |
| `@Override public` | `void` | `unloaded(Role role)` |
| `@Override public` | `void` | `removed(Role role)` |
| `@Override public` | `void` | `teleported(Role role, World from, World to)` |
