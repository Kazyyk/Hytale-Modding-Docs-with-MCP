---
title: "EmoteAssetPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.cosmetics"
fqcn: "com.hypixel.hytale.server.core.cosmetics.EmoteAssetPacketGenerator"
api_surface: false
extends: "AssetPacketGenerator"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:06Z"
tags:
  - "asset"
  - "cosmetic"
  - "emote"
  - "network"
---

**Package:** `com.hypixel.hytale.server.core.cosmetics`

```java
public class EmoteAssetPacketGenerator extends AssetPacketGenerator<String, EmoteAsset, IndexedLookupTableAssetMap<String, EmoteAsset>>
```

Generates `UpdateEmotes` network packets for synchronizing emote assets to clients. Produces init packets (full state), update packets (add/modify), and remove packets.

## Methods

```java
public ToClientPacket generateInitPacket(IndexedLookupTableAssetMap<String, EmoteAsset> assetMap, Map<String, EmoteAsset> assets)
```

Generates an `UpdateEmotes` packet with `UpdateType.Init` containing all emote assets.

```java
public ToClientPacket generateUpdatePacket(IndexedLookupTableAssetMap<String, EmoteAsset> assetMap, Map<String, EmoteAsset> loadedAssets, @NonNullDecl AssetUpdateQuery query)
```

Generates an `UpdateEmotes` packet with `UpdateType.AddOrUpdate` for changed emotes.

```java
@NullableDecl
public ToClientPacket generateRemovePacket(IndexedLookupTableAssetMap<String, EmoteAsset> assetMap, Set<String> removedAssets, @NonNullDecl AssetUpdateQuery query)
```

Generates an `UpdateEmotes` packet with `UpdateType.Remove` for deleted emotes.

## Related Types

- [EmoteAsset](EmoteAsset.md) -- the emote asset this generates packets for
- `AssetPacketGenerator` -- abstract base class
