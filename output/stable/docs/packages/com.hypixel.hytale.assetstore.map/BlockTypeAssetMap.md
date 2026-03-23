---
title: "BlockTypeAssetMap"
kind: "class"
package: "com.hypixel.hytale.assetstore.map"
fqcn: "com.hypixel.hytale.assetstore.map.BlockTypeAssetMap"
api_surface: true
extends: "AssetMapWithIndexes"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:08:32Z"
tags:
  - "asset"
  - "map"
  - "block-type"
---

**Package:** `com.hypixel.hytale.assetstore.map`

```java
public class BlockTypeAssetMap<K, T extends JsonAssetWithMap<K, BlockTypeAssetMap<K, T>>> extends AssetMapWithIndexes<K, T>
```

Specialized asset map for block types. Maintains a dense array for O(1) index-based lookup, a key-to-index mapping, sub-key grouping, and deprecated group ID tracking. Thread-safe via `StampedLock` and `ReentrantLock`.

## Methods

```java
public int getIndex(K key)
```

```java
public int getNextIndex()
```

```java
@Nullable
public T getAsset(int index)
```

```java
@Nonnull
public ObjectSet<K> getSubKeys(K key)
```

```java
public int getGroupId(String group)
```

```java
@Nonnull
public String[] getGroups()
```
