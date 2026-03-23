---
title: "ChunkWorldgenBenchmark"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.benchmark"
fqcn: "com.hypixel.hytale.server.worldgen.benchmark.ChunkWorldgenBenchmark"
api_surface: false
extends: ~
implements: ['IWorldGenBenchmark']
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "benchmark"
---

**Package:** `com.hypixel.hytale.server.worldgen.benchmark`

```java
public class ChunkWorldgenBenchmark implements IWorldGenBenchmark
```

Utility type in the `benchmark` subsystem.

## Accessors

| Method | Returns | Description |
|---|---|---|
| `isEnabled()` | `boolean` | Boolean accessor. |

## Methods

| Method | Returns | Description |
|---|---|---|
| `start()` | `void` | Instance method. |
| `stop()` | `void` | Instance method. |
| `buildReport()` | `CompletableFuture<String>` | Instance method. |
| `registerPrefab(String name)` | `void` | Instance method. |
| `registerCaveNode(String name)` | `void` | Instance method. |
