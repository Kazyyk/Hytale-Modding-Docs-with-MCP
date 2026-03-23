---
title: "SensorEntityPrioritiserDefault"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity.prioritisers"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.prioritisers.SensorEntityPrioritiserDefault"
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
public class SensorEntityPrioritiserDefault implements ISensorEntityPrioritiser
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `ComponentType<EntityStore, TransformComponent>` | `TRANSFORM_COMPONENT_TYPE` |
| `private final` | `SensorEntityPrioritiserDefault.DefaultPrioritiser` | `playerPrioritiser` |
| `private final` | `SensorEntityPrioritiserDefault.DefaultPrioritiser` | `npcPrioritiser` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `IEntityByPriorityFilter` | `getNPCPrioritiser()` |
| `@Nonnull @Override public` | `IEntityByPriorityFilter` | `getPlayerPrioritiser()` |
| `@Nonnull @Override public` | `Ref<EntityStore>` | `pickTarget(Ref<EntityStore> ref,
        @Nonnull Role role,
        @Nonnull Vector3d position,
        @Nonnull Ref<EntityStore> playerRef,
        @Nonnull Ref<EntityStore> npcRef,
        boolean useProjectedDistance,
        @Nonnull Store<EntityStore> store)` |
| `@Override public` | `boolean` | `providesFilters()` |
| `@Override public` | `void` | `buildProvidedFilters(List<IEntityFilter> filters)` |

## Inner Types

- `SensorEntityPrioritiserDefault.DefaultPrioritiser`
