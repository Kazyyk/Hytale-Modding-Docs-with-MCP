---
title: "IndexedLookupTableAssetMap"
kind: "class"
package: "com.hypixel.hytale.assetstore.map"
fqcn: "com.hypixel.hytale.assetstore.map.IndexedLookupTableAssetMap"
api_surface: true
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
public class IndexedLookupTableAssetMap<K, T extends JsonAssetWithMap<K, IndexedLookupTableAssetMap<K, T>>> extends AssetMapWithIndexes<K, T>
```

Combines auto-incrementing index assignment with a dense array for O(1) index-based asset retrieval. Similar to [BlockTypeAssetMap](BlockTypeAssetMap.md) but without group tracking or sub-key support.

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

```java
@Nullable
public T getAsset(int index)
```

```java
public T getAssetOrDefault(int index, T def)
```
