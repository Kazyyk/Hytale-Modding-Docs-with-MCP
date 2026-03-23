---
title: "SensorEntityPrioritiserAttitude"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity.prioritisers"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.prioritisers.SensorEntityPrioritiserAttitude"
api_surface: false
extends: ~
implements: ["ISensorEntityPrioritiser"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "npc"
  - "corecomponents"
  - "entity"
  - "prioritisers"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.entity.prioritisers`

```java
public class SensorEntityPrioritiserAttitude implements ISensorEntityPrioritiser
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `ComponentType<EntityStore, TransformComponent>` | `TRANSFORM_COMPONENT_TYPE` |
| `private final` | `Attitude[]` | `attitudeByPriority` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `SensorEntityPrioritiserAttitude(@Nonnull BuilderSensorEntityPrioritiserAttitude builder, @Nonnull BuilderSupport support)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `registerWithSupport(@Nonnull Role role)` |
| `@Nonnull @Override public` | `IEntityByPriorityFilter` | `getNPCPrioritiser()` |
| `@Nonnull @Override public` | `IEntityByPriorityFilter` | `getPlayerPrioritiser()` |
| `@Nonnull @Override public` | `Ref<EntityStore>` | `pickTarget(@Nonnull Ref<EntityStore> ref,
        @Nonnull Role role,
        @Nonnull Vector3d position,
        @Nonnull Ref<EntityStore> playerRef,
        @Nonnull Ref<EntityStore> npcRef,
        boolean useProjectedDistance,
        @Nonnull Store<EntityStore> store)` |
| `@Override public` | `boolean` | `providesFilters()` |
| `@Override public` | `void` | `buildProvidedFilters(@Nonnull List<IEntityFilter> filters)` |
| `protected` | `int` | `getPriority(@Nonnull Ref<EntityStore> ref, @Nonnull WorldSupport support, @Nonnull Ref<EntityStore> targetRef, @Nonnull Store<EntityStore> store)` |

## Inner Types

- `SensorEntityPrioritiserAttitude.AttitudePrioritiser`
