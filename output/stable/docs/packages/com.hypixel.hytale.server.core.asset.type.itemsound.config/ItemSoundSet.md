---
title: "ItemSoundSet"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.itemsound.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.itemsound.config.ItemSoundSet"
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
  - "itemsound"
  - "config"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.itemsound.config`

```java
public class ItemSoundSet implements JsonAssetWithMap, NetworkSerializable
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `AssetBuilderCodec<String,ItemSoundSet>` | `CODEC` |
| `public static final` | `ValidatorCache<String>` | `VALIDATOR_CACHE` |
| `private static` | `AssetStore<String,ItemSoundSet,IndexedLookupTableAssetMap<String,ItemSoundSet>>` | `ASSET_STORE` |
| `protected` | `AssetExtraInfo.Data` | `data` |
| `protected` | `String` | `id` |
| `protected` | `Map<ItemSoundEvent,String>` | `soundEventIds` |
| `protected transient` | `Object2IntMap<ItemSoundEvent>` | `soundEventIndices` |
| `private` | `SoftReference<com.hypixel.hytale.protocol.ItemSoundSet>` | `cachedPacket` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `AssetStore<String,ItemSoundSet,IndexedLookupTableAssetMap<String,ItemSoundSet>>` | `getAssetStore()` |
| `public static` | `IndexedLookupTableAssetMap<String,ItemSoundSet>` | `getAssetMap()` |
| `@Nonnull public` | `com.hypixel.hytale.protocol.ItemSoundSet` | `toPacket()` |
| `public` | `String` | `getId()` |
| `public` | `Map<ItemSoundEvent,String>` | `getSoundEventIds()` |
| `public` | `Object2IntMap<ItemSoundEvent>` | `getSoundEventIndices()` |
| `protected` | `void` | `processConfig()` |
| `@Nonnull @Override public` | `String` | `toString()` |
