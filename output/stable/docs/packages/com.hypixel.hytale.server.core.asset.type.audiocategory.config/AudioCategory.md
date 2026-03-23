---
title: "AudioCategory"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.audiocategory.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.audiocategory.config.AudioCategory"
api_surface: false
extends: null
implements: ["JsonAssetWithMap", "NetworkSerializable"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "asset"
  - "type"
  - "audiocategory"
  - "config"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.audiocategory.config`

```java
public class AudioCategory implements JsonAssetWithMap, NetworkSerializable
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `int` | `EMPTY_ID` |
| `public static final` | `String` | `EMPTY` |
| `public static final` | `AudioCategory` | `EMPTY_AUDIO_CATEGORY` |
| `public static final` | `AssetBuilderCodec<String,AudioCategory>` | `CODEC` |
| `public static final` | `ValidatorCache<String>` | `VALIDATOR_CACHE` |
| `private static` | `AssetStore<String,AudioCategory,IndexedLookupTableAssetMap<String,AudioCategory>>` | `ASSET_STORE` |
| `protected` | `AssetExtraInfo.Data` | `data` |
| `protected` | `String` | `id` |
| `protected` | `float` | `volume` |
| `private` | `SoftReference<com.hypixel.hytale.protocol.AudioCategory>` | `cachedPacket` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `AssetStore<String,AudioCategory,IndexedLookupTableAssetMap<String,AudioCategory>>` | `getAssetStore()` |
| `public static` | `IndexedLookupTableAssetMap<String,AudioCategory>` | `getAssetMap()` |
| `public` | `String` | `getId()` |
| `public` | `float` | `getVolume()` |
| `@Nonnull @Override public` | `String` | `toString()` |
| `@Nonnull public` | `com.hypixel.hytale.protocol.AudioCategory` | `toPacket()` |
