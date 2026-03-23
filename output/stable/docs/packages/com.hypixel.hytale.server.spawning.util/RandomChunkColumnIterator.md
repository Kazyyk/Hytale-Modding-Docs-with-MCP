---
title: "RandomChunkColumnIterator"
kind: "class"
package: "com.hypixel.hytale.server.spawning.util"
fqcn: "com.hypixel.hytale.server.spawning.util.RandomChunkColumnIterator"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "spawning"
  - "utility"
---

**Package:** `com.hypixel.hytale.server.spawning.util`

```java
public class RandomChunkColumnIterator
```

Iterator that visits chunk columns in pseudo-random order. Uses a seeded `Random` and `ChunkColumnMask` to track which columns remain. Supports border avoidance and save/restore of iterator position.

## Constructors

| Signature |
|---|
| `RandomChunkColumnIterator()` |
| `RandomChunkColumnIterator(@Nonnull ChunkColumnMask initialPositions)` |
| `RandomChunkColumnIterator(ChunkColumnMask initialPositions, @Nonnull WorldChunk chunk)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `getCurrentIndex()` |
| `public` | `int` | `getCurrentX()` |
| `public` | `int` | `getCurrentZ()` |
| `@Nullable public` | `ChunkColumnMask` | `getInitialPositions()` |
| `public` | `int` | `nextPosition()` |
| `public` | `int` | `nextPositionAvoidBorders()` |
| `public` | `void` | `saveIteratorPosition()` |
| `public` | `boolean` | `isAtSavedIteratorPosition()` |
| `public` | `int` | `positionsLeft()` |
| `public` | `void` | `markPositionVisited(int index)` |
| `public` | `void` | `markPositionVisited()` |
