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
generated_at: "2026-03-22T21:22:51Z"
tags:
  - "entity"
  - "effect"
  - "system"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.livingentity`

```java
public class LivingEntityEffectSystem extends EntityTickingSystem<EntityStore> implements DisableProcessingAssert
```

ECS ticking system that processes active entity effects each tick. For each entity with an `EffectControllerComponent` and `TransformComponent`, iterates over active effects, checks apply conditions, ticks each effect's duration and stat modifications, removes expired or condition-failed effects, and tracks invulnerability state. Runs non-parallel within the `GatherDamage` system group.

## Static Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `boolean` | `canApplyEffect(Ref<EntityStore> ownerRef, EntityEffect entityEffect, ComponentAccessor<EntityStore> componentAccessor)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Query<EntityStore>` | `getQuery()` |
| `public` | `boolean` | `isParallel(int archetypeChunkSize, int taskCount)` |
| `public` | `void` | `tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)` |
| `public` | `SystemGroup<EntityStore>` | `getGroup()` |

## Relationships

- Extends `EntityTickingSystem<EntityStore>`
- Implements `DisableProcessingAssert`
- Evaluates [Condition](../com.hypixel.hytale.server.core.modules.entity.condition/Condition.md) arrays via `Condition.allConditionsMet()`
