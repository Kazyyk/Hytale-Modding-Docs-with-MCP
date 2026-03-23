---
title: "MemoriesPlugin.PlayerAddedSystem"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.memories"
fqcn: "com.hypixel.hytale.builtin.adventure.memories.MemoriesPlugin.PlayerAddedSystem"
api_surface: false
extends: "RefSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "memories"
  - "ecs"
  - "system"
---

**Package:** `com.hypixel.hytale.builtin.adventure.memories`

```java
public static class PlayerAddedSystem extends RefSystem<EntityStore>
```

ECS system that runs after `PlayerSystems.PlayerSpawnedSystem`. When a player entity is added, sends an `UpdateMemoriesFeatureStatus` packet to the player's connection indicating whether the memories feature is unlocked (i.e., whether the player has a `PlayerMemories` component).

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Query<EntityStore>` | `getQuery()` |
| `public` | `Set<Dependency<EntityStore>>` | `getDependencies()` |
| `public` | `void` | `onEntityAdded(@Nonnull Ref<EntityStore> ref, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer)` |
| `public` | `void` | `onEntityRemove(@Nonnull Ref<EntityStore> ref, @Nonnull RemoveReason reason, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer)` |
