---
title: "CameraShakePacketGenerator"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.camera.asset.camerashake"
fqcn: "com.hypixel.hytale.builtin.adventure.camera.asset.camerashake.CameraShakePacketGenerator"
api_surface: false
extends: "SimpleAssetPacketGenerator"
implements: []
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
public class CameraShakePacketGenerator extends SimpleAssetPacketGenerator
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ToClientPacket` | `generateInitPacket(IndexedAssetMap<String,CameraShake> assetMap, Map<String,CameraShake> assets)` |
| `@Nonnull protected` | `ToClientPacket` | `generateUpdatePacket(IndexedAssetMap<String,CameraShake> assetMap, Map<String,CameraShake> loadedAssets)` |
| `@Nonnull protected` | `ToClientPacket` | `generateRemovePacket(IndexedAssetMap<String,CameraShake> assetMap, Set<String> removed)` |
| `@Nonnull protected static` | `ToClientPacket` | `toCachedPacket(UpdateType type, IndexedAssetMap<String,CameraShake> assetMap, Map<String,CameraShake> assets)` |
