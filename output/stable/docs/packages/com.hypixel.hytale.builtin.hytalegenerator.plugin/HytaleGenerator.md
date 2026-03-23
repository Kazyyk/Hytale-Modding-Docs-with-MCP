---
title: "HytaleGenerator"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.plugin"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.plugin.HytaleGenerator"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "plugin"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.plugin`

```java
public class HytaleGenerator extends JavaPlugin
```

Plugin class that registers components, systems, and commands for the HytaleGenerator subsystem.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `private` | `AssetManager` | `assetManager` |  |
| `private` | `Runnable` | `assetReloadListener` |  |
| `@Nonnull private final` | `Map<ChunkRequest.GeneratorProfile, ChunkGenerator>` | `generators` | `new HashMap<>()` |
| `@Nonnull private final` | `Semaphore` | `chunkGenerationSemaphore` | `new Semaphore(1)` |
| `private` | `int` | `concurrency` |  |
| `private` | `ExecutorService` | `mainExecutor` |  |
| `private` | `ThreadPoolExecutor` | `concurrentExecutor` |  |
| `private` | `int` | `worldCounter` |  |
| `@Nonnull public static` | `Vector3d` | `DEFAULT_SPAWN_POSITION` | `new Vector3d(0.0, 140.0, 0.0)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `HytaleGenerator(@Nonnull JavaPluginInit init)` |
| `@Override protected` | `void` | `start()` |
| `@Nonnull public` | `List<Vector3d>` | `getSpawnPositions(@Nonnull ChunkRequest.GeneratorProfile profile, int maxPositionsCount)` |
| `@Nonnull public` | `CompletableFuture<GeneratedChunk>` | `submitChunkRequest(@Nonnull ChunkRequest request)` |
| `@Override protected` | `void` | `setup()` |
| `@Nonnull public` | `NStagedChunkGenerator` | `createStagedChunkGenerator(@Nonnull ChunkRequest.GeneratorProfile generatorProfile, @Nonnull WorldStructureAsset worldStructureAsset, @Nonnull SettingsAsset settingsAsset)` |
| `@Nonnull private static` | `Set<Integer>` | `getAllPossibleRuntimeIndices(@Nonnull List<Biome> biomes)` |
| `@Nonnull private` | `ChunkGenerator` | `getGenerator(@Nonnull ChunkRequest.GeneratorProfile profile)` |
| `private` | `void` | `loadExecutors(@Nonnull SettingsAsset settingsAsset)` |
| `private static` | `int` | `getConcurrency(@Nonnull SettingsAsset settingsAsset)` |
| `private` | `void` | `reloadGenerators()` |
