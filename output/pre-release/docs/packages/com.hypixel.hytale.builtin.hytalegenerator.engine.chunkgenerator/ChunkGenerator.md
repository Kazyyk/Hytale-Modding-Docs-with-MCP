---
title: "ChunkGenerator"
kind: "interface"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.chunkgenerator"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.chunkgenerator.ChunkGenerator"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "engine"
  - "chunkgenerator"
  - "interface"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.engine.chunkgenerator`

```java
public interface ChunkGenerator
```

Defines the contract for chunk generation in the Hytale world generator. Implementations produce a `GeneratedChunk` from a [ChunkRequest.Arguments](ChunkRequest.Arguments.md) and provide spawn positions via a `PositionProvider`. Known implementations: [StagedChunkGenerator](StagedChunkGenerator.md) and [FallbackGenerator](FallbackGenerator.md).

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable` | `GeneratedChunk` | `generate(@Nonnull ChunkRequest.Arguments var1)` |
| `@Nonnull` | `PositionProvider` | `getSpawnPositions()` |
