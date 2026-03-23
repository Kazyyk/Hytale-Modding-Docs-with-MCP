---
title: "VoidWorldGenProvider"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.worldgen.provider"
fqcn: "com.hypixel.hytale.server.core.universe.world.worldgen.provider.VoidWorldGenProvider"
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
public class VoidWorldGenProvider implements IWorldGenProvider
```

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `String` | `ID` | `"Void"` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `String` | `ID` |
| `private` | `Color` | `tint` |
| `private` | `String` | `environment` |
| `private final` | `int` | `tintId` |
| `private final` | `int` | `environmentId` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `VoidWorldGenProvider()` |
| `public` | `` | `VoidWorldGenProvider(Color tint, String environment)` |
| `public` | `IWorldGen` | `getGenerator()` |
| `public` | `String` | `toString()` |
| `public` | `WorldGenTimingsCollector` | `getTimings()` |
| `public` | `Transform[]` | `getSpawnPoints(int seed)` |
| `public` | `CompletableFuture<GeneratedChunk>` | `generate(int seed, long index, int cx, int cz, LongPredicate stillNeeded)` |
