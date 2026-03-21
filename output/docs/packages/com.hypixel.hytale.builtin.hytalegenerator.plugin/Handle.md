---
title: "Handle"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.plugin"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.plugin.Handle"
api_surface: false
extends: null
implements: ["IWorldGen"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "plugin"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.plugin`

```java
public class Handle implements IWorldGen
```

Implements `IWorldGen` to provide Handle functionality.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `HytaleGenerator` | `plugin` |
| `@Nonnull private final` | `ChunkRequest.GeneratorProfile` | `profile` |
| `@Nullable private final` | `String` | `seedOverride` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `Handle(@Nonnull HytaleGenerator plugin, @Nonnull ChunkRequest.GeneratorProfile profile, @Nullable String seedOverride)` |
| `@Nonnull @Override public` | `CompletableFuture<GeneratedChunk>` | `generate(int seed, long index, int x, int z, LongPredicate stillNeeded)` |
| `@Nonnull public` | `ChunkRequest.GeneratorProfile` | `getProfile()` |
| `@Nonnull @Override public` | `Transform[]` | `getSpawnPoints(int seed)` |
| `@Nonnull @Override public` | `ISpawnProvider` | `getDefaultSpawnProvider(int seed)` |
| `@Nullable @Override public` | `WorldGenTimingsCollector` | `getTimings()` |
