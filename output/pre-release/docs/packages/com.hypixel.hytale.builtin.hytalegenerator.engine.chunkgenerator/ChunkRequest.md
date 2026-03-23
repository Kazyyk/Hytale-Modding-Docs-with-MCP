---
title: "ChunkRequest"
kind: "record"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.chunkgenerator"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.chunkgenerator.ChunkRequest"
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
  - "record"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.engine.chunkgenerator`

```java
public record ChunkRequest(@Nonnull ChunkRequest.GeneratorProfile generatorProfile, @Nonnull ChunkRequest.Arguments arguments)
```

Pairs a [ChunkRequest.GeneratorProfile](ChunkRequest.GeneratorProfile.md) with [ChunkRequest.Arguments](ChunkRequest.Arguments.md) to represent a complete chunk generation request.

## Inner Types

| Type | Kind | Description |
|---|---|---|
| [ChunkRequest.Arguments](ChunkRequest.Arguments.md) | record | Per-chunk generation parameters |
| [ChunkRequest.GeneratorProfile](ChunkRequest.GeneratorProfile.md) | class | World structure name, seed, and counter |

## Components

| Type | Name |
|---|---|
| `@Nonnull ChunkRequest.GeneratorProfile` | `generatorProfile` |
| `@Nonnull ChunkRequest.Arguments` | `arguments` |
