---
title: "CommonAssetRegistry"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.common"
fqcn: "com.hypixel.hytale.server.core.asset.common.CommonAssetRegistry"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "asset"
  - "common"
---

**Package:** `com.hypixel.hytale.server.core.asset.common`

```java
public class CommonAssetRegistry
```

Global static registry of common assets, indexed by both name and SHA-256 hash. Supports layered asset packs where a later pack can override an earlier one. Thread-safe via `ConcurrentHashMap` and `CopyOnWriteArrayList`.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `int` | `getDuplicateAssetCount()` |
| `@Nonnull public static` | `Map<String, List<PackAsset>>` | `getDuplicatedAssets()` |
| `@Nonnull public static` | `Collection<List<PackAsset>>` | `getAllAssets()` |
| `public static` | `void` | `clearAllAssets()` |
| `@Nonnull public static` | `AddCommonAssetResult` | `addCommonAsset(String pack, @Nonnull CommonAsset asset)` |
| `@Nullable public static` | `BooleanObjectPair<PackAsset>` | `removeCommonAssetByName(String pack, String name)` |
| `@Nonnull public static` | `List<CommonAsset>` | `getCommonAssetsStartingWith(String pack, String name)` |
| `public static` | `boolean` | `hasCommonAsset(String name)` |
| `public static` | `boolean` | `hasCommonAsset(AssetPack pack, String name)` |
| `@Nullable public static` | `CommonAsset` | `getByName(String name)` |
| `@Nullable public static` | `CommonAsset` | `getByHash(@Nonnull String hash)` |

## Inner Types

### PackAsset (record)

```java
public record PackAsset(String pack, CommonAsset asset)
```

### AddCommonAssetResult

Holds the result of adding a common asset, including the new pack asset, any previously existing asset with the same name or hash, and the active (winning) asset.
