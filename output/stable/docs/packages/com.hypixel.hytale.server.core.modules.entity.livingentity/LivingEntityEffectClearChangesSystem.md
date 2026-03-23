---
title: "LivingEntityEffectClearChangesSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.livingentity"
fqcn: "com.hypixel.hytale.server.core.modules.entity.livingentity.LivingEntityEffectClearChangesSystem"
api_surface: false
extends: "EntityTickingSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "entity"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.livingentity`

```java
public class LivingEntityEffectClearChangesSystem extends EntityTickingSystem<EntityStore>
```

ECS system extending `EntityTickingSystem<EntityStore>`. Processes entities each tick.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getQuery()` | `Query<EntityStore>` | public method. |
| `getDependencies()` | `Set<Dependency<EntityStore>>` | public method. |
