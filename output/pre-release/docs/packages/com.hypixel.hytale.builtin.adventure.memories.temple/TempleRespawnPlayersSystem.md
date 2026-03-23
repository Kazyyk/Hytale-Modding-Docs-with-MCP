---
title: "TempleRespawnPlayersSystem"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.memories.temple"
fqcn: "com.hypixel.hytale.builtin.adventure.memories.temple.TempleRespawnPlayersSystem"
api_surface: false
extends: "DelayedEntitySystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "memories"
  - "temple"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.memories.temple`

```java
public class TempleRespawnPlayersSystem extends DelayedEntitySystem
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `ComponentType<EntityStore,PlayerRef>` | `playerRefComponentType` |
| `private final` | `ComponentType<EntityStore,TransformComponent>` | `transformComponentType` |
| `private final` | `Query<EntityStore>` | `query` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)` |
| `@Nonnull @Override public` | `Query<EntityStore>` | `getQuery()` |
