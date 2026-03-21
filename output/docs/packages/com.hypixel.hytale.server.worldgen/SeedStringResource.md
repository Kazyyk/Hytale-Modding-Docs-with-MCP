---
title: "SeedStringResource"
kind: "class"
package: "com.hypixel.hytale.server.worldgen"
fqcn: "com.hypixel.hytale.server.worldgen.SeedStringResource"
api_surface: false
extends: null
implements: ["SeedResource"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
---

**Package:** `com.hypixel.hytale.server.worldgen`

```java
public class SeedStringResource implements SeedResource
```

Implements `SeedResource` to provide SeedStringResource functionality.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull protected final` | `FileMaskCache<IIntCondition>` | `biomeMaskRegistry` |
| `@Nonnull protected final` | `BlockPlacementMaskRegistry` | `blockMaskRegistry` |
| `@Nonnull protected` | `WorldGenConfig` | `config` |
| `@Nonnull protected` | `WorldGenPrefabLoader` | `loader` |
| `@Nonnull protected final` | `Map<String, AtomicInteger>` | `uniqueIds` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `SeedStringResource(@Nonnull PrefabStoreRoot prefabStore, @Nonnull WorldGenConfig config)` |
| `@Nonnull public` | `String` | `getUniqueName(@Nonnull String prefix)` |
| `@Nonnull public` | `WorldGenPrefabLoader` | `getLoader()` |
| `public` | `void` | `setPrefabConfig(@Nonnull WorldGenConfig config, @Nonnull PrefabStoreRoot prefabStore)` |
| `@Nonnull @Override public` | `ResultBuffer.Bounds2d` | `localBounds2d()` |
| `@Nonnull @Override public` | `ResultBuffer.ResultBuffer2d` | `localBuffer2d()` |
| `@Nonnull @Override public` | `ResultBuffer.ResultBuffer3d` | `localBuffer3d()` |
| `@Override public` | `void` | `writeSeedReport(String seedReport)` |
| `@Nonnull public` | `FileMaskCache<IIntCondition>` | `getBiomeMaskRegistry()` |
| `@Nonnull public` | `BlockPlacementMaskRegistry` | `getBlockMaskRegistry()` |
