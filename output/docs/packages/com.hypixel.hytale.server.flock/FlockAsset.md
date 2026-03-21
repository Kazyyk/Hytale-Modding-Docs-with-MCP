---
title: "FlockAsset"
kind: "abstract class"
package: "com.hypixel.hytale.server.flock.config"
fqcn: "com.hypixel.hytale.server.flock.config.FlockAsset"
api_surface: false
extends: "java.lang.Object"
implements:
  - "JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, FlockAsset>>"
generator_version: "2.0.0"
generated_at: "2026-03-21T02:46:37Z"
tags:
  - "flock"
  - "config"
  - "asset"
---

**Package:** `com.hypixel.hytale.server.flock.config`

```java
public abstract class FlockAsset implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, FlockAsset>>
```

Abstract base class for flock configuration assets loaded from JSON at path `NPC/Flocks`. Defines the size parameters and role restrictions for flock spawning. Two concrete implementations: [RangeSizeFlockAsset](RangeSizeFlockAsset.md) (default, size from a min-max range) and [WeightedSizeFlockAsset](WeightedSizeFlockAsset.md) (size from weighted distribution).

## Fields

| Field | Type | Default | Description |
|---|---|---|---|
| `MaxGrowSize` | `int` | `8` | Maximum flock size after initial spawning. |
| `BlockedRoles` | `String[]` | `[]` | Roles excluded from joining this flock post-spawn. |

## Abstract Methods

```java
public abstract int getMinFlockSize()
```

```java
public abstract int pickFlockSize()
```

Returns a random flock size based on the asset's configuration.

## Methods

```java
public String getId()
```

```java
public int getMaxGrowSize()
```

```java
public String[] getBlockedRoles()
```

```java
public static AssetStore<String, FlockAsset, IndexedLookupTableAssetMap<String, FlockAsset>> getAssetStore()
```

```java
public static IndexedLookupTableAssetMap<String, FlockAsset> getAssetMap()
```

## Related Types

- [RangeSizeFlockAsset](RangeSizeFlockAsset.md) -- default implementation with min-max range
- [WeightedSizeFlockAsset](WeightedSizeFlockAsset.md) -- weighted distribution implementation
- [FlockPlugin](FlockPlugin.md) -- registers the asset store
- [PersistentFlockData](PersistentFlockData.md) -- uses max grow size and blocked roles
