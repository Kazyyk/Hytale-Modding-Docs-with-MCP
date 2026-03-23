---
title: "ProvidedIndexAssetMap"
kind: "class"
package: "com.hypixel.hytale.assetstore.map"
fqcn: "com.hypixel.hytale.assetstore.map.ProvidedIndexAssetMap"
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
public class ProvidedIndexAssetMap<K, T extends JsonAssetWithMap<K, ProvidedIndexAssetMap<K, T>>> extends AssetMapWithIndexes<K, T>
```

Asset map where the index is computed from the key and value via an externally-provided `ToIntBiFunction`. Does not use a dense array.

## Methods

```java
public int getIndex(K key)
```

```java
public int getIndexOrDefault(K key, int def)
```

```java
@Override
public boolean requireReplaceOnRemove()
```
