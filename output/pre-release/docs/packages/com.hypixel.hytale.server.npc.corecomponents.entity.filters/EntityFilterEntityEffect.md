---
title: "EntityFilterEntityEffect"
kind: "class"
package: "com.hypixel.hytale.server.npc.corecomponents.entity.filters"
fqcn: "com.hypixel.hytale.server.npc.corecomponents.entity.filters.EntityFilterEntityEffect"
api_surface: false
extends: "EntityFilterBase"
generator_version: "2.0.0"
generated_at: "2026-03-22T00:00:00Z"
tags:
  - "npc"
  - "entity-filter"
  - "effects"
---

**Package:** `com.hypixel.hytale.server.npc.corecomponents.entity.filters`

```java
public class EntityFilterEntityEffect extends EntityFilterBase
```

NPC entity filter that checks whether a target entity has a specific active entity effect. Used in NPC AI decision-making to conditionally include or exclude entities based on applied effects (e.g., poison, buffs).

## Static Fields

| Field | Type | Description |
|---|---|---|
| `COST` | `int` | Filter evaluation cost: `100`. |

## Constructor

```java
public EntityFilterEntityEffect(@Nonnull BuilderEntityFilterEntityEffect builder, @Nonnull BuilderSupport support)
```

Resolves the entity effect index from the builder at construction time.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `matchesEntity(Ref<EntityStore>, Ref<EntityStore>, Role, Store<EntityStore>)` | `boolean` | Returns `true` if the target entity's `EffectControllerComponent` has the specified effect active. |
| `cost()` | `int` | Returns `100`. |
