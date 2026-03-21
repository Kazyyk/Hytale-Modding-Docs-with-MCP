---
title: "SpawnNPCInteraction"
kind: "class"
package: "com.hypixel.hytale.server.npc.interactions"
fqcn: "com.hypixel.hytale.server.npc.interactions.SpawnNPCInteraction"
api_surface: false
extends: "SimpleBlockInteraction"
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "npc"
---
**Package:** `com.hypixel.hytale.server.npc.interactions`

```java
public class SpawnNPCInteraction extends SimpleBlockInteraction
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `String` | `entityId` |
| `protected` | `SpawnNPCInteraction.WeightedNPCSpawn[]` | `weightedSpawns` |
| `protected` | `IWeightedMap<String>` | `weightedSpawnMap` |
| `protected` | `float` | `spawnYawOffset` |
| `protected` | `float` | `spawnChance` |
| `private` | `String` | `id` |
| `private` | `double` | `weight` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `private` | `void` | `spawnNPC(@Nonnull Store<EntityStore> store, @Nonnull Vector3i targetBlock)` |
| `private` | `SpawnNPCInteraction.SpawnData` | `computeSpawnData(@Nonnull World world, @Nonnull Vector3i targetBlock)` |
| `protected` | `void` | `interactWithBlock( @Nonnull World world, @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull Vector3i targetBlock, @Nonnull CooldownHandler cooldownHandler )` |
| `protected` | `void` | `simulateInteractWithBlock( @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nullable ItemStack itemInHand, @Nonnull World world, @Nonnull Vector3i targetBlock )` |
| `private` | `record` | `SpawnData(@Nonnull Vector3d position, @Nonnull Vector3f rotation)` |
| `public` | `double` | `getWeight()` |
