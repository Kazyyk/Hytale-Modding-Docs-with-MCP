---
title: "BlockParticleSet"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.blockparticle.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.blockparticle.config.BlockParticleSet"
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
  - "blockparticle"
  - "config"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.blockparticle.config`

```java
public class BlockParticleSet implements JsonAssetWithMap, NetworkSerializable
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `AssetBuilderCodec<String,BlockParticleSet>` | `CODEC` |
| `private static` | `AssetStore<String,BlockParticleSet,DefaultAssetMap<String,BlockParticleSet>>` | `ASSET_STORE` |
| `public static final` | `ValidatorCache<String>` | `VALIDATOR_CACHE` |
| `protected` | `AssetExtraInfo.Data` | `data` |
| `protected` | `String` | `id` |
| `protected` | `Color` | `color` |
| `protected` | `float` | `scale` |
| `protected` | `Vector3f` | `positionOffset` |
| `protected` | `Direction` | `rotationOffset` |
| `protected` | `Map<BlockParticleEvent,String>` | `particleSystemIds` |
| `private` | `SoftReference<com.hypixel.hytale.protocol.BlockParticleSet>` | `cachedPacket` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `AssetStore<String,BlockParticleSet,DefaultAssetMap<String,BlockParticleSet>>` | `getAssetStore()` |
| `public static` | `DefaultAssetMap<String,BlockParticleSet>` | `getAssetMap()` |
| `@Nonnull public` | `com.hypixel.hytale.protocol.BlockParticleSet` | `toPacket()` |
| `public` | `String` | `getId()` |
| `public` | `Color` | `getColor()` |
| `public` | `float` | `getScale()` |
| `public` | `Vector3f` | `getPositionOffset()` |
| `public` | `Direction` | `getRotationOffset()` |
| `public` | `Map<BlockParticleEvent,String>` | `getParticleSystemIds()` |
| `@Nonnull @Override public` | `String` | `toString()` |
