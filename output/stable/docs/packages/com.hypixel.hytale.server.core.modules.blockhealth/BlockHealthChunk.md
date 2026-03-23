---
title: "BlockHealthChunk"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.blockhealth"
fqcn: "com.hypixel.hytale.server.core.modules.blockhealth.BlockHealthChunk"
api_surface: false
extends: null
implements:
  - "Component<ChunkStore>"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "blockhealth"
  - "component"
  - "chunk"
---

**Package:** `com.hypixel.hytale.server.core.modules.blockhealth`

```java
public class BlockHealthChunk implements Component<ChunkStore>
```

A `ChunkStore` component that tracks per-block health and fragility within a chunk. Maintains two maps keyed by `Vector3i` block position: one for [BlockHealth](BlockHealth.md) damage state and one for [FragileBlock](FragileBlock.md) fragility timers.

Provides methods to damage blocks (reducing health and sending network updates), repair blocks (increasing health), remove block health tracking, and mark blocks as fragile. Serialized as versioned binary data (version 2 adds fragility support).

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<BlockHealthChunk>` | `CODEC` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Instant` | `getLastRepairGameTime()` |
| `public` | `void` | `setLastRepairGameTime(Instant lastRepairGameTime)` |
| `@Nonnull public` | `Map<Vector3i, BlockHealth>` | `getBlockHealthMap()` |
| `@Nonnull public` | `Map<Vector3i, FragileBlock>` | `getBlockFragilityMap()` |
| `@Nonnull public` | `BlockHealth` | `damageBlock(Instant currentUptime, @Nonnull World world, @Nonnull Vector3i block, float health)` |
| `@Nonnull public` | `BlockHealth` | `repairBlock(@Nonnull World world, @Nonnull Vector3i block, float progress)` |
| `public` | `void` | `removeBlock(@Nonnull World world, @Nonnull Vector3i block)` |
| `public` | `void` | `makeBlockFragile(Vector3i blockLocation, float fragileDuration)` |
| `public` | `boolean` | `isBlockFragile(Vector3i block)` |
| `public` | `float` | `getBlockHealth(Vector3i block)` |
| `public` | `void` | `createBlockDamagePackets(@Nonnull List<ToClientPacket> list)` |
| `@Nonnull public` | `BlockHealthChunk` | `clone()` |
