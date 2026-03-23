---
title: "SensorWithEntityFilters"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.SensorWithEntityFilters"
api_surface: false
extends: "SensorBase"
implements: ["IAnnotatedComponentCollection"]
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
public abstract class SensorWithEntityFilters extends SensorBase implements IAnnotatedComponentCollection
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `IEntityFilter[]` | `filters` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `SensorWithEntityFilters(@Nonnull BuilderSensorBase builderSensorBase, @Nonnull IEntityFilter[] filters)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
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
| `@Override public` | `int` | `componentCount()` |
| `@Override public` | `IAnnotatedComponent` | `getComponent(int index)` |
| `@Override public` | `void` | `setContext(IAnnotatedComponent parent, int index)` |
| `protected` | `boolean` | `matchesFilters(@Nonnull Ref<EntityStore> ref, @Nonnull Ref<EntityStore> targetRef, @Nonnull Role role, @Nonnull Store<EntityStore> store)` |
| `protected` | `float` | `findViewAngleFromFilters()` |
