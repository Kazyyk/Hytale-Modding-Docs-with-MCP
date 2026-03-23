---
title: "InteractionSystems"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.system"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.system.InteractionSystems"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:08:32Z"
tags:
  - "interaction"
  - "ecs"
  - "system"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.system`

```java
public class InteractionSystems
```

Container class for ECS systems that manage entity interactions. Houses systems for interaction manager lifecycle, entity tracker synchronization, and interaction ticking.

## Inner Types

- **CleanUpSystem** -- `RefSystem<EntityStore>` that clears the `InteractionManager` when an entity is removed.
- **EntityTrackerRemove** -- `RefChangeSystem<EntityStore, Interactions>` that queues tracker removal updates when the `Interactions` component is removed.
- **PlayerAddManagerSystem** -- `HolderSystem<EntityStore>` that adds an `InteractionManager` component to players on entity add.
- **TickInteractionManagerSystem** -- `EntityTickingSystem<EntityStore>` that ticks interaction managers each frame and sends sync packets to players. Implements `StatModifyingSystem`.
- **TrackerTickSystem** -- `EntityTickingSystem<EntityStore>` that queues interaction component updates to entity tracker viewers.
