---
title: "DummyWorldGenProvider"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.worldgen.provider"
fqcn: "com.hypixel.hytale.server.core.universe.world.worldgen.provider.DummyWorldGenProvider"
api_surface: false
extends: null
implements:
  - "IWorldGenProvider"
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "worldgen"
---
**Package:** `com.hypixel.hytale.server.core.universe.world.worldgen.provider`

```java
public class DummyWorldGenProvider implements IWorldGenProvider
```

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `String` | `ID` | `"Dummy"` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `String` | `ID` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `IWorldGen` | `getGenerator()` |
| `public` | `String` | `toString()` |
| `public` | `WorldGenTimingsCollector` | `getTimings()` |
| `public` | `Transform[]` | `getSpawnPoints(int seed)` |
| `public` | `CompletableFuture<GeneratedChunk>` | `generate(int seed, long index, int cx, int cz, LongPredicate stillNeeded)` |
