---
title: "DefaultAssetMap"
kind: "class"
package: "com.hypixel.hytale.assetstore.map"
fqcn: "com.hypixel.hytale.assetstore.map.DefaultAssetMap"
api_surface: true
extends: "AssetMap"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:08:32Z"
tags:
  - "asset"
  - "map"
---

**Package:** `com.hypixel.hytale.assetstore.map`

```java
public class DefaultAssetMap<K, T extends JsonAsset<K>> extends AssetMap<K, T>
```

Default implementation of `AssetMap` using case-insensitive hash maps. Supports asset chains (multiple packs overriding the same key), tag-based indexing, path-to-key mapping, and parent-child asset relationships. Uses `StampedLock` for concurrent read/write safety.

## Fields

```java
public static final DefaultAssetMap.AssetRef[] EMPTY_PAIR_ARRAY
```

```java
public static final String DEFAULT_PACK_KEY = "Hytale:Hytale"
```

## Key Methods

```java
@Nullable
@Override
public T getAsset(K key)
```

```java
@Override
public int getAssetCount()
```

```java
@Nonnull
@Override
public Map<K, T> getAssetMap()
```

```java
@Override
public Set<K> getKeysForTag(int tagIndex)
```

```java
@Override
public Set<K> getKeysForPack(@Nonnull String name)
```
