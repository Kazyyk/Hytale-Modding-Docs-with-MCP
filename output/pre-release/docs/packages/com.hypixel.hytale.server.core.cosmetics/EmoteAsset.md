---
title: "EmoteAsset"
kind: "class"
package: "com.hypixel.hytale.server.core.cosmetics"
fqcn: "com.hypixel.hytale.server.core.cosmetics.EmoteAsset"
api_surface: false
extends: "java.lang.Object"
implements:
  - "JsonAssetWithMap"
  - "NetworkSerializable"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:06Z"
tags:
  - "asset"
  - "cosmetic"
  - "emote"
---

**Package:** `com.hypixel.hytale.server.core.cosmetics`

```java
public class EmoteAsset implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, EmoteAsset>>, NetworkSerializable<ProtocolEmote>
```

Asset definition for a player emote. Contains the emote's display name, animation file path, icon path, and whether the animation loops. Registered in an indexed asset store for efficient lookup and network serialization.

## Fields

| Field | Type | Description |
|---|---|---|
| `id` | `String` | Asset key identifier |
| `name` | `String` | Localization key for the emote name |
| `animationPath` | `String` | Path to the animation file (in `HytaleAssets/Common/Characters`) |
| `iconPath` | `String` | Path to the icon file (in `HytaleAssets/Common/Icons/Emotes`) |
| `isLooping` | `boolean` | Whether the emote animation loops |

## Methods

```java
public static AssetStore<String, EmoteAsset, IndexedLookupTableAssetMap<String, EmoteAsset>> getAssetStore()
```

Returns the global asset store for emotes.

```java
public static IndexedLookupTableAssetMap<String, EmoteAsset> getAssetMap()
```

Returns the asset map for emotes.

```java
public String getId()
```

Returns the emote asset key.

```java
public ProtocolEmote toPacket()
```

Converts this emote to its protocol representation.

## Related Types

- [EmoteAssetPacketGenerator](EmoteAssetPacketGenerator.md) -- generates network packets for emote updates
- `CosmeticRegistry` -- manages cosmetic assets
