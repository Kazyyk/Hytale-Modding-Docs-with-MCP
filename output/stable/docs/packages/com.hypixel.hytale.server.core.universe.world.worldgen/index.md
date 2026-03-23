---
title: "com.hypixel.hytale.server.core.universe.world.worldgen"
package: "com.hypixel.hytale.server.core.universe.world.worldgen"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.worldgen`

## Interfaces

| Type | Description |
|---|---|
| [IBenchmarkableWorldGen](IBenchmarkableWorldGen.md) | IWorldGen extension with benchmarking capabilities |
| [IWorldGen](IWorldGen.md) | Core interface for world generation implementations |
| [IWorldGenBenchmark](IWorldGenBenchmark.md) | Interface for worldgen benchmark operations |
| [ValidatableWorldGen](ValidatableWorldGen.md) | Interface for world generators with validation support |

## Classes

| Type | Description |
|---|---|
| [GeneratedBlockChunk](GeneratedBlockChunk.md) | Generated block chunk for world generation |
| [GeneratedBlockStateChunk](GeneratedBlockStateChunk.md) | Stores generated block states during worldgen |
| [GeneratedChunk](GeneratedChunk.md) | Composite container for all generated chunk data |
| [GeneratedChunkSection](GeneratedChunkSection.md) | 32x32x32 section of generated chunk data |
| [GeneratedEntityChunk](GeneratedEntityChunk.md) | Collects generated entity holders during worldgen |
| [WorldGenLoadException](WorldGenLoadException.md) | Exception thrown when worldgen data fails to load |
| [WorldGenTimingsCollector](WorldGenTimingsCollector.md) | Collects timing metrics for worldgen phases |
