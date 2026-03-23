---
title: "DeathSystems.TickCorpseRemoval"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DeathSystems.TickCorpseRemoval"
api_surface: false
extends: "EntityTickingSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:22:51Z"
tags:
  - "damage"
  - "death"
  - "system"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class DeathSystems.TickCorpseRemoval extends EntityTickingSystem<EntityStore>
```

Ticks the `DeferredCorpseRemoval` timer for dead non-player entities. Only ticks when the death interaction chain (if any) has finished.

## Relationships

- Inner class of [DeathSystems](DeathSystems.md)
