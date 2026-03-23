---
title: "AssetMapWithIndexes"
kind: "class"
package: "com.hypixel.hytale.assetstore.map"
fqcn: "com.hypixel.hytale.assetstore.map.AssetMapWithIndexes"
api_surface: true
extends: "DefaultAssetMap"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:08:32Z"
tags:
  - "asset"
  - "map"
---

**Package:** `com.hypixel.hytale.assetstore.map`

```java
public abstract class AssetMapWithIndexes<K, T extends JsonAsset<K>> extends DefaultAssetMap<K, T>
```

Extends [DefaultAssetMap](DefaultAssetMap.md) with integer-indexed tag storage. Assets can be looked up by numeric index in addition to key-based lookup. Subclasses such as [BlockTypeAssetMap](BlockTypeAssetMap.md) and [IndexedAssetMap](IndexedAssetMap.md) provide concrete index assignment strategies.

## Fields

```java
public static final int NOT_FOUND = Integer.MIN_VALUE
```

## Methods

```java
public IntSet getIndexesForTag(int index)
```

```java
@Override
public boolean requireReplaceOnRemove()
```
