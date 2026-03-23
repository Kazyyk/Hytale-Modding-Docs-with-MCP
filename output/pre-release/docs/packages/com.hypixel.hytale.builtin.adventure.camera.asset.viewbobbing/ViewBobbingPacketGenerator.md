---
title: "ViewBobbingPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.camera.asset.viewbobbing"
fqcn: "com.hypixel.hytale.builtin.adventure.camera.asset.viewbobbing.ViewBobbingPacketGenerator"
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
  - "viewbobbing"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.camera.asset.viewbobbing`

```java
public class ViewBobbingPacketGenerator extends SimpleAssetPacketGenerator
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `ToClientPacket` | `generateInitPacket(AssetMap<MovementType,ViewBobbing> assetMap, Map<MovementType,ViewBobbing> assets)` |
| `@Nonnull @Override protected` | `ToClientPacket` | `generateUpdatePacket(AssetMap<MovementType,ViewBobbing> assetMap, Map<MovementType,ViewBobbing> loadedAssets)` |
| `@Nonnull @Override protected` | `ToClientPacket` | `generateRemovePacket(AssetMap<MovementType,ViewBobbing> assetMap, Set<MovementType> removed)` |
| `@Nonnull protected static` | `ToClientPacket` | `toCachedPacket(UpdateType type, Map<MovementType,ViewBobbing> assets)` |
