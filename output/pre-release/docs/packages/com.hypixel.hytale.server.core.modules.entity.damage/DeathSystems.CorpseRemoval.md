---
title: "DeathSystems.CorpseRemoval"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DeathSystems.CorpseRemoval"
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
public static class DeathSystems.CorpseRemoval extends EntityTickingSystem<EntityStore>
```

Removes dead non-player entities from the store. If the entity has a `DeferredCorpseRemoval` component and its timer has expired, removes it and optionally spawns death particles. If no deferred removal, removes immediately after death interactions complete.

## Relationships

- Inner class of [DeathSystems](DeathSystems.md)
