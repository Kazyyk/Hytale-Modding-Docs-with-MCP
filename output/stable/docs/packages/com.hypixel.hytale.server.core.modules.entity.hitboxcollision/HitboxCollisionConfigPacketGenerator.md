---
title: "HitboxCollisionConfigPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.hitboxcollision"
fqcn: "com.hypixel.hytale.server.core.modules.entity.hitboxcollision.HitboxCollisionConfigPacketGenerator"
api_surface: false
extends: "AssetPacketGenerator"
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "entity"
---
**Package:** `com.hypixel.hytale.server.core.modules.entity.hitboxcollision`

```java
public class HitboxCollisionConfigPacketGenerator extends AssetPacketGenerator<String, HitboxCollisionConfig, IndexedLookupTableAssetMap<String, HitboxCollisionConfig>>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `ToClientPacket` | `generateInitPacket( @Nonnull IndexedLookupTableAssetMap<String, HitboxCollisionConfig> assetMap, @Nonnull Map<String, HitboxCollisionConfig> assets )` |
| `public` | `ToClientPacket` | `generateUpdatePacket( @Nonnull IndexedLookupTableAssetMap<String, HitboxCollisionConfig> assetMap, @Nonnull Map<String, HitboxCollisionConfig> loadedAssets, @Nonnull AssetUpdateQuery query )` |
| `public` | `ToClientPacket` | `generateRemovePacket( @Nonnull IndexedLookupTableAssetMap<String, HitboxCollisionConfig> assetMap, @Nonnull Set<String> removed, @Nonnull AssetUpdateQuery query )` |
