---
title: "ChunkRequest.Arguments"
kind: "record"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.chunkgenerator"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.chunkgenerator.ChunkRequest.Arguments"
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
public record ChunkRequest.Arguments(int seed, long index, int x, int z, @Nullable LongPredicate stillNeeded)
```

Per-chunk generation parameters. Contains the world seed, chunk index, chunk coordinates (x, z), and an optional `stillNeeded` predicate that allows the generator to skip chunks that are no longer needed (e.g., if a player has moved away).

## Components

| Type | Name |
|---|---|
| `int` | `seed` |
| `long` | `index` |
| `int` | `x` |
| `int` | `z` |
| `@Nullable LongPredicate` | `stillNeeded` |
