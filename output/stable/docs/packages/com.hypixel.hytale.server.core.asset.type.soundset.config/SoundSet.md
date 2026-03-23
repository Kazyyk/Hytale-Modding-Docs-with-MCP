---
title: "SoundSet"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.soundset.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.soundset.config.SoundSet"
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
  - "soundset"
  - "config"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.soundset.config`

```java
public class SoundSet implements JsonAssetWithMap, NetworkSerializable
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `int` | `EMPTY_ID` |
| `public static final` | `String` | `EMPTY` |
| `public static final` | `SoundSet` | `EMPTY_SOUND_SET` |
| `public static final` | `AssetBuilderCodec<String,SoundSet>` | `CODEC` |
| `public static final` | `Codec<String>` | `CHILD_ASSET_CODEC` |
| `public static final` | `ValidatorCache<String>` | `VALIDATOR_CACHE` |
| `private static` | `AssetStore<String,SoundSet,IndexedLookupTableAssetMap<String,SoundSet>>` | `ASSET_STORE` |
| `protected` | `AssetExtraInfo.Data` | `data` |
| `protected` | `String` | `id` |
| `protected` | `Map<String,String>` | `soundEventIds` |
| `protected transient` | `Object2IntMap<String>` | `soundEventIndices` |
| `protected` | `SoundCategory` | `category` |
| `private` | `SoftReference<com.hypixel.hytale.protocol.SoundSet>` | `cachedPacket` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `AssetStore<String,SoundSet,IndexedLookupTableAssetMap<String,SoundSet>>` | `getAssetStore()` |
| `public static` | `IndexedLookupTableAssetMap<String,SoundSet>` | `getAssetMap()` |
| `public` | `String` | `getId()` |
| `public` | `Map<String,String>` | `getSoundEventIds()` |
| `public` | `Object2IntMap<String>` | `getSoundEventIndices()` |
| `protected` | `void` | `processConfig()` |
| `@Nonnull @Override public` | `String` | `toString()` |
| `@Nonnull public` | `com.hypixel.hytale.protocol.SoundSet` | `toPacket()` |
