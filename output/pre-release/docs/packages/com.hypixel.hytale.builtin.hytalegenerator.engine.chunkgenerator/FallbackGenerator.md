---
title: "FallbackGenerator"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.chunkgenerator"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.chunkgenerator.FallbackGenerator"
api_surface: false
extends: null
implements: ["ChunkGenerator"]
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "engine"
  - "chunkgenerator"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.engine.chunkgenerator`

```java
public class FallbackGenerator implements ChunkGenerator
```

A [ChunkGenerator](ChunkGenerator.md) that produces empty chunks with no blocks, block states, or entities. Used as a fallback when the primary staged generator is unavailable. Provides an `EmptyPositionProvider` for spawn positions. Accessed via the static `INSTANCE` singleton.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public static final` | `FallbackGenerator` | `INSTANCE` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable @Override public` | `GeneratedChunk` | `generate(@Nonnull ChunkRequest.Arguments arguments)` |
| `@Override public` | `PositionProvider` | `getSpawnPositions()` |
