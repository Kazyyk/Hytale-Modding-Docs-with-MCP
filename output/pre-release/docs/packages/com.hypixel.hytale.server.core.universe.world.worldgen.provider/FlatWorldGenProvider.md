---
title: "FlatWorldGenProvider"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.worldgen.provider"
fqcn: "com.hypixel.hytale.server.core.universe.world.worldgen.provider.FlatWorldGenProvider"
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
public class FlatWorldGenProvider implements IWorldGenProvider
```

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `String` | `ID` | `"Flat"` |
| `public static final` | `Color` | `DEFAULT_TINT` | `new Color((byte)91, (byte)-98, (byte)40)` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `String` | `ID` |
| `private` | `Color` | `tint` |
| `private` | `FlatWorldGenProvider.Layer[]` | `layers` |
| `private final` | `FlatWorldGenProvider.Layer[]` | `layers` |
| `private final` | `int` | `tintId` |
| `public` | `int` | `from` |
| `public` | `int` | `to` |
| `public` | `String` | `environment` |
| `public` | `String` | `blockType` |
| `public` | `int` | `environmentId` |
| `public` | `int` | `blockId` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `FlatWorldGenProvider()` |
| `public` | `` | `FlatWorldGenProvider(Color tint, FlatWorldGenProvider.Layer[] layers)` |
| `public` | `IWorldGen` | `getGenerator()` |
| `public` | `String` | `toString()` |
| `public` | `WorldGenTimingsCollector` | `getTimings()` |
| `public` | `Transform[]` | `getSpawnPoints(int seed)` |
| `public` | `CompletableFuture<GeneratedChunk>` | `generate(int seed, long index, int cx, int cz, LongPredicate stillNeeded)` |
| `public` | `String` | `toString()` |
