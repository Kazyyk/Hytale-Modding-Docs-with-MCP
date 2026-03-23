---
title: "Trail"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.trail.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.trail.config.Trail"
api_surface: false
extends: ~
implements:
  - "JsonAssetWithMap<String, DefaultAssetMap<String, Trail>>"
  - "NetworkSerializable<com.hypixel.hytale.protocol.Trail>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "asset"
  - "trail"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.trail.config`

```java
public class Trail implements JsonAssetWithMap<String, DefaultAssetMap<String, Trail>>, NetworkSerializable<com.hypixel.hytale.protocol.Trail>
```

Class in the config subsystem.

## Fields

| Field | Type | Description |
|---|---|---|
| `ASSET_STORE` | `AssetStore<String, Trail, DefaultAssetMap<String, Trail>>` | Static AssetStore<String, Trail, DefaultAssetMap<String, Trail>> field. |
| `data` | `AssetExtraInfo.Data` | AssetExtraInfo.Data field. |
| `id` | `String` | String field. |
| `texture` | `String` | String field. |
| `renderMode` | `FXRenderMode` | FXRenderMode field. |
| `intersectionHighlight` | `IntersectionHighlight` | IntersectionHighlight field. |
| `lifeSpan` | `int` | int field. |
| `roll` | `float` | float field. |
| `lightInfluence` | `float` | float field. |
| `smooth` | `boolean` | boolean field. |
| `start` | `Edge` | Edge field. |
| `end` | `Edge` | Edge field. |
| `animation` | `Animation` | Animation field. |
| `cachedPacket` | `SoftReference<com.hypixel.hytale.protocol.Trail>` | SoftReference<com.hypixel.hytale.protocol.Trail> field. |

## Constructors

| Constructor | Description |
|---|---|
| `Trail()` | Creates a new Trail instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getAssetStore()` | `AssetStore<String, Trail, DefaultAssetMap<String, Trail>>` | static public method. |
| `getAssetMap()` | `DefaultAssetMap<String, Trail>` | static public method. |
| `toPacket()` | `com.hypixel.hytale.protocol.Trail` | public method. |
| `getId()` | `String` | public method. |
| `getTexture()` | `String` | public method. |
| `getRenderMode()` | `FXRenderMode` | public method. |
| `getIntersectionHighlight()` | `IntersectionHighlight` | public method. |
| `getLifeSpan()` | `int` | public method. |
| `getRoll()` | `float` | public method. |
| `getLightInfluence()` | `float` | public method. |
| `isSmooth()` | `boolean` | public method. |
| `getStart()` | `Edge` | public method. |
| `getEnd()` | `Edge` | public method. |
| `getAnimation()` | `Animation` | public method. |
| `toString()` | `String` | public method. |
