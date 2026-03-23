---
title: "CameraEffect"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.camera"
fqcn: "com.hypixel.hytale.server.core.asset.type.camera.CameraEffect"
api_surface: false
extends: null
implements: ["JsonAssetWithMap"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "asset"
  - "type"
  - "camera"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.camera`

```java
public abstract class CameraEffect implements JsonAssetWithMap
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `AssetCodecMapCodec<String,CameraEffect>` | `CODEC` |
| `public static final` | `Codec<String>` | `CHILD_ASSET_CODEC` |
| `public static final` | `ValidatorCache<String>` | `VALIDATOR_CACHE` |
| `private static` | `AssetStore<String,CameraEffect,IndexedLookupTableAssetMap<String,CameraEffect>>` | `ASSET_STORE` |
| `protected` | `String` | `id` |
| `protected` | `AssetExtraInfo.Data` | `data` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `AssetStore<String,CameraEffect,IndexedLookupTableAssetMap<String,CameraEffect>>` | `getAssetStore()` |
| `@Nonnull public static` | `IndexedLookupTableAssetMap<String,CameraEffect>` | `getAssetMap()` |
| `public` | `String` | `getId()` |
| `public abstract` | `CameraShakeEffect` | `createCameraShakePacket()` |
| `public abstract` | `CameraShakeEffect` | `createCameraShakePacket(float var1)` |

## Inner Types

- `CameraEffect.MissingCameraEffect`
