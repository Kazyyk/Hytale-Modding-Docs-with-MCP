---
title: "VoidWorldGenProvider.VoidWorldGen"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.worldgen.provider"
fqcn: "com.hypixel.hytale.server.core.universe.world.worldgen.provider.VoidWorldGenProvider.VoidWorldGen"
api_surface: false
extends: null
implements:
  - "IWorldGen"
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "worldgen"
---
**Package:** `com.hypixel.hytale.server.core.universe.world.worldgen.provider`

```java
public static class VoidWorldGen implements IWorldGen
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `int` | `tintId` |
| `private final` | `int` | `environmentId` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `VoidWorldGen()` |
| `public` | `` | `VoidWorldGen(@Nullable Color tint, @Nullable String environment)` |
| `public` | `` | `VoidWorldGen(int tintId, int environmentId)` |
| `public` | `WorldGenTimingsCollector` | `getTimings()` |
| `public` | `Transform[]` | `getSpawnPoints(int seed)` |
| `public` | `CompletableFuture<GeneratedChunk>` | `generate(int seed, long index, int cx, int cz, LongPredicate stillNeeded)` |
