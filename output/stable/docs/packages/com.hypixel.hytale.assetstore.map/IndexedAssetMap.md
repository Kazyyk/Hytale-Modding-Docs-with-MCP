---
title: "IndexedAssetMap"
kind: "class"
package: "com.hypixel.hytale.assetstore.map"
fqcn: "com.hypixel.hytale.assetstore.map.IndexedAssetMap"
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
public class IndexedAssetMap<K, T extends JsonAssetWithMap<K, IndexedAssetMap<K, T>>> extends AssetMapWithIndexes<K, T>
```

Asset map that auto-assigns incrementing integer indexes to assets. Provides key-to-index lookup without a dense backing array.

## Methods

```java
public int getIndex(K key)
```

```java
public int getIndexOrDefault(K key, int def)
```

```java
public int getNextIndex()
```
