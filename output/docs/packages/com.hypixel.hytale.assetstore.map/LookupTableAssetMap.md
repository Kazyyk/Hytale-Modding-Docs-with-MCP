---
title: "LookupTableAssetMap"
kind: "class"
package: "com.hypixel.hytale.assetstore.map"
fqcn: "com.hypixel.hytale.assetstore.map.LookupTableAssetMap"
api_surface: false
extends: "AssetMapWithIndexes"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:08:32Z"
tags:
  - "asset"
  - "map"
---

**Package:** `com.hypixel.hytale.assetstore.map`

```java
public class LookupTableAssetMap<K, T extends JsonAssetWithMap<K, LookupTableAssetMap<K, T>>> extends AssetMapWithIndexes<K, T>
```

Asset map using externally-provided index and max-index functions for a dense backing array. Resizes automatically as the max index changes.

## Methods

```java
@Nullable
public T getAsset(int index)
```

```java
public T getAssetOrDefault(int index, T def)
```

```java
@Override
public boolean requireReplaceOnRemove()
```
