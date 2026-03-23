---
title: "EntityStatsSystems"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entitystats"
fqcn: "com.hypixel.hytale.server.core.modules.entitystats.EntityStatsSystems"
api_surface: false
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "entity-stats"
  - "ecs"
  - "system"
---

**Package:** `com.hypixel.hytale.server.core.modules.entitystats`

```java
public class EntityStatsSystems
```

Container class for all ECS systems related to entity stat processing. These systems handle stat initialization, regeneration, recalculation, network replication, and change event processing.

## Inner Types

| Type | Kind | Store | Description |
|---|---|---|---|
| `Setup` | `HolderSystem<EntityStore>` | EntityStore | Ensures every `LivingEntity` has an `EntityStatMap` component on spawn. |
| `Regenerate<EntityType>` | `EntityTickingSystem<EntityStore>` | EntityStore | Ticks regeneration values on stat map entries, including armor regen. Implements `StatModifyingSystem`. |
| `Recalculate` | `EntityTickingSystem<EntityStore>` | EntityStore | Invokes `StatModifiersManager.recalculateEntityStatModifiers()` each tick for living entities. |
| `Changes` | `EntityTickingSystem<EntityStore>` | EntityStore | Processes stat change events -- triggers min/max value effects (interactions), and initiates death when health reaches minimum. |
| `EntityTrackerUpdate` | `EntityTickingSystem<EntityStore>` | EntityStore | Sends stat updates to entity tracker viewers. Handles newly-visible and incremental updates. |
| `EntityTrackerRemove` | `RefChangeSystem<EntityStore>` | EntityStore | Queues stat removal packets when the `EntityStatMap` component is removed. |
| `ClearChanges` | `EntityTickingSystem<EntityStore>` | EntityStore | Clears pending stat update buffers after entity tracker processing. |
| `StatModifyingSystem` | interface | EntityStore | Marker interface for systems that modify entity stats. Used for dependency ordering. |
