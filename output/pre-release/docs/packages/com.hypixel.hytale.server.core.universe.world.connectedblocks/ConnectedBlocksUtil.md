---
title: "ConnectedBlocksUtil"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.connectedblocks"
fqcn: "com.hypixel.hytale.server.core.universe.world.connectedblocks.ConnectedBlocksUtil"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "universe"
  - "world"
  - "connectedblocks"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.connectedblocks`

```java
public class ConnectedBlocksUtil
```

Utility methods for evaluating connected block patterns and resolving shape variants.

## Record Components

```java
Vector3i coordinate, int depth
```

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `void` | `setConnectedBlockAndNotifyNeighbors(int blockTypeId, @Nonnull RotationTuple blockTypeRotation, @Nonnull Vector3i placementNormal, @Nonnull Vector3i blockPosition, @Nonnull WorldChunk worldChunkComponent, @Nonnull BlockChunk blockChunkComponent)` |
| `public static` | `void` | `notifyNeighborsAndCollectChanges(@Nonnull World world, @Nonnull Vector3i origin, @Nonnull Map<Vector3i, ConnectedBlocksUtil.ConnectedBlockResult> desiredChanges, Vector3i placementNormal)` |
| `public static` | `Optional<ConnectedBlocksUtil.ConnectedBlockResult>` | `getDesiredConnectedBlockType(@Nonnull World world, @Nonnull Vector3i coordinate, @Nonnull BlockType currentBlockType, int currentRotation, @Nonnull Vector3i placementNormal, boolean isPlacement)` |
| `public` | `String` | `blockTypeKey()` |
| `public` | `int` | `rotationIndex()` |
| `public` | `void` | `addAdditionalBlock(@Nonnull Vector3i offset, @Nonnull String blockTypeKey, int rotationIndex)` |
| `public` | `boolean` | `equals(Object obj)` |
| `public` | `int` | `hashCode()` |
| `public` | `String` | `toString()` |
