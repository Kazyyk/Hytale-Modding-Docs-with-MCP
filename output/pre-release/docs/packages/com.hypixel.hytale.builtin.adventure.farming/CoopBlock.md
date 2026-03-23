---
title: "CoopBlock"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming.states"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.states.CoopBlock"
api_surface: false
extends: null
implements:
  - "Component<ChunkStore>"
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "farming"
  - "component"
  - "coop"
---

**Package:** `com.hypixel.hytale.builtin.adventure.farming.states`

```java
public class CoopBlock implements Component<ChunkStore>
```

A `ChunkStore` component representing a farming coop block. Manages a list of [CoopResident](CoopBlock.CoopResident.md) records, an item container for produce storage, and the reference to a [FarmingCoopAsset](FarmingCoopAsset.md) configuration. Handles resident spawning/despawning in the world, wild NPC capture, produce generation based on time elapsed, and cleanup when the block is broken.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `@Nonnull public static final` | `String` | `STATE_PRODUCE` | `"Produce_Ready"` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `String` | `coopAssetId` |
| `@Nonnull protected` | `List<CoopBlock.CoopResident>` | `residents` |
| `@Nonnull protected` | `ItemContainer` | `itemContainer` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<ChunkStore, CoopBlock>` | `getComponentType()` |
| `@Nullable public` | `FarmingCoopAsset` | `getCoopAsset()` |
| `public` | `boolean` | `tryPutResident(@Nonnull CapturedNPCMetadata metadata, @Nonnull WorldTimeResource worldTimeResource)` |
| `public` | `boolean` | `tryPutWildResidentFromWild(@Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> entityRef, @Nonnull WorldTimeResource worldTimeResource, @Nonnull Vector3i coopLocation)` |
| `public` | `boolean` | `getCoopAcceptsNPC(String npcNameKey)` |
| `public` | `void` | `generateProduceToInventory(@Nonnull WorldTimeResource worldTimeResource)` |
| `public` | `void` | `gatherProduceFromContainer(@Nonnull ItemContainer playerInventory)` |
| `public` | `void` | `ensureSpawnResidentsInWorld(@Nonnull World world, @Nonnull Store<EntityStore> store, @Nonnull Vector3d coopLocation, @Nonnull Vector3d spawnOffset)` |
| `public` | `void` | `ensureNoResidentsInWorld(@Nonnull Store<EntityStore> store)` |
| `public` | `boolean` | `shouldResidentsBeInCoop(@Nonnull WorldTimeResource worldTimeResource)` |
| `@Nullable public` | `Instant` | `getNextScheduledTick(@Nonnull WorldTimeResource worldTimeResource)` |
| `public` | `void` | `handleResidentDespawn(@Nonnull UUID entityUuid)` |
| `public` | `void` | `handleBlockBroken(@Nonnull World world, @Nonnull WorldTimeResource worldTimeResource, @Nonnull Store<EntityStore> store, int blockX, int blockY, int blockZ)` |
| `public` | `boolean` | `hasProduce()` |

## Inner Classes

| Type | Kind |
|---|---|
| [CoopResident](CoopBlock.CoopResident.md) | class |
