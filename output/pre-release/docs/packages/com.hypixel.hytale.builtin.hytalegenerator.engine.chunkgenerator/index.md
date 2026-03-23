---
title: "com.hypixel.hytale.builtin.hytalegenerator.engine.chunkgenerator"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.chunkgenerator"
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.engine.chunkgenerator`

## Interfaces

| Type | Description |
|---|---|
| [ChunkGenerator](ChunkGenerator.md) | Contract for chunk generation |

## Classes

| Type | Description |
|---|---|
| [ChunkRequest](ChunkRequest.md) | Pairs a generator profile with generation arguments |
| [ChunkRequest.Arguments](ChunkRequest.Arguments.md) | Per-chunk generation parameters |
| [ChunkRequest.GeneratorProfile](ChunkRequest.GeneratorProfile.md) | World structure name, seed, and counter |
| [FallbackGenerator](FallbackGenerator.md) | Produces empty chunks as a fallback |
| [StagedChunkGenerator](StagedChunkGenerator.md) | Primary staged chunk generation implementation |
| [StagedChunkGenerator.Builder](StagedChunkGenerator.Builder.md) | Fluent builder for StagedChunkGenerator |
