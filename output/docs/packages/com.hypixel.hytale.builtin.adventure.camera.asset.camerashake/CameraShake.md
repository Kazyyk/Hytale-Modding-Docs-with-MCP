---
title: "CameraShake"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.camera.asset.camerashake"
fqcn: "com.hypixel.hytale.builtin.adventure.camera.asset.camerashake.CameraShake"
api_surface: false
extends: null
implements: ["NetworkSerializable", "JsonAssetWithMap"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "camera"
  - "asset"
  - "camerashake"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.camera.asset.camerashake`

```java
public class CameraShake implements NetworkSerializable, JsonAssetWithMap
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `AssetBuilderCodec<String,CameraShake>` | `CODEC` |
| `public static final` | `Codec<String>` | `CHILD_ASSET_CODEC` |
| `public static final` | `ValidatorCache<String>` | `VALIDATOR_CACHE` |
| `private static` | `AssetStore<String,CameraShake,IndexedAssetMap<String,CameraShake>>` | `ASSET_STORE` |
| `protected` | `String` | `id` |
| `protected` | `AssetExtraInfo.Data` | `data` |
| `protected` | `CameraShakeConfig` | `firstPerson` |
| `protected` | `CameraShakeConfig` | `thirdPerson` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `AssetStore<String,CameraShake,IndexedAssetMap<String,CameraShake>>` | `getAssetStore()` |
| `@Nonnull public static` | `IndexedAssetMap<String,CameraShake>` | `getAssetMap()` |
| `@Nonnull public` | `com.hypixel.hytale.protocol.CameraShake` | `toPacket()` |
| `public` | `String` | `getId()` |
| `@Nonnull @Override public` | `String` | `toString()` |
