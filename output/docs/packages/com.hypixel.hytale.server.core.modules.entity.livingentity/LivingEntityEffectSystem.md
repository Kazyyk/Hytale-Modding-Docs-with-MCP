---
title: "LivingEntityEffectSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.livingentity"
fqcn: "com.hypixel.hytale.server.core.modules.entity.livingentity.LivingEntityEffectSystem"
api_surface: false
extends: "EntityTickingSystem<EntityStore>"
implements: 
  - "DisableProcessingAssert"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "entity"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.livingentity`

```java
public class LivingEntityEffectSystem extends EntityTickingSystem<EntityStore> implements DisableProcessingAssert
```

ECS system extending `EntityTickingSystem<EntityStore>`. Processes entities each tick.

## Fields

| Field | Type | Description |
|---|---|---|
| `EFFECT_NAME_BURN` | `String` | Static final String field. |
| `BLOCK_TYPE_FLUID_WATER` | `String` | Static final String field. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getQuery()` | `Query<EntityStore>` | public method. |
| `isParallel(int archetypeChunkSize, int taskCount)` | `boolean` | public method. |
| `getGroup()` | `SystemGroup<EntityStore>` | public method. |
