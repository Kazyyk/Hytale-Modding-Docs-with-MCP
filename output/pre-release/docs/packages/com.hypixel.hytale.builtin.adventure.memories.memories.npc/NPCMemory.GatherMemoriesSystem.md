---
title: "NPCMemory.GatherMemoriesSystem"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.memories.memories.npc"
fqcn: "com.hypixel.hytale.builtin.adventure.memories.memories.npc.NPCMemory.GatherMemoriesSystem"
api_surface: false
extends: "EntityTickingSystem"
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "builtin"
  - "npc"
---
**Package:** `com.hypixel.hytale.builtin.adventure.memories.memories.npc`

```java
public static class GatherMemoriesSystem extends EntityTickingSystem<EntityStore>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `ComponentType<EntityStore, TransformComponent>` | `transformComponentType` |
| `private final` | `ComponentType<EntityStore, Player>` | `playerComponentType` |
| `private final` | `ComponentType<EntityStore, PlayerRef>` | `playerRefComponentType` |
| `private final` | `ComponentType<EntityStore, PlayerMemories>` | `playerMemoriesComponentType` |
| `private final` | `Query<EntityStore>` | `query` |
| `private final` | `double` | `radius` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `GatherMemoriesSystem( @Nonnull ComponentType<EntityStore, TransformComponent> transformComponentType, @Nonnull ComponentType<EntityStore, Player> playerComponentType, @Nonnull ComponentType<EntityStore, PlayerRef> playerRefComponentType, @Nonnull ComponentType<EntityStore, PlayerMemories> playerMemoriesComponentType, double radius )` |
| `public` | `void` | `tick( float dt, int index, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )` |
| `private static` | `String` | `findLocationZoneName(@Nonnull World world, @Nonnull Vector3d position)` |
| `private static` | `void` | `displayCatchEntityParticles( @Nonnull MemoriesGameplayConfig memoriesGameplayConfig, @Nonnull Vector3d targetPosition, @Nonnull Ref<EntityStore> targetRef, @Nonnull CommandBuffer<EntityStore> commandBuffer )` |
| `public` | `Query<EntityStore>` | `getQuery()` |
